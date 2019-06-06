package com.zxdy.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.zxdy.dao.provider.DyUserSqlProvider;
import com.zxdy.model.DyUser;

public interface DyUserDao {
	
	String USERTABLE = "dy_user";
	
	@Select("select * from "+USERTABLE+" where uname = #{uname} and upwd = #{upwd}")
	DyUser selectByLoginnameAndPassword(
			@Param("uname") String uname,
			@Param("upwd") String upwd);
	
	// 根据id查询用户
	@Select("select * from "+USERTABLE+" where uid = #{uid}")
	DyUser selectById(Integer id);
	
	// 根据id删除用户
	@Delete(" delete from "+USERTABLE+" where uid = #{uid} ")
	void deleteById(Integer id);
		
	// 动态修改用户
	@SelectProvider(type=DyUserSqlProvider.class,method="updateUser")
	void update(DyUser user);
		
	// 动态查询
	@SelectProvider(type=DyUserSqlProvider.class,method="selectWhitParam")
	List<DyUser> selectByPage(Map<String, Object> params);
	
	// 根据参数查询用户总数
	@SelectProvider(type=DyUserSqlProvider.class,method="count")
	Integer count(Map<String, Object> params);
	
	// 动态插入用户
	@SelectProvider(type=DyUserSqlProvider.class,method="insertUser")
	void save(DyUser user);
}

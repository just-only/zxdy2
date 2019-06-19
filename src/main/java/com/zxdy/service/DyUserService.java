package com.zxdy.service;

import java.util.List;

import com.zxdy.model.DyUser;
import com.zxdy.tag.PageModel;

public interface DyUserService {
	
	/*
	 * 用户登录
	 * @param　loginname
	 * @param  password
	 * @return User
	 */
	DyUser login(String loginname,String password);
	
	/*
	 * 按id查询用户
	 * @param id
	 * @return DyUser
	 */
	
	DyUser finDyUserById(int id);
	
	/*
	 * 查询所有用户
	 * @return List<DyUser>
	 */
	List<DyUser> findAllDyUser();
	
	/*
	 * 根据ID删除用户
	 * @param ID
	 * @return 0 or 1
	 */
	void removeDyUserById(int id);
	
	/**
	 * 修改用户
	 * @param User 用户对象
	 * */
	void modifyUser(DyUser user);
	
	/**
	 * 添加用户
	 * @param User 用户对象
	 * */
	void addUser(DyUser user);
	
	/**
	 * 获得所有老师或者学生
	 * @param employee 查询条件
	 * @param pageModel 分页对象
	 * @return Dept对象的List集合
	 * */
	List<DyUser> findDyUser(DyUser user,PageModel pageModel);
	
	int selectRole(Integer id);
}

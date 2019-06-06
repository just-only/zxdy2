package com.zxdy.dao.provider;

import java.util.Map;
import static com.zxdy.common.ZxdyConstants.USERTABLE;
import org.apache.ibatis.jdbc.SQL;

import com.zxdy.model.DyUser;

public class DyUserSqlProvider {
	
	//分页动态查询
	public String selectWhitParam(Map<String, Object> params) {
		String sql = new SQL() {
			{
				SELECT("*");
				FROM(USERTABLE);
				if (params.get("user") != null) {
					DyUser user = (DyUser) params.get("user");
					if (user.getUname()!= null && !user.getUname().equals("")) {
						WHERE("  uname LIKE CONCAT ('%',#{user.uname},'%') ");
					}
				}
			}
		}.toString();

		if (params.get("pageModel") != null) {
			sql += " limit #{pageModel.firstLimitParam} , #{pageModel.pageSize}  ";
		}

		return sql;
	}

	// 动态查询总数量
	public String count(Map<String, Object> params) {
		return new SQL() {
			{
				SELECT("count(*)");
				FROM(USERTABLE);
				if (params.get("user") != null) {
					DyUser user = (DyUser) params.get("user");
					if (user.getUname() != null && !user.getUname().equals("")) {
						WHERE("  uname LIKE CONCAT ('%',#{user.uname},'%') ");
					}
				}
			}
		}.toString();
	}

	// 动态插入
	public String insertUser(DyUser user) {

		return new SQL() {
			{
				INSERT_INTO(USERTABLE);
				if (user.getUname() != null && !user.getUname().equals("")) {
					VALUES("uname", "#{uname}");
				}
				if (user.getUpwd() != null && !user.getUpwd().equals("")) {
					VALUES("upwd", "#{upwd}");
				}
			}
		}.toString();
	}

	// 动态更新
	public String updateUser(DyUser user) {

		return new SQL() {
			{
				UPDATE(USERTABLE);
				if (user.getUname() != null) {
					SET(" uname = #{uname} ");
				}
				if (user.getUname() != null) {
					SET(" upwd = #{upwd} ");
				}
				WHERE(" uid = #{uid} ");
			}
		}.toString();
	}
}

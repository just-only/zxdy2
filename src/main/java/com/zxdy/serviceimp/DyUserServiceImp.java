package com.zxdy.serviceimp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxdy.dao.DyUserDao;
import com.zxdy.model.DyUser;
import com.zxdy.service.DyUserService;
import com.zxdy.tag.PageModel;

@Service("userservice")
public class DyUserServiceImp implements DyUserService{

	@Autowired
	private DyUserDao userdao;
	
	@Override
	public DyUser login(String loginname, String password) {
		// TODO Auto-generated method stub
		return userdao.selectByLoginnameAndPassword(loginname, password);
	}

	@Override
	public DyUser finDyUserById(int id) {
		// TODO Auto-generated method stub
		return userdao.selectById(id);
	}

	@Override
	public List<DyUser> findAllDyUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeDyUserById(int id) {
		// TODO Auto-generated method stub
		userdao.deleteById(id);
	}

	@Override
	public void modifyUser(DyUser user) {
		// TODO Auto-generated method stub
		userdao.update(user);
	}

	@Override
	public void addUser(DyUser user) {
		// TODO Auto-generated method stub
		userdao.save(user);
	}

	@Override
	public List<DyUser> findDyUser(DyUser user, PageModel pageModel) {
		// TODO Auto-generated method stub
		Map<String,Object> params = new HashMap<>();
		params.put("user", user);
		int recordCount = userdao.count(params);
		pageModel.setRecordCount(recordCount);
		if(recordCount > 0){
	        /** 开始分页查询数据：查询第几页的数据 */
		    params.put("pageModel", pageModel);
	    }
		List<DyUser> users = userdao.selectByPage(params);		 
		return users;
	}
	
}

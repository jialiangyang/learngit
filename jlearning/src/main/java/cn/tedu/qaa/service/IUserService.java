package cn.tedu.qaa.service;

import cn.tedu.qaa.bean.User;

public interface IUserService {

	/**
	 * 添加用户信息
	 * @param user
	 */
	void addUser(User user);
	
	User login(String username,String password);
	
	User selectById(Integer id);
}

package com.school.nsc.service;

import com.school.nsc.pojo.User;

public interface UserService {
	
	public void reg(User user);
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 登录成功的用户数据
     */
    public  User login(String username, String password);

    /**
     * 修改密码
     * @param uid 当前登录的用户id
     * @param username 用户名
     * @param oldPassword 原密码
     * @param newPassword 新密码
     */
    public void changePassword(String username, String oldPassword, String newPassword);

    /**
     * 获取当前登录的用户的信息
     * @param uid 当前登录的用户的id
     * @return 当前登录的用户的信息
     */
    public User getByUid(int uid);
	

    /**
     * 修改用户资料
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @param user 用户的新的数据
     */
    public void changeInfo(int uid, String username, User user);

}

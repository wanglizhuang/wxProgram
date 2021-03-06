package com.idig8.service;

import com.idig8.pojo.Users;
import com.idig8.pojo.UsersReport;

public interface UserService {

	/**
	 * 判断用户名是否存在
	 * @param username
	 * @return
	 */
	public boolean queryUsernameIsExist(String username);
	
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	public void saveUser(Users user);
	
	/**
	 * 查询用户对象
	 * @param username
	 * @return
	 */
	public Users queryUserIsExist(Users user);
	
	/**
	 * 更新对象
	 * @param username
	 * @return
	 */
	public void updateUser(Users user);
	
	
	/**
	 * userId查询用户对象
	 * @param username
	 * @return
	 */
	public Users queryUserId(String userId);
	
	/**
	 * 查询用户信息
	 */
	public Users queryUserInfo(String userId);
	
	/**
	 * 查询用户是否喜欢点赞视频
	 */
	public boolean isUserLikeVideo(String userId, String videoId);
	
	/**
	 * @Description: 增加用户和粉丝的关系
	 */
	public void saveUserFanRelation(String userId, String fanId);
	
	/**
	 * @Description: 删除用户和粉丝的关系
	 */
	public void deleteUserFanRelation(String userId, String fanId);
	
	/**
	 * @Description: 查询用户是否关注
	 */
	public boolean queryIfFollow(String userId, String fanId);
	
	/**
	 * @Description: 举报用户
	 */
	public void reportUser(UsersReport userReport);
	
	
}

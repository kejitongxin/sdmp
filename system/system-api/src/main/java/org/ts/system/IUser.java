package org.ts.system;


/**
 * 系统用户
 * 
 * @author 孔超
 *
 */
public interface IUser {
	/**
	 * 用户创建
	 */
	void create();
	/**
	 * 用户注销
	 */
	void close( );
	
	/**
	 * 用户激活
	 */
	void activate( );
	/**
	 * 用户冻结
	 */
	void deactivate( );
	
	/**
	 * 密码修改
	 * @param oldPassword 旧密码
	 * @param newPassword 新密码
	 */
	void passwordModify( String oldPassword, String newPassword);
	
	/**
	 * 密码重置
	 * @param userId 用户id
	 * @param newPassword 重置后密码
	 */
	void passwordReset(String userId, String newPassword);
	
	/**
	 * 用户认证
	 * @param userName 用户名
	 * @param password 密码
	 */
	void authorize(String userName, String password);
	

	

}

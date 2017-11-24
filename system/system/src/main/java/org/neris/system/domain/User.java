package org.neris.system.domain;

import org.ts.system.IUser;
import java.util.UUID;

public class User implements IUser{
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 激活标识
	 */
	private boolean activated;
	
	private UserRepo userRepo;

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passwordModify(String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void passwordReset(String userId, String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void authorize(String userName, String password) {
		// TODO Auto-generated method stub
		
	}

}

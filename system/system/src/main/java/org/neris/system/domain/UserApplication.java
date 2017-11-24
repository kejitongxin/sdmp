package org.neris.system.domain;

import java.util.Collection;
import java.util.UUID;

public class UserApplication {
	/**
	 * ID
	 */
	private String userApplicationID;
	/**
	 * 用户名
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private int sex;
	/**
	 * 身份证号
	 */
	private String personalIDNum;
	/**
	 * 申请处理状态。0，新申请；1，处理中；2，审核不通过；3，审核通过
	 */
	private ApplicationDealState applicationDealState;
	
	
	private UserApplicationRepo userApplicationRepo;
	
	public enum ApplicationDealState{
		applied,//0，已申请
		dealing,//1，处理中
		applyFailed,//2，审核不通过
		applySuceed//3，审核通过
	}
	/**
	 * 用户注册
	 */
	public void register(UserApplication userApplication) {
		UserApplication newUserApplication=userApplication;
		newUserApplication.userApplicationID=UUID.randomUUID().toString();
		newUserApplication.applicationDealState=ApplicationDealState.applied;
		userApplicationRepo.saveUserApplication(newUserApplication);
		
	}
	/**
	 * 用户审核
	 */
	void approve(Collection<String> userApplicationIDs,ApplicationDealState applicationDealState) {
		
	}
	
	
	
		
	

}

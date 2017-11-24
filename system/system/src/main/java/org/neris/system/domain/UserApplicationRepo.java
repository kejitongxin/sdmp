package org.neris.system.domain;

public interface UserApplicationRepo {
	public void saveUserApplication(UserApplication userApplication);
	public UserApplication findUserApplicationByID(String userApplicationID);

}

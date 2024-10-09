package org.trueFanBoutique.dataBase.dto;

public class ChangePassword {
	private String password;
	private String npassword;
	
	public ChangePassword(String password, String npassword) {
		this.password = password;
		this.npassword = npassword;
	}//constructor 1
	
	public ChangePassword() {
	}//constructor 2

	public String getPassword() {
		return password;
	}//getPassword

	public void setPassword(String password) {
		this.password = password;
	}//getNpassword

	public String getNpassword() {
		return npassword;
	}//getNpassword

	public void setNpassword(String npassword) {
		this.npassword = npassword;
	}//setNpassword

	@Override
	public String toString() {
		return "ChangePassword [password=" + password + ", npassword=" + npassword + "]";
	}//toString
	
}//class ChangePassword

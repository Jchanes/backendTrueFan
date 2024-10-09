package org.trueFanBoutique.dataBase.dto;

public class ChangePhone {
	private Long phone;
	private Long nphone;
	public ChangePhone(Long phone, Long nphone) {
		this.phone = phone;
		this.nphone = nphone;
	}//constructor 1
	
	public ChangePhone() {
	}//Constructor 2

	public Long getPhone() {
		return phone;
	}//getPhone

	public void setPhone(Long phone) {
		this.phone = phone;
	}//setPhone

	public Long getNphone() {
		return nphone;
	}//getNphone

	public void setNphone(Long nphone) {
		this.nphone = nphone;
	}//setNphone

	@Override
	public String toString() {
		return "ChangePhone [phone=" + phone + ", nphone=" + nphone + "]";
	}//toString

}//class ChangePhone

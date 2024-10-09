package org.trueFanBoutique.model;

public class Order {
	
	private Long id, userid, productid;
	private String date;
	private Boolean orderStatus;
	private static Long total = Long.valueOf(0);
	
	public Order(Long userid, Long productid, String date, Boolean orderStatus) {
	
		this.userid = userid;
		this.productid = productid;
		this.date = date;
		this.orderStatus = orderStatus;
		Order.total++;
		this.id = Order.total;
	}

	public Order() {
		Order.total++;
		this.id = Order.total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Boolean getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userid=" + userid + ", productid=" + productid + ", date=" + date
				+ ", orderStatus=" + orderStatus + "]";
	}
	
	
	
	
	

}// class Order

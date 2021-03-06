package com_01.pilot.anno.hibernate;

import javax.persistence.*;

@Entity 
@Table(name="customers")

public class Customer{
	

@Id
@GeneratedValue
@Column(name="cid")


	private int cid;


@Column (name="cname")
	private String cname;

@Column (name="email")
private String email;

@Column (name="phone")
private long phone;

@Column (name="city")
private String city;

@Column (name="status")
private String status;

public Customer(){}
public Customer(String cname, String email,long phone, String city, String status) {
	super();
	
	this.cname = cname;
	this.email= email;
	this.phone = phone;
	this.city = city;
	this.status = status;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}

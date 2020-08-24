package com.silencer.entity;
// Generated Jul 16, 2020 10:33:30 AM by Hibernate Tools 5.2.12.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.silencer.entity.SilencerOrder;



@Entity
@Table(name = "customer", catalog = "freydevikdb")
@NamedQueries({
	@NamedQuery(name= "Customer.findAll", query= "SELECT c FROM Customer c ORDER BY c.fullName"),
	@NamedQuery(name= "Customer.findByEmail", query= "SELECT c FROM Customer c WHERE c.email = :email"),
	@NamedQuery(name= "Customer.checkLogin", query= "SELECT c FROM Customer c WHERE c.email = :email AND c.password = :password"),
	@NamedQuery(name= "Customer.countAll", query= "SELECT COUNT(*) FROM Customer c" )
})

public class Customer implements java.io.Serializable {

	private Integer customerId;
	private String email;
	private String fullName;
	private String address;
	private String city;
	private String country;
	private String phone;
	private String zipcode;
	private String password;
	private Date registerDate;
	private String discount;
	private Set silencerOrders = new HashSet(0);

	public Customer() {
	}

	public Customer(Integer customerId,String email, String fullName, String address, String city, String country, String phone,
			String zipcode, String password, String discount) {
		
		this.customerId = customerId;
		this.email = email;
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.zipcode = zipcode;
		this.password = password;
		this.discount = discount;
	}
	
	public Customer(String email, String fullName, String address, String city, String country, String phone,
			String zipcode, String password, String discount) {
		
		this.email = email;
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.zipcode = zipcode;
		this.password = password;
		this.discount = discount;
	}
	
	public Customer(String email, String fullName, String address, String city, String country, String phone,
			String zipcode, String password) {
		
		this.email = email;
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.zipcode = zipcode;
		this.password = password;
		
	}


	public Customer(String email, String fullName, String address, String city, String country, String phone,
			String zipcode, String password, Date registerDate, String discount, Set silencerOrders) {
		this.email = email;
		this.fullName = fullName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.phone = phone;
		this.zipcode = zipcode;
		this.password = password;
		this.registerDate = registerDate;
		this.discount = discount;
		this.silencerOrders = silencerOrders;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "customer_id", unique = true, nullable = false)
	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@Column(name = "email", nullable = false, length = 64)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "full_name", nullable = false, length = 45)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "address", nullable = false, length = 128)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city", nullable = false, length = 32)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "country", nullable = false, length = 64)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "phone", nullable = false, length = 15)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "zipcode", nullable = false, length = 15)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "register_date", length = 19)
	public Date getRegisterDate() {
		return this.registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}

	@Column(name = "discount", nullable = true, length = 10)
	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
	public Set<SilencerOrder> getSilencerOrders() {
		return this.silencerOrders;
	}

	public void setSilencerOrders(Set<SilencerOrder> silencerOrders) {
		this.silencerOrders = silencerOrders;
	}

}

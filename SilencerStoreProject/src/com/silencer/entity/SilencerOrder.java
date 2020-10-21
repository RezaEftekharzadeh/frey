package com.silencer.entity;
// Generated Jul 16, 2020 10:33:30 AM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name = "silencer_order", catalog = "freydevikdb")
@NamedQueries({
	@NamedQuery(name = "SilencerOrder.findAll", query = "SELECT so FROM SilencerOrder so ORDER BY so.orderDate DESC"),
	@NamedQuery(name = "SilencerOrder.countAll", query = "SELECT COUNT(*) FROM SilencerOrder")
})
public class SilencerOrder implements java.io.Serializable {

	private int orderId;
	private Customer customer;
	private Date orderDate;
	private String shippingAddress;
	private String ricipientName;
	private String ricipientPhone;
	private String paymentMethod;
	private float total;
	private String status;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public SilencerOrder() {
	}

	public SilencerOrder(int orderId, Customer customer, Date orderDate, float total) {
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.total = total;
	}

	public SilencerOrder(int orderId, Customer customer, Date orderDate, String shippingAddress, String ricipientName,
			String ricipientPhone, String paymentMethod, float total, String status, Set<OrderDetail> orderDetails) {
		this.orderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.shippingAddress = shippingAddress;
		this.ricipientName = ricipientName;
		this.ricipientPhone = ricipientPhone;
		this.paymentMethod = paymentMethod;
		this.total = total;
		this.status = status;
		this.orderDetails = orderDetails;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", unique = true, nullable = false)
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id", nullable = false)
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date", nullable = false, length = 19)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "shipping_address", length = 256)
	public String getShippingAddress() {
		return this.shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Column(name = "ricipient_name", length = 45)
	public String getRicipientName() {
		return this.ricipientName;
	}

	public void setRicipientName(String ricipientName) {
		this.ricipientName = ricipientName;
	}

	@Column(name = "ricipient_phone", length = 15)
	public String getRicipientPhone() {
		return this.ricipientPhone;
	}

	public void setRicipientPhone(String ricipientPhone) {
		this.ricipientPhone = ricipientPhone;
	}

	@Column(name = "payment_method", length = 20)
	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Column(name = "total", nullable = false, precision = 12, scale = 0)
	public float getTotal() {
		return this.total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@Column(name = "status", length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "silencerOrder", cascade = CascadeType.ALL, orphanRemoval = true )
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
	@Transient
	public int getTotalSilencer() {
		int total =0;
		for(OrderDetail orderDetail : orderDetails) {
			total += orderDetail.getQuantity();
		}
		return total;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SilencerOrder other = (SilencerOrder) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}

}

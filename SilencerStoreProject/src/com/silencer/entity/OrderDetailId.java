package com.silencer.entity;
// Generated Jul 16, 2020 10:33:30 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrderDetailId generated by hbm2java
 */
@Embeddable
public class OrderDetailId implements java.io.Serializable {

	private int orderId;
	private int bookId;
	private Integer quantity;
	private Float subtotal;

	public OrderDetailId() {
	}

	public OrderDetailId(int orderId, int bookId) {
		this.orderId = orderId;
		this.bookId = bookId;
	}

	public OrderDetailId(int orderId, int bookId, Integer quantity, Float subtotal) {
		this.orderId = orderId;
		this.bookId = bookId;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}

	@Column(name = "order_id", nullable = false)
	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	@Column(name = "book_id", nullable = false)
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "subtotal", precision = 12, scale = 0)
	public Float getSubtotal() {
		return this.subtotal;
	}

	public void setSubtotal(Float subtotal) {
		this.subtotal = subtotal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderDetailId))
			return false;
		OrderDetailId castOther = (OrderDetailId) other;

		return (this.getOrderId() == castOther.getOrderId()) && (this.getBookId() == castOther.getBookId())
				&& ((this.getQuantity() == castOther.getQuantity()) || (this.getQuantity() != null
						&& castOther.getQuantity() != null && this.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getSubtotal() == castOther.getSubtotal()) || (this.getSubtotal() != null
						&& castOther.getSubtotal() != null && this.getSubtotal().equals(castOther.getSubtotal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOrderId();
		result = 37 * result + this.getBookId();
		result = 37 * result + (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result + (getSubtotal() == null ? 0 : this.getSubtotal().hashCode());
		return result;
	}

}

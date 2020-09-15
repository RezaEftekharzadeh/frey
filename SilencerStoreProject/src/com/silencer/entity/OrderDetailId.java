package com.silencer.entity;
// Generated Jul 16, 2020 10:33:30 AM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable
public class OrderDetailId implements java.io.Serializable {

	private Silencer silencer;
	private SilencerOrder silencerOrder;

	public OrderDetailId() {
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "silencer_id", nullable = false, insertable = false, updatable = false)
	public Silencer getSilencer() {
		return this.silencer;
	}

	public void setSilencer(Silencer silencer) {
		this.silencer = silencer;
		
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", nullable = false, insertable = false, updatable = false)
	public SilencerOrder getSilencerOrder() {
		return this.silencerOrder;
	}

	public void setSilencerOrder(SilencerOrder silencerOrder) {
		this.silencerOrder = silencerOrder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((silencer == null) ? 0 : silencer.hashCode());
		result = prime * result + ((silencerOrder == null) ? 0 : silencerOrder.hashCode());
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
		OrderDetailId other = (OrderDetailId) obj;
		if (silencer == null) {
			if (other.silencer != null)
				return false;
		} else if (!silencer.equals(other.silencer))
			return false;
		if (silencerOrder == null) {
			if (other.silencerOrder != null)
				return false;
		} else if (!silencerOrder.equals(other.silencerOrder))
			return false;
		return true;
	}
	
	
}

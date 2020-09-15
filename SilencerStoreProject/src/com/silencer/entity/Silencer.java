package com.silencer.entity;
// Generated Jul 16, 2020 10:33:30 AM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Objects;
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


@Entity
@Table(name = "silencer", catalog = "freydevikdb")
@NamedQueries({
	@NamedQuery(name="silencer.findAll", query="SELECT s FROM Silencer s ORDER BY s.threadSize "),
	@NamedQuery(name="silencer.findAllTread", query="SELECT DISTINCT s.threadSize FROM Silencer s ORDER BY s.threadSize"),
	@NamedQuery(name="silencer.findAllCore", query="SELECT DISTINCT s.coreSize FROM Silencer s ORDER BY s.coreSize"),
	@NamedQuery(name="silencer.findAllName", query="SELECT DISTINCT s.name FROM Silencer s ORDER BY s.name"),
	@NamedQuery(name="silencer.findAllCaliber", query="SELECT DISTINCT s.caliber FROM Silencer s ORDER BY s.caliber"),
	@NamedQuery(name="silencer.findById", query="SELECT s FROM Silencer s WHERE s.silencerId = :silencerId"),
	@NamedQuery(name="silencer.findByThreadSize" , query="SELECT DISTINCT  s FROM Silencer s WHERE s.threadSize = :threadSize"),
	@NamedQuery(name="silencer.findByCode" , query="SELECT s FROM Silencer s WHERE s.code = :code"),
	@NamedQuery(name="silencer.findByCoreSize" , query="SELECT DISTINCT s FROM Silencer s WHERE s.coreSize = :coreSize"),
	@NamedQuery(name="silencer.findMatchSilencer" , query="SELECT s FROM Silencer s WHERE s.threadSize = :threadSize AND s.coreSize = :coreSize"),
	@NamedQuery(name="silencer.findSilencer" , query="SELECT s FROM Silencer s WHERE s.threadSize = :threadSize AND s.coreSize = :coreSize AND s.name = :name AND s.caliber = :caliber"),
	@NamedQuery(name="silencer.findAllByCode" , query="SELECT s.name,s.threadSize,s.coreSize,s.caliber,s.price  FROM Silencer s WHERE s.code = :code"),
	@NamedQuery(name="silencer.countAll", query="SELECT COUNT(*) FROM Silencer s")
})
public class Silencer implements java.io.Serializable {
	
	private String importantField;
	private Integer silencerId;
	private String threadSize;
	private String coreSize;
	private float price;
	private byte[] image;
	private String description;
	private String code;
	private String caliber;
	private String name;
	private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

	public Silencer() {
		
	}

	public Silencer(Integer silencerId) {
		super();
		this.silencerId = silencerId;
	}


	public Silencer(Integer silencerId, String threadSize, String coreSize, float price, String code, String caliber, String name) {
		this.silencerId = silencerId;
		this.threadSize = threadSize;
		this.coreSize = coreSize;
		this.code=code;
		this.caliber=caliber;
		this.name= name;
		this.price = price;
	}
	
	public Silencer(String threadSize, String coreSize, float price, String code, String caliber, String name) {
		this.threadSize = threadSize;
		this.coreSize = coreSize;
		this.code = code;
		this.caliber = caliber;
		this.price=price;
		this.name=name;
	}

	public Silencer(Integer silencerId, String threadSize, String coreSize, float price, byte[] image, String description,
			Set<OrderDetail> orderDetails) {
		this.silencerId = silencerId;
		this.threadSize = threadSize;
		this.coreSize = coreSize;
		this.price = price;
		this.image = image;
		this.description = description;
		this.orderDetails = orderDetails;
	}
	   @Override
	    public int hashCode() {
	        return Objects.hashCode(silencerId);
	    }
	 
	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Silencer other = (Silencer) obj;
	        return Objects.equals(silencerId, other.getSilencerId());
	    }

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "silencer_id", unique = true, nullable = false)
	public Integer getSilencerId() {
		return this.silencerId;
	}

	public void setSilencerId(Integer silencerId) {
		this.silencerId = silencerId;
	}

	@Column(name = "thread_size", nullable = false, length = 45)
	public String getThreadSize() {
		return this.threadSize;
	}

	public void setThreadSize(String threadSize) {
		this.threadSize = threadSize;
	}
	
	@Column(name = "name", nullable = true, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "caliber", nullable = true, length = 45)
	public String getCaliber() {
		return this.caliber;
	}

	public void setCaliber(String caliber) {
		this.caliber = caliber;
	}
	
	@Column(name = "code", nullable = true, length = 45)
	public String getcode() {
		return this.code;
	}

	public void setcode(String code) {
		this.code = code;
	}

	@Column(name = "core_size", nullable = false, length = 45)
	public String getCoreSize() {
		return this.coreSize;
	}

	public void setCoreSize(String coreSize) {
		this.coreSize = coreSize;
	}

	@Column(name = "price", nullable = false, precision = 12, scale = 0)
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Column(name = "image")
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Column(name = "description", length = 16777215)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "silencer")
	public Set<OrderDetail> getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

}

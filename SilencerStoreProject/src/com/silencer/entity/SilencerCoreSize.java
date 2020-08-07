package com.silencer.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "silencer_core_size", catalog = "freydevikdb")
public class SilencerCoreSize {
	private Integer silencerSizeId;
	private String coreSize;
	
	

		public SilencerCoreSize() {
		
		}

		public SilencerCoreSize(String coreSize) {
		
		this.coreSize = coreSize;
			}
		
		@Id
		@GeneratedValue(strategy = IDENTITY)
		
		@Column(name = "silencer_core_size_id", unique = true, nullable = false)
		public Integer getSilencerSizeId() {
			return this.silencerSizeId;
		}
		public void setSilencerSizeId(Integer silencerSizeId) {
			this.silencerSizeId = silencerSizeId;
		}
		@Column(name = "core_size", nullable = true, length = 45)
		public String getCoreSize() {
			return this.coreSize;
		}
		
		public void setCoreSize(String coreSize) {
			this.coreSize = coreSize;
		}
}

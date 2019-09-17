package com.sv.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_traffic")
public class UserTraffic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "req_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
	@SequenceGenerator(name="book_generator", sequenceName = "user_traffic_req_id_seq")
	private long reqId;

	@Column(name = "ip_address")
	private String ipAddress;

	@Column(name = "date_time")
	private Date dateTime;

	@Column(name = "req_type")
	private String reqType;

	@Column(name = "req_page")
	private String reqPage;
	
	public UserTraffic() {
		super();
	}

	public long getReqId() {
		return reqId;
	}

	public void setReqId(long reqId) {
		this.reqId = reqId;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getReqType() {
		return reqType;
	}

	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	public String getReqPage() {
		return reqPage;
	}

	public void setReqPage(String reqPage) {
		this.reqPage = reqPage;
	}

	@Override
	public String toString() {
		return "UserTraffic [reqId=" + reqId + ", ipAddress=" + ipAddress + ", dateTime=" + dateTime + ", reqType="
				+ reqType + ", reqPage=" + reqPage + "]";
	}

}

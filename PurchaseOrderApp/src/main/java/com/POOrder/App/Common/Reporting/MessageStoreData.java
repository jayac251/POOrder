package com.POOrder.App.Common.Reporting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Message_Store_Data",catalog="orderdbo")
public class MessageStoreData {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String msg_guid;
	@Column
	 private String data_type;
	@Column
	 private String encoding;
	@Column
	 private String data_value;
	
	@OneToOne
	@JoinColumn(name="msg_guid", referencedColumnName="msg_guid")
	private MessageStore message_store;
	 
	 /**
	  * Default Constructor
	  */
	 public MessageStoreData()
	 {}
	 
	 
	/**
	 * @param msg_guid
	 * @param data_type
	 * @param encoding
	 * @param data_value
	 */
	public MessageStoreData(String msg_guid, String data_type, String encoding, String data_value) {
		super();
		msg_guid = msg_guid;
		this.data_type = data_type;
		this.encoding = encoding;
		this.data_value = data_value;
	}
	/**
	 * @return the msg_guid
	 */
	public String getMsg_guid() {
		return msg_guid;
	}
	/**
	 * @param msg_guid the msg_guid to set
	 */
	public void setMsg_guid(String msg_guid) {
		msg_guid = msg_guid;
	}
	/**
	 * @return the data_type
	 */
	public String getData_type() {
		return data_type;
	}
	/**
	 * @param data_type the data_type to set
	 */
	public void setData_type(String data_type) {
		this.data_type = data_type;
	}
	/**
	 * @return the encoding
	 */
	public String getEncoding() {
		return encoding;
	}
	/**
	 * @param encoding the encoding to set
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	/**
	 * @return the data_value
	 */
	public String getData_value() {
		return data_value;
	}
	/**
	 * @param data_value the data_value to set
	 */
	public void setData_value(String data_value) {
		this.data_value = data_value;
	}

}

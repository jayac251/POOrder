package com.POOrder.App.Common.Reporting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name="Message_Store_Data")
public class MessageStoreData {
	@Id
	private String Msg_guid;
	@Column
	 private String data_type;
	@Column
	 private String encoding;
	@Column
	 private String data_value;
	
	@OneToOne
	@PrimaryKeyJoinColumn
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
		Msg_guid = msg_guid;
		this.data_type = data_type;
		this.encoding = encoding;
		this.data_value = data_value;
	}
	/**
	 * @return the msg_guid
	 */
	public String getMsg_guid() {
		return Msg_guid;
	}
	/**
	 * @param msg_guid the msg_guid to set
	 */
	public void setMsg_guid(String msg_guid) {
		Msg_guid = msg_guid;
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

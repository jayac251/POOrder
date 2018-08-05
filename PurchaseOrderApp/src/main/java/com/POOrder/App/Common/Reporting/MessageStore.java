package com.POOrder.App.Common.Reporting;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Message_Store",catalog="orderdbo")
public class MessageStore {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String msg_guid;	
	@Column
	private String db_timestamp;
	@Column
	private String localhost_timestamp;
	@Column
	private String host_name;
	@Column
	private String state;
	@Column
	private String node;
	@Column
	private String pipeline_name;
	@Column
	private String stage_name;
	@Column
	private String inbound_service_name;
	@Column
	private String inbound_service_uri;
	@Column
	private String inbound_operation;
	@Column
	private String outbound_service_name;
	@Column
	private String outbound_service_uri;
	@Column
	private String outbound_operation;
	@Column
	private String msg_labels;
	@Column
	private String error_code;
	@Column
	private String error_reason;
	@Column
	private String error_details;
	
	

//	@OneToOne(mappedBy="message_store")
	//private MessageStoreData message_store_data;
	
	 /**
	  * Default Constructor
	  */
	 public MessageStore()
	 {}

	

	/**
	 * @param msg_guid
	 * @param db_timestamp
	 * @param localhost_timestamp
	 * @param host_name
	 * @param state
	 * @param node
	 * @param pipeline_name
	 * @param stage_name
	 * @param inbound_service_name
	 * @param inbound_service_uri
	 * @param inbound_operation
	 * @param outbound_service_name
	 * @param outbound_service_uri
	 * @param outbound_operation
	 * @param msg_labels
	 * @param error_code
	 * @param error_reason
	 * @param error_details
	 * @param message_store_data
	 */
	public MessageStore(String msg_guid, String db_timestamp, String localhost_timestamp, String host_name,
			String state, String node, String pipeline_name, String stage_name, String inbound_service_name,
			String inbound_service_uri, String inbound_operation, String outbound_service_name,
			String outbound_service_uri, String outbound_operation, String msg_labels, String error_code,
			String error_reason, String error_details, MessageStoreData message_store_data) {
		super();
		this.msg_guid = msg_guid;
		this.db_timestamp = db_timestamp;
		this.localhost_timestamp = localhost_timestamp;
		this.host_name = host_name;
		this.state = state;
		this.node = node;
		this.pipeline_name = pipeline_name;
		this.stage_name = stage_name;
		this.inbound_service_name = inbound_service_name;
		this.inbound_service_uri = inbound_service_uri;
		this.inbound_operation = inbound_operation;
		this.outbound_service_name = outbound_service_name;
		this.outbound_service_uri = outbound_service_uri;
		this.outbound_operation = outbound_operation;
		this.msg_labels = msg_labels;
		this.error_code = error_code;
		this.error_reason = error_reason;
		this.error_details = error_details;
		//this.message_store_data = message_store_data;
	}

	/**
	 * @return the msg_guid
	 */
	public String getMsg_guid() {
		return msg_guid;
	}

	/**
	 * @param msg_guid
	 *            the msg_guid to set
	 */
	public void setMsg_guid(String msg_guid) {
		this.msg_guid = msg_guid;
	}

	/**
	 * @return the db_timestamp
	 */
	public String getDb_timestamp() {
		return db_timestamp;
	}

	/**
	 * @param db_timestamp
	 *            the db_timestamp to set
	 */
	public void setDb_timestamp(String db_timestamp) {
		this.db_timestamp = db_timestamp;
	}

	/**
	 * @return the localhost_timestamp
	 */
	public String getLocalhost_timestamp() {
		return localhost_timestamp;
	}

	/**
	 * @param localhost_timestamp
	 *            the localhost_timestamp to set
	 */
	public void setLocalhost_timestamp(String localhost_timestamp) {
		this.localhost_timestamp = localhost_timestamp;
	}

	/**
	 * @return the host_name
	 */
	public String getHost_name() {
		return host_name;
	}

	/**
	 * @param host_name
	 *            the host_name to set
	 */
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the node
	 */
	public String getNode() {
		return node;
	}

	/**
	 * @param node
	 *            the node to set
	 */
	public void setNode(String node) {
		this.node = node;
	}

	/**
	 * @return the pipeline_name
	 */
	public String getPipeline_name() {
		return pipeline_name;
	}

	/**
	 * @param pipeline_name
	 *            the pipeline_name to set
	 */
	public void setPipeline_name(String pipeline_name) {
		this.pipeline_name = pipeline_name;
	}

	/**
	 * @return the stage_name
	 */
	public String getStage_name() {
		return stage_name;
	}

	/**
	 * @param stage_name
	 *            the stage_name to set
	 */
	public void setStage_name(String stage_name) {
		this.stage_name = stage_name;
	}

	/**
	 * @return the inbound_service_name
	 */
	public String getInbound_service_name() {
		return inbound_service_name;
	}

	/**
	 * @param inbound_service_name
	 *            the inbound_service_name to set
	 */
	public void setInbound_service_name(String inbound_service_name) {
		this.inbound_service_name = inbound_service_name;
	}

	/**
	 * @return the inbound_service_uri
	 */
	public String getInbound_service_uri() {
		return inbound_service_uri;
	}

	/**
	 * @param inbound_service_uri
	 *            the inbound_service_uri to set
	 */
	public void setInbound_service_uri(String inbound_service_uri) {
		this.inbound_service_uri = inbound_service_uri;
	}

	/**
	 * @return the inbound_operation
	 */
	public String getInbound_operation() {
		return inbound_operation;
	}

	/**
	 * @param inbound_operation
	 *            the inbound_operation to set
	 */
	public void setInbound_operation(String inbound_operation) {
		this.inbound_operation = inbound_operation;
	}

	/**
	 * @return the outbound_service_name
	 */
	public String getOutbound_service_name() {
		return outbound_service_name;
	}

	/**
	 * @param outbound_service_name
	 *            the outbound_service_name to set
	 */
	public void setOutbound_service_name(String outbound_service_name) {
		this.outbound_service_name = outbound_service_name;
	}

	/**
	 * @return the outbound_service_uri
	 */
	public String getOutbound_service_uri() {
		return outbound_service_uri;
	}

	/**
	 * @param outbound_service_uri
	 *            the outbound_service_uri to set
	 */
	public void setOutbound_service_uri(String outbound_service_uri) {
		this.outbound_service_uri = outbound_service_uri;
	}

	/**
	 * @return the outbound_operation
	 */
	public String getOutbound_operation() {
		return outbound_operation;
	}

	/**
	 * @param outbound_operation
	 *            the outbound_operation to set
	 */
	public void setOutbound_operation(String outbound_operation) {
		this.outbound_operation = outbound_operation;
	}

	/**
	 * @return the msg_labels
	 */
	public String getMsg_labels() {
		return msg_labels;
	}

	/**
	 * @param msg_labels
	 *            the msg_labels to set
	 */
	public void setMsg_labels(String msg_labels) {
		this.msg_labels = msg_labels;
	}

	/**
	 * @return the error_code
	 */
	public String getError_code() {
		return error_code;
	}

	/**
	 * @param error_code
	 *            the error_code to set
	 */
	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	/**
	 * @return the error_reason
	 */
	public String getError_reason() {
		return error_reason;
	}

	/**
	 * @param error_reason
	 *            the error_reason to set
	 */
	public void setError_reason(String error_reason) {
		this.error_reason = error_reason;
	}

	/**
	 * @return the error_details
	 */
	public String getError_details() {
		return error_details;
	}

	/**
	 * @param error_details
	 *            the error_details to set
	 */
	public void setError_details(String error_details) {
		this.error_details = error_details;
	}
	
	/*public MessageStoreData getMessage_store_data() {
		return message_store_data;
	}

	public void setMessage_store_data(MessageStoreData message_store_data) {
		this.message_store_data = message_store_data;
	}*/

}

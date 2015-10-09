package tony.project.language.domain;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import tony.project.language.interfaces.StaffDM;

@DynamoDBTable(tableName="Staff")
public class Staff extends RootObject<Staff> implements StaffDM {

	private Integer staffID;
	private String staffName;
	private String accountName;
	private String password;
	private String privateEmail;
	private Integer authority;
	
	@DynamoDBHashKey(attributeName="StaffID")
	public Integer getStaffID() {return staffID;}
	public void setStaffID(Integer staffID) {this.staffID = staffID;}
	
	@DynamoDBAttribute(attributeName="StaffName")
	public String getStaffName() {return staffName;}
	public void setStaffName(String staffName) {this.staffName = staffName;}
	
	
	@DynamoDBIndexRangeKey(attributeName="AccountName-index")
	public String getAccountName() {return accountName;}
	public void setAccountName(String accountName) {this.accountName = accountName;}
	
	@DynamoDBAttribute(attributeName="Password")
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	@DynamoDBAttribute(attributeName="PrivateEmail")
	public String getPrivateEmail() {return privateEmail;}
	public void setPrivateEmail(String privateEmail) {this.privateEmail = privateEmail;}
	
	@DynamoDBAttribute(attributeName="Authority")
	public Integer getAuthority() {return authority;}
	public void setAuthority(Integer authority) {this.authority = authority;}
	
	
	public Staff(Integer staffID, String staffName, String accountName, String password, String privateEmail,
			Integer authority) {
		super();
		this.staffID = staffID;
		this.staffName = staffName;
		this.accountName = accountName;
		this.password = password;
		this.privateEmail = privateEmail;
		this.authority = authority;
	}
	
	
	public Staff() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Staff [staffID=" + staffID + ", staffName=" + staffName + 
				", accountName=" + accountName + ", password="
				+ password + ", privateEmail=" + privateEmail + 
				", authority=" + authority + "]";
	}
	@Override
	public void saveStaffByMapper(Staff user) {

		
		saveByMapper(user);
	}
	@Override
	public Staff loadAStaffByMapper(Integer hashKey) {

		Staff user = loadByMapper(hashKey);
		
		return user;
	}
	@Override
	public void deleteAStaffByMapper(Integer hashKey) {

		deleteByMapper(hashKey);
		
	}
	
	
	
	
	
	
	
}

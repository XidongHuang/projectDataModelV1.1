package tony.project.language.domain;

import java.util.List;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import tony.project.language.initial.Initial;
import tony.project.language.interfaces.InstructorDM;

@DynamoDBTable(tableName = "Instructor")
public class Instructor extends Staff implements InstructorDM{

	private List<Integer> levelID;
	private List<String> courses;
	private Boolean upload;
	
	@DynamoDBAttribute(attributeName="LevelID")
	public List<Integer> getLevelID() {return levelID;}
	public void setLevelID(List<Integer> levelID) {this.levelID = levelID;}

	@DynamoDBAttribute(attributeName="Courses")
	public List<String> getCourses() {return courses;}
	public void setCourses(List<String> courses) {this.courses = courses;}

	@DynamoDBIndexRangeKey(attributeName="Upload")
	public Boolean getUpload() {return upload;}
	public void setUpload(Boolean upload) {this.upload = upload;}

	

	
	
	
	@Override
	public String toString() {
		return "Instructor [levelID=" + levelID + ", courses=" + courses + ", upload=" + upload + "]";
	}
	
	
	public Instructor(Integer staffID, String staffName, String accountName, String password, String privateEmail,
			Integer authority) {
		super(staffID, staffName, accountName, password, privateEmail, authority);
	}
	
	
	public Instructor(Integer staffID, String staffName, String accountName, String password, String privateEmail,
			Integer authority, List<Integer> levelID, List<String> courses, Boolean upload) {
		super(staffID, staffName, accountName, password, privateEmail, authority);
		this.levelID = levelID;
		this.courses = courses;
		this.upload = upload;
	}
	
	
	@Override
	public void saveInsructorByMapper(Instructor instructor) {

		saveByMapper(instructor);
	}
	
	
	@Override
	public Instructor loadInstructorByMapper(Integer staffID) {

		AmazonDynamoDBClient client = Initial.getClient();
		DynamoDBMapper mapper = new DynamoDBMapper(client);
		Instructor instructor = mapper.load(this.getClass(), staffID);
		System.out.println(instructor);
		return instructor;
	}
	
	
	@Override
	public void delteInstructor(Integer staffID) {

		deleteByMapper(staffID);
		
	}
	

	
	
	
}

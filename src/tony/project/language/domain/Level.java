package tony.project.language.domain;

import java.util.Date;
import java.util.List;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIndexHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import tony.project.language.interfaces.LevelDM;


@DynamoDBTable(tableName="Level")
public class Level extends RootObject<Level> implements LevelDM {

	private Integer levelID;
	private String levelName;
	private Date semester;
	private List<String> courses;
	private Integer studentAmount;
	private List<String> students;
	private Double failRate;
	private Integer failStudentAmount;
	private List<Integer> failStudents;
	
	
	@DynamoDBHashKey(attributeName="LevelID")
	public Integer getLevelID() {return levelID;}
	public void setLevelID(Integer levelID) {this.levelID = levelID;}
	
	@DynamoDBAttribute(attributeName="LeveName")
	public String getLevelName() {return levelName;}
	public void setLevelName(String levelName) {this.levelName = levelName;}

	@DynamoDBIndexHashKey(attributeName="Semester")
	public Date getSemester() {return semester;}
	public void setSemester(Date semester) {this.semester = semester;}
	
	@DynamoDBAttribute(attributeName="Courses")
	public List<String> getCourses() {return courses;}
	public void setCourses(List<String> courses) {this.courses = courses;}
	
	@DynamoDBAttribute(attributeName="StudentAmount")
	public Integer getStudentAmount() {return studentAmount;}
	public void setStudentAmount(Integer studentAmount) {this.studentAmount = studentAmount;}
	
	@DynamoDBAttribute(attributeName="Students")
	public List<String> getStudents() {return students;}
	public void setStudents(List<String> students) {this.students = students;}
	
	@DynamoDBAttribute(attributeName="FailRate")
	public Double getFailRate() {return failRate;}
	public void setFailRate(Double failRate) {this.failRate = failRate;}
	
	@DynamoDBAttribute(attributeName="FailStudentAmount")
	public Integer getFailStudentAmount() {return failStudentAmount;}
	public void setFailStudentAmount(Integer failStudentAmount) {this.failStudentAmount = failStudentAmount;}
	
	@DynamoDBAttribute(attributeName="FailStudents")
	public List<Integer> getFailStudents() {return failStudents;}
	public void setFailStudents(List<Integer> failStudents) {this.failStudents = failStudents;}
	
	
	public Level() {
		super();
	}
	
	public Level(Integer levelID, String levelName, Date semester, List<String> courses, Integer studentAmount,
			List<String> students, Double failRate, Integer failStudentAmount, List<Integer> failStudents) {
		super();
		this.levelID = levelID;
		this.levelName = levelName;
		this.semester = semester;
		this.courses = courses;
		this.studentAmount = studentAmount;
		this.students = students;
		this.failRate = failRate;
		this.failStudentAmount = failStudentAmount;
		this.failStudents = failStudents;
	}
	
	
	@Override
	public String toString() {
		return "Level [levelID=" + levelID + ", levelName=" + levelName + ", semester=" + semester + ", courses="
				+ courses + ", studentAmount=" + studentAmount + ", students=" + students + ", failRate=" + failRate
				+ ", failStudentAmount=" + failStudentAmount + ", failStudents=" + failStudents + "]";
	}
	@Override
	public void saveLevelByMapper(Level level) {

		saveByMapper(level);
		
	}
	
	@Override
	public Level loadLevelByMapper(String levelID) {
		Level level = loadByMapper(levelID);
		
		return level;
	}
	@Override
	public void deleteLevelByMapper(String levelID) {

		deleteByMapper(levelID);
	}

	
	
	
	
	
	
	
	
}

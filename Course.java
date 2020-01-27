import java.util.ArrayList;

public class Course 
{
	private String name;
	private String courseID;
	private int maxNumber;
	private int currentNumber;
	private ArrayList<String> names;
	private String instructor;
	private int sectionNumber;
	private String location;
	
	public Course()
	{
		name= null;
		courseID= null;
		maxNumber= -1;
		currentNumber= -1;
		names= null;
		instructor= null;
		sectionNumber= -1;
		location= null;		
	}
	
	public Course(String name, String courseID, int maxNumber, int currentNumber, ArrayList<String> names, String instructor, int sectionNumber, String location)
	{
		this.name= name;
		this.courseID= courseID;
		this.maxNumber= maxNumber;
		this.currentNumber= currentNumber;
		this.names= names;
		this.instructor= instructor;
		this.sectionNumber= sectionNumber;
		this.location= location;		
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getCourseID()
	{
		return courseID;
	}

	public int getMaxNumber()
	{
		return maxNumber;
	}
	
	public int getCurrentNumber()
	{
		return currentNumber;
	}
	
	public ArrayList<String> getNames()
	{
		return names;
	}
	
	public String getInstructor()
	{
		return instructor;
	}
	
	public int getSectionNumber()
	{
		return sectionNumber;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public void setCourseID(String courseID)
	{
		this.courseID= courseID;
	}

	public void setMaxNumber(int maxNumber)
	{
		this.maxNumber= maxNumber;
	}
	
	public void setCurrentNumber(int currentNumber)
	{
		this.currentNumber= currentNumber;
	}
	
	public void setNames(ArrayList<String> names)
	{
		this.names= names;
	}
	
	public void setInstructor(String instructor)
	{
		this.instructor= instructor;
	}
	
	public void setSectionNumber(int sectionNumber)
	{
		this.sectionNumber= sectionNumber;
	}
	
	public void setLocation(String location)
	{
		this.location= location;
	}
	
	public String toString()
	{
		String returnString = "";
		
		returnString+= name+courseID+maxNumber+currentNumber+names+instructor+sectionNumber+location;
		
		return returnString;
	}
	
	
}

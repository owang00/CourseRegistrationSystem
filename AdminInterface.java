import java.util.ArrayList;

public interface AdminInterface 
{
	//Course Management Methods
	public ArrayList<Course> createCourse(ArrayList<Course> listOfCourses, Course course);
	public ArrayList<Course> deleteCourse(ArrayList<Course> listOfCourses, String courseID);
	public ArrayList<Course> editCourse(ArrayList<Course> listOfCourses, String courseID, int maxNumber, int currentNumber, ArrayList<String> names, String instructor, int sectionNumber, String location);
	public Course displayCourse(ArrayList<Course> listOfCourses, String courseID);
	public ArrayList<Student> registerStudent(ArrayList<Student> listOfStudents, Student student);
	
	
	//Reports Method
	public void viewAllCourses(ArrayList<Course> listOfCourses);
	public void viewFullCourses(ArrayList<Course> listOfCourses);
	public void fullWriteToFile();
	public void courseStudents(ArrayList<Course> listOfCourses, String courseID);
	public void studentCourses(ArrayList<Course> listOfCourses, String firstName, String lastName);
	public ArrayList<Course> sortCourses(ArrayList<Course> courses);
}

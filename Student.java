
public class Student extends User implements StudentInterface
{
	private ArrayList<String> registeredCourses; // FILLED WITH COURSE ID'S
	
	public Student()
	{
		super.setUsername("User");
		super.setPassword("Pass");
	}
	
	public Student(String user, String pass)
	{
		super.setUsername(user);
		super.setPassword(pass);
	}
}

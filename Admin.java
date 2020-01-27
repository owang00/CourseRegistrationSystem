import java.util.ArrayList;

public class Admin extends User implements AdminInterface
{	
	public Admin()
	{
		super.setUsername("Admin");
		super.setPassword("Admin001");
	}
	
	//Course Management Methods
	public ArrayList<Course> createCourse(ArrayList<Course> listOfCourses, Course course)
	{
		listOfCourses.add(course);
		return listOfCourses;
	}
	public ArrayList<Course> deleteCourse(ArrayList<Course> listOfCourses, String courseID) 
	{
		for(int i=0; i<listOfCourses.size(); i++)
		{
			if( (listOfCourses.get(i).getCourseID()).equals(courseID) )
			{
				listOfCourses.remove(i);
				return listOfCourses;
			}
		}
		System.out.println("Cannot find course.");
		return listOfCourses;
	}
	public ArrayList<Course> editCourse(ArrayList<Course> listOfCourses, String courseID, int maxNumber, int currentNumber, ArrayList<String> names, String instructor, int sectionNumber, String location)
	{
		for(int i=0; i<listOfCourses.size(); i++)
		{
			if( (listOfCourses.get(i).getCourseID()).equals(courseID) )
			{
				listOfCourses.get(i).setMaxNumber(maxNumber);
				listOfCourses.get(i).setCurrentNumber(currentNumber);
				listOfCourses.get(i).setNames(names);
				listOfCourses.get(i).setInstructor(instructor);
				listOfCourses.get(i).setSectionNumber(sectionNumber);
				listOfCourses.get(i).setLocation(location);
				return listOfCourses;
			}
		}
		
		System.out.println("Cannot find course.");
		return listOfCourses;
	}
	
	/*********
	 * CHANGE THIS TO VOID JUST PRINT IT OUT INSTEAD OF RETURNING SOMETHING
	 */
	public Course displayCourse(ArrayList<Course> listOfCourses, String courseID)
	{
		for(int i=0; i<listOfCourses.size(); i++)
		{
			if( (listOfCourses.get(i).getCourseID()).equals(courseID) )
			{
				return listOfCourses.get(i);
			}
		}
		
		System.out.println("Cannot find course.");
		return null;
	}
	public ArrayList<Student> registerStudent(ArrayList<Student> listOfStudents, Student student) 
	{
		listOfStudents.add(student);
		
		/*
		 * 
		 * REMEMBER TO CHANGE THE COURSES THAT THE STUDENTS ARE REGISTERED IN
		 * 
		 */
		return listOfStudents;
	}
	
	
	//Reports Method
	public void viewAllCourses(ArrayList<Course> listOfCourses)
	{
		/* student’s names
		 * enrolled student’s ids
		 * number of students registered
		 * maximum number of students allowed to be registered
		*/
		for(int i=0; i<listOfCourses.size(); i++)
		{
			System.out.println(listOfCourses.get(i));
		}
		
	}
	public void viewFullCourses(ArrayList<Course> listOfCourses)
	{
		for(int i=0; i<listOfCourses.size(); i++)
		{
			if(listOfCourses.get(i).getCurrentNumber()==listOfCourses.get(i).getMaxNumber())
				System.out.println(listOfCourses.get(i));
		}
	}
	public void fullWriteToFile()
	{
		
	}
	public void courseStudents(ArrayList<Course> listOfCourses, String courseID)
	{
		for(int i=0; i<listOfCourses.size(); i++)
		{
			if(listOfCourses.get(i).getCourseID().equalsIgnoreCase(courseID))
			{
				for(int x=0; x<listOfCourses.get(x).getNames().size(); x++)
				{
					System.out.println(listOfCourses.get(i).getNames().get(x));
				}
			}
		}
	}
	public void studentCourses(ArrayList<Student> listOfStudents, String firstName, String lastName)
	{
		for(int i=0; i<listOfStudents.size(); i++)
		{
			if( (listOfStudents.get(i).getFirstName().equalsIgnoreCase(firstName)) && (listOfStudents.get(i).getLastName().equalsIgnoreCase(lastName)) )
			{
				for(int x=0; x<listOfStudents.get(x).g().size(); x++)
				{
					System.out.println(listOfCourses.get(i).getNames().get(x));
				}
			}
		}
	}
	public ArrayList<Course> sortCourses(ArrayList<Course> courses)
	{
		
	}
}

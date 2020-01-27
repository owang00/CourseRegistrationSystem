import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Runner
{
    static ArrayList<Course> listOfCourses;

    public static void main(String[]args)
    {
        listOfCourses= new ArrayList<Course>();
        ArrayList<Student> listOfStudents= new ArrayList<Student>();

        ReadCourseFile();   // read in csv text file and create course list


        String input="";
        Admin root= new Admin();

        root.deleteCourse(listOfCourses, listOfCourses.get(1).getCourseID());


        do
        {



        }while(!(input.equalsIgnoreCase("quit")));
    }

    private static void ReadCourseFile()
    {
        String csvFile = "MyUniversityCourses.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try
        {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null)
            {
                // use comma as separator
                String[] eachLine = line.split(cvsSplitBy);
                listOfCourses.add(new Course(eachLine[0], eachLine[1], Integer.parseInt(eachLine[2]),
                        Integer.parseInt(eachLine[3]), null, eachLine[5],
                        Integer.parseInt(eachLine[6]), eachLine[7]));
            }
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (br != null)
            {
                try
                {
                    br.close();
                } catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}

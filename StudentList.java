import java.util.*;
public class StudentList
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String llamo = "";
        ArrayList<Student> roster = new ArrayList<Student>();
        roster.add(new Student("Phillip", "Phil@gmail.com", 789015));
        roster.add(new Student("Ben", "Ben@gmail.com", 789016));
        roster.add(new Student("Jacob", "Jacob@gmail.com", 789017));
        System.out.println(studentFinder("Phillip"));//trying to use the method from the other class to find a student, in this case Phillip.
        roster.add(new Student("Jerry", "Jerry@gmail.com", 789018)); //step 3, adding a new student whose name is jerry
        roster.remove("Phillip", "Phillip@gamil.com", 789015); //Step 4
        for(int i = 0; i < roster.size(); i++)
        {
        System.out.println(roster);
        }
    }
}
//for step 2, i want to use a sequential search, since there are
//only 3 elements in this array, but I forgot how the syntax for a sequential search.
import java.util.*;
public class Student
{
    private String name;
    private String email;
    private int id;
    public Student(String initName, String initEmail, int initId)
    {
        name = initName;
        email = initEmail;
        id = initId;
    }
    //Step 2 attempt; trying to use my sequential search, but I am a little confused on how to connect this to the other code that I have.
    public static int studentFinder(ArrayList<Student> kids, String kid)
    {
        for(int q = 0; q < kids.size(); q++)
        {
            if(kids.get(q).equals(kid))
            {
                return q;
            }
            
        }
        return -1;
    }
/*public String toString()
{
return("Identity: " + name + "Mensaje electronico: " + email
+ "Identificacion: " + id);
}
*/
}
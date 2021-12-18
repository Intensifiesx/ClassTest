import java.util.*;

public class testCourse
{
  public static void main(String [] args){
      //TEST 1
      Course c1 = new Course();
      System.out.println(c1);
      System.out.println("");
      
      //TEST 2
      System.out.println(c1.printStudents());
      
      //TEST 3
      Address a1 = new Address("Happy Lane", "12345");
      Student s2 = new Student("Bob", 555, a1);
      System.out.println(c1.setStudent(s2));
      System.out.println(c1.setStudent(s2, 1));
      System.out.println(c1.printStudents());
      
      //TEST 4
      c1.setName("Marketing");
      Faculty f1 = new Faculty("Ms. Smith", a1);
      c1.setFaculty(f1);
      System.out.println(c1);
      System.out.println("");
      
      //TEST 5
      Course c2 = new Course("COURSE2", f1, 21);
      System.out.println(c2.getStudent(25));
      System.out.println("");
      
      //TEST 6
      System.out.println(c2);
  }
}

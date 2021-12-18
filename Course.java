import java.util.*;

public class Course
{
    private String name;
    private Faculty f;
    private Student[] s;
    private int count;
    
    public Course(){
        name = "Default";
        f = new Faculty();
        count = 3;
        s = new Student[50];
        
        for(int i = 0; i < count; i++){
            s[i] = new Student();
        }
    }
    public Course(String name, Faculty f, int count){
        this.name = name;
        this.f = f;
        this.count = count;
        s = new Student[50];
        
        for(int i = 0; i < count; i++){
            s[i] = new Student();
        }
    }
    public String getName(){
        return name;
    }
    public Faculty getFaculty(){
        return f;
    }
    public String getStudent(int index){
        if(index < count - 1){
            return s[index].toString();
        }else{
            return "Error. Input Validation Error.";
        }
    }
    public int getCount(){
        return count;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setFaculty(Faculty f){
        this.f = f;
    }
    public int setStudent(Student newS){
        if(count >= 50){
            return -1;
        }
        s[count] = newS;
        count++;
        
        return count - 1;
    }
    public int setStudent(Student newS, int i){
        if(i >= 50){
            return -1;
        }
        else if(i > count){
            s[count] = newS;
            count++;
            return count - 1;
        } 
        else{
            s[i] = newS;
            return i;
        }
    }
    public String printStudents(){
        String answer = "";
        
        for(int i = 0; i < count; i++){
            answer += s[i].toString() + "\n\n";
        }
        return answer;
    }
    public String toString(){
        return "Course Name: " + name + " \n" + f.toString() + " \nNumber of Students: " + count;
    }
}
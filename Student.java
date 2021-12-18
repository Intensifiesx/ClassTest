import java.util.*;

public class Student
{
    private String name;
    private int id;
    private Address ad;
    
    public Student(){
        name = "Default Name";
        id = 0;
        ad = new Address();
    }
    public Student(String name, int id, Address ad){
        this.name = name;
        this.id = id;
        this.ad = ad;
    }
    public String getName(){
        return name;
    } 
    public int getId(){
        return id;
    } 
    public Address getAddress(){
        return ad;
    } 
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    } 
    public void setAddress(Address ad){
        this.ad = ad;
    } 
    public String toString(){
        return "Name: " + name + " \nId: " + id + " \n" + ad;
    }
}

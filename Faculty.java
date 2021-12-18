import java.util.*;

public class Faculty
{
    private String name;
    private Address ad;
    
    public Faculty(){
        name = "N/A";
        ad = new Address();
    }
    public Faculty(String name, Address ad){
        this.name = name;
        this.ad = ad;
    }
    public String getName(){
        return name;
    } 
    public Address getAddress(){
        return ad;
    } 
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(Address ad){
        this.ad = ad;
    } 
    public String toString(){
        return "Name: " + name + " \n" + ad;
    }
}
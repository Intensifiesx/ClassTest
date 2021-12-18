import java.util.*;

public class Address {
    private String street;
    private String zip;

    public Address() {
        street = "Default Street";
        zip = "00000";
    }

    public Address(String a, String b) {
        this.street = a;
        this.zip = b;
    }

    public String getAddress() {
        return street;
    }

    public String getZip() {
        return zip;
    }

    public void setAddress(String street) {
        this.street = street;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String toString() {
        return "Street Address: " + street + " \nZip Code: " + zip;
    }
}

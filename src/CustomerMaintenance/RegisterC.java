/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerMaintenance;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//
/**
 *
 * @author: Khiew Choon Hong
 */

public class RegisterC {
    private static int nextID = 1000;
    private int id;
    private String name;
    private String ic;
    private int contactNumber;
    private String companyName;
    private String emailAddress;
    private String mailingAddress;
    private String gender;
    private String status;

    private List<RegisterC> customerList = new ArrayList<RegisterC>();
    
    public List<RegisterC> getCustomerList()
    {
        return customerList;
    }
    
    public void setCustomerList(List<RegisterC> customerList)
    {
        this.customerList = customerList;
    }
    
    public RegisterC()
    {
    }
    
    
    public RegisterC(int id) {
        this.id = id;
    }
  
    public RegisterC(String name) {
        this.name = name;
        //this.id = nextID++;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        RegisterC.nextID = nextID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RegisterC(String name, String ic, int contactNumber, String companyName, String emailAddress, String mailingAddress, String gender, String status) {
        this.name = name;
        this.ic = ic;
        this.contactNumber = contactNumber;
        this.companyName = companyName;
        this.emailAddress = emailAddress;
        this.mailingAddress = mailingAddress;
        this.gender = gender;
        this.status = status;
        this.id = nextID++;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.ic);
        hash = 41 * hash + this.contactNumber;
        hash = 41 * hash + Objects.hashCode(this.companyName);
        hash = 41 * hash + Objects.hashCode(this.emailAddress);
        hash = 41 * hash + Objects.hashCode(this.mailingAddress);
        hash = 41 * hash + Objects.hashCode(this.gender);
        hash = 41 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RegisterC other = (RegisterC) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.contactNumber != other.contactNumber) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.ic, other.ic)) {
            return false;
        }
        if (!Objects.equals(this.companyName, other.companyName)) {
            return false;
        }
        if (!Objects.equals(this.emailAddress, other.emailAddress)) {
            return false;
        }
        if (!Objects.equals(this.mailingAddress, other.mailingAddress)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString() {
        return String.format("No. %-10d %-20s %-10s %-13d %-20s %-20s %-70s %-6s %-20s\n", id, name, ic, contactNumber, companyName, emailAddress, mailingAddress, gender, status);
    }
}
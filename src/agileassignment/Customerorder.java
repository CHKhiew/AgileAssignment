/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agileassignment;

public class Customerorder {

    private String name;
    private int ic;
    private int contactNumber;
    private String emailAddress;
    private String mailingAddress;
    private char gender;
    private String status;
    private int creditLimit;

    public Customerorder() {
    }

    public Customerorder(String name, int ic, int contactNumber, String emailAddress, String mailingAddress, char gender, String status,int creditLimit) {
        this.name = name;
        this.ic = ic;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.mailingAddress = mailingAddress;
        this.gender = gender;
        this.status = status;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIc() {
        return ic;
    }

    public void setIc(int ic) {
        this.ic = ic;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }
    
    
}

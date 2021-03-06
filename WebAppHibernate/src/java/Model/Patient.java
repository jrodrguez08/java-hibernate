package Model;
// Generated 18/05/2016 08:50:39 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Patient generated by hbm2java
 */
public class Patient  implements java.io.Serializable {


     private String userId;
     private User user;
     private Date birth;
     private String address;
     private String email;
     private String phone;
     private Patientrecord patientrecord;

    public Patient() {
    }

	
    public Patient(User user, Date birth, String address, String email, String phone) {
        this.user = user;
        this.birth = birth;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }
    public Patient(User user, Date birth, String address, String email, String phone, Patientrecord patientrecord) {
       this.user = user;
       this.birth = birth;
       this.address = address;
       this.email = email;
       this.phone = phone;
       this.patientrecord = patientrecord;
    }
   
    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Date getBirth() {
        return this.birth;
    }
    
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Patientrecord getPatientrecord() {
        return this.patientrecord;
    }
    
    public void setPatientrecord(Patientrecord patientrecord) {
        this.patientrecord = patientrecord;
    }




}



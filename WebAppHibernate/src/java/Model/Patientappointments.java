package Model;
// Generated 18/05/2016 08:50:39 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Patientappointments generated by hbm2java
 */
public class Patientappointments  implements java.io.Serializable {


     private PatientappointmentsId id;
     private Doctor doctor;
     private Patientrecord patientrecord;
     private Date date;
     private String time;
     private String description;
     private String results;

    public Patientappointments() {
    }

	
    public Patientappointments(PatientappointmentsId id, Doctor doctor, Patientrecord patientrecord) {
        this.id = id;
        this.doctor = doctor;
        this.patientrecord = patientrecord;
    }
    public Patientappointments(PatientappointmentsId id, Doctor doctor, Patientrecord patientrecord, Date date, String time, String description, String results) {
       this.id = id;
       this.doctor = doctor;
       this.patientrecord = patientrecord;
       this.date = date;
       this.time = time;
       this.description = description;
       this.results = results;
    }
   
    public PatientappointmentsId getId() {
        return this.id;
    }
    
    public void setId(PatientappointmentsId id) {
        this.id = id;
    }
    public Doctor getDoctor() {
        return this.doctor;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Patientrecord getPatientrecord() {
        return this.patientrecord;
    }
    
    public void setPatientrecord(Patientrecord patientrecord) {
        this.patientrecord = patientrecord;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getResults() {
        return this.results;
    }
    
    public void setResults(String results) {
        this.results = results;
    }




}


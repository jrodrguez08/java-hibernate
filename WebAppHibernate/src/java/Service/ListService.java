/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Controller.NewHibernateUtil;
import Model.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author j.a.rodriguez.lopez
 */
public class ListService {

    public List<Doctor> getAllDoctors() {
        List<Doctor> listDoctor = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List doctors = session.createQuery("from Doctor").list();
            for (Iterator it = doctors.iterator(); it.hasNext();) {
                Doctor doctor = (Doctor) it.next();
                listDoctor.add(doctor);
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return listDoctor;
    }
    
    public List<Patient> getAllPatients() {
        List<Patient> listPatient = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patients = session.createQuery("from Patient").list();
            for (Iterator it = patients.iterator(); it.hasNext();) {
                Patient patient = (Patient) it.next();
                listPatient.add(patient);
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return listPatient;
    }
    
    public List<Patientappointments> getAllPatientsAppointments() {
        List<Patientappointments> listPatientsAppointments = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patients = session.createQuery("from Patientappointments").list();
            for (Iterator it = patients.iterator(); it.hasNext();) {
                Patientappointments patientAppointments = (Patientappointments) it.next();
                listPatientsAppointments.add(patientAppointments);
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return listPatientsAppointments;
    }
    
    public List<Patientappointments> getAllPatientsAppointmentsByPatientId(String patientId) {
        List<Patientappointments> listPatientsAppointments = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patients = session.createQuery("from Patientappointments where patientRecordId='"+patientId+"'").list();
            for (Iterator it = patients.iterator(); it.hasNext();) {
                Patientappointments dummy = (Patientappointments) it.next();
                if(dummy.getPatientrecord().getPatientRecordId().equals(patientId)){
                listPatientsAppointments.add(dummy);
                }
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return listPatientsAppointments;
    }
    
    public Doctor getDoctor(String userId) {
        Doctor doctor = new Doctor();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List doctors = session.createQuery("from Doctor").list();
            for (Iterator it = doctors.iterator(); it.hasNext();) {
                Doctor dummy = (Doctor) it.next();
                if(dummy.getUserId().equals(userId)){
                    doctor = dummy;
                }
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return doctor;
    }
    
    public Patient getPatient(String userId) {
        Patient patient = new Patient();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patients = session.createQuery("from Patient").list();
            for (Iterator it = patients.iterator(); it.hasNext();) {
                Patient dummy = (Patient) it.next();
                if(dummy.getUserId().equals(userId)){
                    patient = dummy;
                }
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return patient;
    }
    
    public int getLastPatientAppointmentId(String userId) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        int counter = 1;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patientAppointments = session.createQuery("from Patientappointments").list();
               for (Iterator it = patientAppointments.iterator(); it.hasNext();) {
                Patientappointments dummy = (Patientappointments) it.next();
                if(dummy.getPatientrecord().getPatientRecordId().equals(userId)){
                    System.out.println(dummy.getPatientrecord().getPatientRecordId());
                    System.out.println(userId);
                    System.out.println(counter);
                    counter++;
                }
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return counter;
    }
    
    public List<Patientappointments> getNextAppointmentsByDoctorId(String userId) {
        List<Patientappointments> listPatientsAppointments = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patientApp = session.createQuery("from Patientappointments where doctorId='"+userId+"' and date > sysdate()").list();
            for (Iterator it = patientApp.iterator(); it.hasNext();) {
                Patientappointments dummy = (Patientappointments) it.next();
                if(dummy.getDoctor().getUserId().equals(userId)){
                listPatientsAppointments.add(dummy);
                }
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return listPatientsAppointments;
    }

    public List<Patientrecord> getAllAppointmentsByPatientRecordId(String patientRecordId) {
        List<Patientrecord> listPatientsRecord = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patientApp = session.createQuery("from Patientappointments where patientRecordId='"+patientRecordId+"'").list();
            for (Iterator it = patientApp.iterator(); it.hasNext();) {
                Patientrecord dummy = (Patientrecord) it.next();
                if(dummy.getPatientRecordId().equals(patientRecordId)){
                listPatientsRecord.add(dummy);
                }
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return listPatientsRecord;
    }
    
    public List<Patientrecord> getAllPatientsRecords() {
        List<Patientrecord> listPatientsRecord = new ArrayList<>();
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            List patientApp = session.createQuery("from Patientrecord").list();
            for (Iterator it = patientApp.iterator(); it.hasNext();) {
                Patientrecord patientRecord = (Patientrecord) it.next();
                listPatientsRecord.add(patientRecord);
            }
            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return listPatientsRecord;
    }
}

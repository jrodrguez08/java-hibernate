/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Controller.NewHibernateUtil;
import Model.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author j.a.rodriguez.lopez
 */
public class EditService {

    public void edit(Doctor doctor, String userId) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Doctor doc = (Doctor) session.get(Doctor.class, userId);
            System.out.println("agarro " + doc.getUserId());
            doc.setUser(doctor.getUser());
            doc.setPhone(doctor.getPhone());
            doc.setEmail(doctor.getEmail());
            session.update(doc);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public void edit(Patient patient, String userId) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Patient pat = (Patient) session.get(Patient.class, userId);
            pat.setUser(patient.getUser());
            pat.setPhone(patient.getPhone());
            pat.setEmail(patient.getEmail());
            pat.setBirth(patient.getBirth());
            pat.setAddress(patient.getAddress());
            session.update(pat);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public void edit(User user, String userId) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            User us = (User) session.get(User.class, userId);
            System.out.println("agarro " + us.getUserId());
            us.setUserId(user.getUserId());
            us.setPassword(user.getPassword());
            us.setFullName(user.getFullName());
            session.update(us);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    public void edit(Patientappointments patientAppointments, PatientappointmentsId paID) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Patientappointments patApp = (Patientappointments) session.get(Patientappointments.class, paID);
            patApp.setDate(patientAppointments.getDate());
            patApp.setTime(patientAppointments.getTime());
            patApp.setDoctor(patientAppointments.getDoctor());
            patApp.setPatientrecord(patientAppointments.getPatientrecord());
            patApp.setId(patientAppointments.getId());
            patApp.setDescription(patientAppointments.getDescription());
            patApp.setResults(patientAppointments.getResults());
            session.update(patApp);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

}

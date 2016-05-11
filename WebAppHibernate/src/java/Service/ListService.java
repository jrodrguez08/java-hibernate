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

}

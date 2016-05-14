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

}

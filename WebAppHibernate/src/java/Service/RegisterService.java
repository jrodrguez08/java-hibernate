/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Controller.NewHibernateUtil;
import Model.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author j.a.rodriguez.lopez
 */
public class RegisterService {

    public boolean register(User user) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        if (userExists(user)) {
            return false;
        }

        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(user);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public boolean register(Doctor doctor) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        if (userExists(doctor)) {
            return false;
        }

        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(doctor);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public boolean register(Patient patient) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        if (userExists(patient)) {
            return false;
        }

        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(patient);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public boolean register(Patientrecord patientRecord) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        if (patientRecordExists(patientRecord)) {
            return false;
        }

        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(patientRecord);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public boolean register(Patientappointments patientAppointments) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        if (patientAppointmentExists(patientAppointments)) {
            return false;
        }

        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            session.saveOrUpdate(patientAppointments);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return true;
    }

    public boolean userExists(User user) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        boolean result = false;
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where userId='" + user.getUserId() + "'");
            User u = (User) query.uniqueResult();
            tx.commit();
            if (u != null) {
                result = true;
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public boolean userExists(Doctor doctor) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        boolean result = false;
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where userId='" + doctor.getUser().getUserId() + "'");
            Doctor d = (Doctor) query.uniqueResult();
            tx.commit();
            if (d != null) {
                result = true;
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public boolean userExists(Patient patient) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        boolean result = false;
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from User where userId='" + patient.getUser().getUserId() + "'");
            Patient p = (Patient) query.uniqueResult();
            tx.commit();
            if (p != null) {
                result = true;
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public boolean patientRecordExists(Patientrecord patientRecord) {SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        boolean result = false;
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Patientrecord where patientRecordId='" + patientRecord.getPatientRecordId() + "'");
            System.out.println(patientRecord.getPatientRecordId());
            Patientrecord pR = (Patientrecord) query.uniqueResult();
            tx.commit();
            if (pR != null) {
                result = true;
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

    public boolean patientAppointmentExists(Patientappointments patientAppointments) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sessionFactory.openSession();
        boolean result = false;
        Transaction tx = null;
        try {
            tx = session.getTransaction();
            tx.begin();
            Query query = session.createQuery("from Patientappointments where patientAppointmentsId='" + Integer.parseInt(patientAppointments.getId().toString()) + "'and patientRecordId='" + patientAppointments.getPatientrecord().getPatientRecordId() + "'");
            Patientappointments pA = (Patientappointments) query.uniqueResult();
            tx.commit();
            if (pA != null) {
                result = true;
            }
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
        } finally {
            session.close();
        }
        return result;
    }

}

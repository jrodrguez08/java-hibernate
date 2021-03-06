/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Doctor;
import Model.Patient;
import Model.Patientappointments;
import Model.PatientappointmentsId;
import Model.Patientrecord;
import Service.EditService;
import Service.ListService;
import Service.RegisterService;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andrés
 */
@WebServlet(name = "EditAppointmentFormServlet", urlPatterns = {"/EditAppointmentFormServlet"})
public class EditAppointmentFormServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public Date convertStringToDate(String birthDate) {
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        try {
            date = format.parse(birthDate);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        System.out.println("Fecha del servlet paciente: "+date.toString());
        return date;
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        Date date = convertStringToDate(request.getParameter("appointmentDate"));
        String time = request.getParameter("appointmentTime");
        String doctorId = request.getParameter("selectEditDoctor");
        String patientId = request.getParameter("selectEditPatient");
        String description = request.getParameter("description");
        String results = request.getParameter("results");
        String test = (String) request.getSession().getAttribute("appointmentToEdit");
        System.out.println("Esto: " + test);
        Integer appointmentId = Integer.parseInt(test);
        
        ListService service = new ListService();
        Doctor doctor = service.getDoctor(doctorId);
        Patient patient = service.getPatient(patientId);
        Set patientappointmentses = new HashSet(patient.getPatientrecord().getPatientappointmentses());
        Patientrecord patientRecord = new Patientrecord(patient,patientappointmentses);
        patientRecord.setPatientRecordId(patientId);
        
        
        
        RegisterService registerService = new RegisterService();
        registerService.patientRecordExists(patientRecord);
        
        
        
        PatientappointmentsId patientappointmentsId = new PatientappointmentsId(appointmentId,patientId);
        
        Patientappointments patientAppointments = new Patientappointments(patientappointmentsId,doctor,patientRecord,date,time,description,results);
        
        
       try {
            EditService editService = new EditService();
            editService.edit(patientAppointments, patientappointmentsId);
            response.sendRedirect("doctorAppointmentEdited.jsp");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

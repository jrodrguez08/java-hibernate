/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {

    var nowDate = new Date();
    var today = new Date(nowDate.getFullYear(), nowDate.getMonth(), nowDate.getDate(), 0, 0, 0, 0);

    $('#birthDate').datepicker();

    $('#appointmentDate').datepicker({
        startDate: today
    });

    $('#birthDateEdit').datepicker();

    $('#appointmentTime').timepicker({
        template: false,
        showInputs: false,
        minuteStep: 30
    });


});
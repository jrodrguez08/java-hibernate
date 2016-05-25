/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {

    $("#login").validate({
        rules: {
            user: "required",
            password: "required"
        },
        messages: {
            user: "Por favor ingrese un nombre de usuario",
            password: "Por favor ingrese una contrase&ntilde;a"
        },
        submitHandler: function (form) {
            form.submit();
        }
    });

    $("#addDoctor").validate({
        rules: {
            fullName: "required",
            userId: "required",
            password: "required",
            confirmPassword: {
                required: true,
                equalTo: "#password"
            },
            phone: {
                required: true
            },
            email: {
                required: true,
                email: true
            }
        },
        messages: {
            fullName: "Por favor ingrese un nombre",
            userId: "Por favor ingrese un nombre de usuario",
            password: "Por favor ingrese una contrase&ntilde;a",
            confirmPassword: {
                required: "Por favor confirme su contrase&ntilde;a",
                equalTo: "Debe ser igual a la contrase&ntilde;a antes provista"
            },
            phone: {
                required: "Por favor ingrese un n&uacute;mero de tel&eacute;fono v&aacute;lido"
            },
            email: "Por favor ingrese un email v&aacute;lido"
        },
        submitHandler: function (form) {
            form.submit();
        }
    });

    $("#addPatient").validate({
        rules: {
            fullName: "required",
            userId: "required",
            password: "required",
            confirmPassword: {
                required: true,
                equalTo: "#password"
            },
            birthDate: {
                required: true
            },
            address: "required",
            phone: "required",
            email: {
                required: true,
                email: true
            }
        },
        messages: {
            fullName: "Por favor ingrese un nombre",
            userId: "Por favor ingrese un nombre de usuario",
            password: "Por favor ingrese una contrase&ntilde;a",
            confirmPassword: {
                required: "Por favor confirme su contrase&ntilde;a",
                equalTo: "Debe ser igual a la contrase&ntilde;a antes provista"
            },
            birthDate: {
                required: "Por favor ingrese la fecha de nacimiento del paciente"
            },
            address: "Por favor ingrese la direcci&oacute;n del paciente",
            phone: "Por favor ingrese un n&uacute;mero de tel&eacute;fono v&aacute;lido",
            email: "Por favor ingrese un email v&aacute;lido"
        },
        submitHandler: function (form) {
            form.submit();
        }
    });
    
    $("#editDoctor").validate({
        rules: {
            fullName: "required",
            userId: "required",
            password: "required",
            phone: {
                required: true
            },
            email: {
                required: true,
                email: true
            }
        },
        messages: {
            fullName: "Por favor ingrese un nombre",
            userId: "Por favor ingrese un nombre de usuario",
            password: "Por favor ingrese una contrase&ntilde;a",
            phone: {
                required: "Por favor ingrese un n&uacute;mero de tel&eacute;fono v&aacute;lido"
            },
            email: "Por favor ingrese un email v&aacute;lido"
        },
        submitHandler: function (form) {
            form.submit();
        }
    });
    
    $("#editPatient").validate({
        rules: {
            fullName: "required",
            userId: "required",
            password: "required",
            birthDateEdit: {
                required: true
            },
            address: "required",
            phone: "required",
            email: {
                required: true,
                email: true
            }
        },
        messages: {
            fullName: "Por favor ingrese un nombre",
            userId: "Por favor ingrese un nombre de usuario",
            password: "Por favor ingrese una contrase&ntilde;a",
            birthDateEdit: {
                required: "Por favor ingrese la fecha de nacimiento del paciente"
            },
            address: "Por favor ingrese la direcci&oacute;n del paciente",
            phone: "Por favor ingrese un n&uacute;mero de tel&eacute;fono v&aacute;lido",
            email: "Por favor ingrese un email v&aacute;lido"
        },
        submitHandler: function (form) {
            form.submit();
        }
    });
    
    $("#addAppointment").validate({
        rules: {
            appointmentDate: "required",
            appointmentTime: "required",
            selectEditDoctor: "required",
            selectEditPatient: "required"
        },
        messages: {
            appointmentDate: "Por favor ingrese una fecha para la cita",
            appointmentTime: "Por favor ingrese una hora para la cita",
            selectEditDoctor: "Por favor seleccione un M&eacute;dico",
            selectEditPatient: "Por favor seleccione Paciente"
        },
        submitHandler: function (form) {
            form.submit();
        }
    });

});

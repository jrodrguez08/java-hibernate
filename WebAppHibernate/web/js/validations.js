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
            phone: "Por favor ingrese un n&uacute;mero de tel&eacute;fono v&aacute;lido",
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

});

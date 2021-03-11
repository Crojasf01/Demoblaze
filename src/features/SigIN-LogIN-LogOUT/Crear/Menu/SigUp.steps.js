const Login = require("../../../../page-objects/InicioSesion");

//Steps del background inicio de sesion 

Given('Ingreso a la URL luego ingreso a la opcion sigup para crear mi acceso, ingreso {string} y Contraseña {string}', async function(Usuario, Password) {
    Login.SigUP(Usuario, Password);
});

Given('Ingreso al login, con mi usuario {string} y Contraseña {string}', async function(User, Passw) {
    Login.LogIN(User, Passw);
});

Given('Salir de la aplicacion, con mi usuario ingresado', async function() {
    Login.LogOUT();
});

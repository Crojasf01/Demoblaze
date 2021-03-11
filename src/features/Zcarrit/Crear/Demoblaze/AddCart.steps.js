const Login = require("../../../../page-objects/InicioSesion");
const Menuproyectos = require("../../../../page-objects/Menuproyectos");
//Background
Given('Ingreso con mi usuario creado, usuario {string} y Contraseña {string}', async function(User,Passw) {
    Login.LogIN(User,Passw);    
});

//Scenario
Given('Deseo agregar una laptop a mi carrito de compras, luego quiero verificar que se agrego a mi carrito la laptop escogida', async function() {
    Menuproyectos.AddCart();
});


When('Finalizar mi sesion cerrando mi usuario creado', async function() {
    Login.LogOUT();
});

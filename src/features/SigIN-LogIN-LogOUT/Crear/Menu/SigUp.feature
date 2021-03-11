Feature: Abrir la URL
Yo como Usuario del sistema deseo verificar la creacion de mi usuario-SigUP, luego deseo logearme-LogIN y finalmente salir del sistema con logOUT correctamente.

Background: SignUP + LogIN
Given Ingreso a la URL luego ingreso a la opcion sigup para crear mi acceso, ingreso 'juanitoperez16' y Contraseña '1234567'
When Ingreso al login, con mi usuario 'juanitoperez16' y Contraseña '1234567'

@LogOUT
Scenario: Deseo cerrar mi sesion con LogOUT
Given Salir de la aplicacion, con mi usuario ingresado
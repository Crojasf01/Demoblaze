Feature: Abrir la URL
Yo como Usuario del sistema deseo agregar una laptop a mi carrito de compras y verificarlo luego correctamente.

Background: Deseo logearme con usuario creado en la opcion LogIN
Given Ingreso con mi usuario creado, usuario 'juanitoperez16' y Contraseña '1234567'

@AddCart
Scenario: AgregarCarrito
Given Deseo agregar una laptop a mi carrito de compras, luego quiero verificar que se agrego a mi carrito la laptop escogida
When Finalizar mi sesion cerrando mi usuario creado


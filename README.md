# Estado de cuenta

## Objetivo del Proyecto
- **Gestión de Cuentas Bancarias:**
Permitir a los usuarios crear y manejar sus cuentas bancarias de manera sencilla.
- **Seguridad:** 
Implementar un proceso de autenticación para asegurar que solo los usuarios autorizados accedan a las cuentas.
- **Funcionalidad Completa:**
Ofrecer operaciones bancarias básicas como depósitos, retiros y consultas de saldo.
- **Recuperación de Contraseñas:**
Facilitar el proceso de recuperación de contraseñas para los usuarios que las olviden.

## Componentes del programa
### Modulos
- **Cuenta**
Modulo que maneja la lógica de la cuenta bancaria (depósitos, retiros, consulta de saldo).
- **Usuario**
Modulo que representa al usuario y maneja información personal y de autenticación.
- **Login**
Modulo que maneja el proceso de autenticación y recuperación de contraseñas.
 
### Menú Principal
**Crear una cuenta:**
- Solicita al usuario que ingrese su nombre, cédula, correo electrónico y una nueva contraseña.
- Crea una nueva instancia de Usuario con esta información y luego una cuenta asociada a ese usuario.
- Mensaje de confirmación: "Cuenta creada exitosamente. Ahora puede entrar."
 
**Entrar a la cuenta:**
- Verifica si ya se ha creado un usuario. Si no, informa al usuario que debe crear una cuenta primero.
- Solicita el correo electrónico del usuario y verifica que coincida con el del usuario registrado.
- Una vez autenticado, presenta un submenú con las siguientes opciones:
###### **1. Depositar dinero: Solicita la cantidad a depositar y actualiza el saldo de la cuenta.**
###### **2. Retirar dinero: Solicita la cantidad a retirar y actualiza el saldo de la cuenta.**
###### **3. Consultar saldo: Muestra el saldo actual de la cuenta.**
###### **4. Salir al menú: Regresa al menú principal.**

**Recuperacion de contraseña:**
- Envia un mail al email ingresado, con la información de como recuperarla.
  
**Salida:**
- Cierra el sistema y el escáner de entrada.

## Organización de Reuniones
- Realizamos dos reuniones, por la plataforma Discord, para plantear las ideas y organizar la reparticion de los mudulos.
- Cada vez que alguno de los participantes realizaba un aporte, este se comunicaba por la misma plataforma.

## Colaboradores
- Diego
- Facundo

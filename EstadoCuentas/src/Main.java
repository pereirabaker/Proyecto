import cuentas.Cuenta;
import usuarios.Usuario;
import login.Login;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = null;
        Cuenta cuenta = null;

// opciones de menu //
        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Entrar");
            System.out.println("3. Olvidé mi contraseña");
            System.out.println("4. Salir");
            int inicial = scanner.nextInt();
            scanner.nextLine();
            switch (inicial) {
                case 1:
                    System.out.println("Ingrese el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la cédula del usuario: ");
                    String idUsuario = scanner.nextLine();
                    System.out.println("Ingrese el correo electrónico del usuario: ");
                    String email = scanner.nextLine();
                    System.out.println("Ingrese la contraseña nueva del usuario: ");
                    String contrasena = scanner.nextLine();
                    usuario = new Usuario(nombre, idUsuario, contrasena, email);
                    cuenta = new Cuenta(usuario);
                    System.out.println("Cuenta creada exitosamente. Ahora puede entrar.");
                    break;
                case 2:
                    if (usuario == null) {
                        System.out.println("Debe crear una cuenta primero.");
                    } else {
                        System.out.println("Ingrese su correo electrónico: ");
                        String emailEntrada = scanner.nextLine();
                        if (usuario.verificarEmail(emailEntrada)) {
                            if (Login.autenticar(usuario)) {
                                int opcion = 0;
                                // opciones de cuenta //
                                while (opcion != 4) {
                                    System.out.println("\nSeleccione una opción: ");
                                    System.out.println("1. Depositar dinero");
                                    System.out.println("2. Retirar dinero");
                                    System.out.println("3. Consultar saldo");
                                    System.out.println("4. Salir al menu.");
                                    opcion = scanner.nextInt();
                                    switch (opcion) {
                                        case 1:
                                            System.out.println("Ingrese la cantidad a depositar: ");
                                            double cantidadDeposito = scanner.nextDouble();
                                            cuenta.depositar(cantidadDeposito);
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la cantidad a retirar: ");
                                            double cantidadRetirar = scanner.nextDouble();
                                            cuenta.retirar(cantidadRetirar);
                                            break;
                                        case 3:
                                            System.out.println("Saldo actual: " + cuenta.getSaldo() + " pesos.");
                                            break;
                                        case 4:
                                            System.out.println("Saliendo al menu...");
                                            break;
                                        default:
                                            System.out.println("Ha ingresado una opción inválida. Intente nuevamente.");
                                            break;
                                    }
                                }
                            } else {
                                System.out.println("Ha excedido el número máximo de intentos. Saliendo del sistema...");
                            }
                        } else {
                            System.out.println("Correo electrónico incorrecto. Intente nuevamente.");
                        }
                    }
                    break;
                case 3:
                    if (usuario == null) {
                        System.out.println("Debe crear una cuenta primero.");
                    } else {
                        Login.reenviarContrasena(usuario);
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ha ingresado una opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }
}
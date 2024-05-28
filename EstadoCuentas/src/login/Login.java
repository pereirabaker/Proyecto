package login;
import usuarios.Usuario;
import java.util.Scanner;

public class Login {
    private static int cont = 0;

    // procedimiento para autenticar //
    public static boolean autenticar(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        int cont = 0;
        final int max = 3;
        while (cont < max) {
            System.out.println("Ingrese la contraseña para el usuario " + usuario.getNombre() + ": ");
            String contrasena = scanner.nextLine();
            if (usuario.verificarContrasena(contrasena)) {
                System.out.println("Contraseña correcta");
                return true;
            } else {
                cont++;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + (max - cont));
            }
        }
        return false;
    }

    // procedimiento para enviar la contraseña al mail //
    public static void reenviarContrasena(Usuario usuario) {
        System.out.println("Se ha enviado un correo a " + usuario.getEmail() + " con instrucciones para restablecer su contraseña.");
        cont = 0;
    }
}
package usuarios;

public class Usuario {

        // privados //
        private String nombre;
        private String idUsuario;
        private String contrasena;
        private String email;

        // contructores //
        public Usuario(String nombre, String idUsuario, String contrasena,String email) {
            this.nombre = nombre;
            this.idUsuario = idUsuario;
            this.contrasena = contrasena;
            this.email = email;
        }

        // getter y setter //
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getIdUsuario() {
            return idUsuario;
        }
        public void setIdUsuario(String idUsuario) {
            this.idUsuario = idUsuario;
        }
        public String getContrasena() {
            return contrasena;
        }
        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        // verificacion de contraseña //
        public boolean verificarContrasena(String contrasena) {
            return this.contrasena.equals(contrasena);
        }

        // verificacion de contraseña //
        public boolean verificarEmail(String email) {
            return this.email.equals(email);
        }
    }


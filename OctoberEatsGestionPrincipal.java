package Grupo4SC303MNProyectoClienteServidor;

public class OctoberEatsGestionPrincipal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan", "Pérez", "12345", "juan.perez@example.com", "Calle Ficticia 123");
        cliente.conectarAlServidor();

//        ManejoClientes manejoClientes = new ManejoClientes();
//        manejoClientes.obtenerClientes();
    }
}

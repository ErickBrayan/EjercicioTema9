public class Main {
    public static void main(String[] args) {

        System.out.println("Clase Cliente");
        Cliente cliente = new Cliente();
        cliente.setEdad(20);
        cliente.setNombre("Pedro");
        cliente.setTelefono(1254785);
        cliente.setCredito(200.00);


        System.out.println("Edad: "+ cliente.getEdad()+
                            " | Nombre: "+ cliente.getNombre()+
                            " | Telefono: "+ cliente.getTelefono()+
                            " | Credito: "+ cliente.getCredito());



        System.out.println("Clase Trabajador");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(20);
        trabajador.setNombre("Pedro");
        trabajador.setTelefono(1254785);
        trabajador.setSalario(2066.00);

        System.out.println("Edad: "+ trabajador.getEdad()+
                " | Nombre: "+ trabajador.getNombre()+
                " | Telefono: "+ trabajador.getTelefono()+
                " | Credito: "+ trabajador.getSalario());
    }
}
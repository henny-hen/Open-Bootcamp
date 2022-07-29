public class Persona {
    private int telefono, edad;
    private String nombre;

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
}

class Main{
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setCredito(0);
        cli.setEdad(22);
        cli.setNombre("oli");
        cli.setTelefono(123456789);
        System.out.println("Cliente: "+cli.getNombre()+", Edad: "+cli.getEdad()+", Telefono: "+cli.getTelefono()+", Credito: "+cli.getCredito());
    }
}
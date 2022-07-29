public class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



}

class Main{
    public static void main(String[] args) {
        Persona per= new Persona();
        per.setEdad(24);
        per.setNombre("Ray");
        per.setTelefono(649305500);
        System.out.println("Persona: "+per.getNombre()+", "+per.getEdad()+", "+ per.getTelefono());
    }
}

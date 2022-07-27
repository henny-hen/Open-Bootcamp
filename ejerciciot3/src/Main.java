public class Main {
    public static void main(String[] args) {
       int summ= suma(1,2,3);
        Coche miCoche = new Coche();
        miCoche.sum_puertas();
        int puertas= miCoche.num_puertas;
        System.out.println(puertas);
    }
    public static int suma(int a, int b, int c){
        return a+b+c;
    }

}
class Coche {
    int num_puertas = 0;

    public void sum_puertas() {
        this.num_puertas++;
    }
}
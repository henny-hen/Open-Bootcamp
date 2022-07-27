public class ejercicio4 {
    public static void main(String[] args) {
        int numeroIf = 10;
        if(numeroIf>0){
            System.out.println("numeroIf es positivo");
        }
        else if(numeroIf<0){

        }
        else{

        }
        int numeroWhile = 0;
        while (numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while(numeroWhile<3);
        int numeroFor =0;
        for(int i=0;i<=3;i++){
            numeroFor++;
            System.out.println(numeroFor);
        }
        var estacion= "VERANO";
        switch (estacion){
            case("VERANO"):
                System.out.println("La estacion es VERANO");
                break;

            case("INVIERNO"):
                System.out.println("La estacion es INVIERNO");
                break;

            case("OTOÑO"):
                System.out.println("La estacion es OTOÑO");
                break;

            case("PRIMAVERA"):
                System.out.println("La estacion es PRIMAVERA");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}

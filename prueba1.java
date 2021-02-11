import java.util.Scanner;

public class prueba1 {
    public static void main(String[] args) {
        
        Scanner intro =  new Scanner(System.in);
        System.out.println("Introduce un numero aleatorio");
        double aleatory = intro.nextDouble();

        System.out.println("El numero es " + aleatory);

        intro.close();
    }
}

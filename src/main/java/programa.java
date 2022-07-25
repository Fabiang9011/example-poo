import java.util.Scanner;

public class programa {


    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        System.out.println("digite la cantidad de dinero que tiene guillermo ");

        guillermo = entrada.nextFloat();
        luis = guillermo / 2;
        System.out.println("luis tiene: " + luis);
        juan = ((guillermo + luis) / 2);
        System.out.println("juan tiene: " + juan);
        total = guillermo + luis + juan;

        System.out.println("la suma del dinero de los tres es: " + total);

    }


}
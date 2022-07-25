import java.util.Scanner;

public class multiplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero;
        System.out.println("digite numero: ");
        numero = entrada.nextFloat();
        if ((numero % 10) == 0) {
            System.out.println(numero + " es multiplo de 10 ");
        } else {
            System.out.println(numero + " no es multiplo de 10 ");
        }
    }
}

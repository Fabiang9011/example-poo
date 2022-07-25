import java.util.Scanner;
public class Cualquiercosa {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);  //escaner es para ingresar datos en consola
       float nota1, nota2, nota3, suma;  // variables

        System.out.println("Digite las tres notas ");

        nota1 = entrada.nextFloat();  //clase para ingrsar datos
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
suma = nota1+nota2+nota3;
        System.out.println("\n la suma de las notas es :"+suma);
    }


}
import java.util.Scanner;
public class comision {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario, carrosvendidos,totalcomision, valorcarro1, valorcarro2, valorcarro3, comisioncarro1, comisioncarro2, comisioncarro3, totalmes;
        salario =1000;
        System.out.println("digite la cantidad de carros vendidos en el mes ");
        carrosvendidos = entrada.nextFloat();
        totalcomision = carrosvendidos*150;
        System.out.println("total comision es:" +totalcomision);
        System.out.println("digite valor carro1 ");
        valorcarro1 = entrada.nextFloat();
        comisioncarro1 = (valorcarro1*5)/100;
        System.out.println("valor comision por venta carro1 es: "+comisioncarro1);
        System.out.println("digite valor carro2 ");
        valorcarro2 = entrada.nextFloat();
        comisioncarro2 = (valorcarro2*5)/100;
        System.out.println("valor comision por venta carro2 es: "+comisioncarro2);
        System.out.println("digite valor carro3 ");
        valorcarro3 = entrada.nextFloat();
        comisioncarro3 = (valorcarro3*5)/100;
        System.out.println("valor comision por venta carro3 es: "+comisioncarro3);
        totalmes = salario+totalcomision+comisioncarro1+comisioncarro2+comisioncarro3;
        System.out.println("el total ganado en el mes es: "+totalmes);
    }
}
import java.util.Scanner;
import java.math.MathContext;

class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("1 para sin");
        System.out.println("2 para cos");
        System.out.println("3 para tan");
        System.out.println("4 para arcsin");
        System.out.println("5 para arccos");
        System.out.println("6 para arctan");
        System.out.println("7 para sinh");
        System.out.println("8 para cosh");
        System.out.println("9 para tanh");
        System.out.println("Escriba el número de la operación para selecionarla:");
        
        int opcion = scan.nextInt();

        System.out.println("Ingresa el valor del ángulo:");
        int a = scan.nextInt();

        if (opcion == 1){
            System.out.println("La respuesta es: "+ Math.sin(a));
        }
        else if (opcion == 2){
            System.out.println("La respuesta es: "+ Math.cos(a));
        }
        else if (opcion == 3){
            System.out.println("La respuesta es: "+ Math.tan(a));
        }
        else if (opcion == 4){
            System.out.println("La respuesta es: "+ Math.asin(a));
        }
        else if (opcion == 5){
            System.out.println("La respuesta es: "+ Math.acos(a));
        }
        else if (opcion == 6){
            System.out.println("La respuesta es: "+ Math.a1tan(a));
        }
        else if (opcion == 7){
            System.out.println("La respuesta es: "+ Math.sinh(a));
        }
        else if (opcion == 8){
            System.out.println("La respuesta es: "+ Math.cosh(a));
        }
        else if (opcion == 9){
            System.out.println("La respuesta es: "+ Math.tanh(a));
        }
        else {
            System.out.println("El número de operación seleccionado no es válido");
        }
    }
}
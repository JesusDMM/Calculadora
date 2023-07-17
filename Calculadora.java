import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
       try {
        Scanner leer = new Scanner (System.in);
        int numero1;
        int numero2;
        int numero;
        System.out.println("Escribe un numero");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        System.out.println("Escribe una operacion");
        numero = leer.nextInt();
        switch (numero) {
            case 1: 
                System.out.println(numero1 + numero2);
            break;
            case 2:
                System.out.println(numero1 - numero2);
            break;
            //agregar un case de multiplicacion
            case 3:
                System.out.println(numero1 * numero2);
            break;
            //ejemplo de uso de fetch
        }
       }catch (Exception e){
        System.out.println(e);
       }
    }
}

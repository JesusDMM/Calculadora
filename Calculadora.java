public class Calculadora {
    public static void main(String[] args) {
       try {
        int numero1 = 2;
        int numero2 = 2;
        System.out.println(numero1 / numero2);
       }catch (Exception e){
        System.out.println(e);
       }
    }
}
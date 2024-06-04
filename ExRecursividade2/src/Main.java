// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int resultado = contaZerosRecursivo(3120);
        System.out.println(resultado);
    }

    private static int contaZerosRecursivo(int num) {

       // caso base
       if (num == 0){
           return 0;
       }
       int ultimoDigito = num % 10;

       if (ultimoDigito == 0){
           return 1 + contaZerosRecursivo(num/10);
       }else {
           return contaZerosRecursivo(num / 10);
       }
    }
}
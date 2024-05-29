// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class SomaRecursividade {
    public static void main(String[] args) {
         int tamanho = 4;
         int arrayNumeros[] = {1,2,3,4,5};
         int somaFor = calcularSomaSemRecursividade(arrayNumeros, tamanho);
         int somaRecur = calcularSomaRecursividade(arrayNumeros, tamanho);
         System.out.println("Calculando a soma do Array com for: " + somaFor);
         System.out.println("Calculando a soma do Array com recursividade: " + somaRecur);
    }
    public static int calcularSomaSemRecursividade(int numeros[], int tamanho){
        int soma = 0;
        for (int numero : numeros) {
            soma = soma + numero;

        } return soma;
    }

    public static int calcularSomaRecursividade(int numeros[], int indice){
        if (indice == 0){
            return numeros[0];
        } else {
            return numeros[indice] + calcularSomaRecursividade(numeros, indice -1 );
        }
    }
}
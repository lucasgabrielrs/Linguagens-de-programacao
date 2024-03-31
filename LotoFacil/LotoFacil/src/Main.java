import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        int opcao = -1;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("************ Menu LotoFácil ************");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("************************************");
            System.out.print("Digite a opção: ");
            opcao = in.nextInt();
            System.out.println("************************************");
            switch (opcao){
                case 1:
                    System.out.println("Aposta de 0 a 100");
                    aposta0a100();
                    break;
                case 2:
                    System.out.println("Aposta de A à Z");
                    apostaAaZ();
                    break;
                case 3:
                    System.out.println("Aposta em impar ou par");
                    apostaImparPar();
                    break;
                case 0:
                    System.out.println("Opção 0 escolhida");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao != 0);
    }

    private static void apostaImparPar() {
        int numeroApostado = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um numero que deseja apostar no par ou impar: ");
        numeroApostado = in.nextInt();

        if (numeroApostado % 2 == 0){
            System.out.println("Você ganhou R$ 100,00 reais!");
        }else{
            System.out.println("Que pena! O número digitado foi impar e a premiação foi para numeros pares.");
        }
    }

    private static void apostaAaZ() throws IOException {
        System.out.println("Digite uma letra de A a Z:");
        int letraApostada = System.in.read();

        if (!Character.isLetter((char) letraApostada)) {
            System.out.println("Aposta inválida.");
            return;
        }

        char letraMaiuscula = Character.toUpperCase((char) letraApostada);

        char letraPremiada = 'L';

        if (letraMaiuscula == letraPremiada) {
            System.out.println("Você ganhou R$ 500,00 reais.");
        } else {
            System.out.printf("Que pena! A letra sorteada foi: "+letraPremiada);
        }
    }

    private static void aposta0a100() {
        int numeroApostado = 0;
        Scanner in = new Scanner(System.in);
        Random numeroAleatorio = new Random();

        System.out.println("Digite o número que deseja apostar entre 0 e 100: ");
        numeroApostado = in.nextInt();
        if (numeroApostado < 0 || numeroApostado > 100) {
            System.out.println("Número inválido");
        } else {
            int numeroSorteado = numeroAleatorio.nextInt(101);

            if (numeroSorteado == numeroApostado){
                System.out.println("Você ganhou R$ 1.000,00 reais.");
            } else {
                System.out.println("Que pena! O número sorteado foi: "+numeroSorteado);
            }
        }
    }
}


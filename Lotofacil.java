import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class Lotofacil {
    public static void main(String[] args) throws IOException {
        int NumeroAposta = -1;
        char LetraAposta;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;

        do {
            System.out.println("*----------------------------*");
            System.out.println("*        BEM VINDO!          *");
            System.out.println("*                            *");
            System.out.println("* 1) Apostar de 0 a 100      *");
            System.out.println("* 2) Apostar de A à Z        *");
            System.out.println("* 3) Apostar em Par ou Ímpar *");
            System.out.println("* 0) Sair                    *");
            System.out.println("*                            *");
            System.out.println("*----------------------------*");

            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1 - Apostar de 0 à 100!");
                    System.out.println("Escreva um número de 0 à 100: ");
                    int numeroAleatorio = random.nextInt(101);
                    NumeroAposta = scanner.nextInt();
                    if (NumeroAposta < 0 || NumeroAposta > 100) {
                        System.out.println("Aposta inválida.\n");
                        break;
                    }
                    if (NumeroAposta == numeroAleatorio) {
                        System.out.println("Você ganhou R$ 1.000,00 reais.\n");
                    } else {
                        System.out.printf("\nInfelizmente você errou, o número certo era: %d \n", numeroAleatorio);
                    }
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2 - Apostar de A à Z!");
                    System.out.println("Escreva uma letra de A à Z: ");
                    int entrada = System.in.read();
                    char letraDigitada = (char) entrada;
                    if (Character.isLetter(letraDigitada)) {
                        LetraAposta = Character.toUpperCase(letraDigitada);
                        char letraPremiada = 'J';
                        if (LetraAposta == letraPremiada) {
                            System.out.println("Você ganhou R$ 500,00 reais.\n");
                        } else {
                            System.out.printf("\nInfelizmente você errou, a letra sorteada foi: %s \n", letraPremiada);
                        }
                    } else {
                        System.out.println("Aposta inválida.");
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3 - Apostar em Par ou Ímpar!");
                    System.out.println("Escreva um número inteiro: ");
                    NumeroAposta = scanner.nextInt();
                    if (NumeroAposta % 2 == 0) {
                        System.out.println("Você ganhou R$ 100,00 reais.\n");
                    } else {
                        System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.\n");
                    }
                    break;
                case 0:
                    System.out.println("Obrigado por jogar volte sempre!");
                    break;

            }
        } while (opcao != 0);
    }
}

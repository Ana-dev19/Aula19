import java.util.Random;
import java.util.Scanner;

public class DesafioJogoDados {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int pontos = 0;
        int numeroUsuario;
        int numeroAleatorio;
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Digite um número:");

            numeroUsuario = scanner.nextInt();

            numeroAleatorio = random.nextInt(10 ) ;

            System.out.println("Número aleatório gerado: " + numeroAleatorio);

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Você ganhou 10 pontos!");

            } else if (numeroUsuario + 1 == numeroAleatorio  || numeroUsuario - 1 == numeroAleatorio ) {

                System.out.println("Você ganhou 5 pontos!");
            } else {
                System.out.println("Você perdeu!");
            }

            System.out.println("Pontos atuais: " + pontos ++);

            System.out.println("Deseja jogar novamente? (sim/não)");
            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("não")) {
                jogarNovamente = false;
            }
        }
    }
}

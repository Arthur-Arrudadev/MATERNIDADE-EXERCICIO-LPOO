package exceção;

//  IMPORT para realizar a leitura de dados do usuário.

//  Scanner para ler a entrada do usuário.
import java.util.Scanner;

public class ExtrairCaractere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a posição do caractere (começando em 0): ");
        try {
            int posicao = scanner.nextInt();

            // Verifica se a posição é válida (maior ou igual a zero e menor que o tamanho da string)
            if (posicao >= 0 && posicao < nome.length()) {
                char caractere = nome.charAt(posicao);
                System.out.println("O caractere na posição " + posicao + " é: " + caractere);
            } else {
                System.out.println("Posição inválida!");
            }
        } catch (Exception e) {
            System.out.println("Posição inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}

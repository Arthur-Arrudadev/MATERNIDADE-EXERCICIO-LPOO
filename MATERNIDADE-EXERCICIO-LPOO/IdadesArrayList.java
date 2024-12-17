package exceção;

import java.util.ArrayList;
import java.util.Scanner;

public class IdadesArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        // Lendo as idades
        System.out.println("Digite as idades de 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            idades.add(scanner.nextInt());
        }

        // Lendo a posição a ser removida
        System.out.print("Digite a posição da idade a ser removida: ");
        try {
            int posicao = scanner.nextInt();

            // Verificando se a posição é válida
            if (posicao >= 0 && posicao < idades.size()) {
                idades.remove(posicao);
                System.out.println("Idade removida com sucesso.");
                System.out.println("Lista atualizada: " + idades);
            } else {
                System.out.println("Posição inválida.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }

        scanner.close();
    }
}

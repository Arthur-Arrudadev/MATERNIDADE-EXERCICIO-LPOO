package exceção;

import java.io.File;
import java.util.Scanner;

public class CriarArquivo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o caminho completo do arquivo: ");
        String caminho = leitor.nextLine();

        try {
            File arquivo = new File(caminho);

            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso em: " + arquivo.getAbsolutePath());
            } else {
                System.out.println("O arquivo já existe ou ocorreu um erro ao criar o arquivo.");
            }
        } catch (Exception e) {
            System.out.println("Caminho inválido.");
            e.printStackTrace(); // Para depuração
        }
    }
}
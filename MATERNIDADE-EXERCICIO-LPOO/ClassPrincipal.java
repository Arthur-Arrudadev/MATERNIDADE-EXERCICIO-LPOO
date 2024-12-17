package exceção;

import java.util.Scanner;
public class ClassPrincipal {

	  public static void main(String[] args) {
	        try {
	            // Instanciar um objeto Triangulo com lados 3, 4 e 5
	            Triangulo triangulo1 = new Triangulo(3, 4, 5);

	            // Mudar a dimensão do primeiro lado para 10
	            triangulo1.setLadoA(10);

	            // Ler do usuário três números
	            Scanner leitor  = new Scanner(System.in);
	            System.out.print("Digite o lado A: ");
	            double ladoA = leitor .nextDouble();
	            System.out.print("Digite o lado B: ");
	            double ladoB = leitor.nextDouble();
	            System.out.print("Digite o lado C: ");
	            double ladoC = leitor.nextDouble();

	            // Instanciar um objeto Triangular usando os valores lidos
	            Triangulo triangulo2 = new Triangulo(ladoA, ladoB, ladoC);
	        } catch (DimensoesInvalidasException e) {
	            System.out.println("Erro: " + e.getMessage());
	        }
	    }
	
}


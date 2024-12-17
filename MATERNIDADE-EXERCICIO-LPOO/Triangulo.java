package exceção;

public class Triangulo {
    
	private double ladoA, ladoB, ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) throws DimensoesInvalidasException {
        if (!ehValido(ladoA, ladoB, ladoC)) {
            throw new DimensoesInvalidasException("As dimensões informadas não formam um triângulo válido.");
        }
        
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) throws DimensoesInvalidasException {
        if (!ehValido(ladoA, ladoB, ladoC)) {
            throw new DimensoesInvalidasException("As dimensões informadas não formam um triângulo válido.");
        }
        this.ladoA = ladoA;
    }

    // Métodos para setLadoB e setLadoC, similares ao setLadoA

    private boolean ehValido(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Outros métodos para calcular área, perímetro, etc.
}

class DimensoesInvalidasException extends Exception {
    public DimensoesInvalidasException(String message) {
        super(message);
    }
}
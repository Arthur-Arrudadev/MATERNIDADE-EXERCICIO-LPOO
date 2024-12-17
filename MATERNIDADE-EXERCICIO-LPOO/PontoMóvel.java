package CírculoMóvel;

	public class PontoMóvel implements Móvel {
	
		int x;
		int y;
		int xSpeed;
		int ySpeed;

    public PontoMóvel (int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moverparacima() {
        this.y -= this.ySpeed;
    }

    @Override
    public void Moverparabaixo() {
        this.y += this.ySpeed;
    }

    @Override
    public void moverparaaesquerda() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moverparaadireita() {
        this.x += this.xSpeed;
    }

    @Override
    public String toString() {
        return "Position=(" + this.x + ", " + this.y + "), Speed=(" + this.xSpeed + ", " + this.ySpeed + ")";
    }


}


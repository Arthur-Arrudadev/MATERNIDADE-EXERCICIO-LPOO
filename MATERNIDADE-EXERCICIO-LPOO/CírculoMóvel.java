package CírculoMóvel;

import CírculoMóvel.CírculoMóvel;

public class CírculoMóvel implements Móvel {

		private int radius;
	    private PontoMóvel center;

	    public CírculoMóvel(int x, int y, int xSpeed, int ySpeed, int radius) {
	        this.center = new PontoMóvel(x, y, xSpeed, ySpeed);
	        this.radius = radius;
	    }

	    @Override
	    public void moverparacima() {
	        this.center.moverparacima();
	    }

	    @Override
	    public void Moverparabaixo() {
	        this.center.Moverparabaixo();
	    }

	    @Override
	    public static void moverparaaesquerda() {
	        this.center.moverparaaesquerda();
	    }

	    @Override
	    public void moverparaadireita() {
	        this.center.moverparaadireita();
	    }

	    @Override
	    public String toString() {
	        return "Center=" + this.center + ", Radius=" + this.radius;
	    }
	}

	


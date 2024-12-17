package animais;

public class Gato extends Animal{

	public Gato(String name) {
		super(name);
	}
	
	@Override
	    public void greets() {
	        System.out.println("Meow");
	    }

}

package animais;

import animais.Cachorro;
import animais.cadela;

class Cachorro extends cadela {
    public Cachorro (String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("auuuf");
    }

    @Override
    public void greets(cadela outra) {
        System.out.println("auuuuuuuf");
    }

    public void greets(Cachorro outro) {
        System.out.println("auuuuuuuuuauuuf");
    }
}
package animais;

class cadela extends Animal {
    public cadela (String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("auuuf");
    }

    public void greets(cadela outra) {
        System.out.println("auuuuuf");
    }
}

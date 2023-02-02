public class Morcego extends Animal implements Walkable, Flyable{

    public Morcego(String nome) {
        super(nome);

    }

    @Override
    public void andar() {
        System.out.println("Morcego anda");
    }

    @Override
    public void voar() {
        System.out.println("Morcego voa");
    }
    
}

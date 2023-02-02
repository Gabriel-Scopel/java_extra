/* Implemente o diagrama de
classes apresentado na figura.
Crie também uma classe para
testar o funcionamento de
objetos da classe Morcego. */
public class App {
    public static void main(String[] args) {
        Morcego m = new Morcego("Batman");
        System.out.println(m.getNome());
        m.andar();
        m.voar();
    }
}

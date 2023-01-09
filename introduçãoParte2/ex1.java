/* enunciado:
● Classe: Televisao
● Atributos (Variáveis de Instância):
○ modelo - private e do tipo string
○ preco e tamanho - private e do tipo float
○ volume e canal - private int
○ ligada - private boolean
● Métodos:
○ set e get para todos atributos
○ alteraVolume( int ) - aumenta ou diminui o valor atual de volume, dado arg
○ alteraCanal( ) - aumenta ou diminui o valor atual do canal em 1 unidade
● main():
○ crie dois objetos (tv1 e tv2) do tipo Televisao
○ altere o volume e o canal de tv1 e tv2
○ desligue a tv2 */

public class ex1{
    public static void main(String[] args) {
        Televisao t1 = new Televisao();
        Televisao t2 = new Televisao();
        t1.setLigada(true);
        t1.setModelo("sony bravia");
        t1.setCanal(5);
        t1.setPreco(3999);
        t1.setVolume(20);
        t1.setTamanho(44);
        t1.getCanal();
        t1.getModelo();
        t1.getPreco();
        t1.getTamanho();
        t1.getVolume();
        t2.setLigada(true);
        t1.setModelo("lg");
        t2.setCanal(7);
        t2.setPreco(2999);
        t2.setVolume(22);
        t2.setTamanho(50);
        t2.getCanal();
        t2.getModelo();
        t2.getPreco();
        t2.getTamanho();
        t2.getVolume();
        t2.setLigada(false);
    }
}
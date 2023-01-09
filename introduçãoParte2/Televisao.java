import java.util.Scanner;

public class Televisao {
    private String modelo;
    private float preco;
    private float tamanho;
    private int volume;
    private int canal;
    private boolean ligada;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public float getTamanho() {
        return tamanho;
    }
    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
    
    public void alteraVolume(int x){
        this.volume=this.volume+x;
    }
    public void alteraCanal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Você deseja aumentar ou diminuir o valome?");
        String entrada = input.nextLine();
        input.close();
        if(entrada.equals("aumentar")){
            this.canal=this.canal++;
        }
        else if(entrada.equals("diminuir")){
            this.canal=this.canal--;
        }
        else{
            System.out.println("entrada inválida");
        }
    }
    

}

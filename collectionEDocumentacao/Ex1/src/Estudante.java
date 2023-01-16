public class Estudante {
    private String nome;
    private String sobrenome;
    private int identificador;
    private int proximoId;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public int getProximoId() {
        return proximoId;
    }
    public void setProximoId(int proximoId) {
        this.proximoId = proximoId;
    }
    public Estudante(String nome, String sobrenome, int identificador, int proximoId) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identificador = identificador;
        this.proximoId = proximoId;
    }
    
    

}

public class Agente{
    String nome;
    boolean modo_agente;
    String profissao;
    
    

    public Agente(String nome, boolean modo_agente, String profissao) {
        this.nome = nome;
        this.modo_agente = modo_agente;
        this.profissao = profissao;
    }
    
    void apresentacao(){
        System.out.println(this.nome);
        System.out.println(this.modo_agente);
        System.out.println(this.profissao);
        if(modo_agente){
            System.out.println("AGENTE SMITH");
        }

    }
    void modo_agente_on(){
        this.modo_agente = true; 
    }
}
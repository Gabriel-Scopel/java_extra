public class Invoice {
    String identificador;
    String descricao;
    int quantidade;
    double preco;
    public String getIdentificador() {
        return identificador;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getInvoiceAmount(){
        double total;
        total = this.quantidade*this.preco;
        if(total>0){
            return total;
        }
        else{
            return 0;
        }
    }
}


public class Account {
    private double saldo;

    public Account(double saldo) {
        if( saldo >= 0.0){
            this.saldo = saldo;
        }else{
            this.saldo = 0;
            System.out.println("saldo inicial inválido");
        }
    }
    public void credit(double valor){
        this.saldo += valor;
    }
    public void debit(double valor){
        if(this.saldo-valor>0){
            this.saldo-=valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public double getBalance(){
        return this.saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    
    
}

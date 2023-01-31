public class CheckingAccount extends Account {
    private double taxa;
    private double saldo = getSaldo();
    public CheckingAccount(double saldo, double taxa) {
        super(saldo);
        this.taxa = taxa;
    }
    public void credit(double valor){
        saldo += (valor - taxa);
    }
    public void debit(double valor){
        if(saldo-valor>0){
            saldo -= (valor - taxa);
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
}

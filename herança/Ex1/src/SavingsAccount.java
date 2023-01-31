public class SavingsAccount extends Account {
    private double juros;
    public SavingsAccount(double saldo, double juros) {
        super(saldo);
        this.juros = juros;
    }
    public double calculateInterest(){
       return getSaldo()*this.juros;
    }
    
}

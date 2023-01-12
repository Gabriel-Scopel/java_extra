public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {

        int i=1;
        while((numerador % i ==0 && denominador % i ==0) || ((numerador>1 && denominador>1) && i<= numerador)){
            if(i>1){
                while(numerador % i ==0 && denominador % i==0){
                    numerador = numerador/i;
                    denominador = denominador/i;
                    this.numerador = numerador;
                    this.denominador = denominador;
                }
            }else{
                System.out.println("iniciando...");
            }
            i++;
            
        }
        
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    
    

    
}

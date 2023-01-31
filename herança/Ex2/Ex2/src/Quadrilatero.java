public class Quadrilatero{
    //obs: p1 e p2 correspondem aos valores da base menor enquanto p3 e p4 da base maior
    private Ponto p1 = new Ponto(0, 0);
    private Ponto p2 = new Ponto(0, 0);
    private Ponto p3 = new Ponto(0, 0);
    private Ponto p4 = new Ponto(0, 0);

    public double baseMaior = Math.abs(p1.px-p2.px);
    public double baseMenor = Math.abs(p3.px-p3.py);
    public double altura = Math.abs(p1.py - p2.py);
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double calculaTrapezio(){
        double area = ((baseMaior+baseMenor)*altura)/2;
        return area;
    }

    public double calculaParalelogramo(){
        double area = baseMaior*altura;
        return area;
    }

    public double calculaRetangulo(){
        double area = baseMaior*altura;
        return area;
    }
    public double calculaQuadrado(){
        double area = baseMaior*baseMaior;
        return area;
    }
    
}
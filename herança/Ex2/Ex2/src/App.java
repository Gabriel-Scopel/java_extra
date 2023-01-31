import java.util.Scanner;

/* (Deitel 9.8) Escreva uma hierarquia de herança para as classes Quadrilatero, Trapezio,
Paralelogramo, Retangulo e Quadrado. Use Quadrilatero como superclasse da hierarquia.
Crie e use uma classe Ponto para representar os pontos (x, y) de cada forma. Faça a
hierarquia o mais profunda (isto é, com muitos níveis) possível.
Especifique as variáveis de instância e os métodos para cada classe. As variáveis de
instância private de Quadrilatero devem ser Pontos para os quatro pontos que delimitam
o quadrilátero. Escreva um programa que instancia objetos de suas classes e gera saída
da área de cada objeto (exceto Quadrilatero). A entrada será feita com a posição de 4
pontos (x, y). */

//obs: p1 e p2 correspondem aos valores da base menor enquanto p3 e p4 da base maior
public class App {
    public static void main(String[] args) throws Exception {
        int p1x,p1y,p2x,p2y,p3x,p3y,p4x,p4y;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de p1x da base: ");
        p1x = input.nextInt();
        System.out.println("Digite o valor de p1y da base: ");
        p1y = input.nextInt();
        System.out.println("Digite o valor de p2x da base: ");
        p2x = input.nextInt();
        System.out.println("Digite o valor de p2y da base: ");
        p2y = input.nextInt();
        System.out.println("Digite o valor de p3x da base: ");
        p3x = input.nextInt();
        System.out.println("Digite o valor de p3y da base: ");
        p3y = input.nextInt();
        System.out.println("Digite o valor de p4x da base: ");
        p4x = input.nextInt();
        System.out.println("Digite o valor de p4y da base: ");
        p4y = input.nextInt();
        Ponto p1 = new Ponto(p1x, p1y);
        Ponto p2 = new Ponto(p2x, p2y);
        Ponto p3 = new Ponto(p3x, p3y);
        Ponto p4 = new Ponto(p4x, p4y);
        Quadrilatero quadrilatero = new Quadrilatero(p1, p2, p3, p4);
        System.out.println(quadrilatero.calculaTrapezio());
        System.out.println(quadrilatero.calculaParalelogramo());
        System.out.println(quadrilatero.calculaRetangulo());
        System.out.println(quadrilatero.calculaQuadrado());
    }
}

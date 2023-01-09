/* enunciado:
(Triplos de Pitágoras) Um triângulo retângulo pode ter lados que são todos 
inteiros. Um conjunto de três valores inteiros para os lados de um triângulo 
retângulo é chamado de triplo de Pitágoras. Esses três lados devem satisfazer 
o relacionamento de que a soma dos quadrados de dois dos lados seja igual ao 
quadrado da hipotenusa. Localize todos os triplos de Pitágoras para lado1, 
lado2 e hipotenusa, todos não maiores que 500. Utilize um loop for triplamente 
aninhado que tente todas as possibilidades. Esse é um exemplo de 
computação baseada na força bruta */
import java.lang.Math;
public class ex2 {
    public static void main(String[] args) {
        
        for(int lado1=1; lado1 <= 500; lado1++){
            for(int lado2=1; lado2 <= 500; lado2++){
                for(int hipotenusa = 1; hipotenusa <= 500; hipotenusa++){
                    if(hipotenusa*hipotenusa == (Math.pow(lado1,2)+(Math.pow(lado2, 2)))){
                        System.out.printf("lado1: "+lado1);
                        System.out.printf(" - lado2: "+lado2);
                        System.out.printf(" - hipotenusa: "+hipotenusa);
                        System.out.println();
                    }
                }
            }
        }
    }
}

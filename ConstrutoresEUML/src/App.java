/* enunciado:
Crie uma classe chamada Racional para realizar aritmética com frações. Utilize 
variáveis do tipo ​inteiro para representar as variáveis de instância private da 
classe: o ​numerador e o denominador. ​ Forneça um construtor que permita que 
um objeto dessa classe seja inicializado quando ele for declarado. O construtor 
deve armazenar a fração em uma forma reduzida, por exemplo, a fração 2/4 é 
equivalente a 1/2 e seria armazenada no objeto como 1 no ​numerador e 2 no 
​denominador​.

Forneça um construtor sem argumento com valores padrão caso nenhum inicializador
seja fornecido. Forneça métodos ​public que realizam cada uma das operações a seguir:
a) Somar dois números ​Racional​: o resultado da adição deve ser armazenado na forma 
reduzida.
b) Subtrair dois números ​Racional​: o resultado da subtração deve ser armazenado na forma 
reduzida.  */


public class App {
    public static void main(String[] args)  {
        Racional r = new Racional(4, 16);
        
    }
}

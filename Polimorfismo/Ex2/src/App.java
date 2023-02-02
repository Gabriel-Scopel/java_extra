/* "Neo, a Matrix é um grande sistema
orientado a objetos em que as pessoas são
objetos de classes que herdam da classe
abstrata Agente."
Dada a definição acima de Matrix, implemente as classes Empresario, Professor
e Advogado como subclasses da classe Agente:
1. A classe Agente tem os seguintes atributos: String nome; boolean modo_agente;
String profissao; o método abstrato void apresentacao() e o método
modo_agente_on();
2. A classe Empresario deve ter os atributos: String nome; boolean modo_agente;
String profissao, String empresa; e o método void apresentacao();
3. A classe Professor deve ter os atributos: String nome; boolean modo_agente;
String profissao, String escola; e o método void apresentacao();
4. A classe Advogado deve ter os atributos: String nome; boolean modo_agente;
String profissao, String OAB; e o método void apresentacao();
No método main( ), a explicação de Matrix deve ser implementada. Um ArrayList de 𝑛
pessoas do tipo Agente deve ser definido. Então, com um loop infinito, faça um menu
para criar pessoas com diferentes profissões dentro deste ArrayList.
Coloque uma opção no menu para todas as pessoas se apresentarem. Escolha algumas
pessoas para invocar o método modo_agente_on() e transformá-las em Agentes.
Cuidado: os objetos não podem ser instanciados como Agentes (classe abstrata), mas
inclua um print no método apresentacao() que leia o atributo modo_agente e imprima
"AGENTE SMITH", para modo_agente = true. */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        String nome="a";
        boolean modo_agente=false;
        String profissao="b";
        String apresentacao;

        String entrada;
        Scanner input = new Scanner(System.in);

        ArrayList <Agente> pessoas = new ArrayList<>();
        
        do {
            
            System.out.println("Digite 1 para iniciar a construção ou qualquer outra tecla para parar");
            entrada = input.nextLine();

            System.out.println("Digite o nome do agente: ");
            nome = input.nextLine();

            System.out.println("Digite true ou false para o modo_agente do agente: ");
            modo_agente = input.nextBoolean();

            System.out.println("Digite a profissão do agente: ");
            profissao = input.nextLine();

            pessoas.add(new Agente(nome, modo_agente, profissao));

            System.out.println("Digite 2 para que as pessoas se apresentem ou qualquer outra tecla para parar ");
            apresentacao = input.nextLine();

            if(apresentacao.equals("2")){
                for(Agente pessoa : pessoas ){
                    pessoa.apresentacao();
                }
            }else{
                continue;
            }
        } while (entrada.equals("1"));

    }
}

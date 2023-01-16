import java.util.ArrayList;
import java.util.Scanner;

/*enunciado:
● Construa uma classe Estudante com os seguintes atributos: nome, 
sobrenome, identificador e proximoId. O atributo proximoId é um número 
sequencial e é disponível para todos os estudantes. 
● Faça os métodos get e set e um construtor parametrizado para a classe 
Estudante.
● Crie um ArrayList para representar uma turma com 30 alunos.
● Faça a impressão das informações dos estudantes.
 */
public class App {
    public static void main(String[] args){
        ArrayList <Estudante> lista = new ArrayList<>();
        
        for(int i=0; i<30; i++){
            String nome;
            String sobrenome;
            int identificador;
            int proximoId;
            Scanner input = new Scanner(System.in);
            System.out.println("Digite o nome: ");
            nome = input.nextLine();
            System.out.println("Digite o sobrenome");
            sobrenome = input.nextLine();
            System.out.println("Digite o identificador:");
            identificador = input.nextInt();
            proximoId = i;
            lista.add(new Estudante(nome, sobrenome, identificador, proximoId));
        }
        for(Estudante estudante : lista){
            System.out.println("nome: "+estudante.getNome());
            System.out.println("sobrenome: "+estudante.getSobrenome());
            System.out.println("identificador: "+estudante.getIdentificador());
            System.out.println("id: "+estudante.getProximoId());
            System.out.println("");
        }
    }
}

/* enunciado:
(Deitel 3.13) Crie uma classe chamada Invoice que uma loja de suprimentos de 
informática possa utilizar para representar uma fatura de um item vendido na loja. Uma 
Invoice (fatura) deve incluir quatro partes de informações como atributos — um número 
identificador (tipo string), uma descrição (tipo string), a quantidade comprada de um 
item (tipo int) e o preço por item (tipo double). Forneça uma função set e uma função get
para cada membro de dados. Além disso, forneça um método chamado 
getInvoiceAmount que calcula a quantia da fatura (isto é, multiplica a quantidade pelo 
preço por item) e depois retorna a quantidade como um valor double. Se a quantidade 
não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, 
ele deve ser configurado como 0. Escreva um programa de teste que demonstre as 
capacidades da classe Invoice. */
public class Ex2 {
    public static void main(String[] args) {
        Invoice conta = new Invoice();
        conta.setPreco(200);
        conta.setQuantidade(10);
        System.out.println(conta.getInvoiceAmount());
        conta.setPreco(-200);
        conta.setQuantidade(10);
        System.out.println(conta.getInvoiceAmount());
        
    }
}

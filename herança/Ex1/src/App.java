/* (Deitel 12.10) Crie uma hierarquia de herança que um banco possa utilizar para
representar as contas bancárias dos clientes. Todos os clientes nesse banco podem
depositar (isto é, creditar) dinheiro em suas contas e retirar (isto é, debitar) o dinheiro
delas. Há também tipos mais específicos de contas. As contas de poupança, por
exemplo, recebem juros pelo dinheiro depositado nelas. As contas correntes, por outro
lado, cobram uma taxa por transação (isto é, crédito ou débito).
Crie uma hierarquia de herança contendo a superclasse Account e as subclasses
SavingsAccount (Poupança) e CheckingAccount (Conta Corrente) que herdam da classe
Account. 
Regras – Classe Account
1. A superclasse Account deve incluir um membro de dados do tipo double para
representar o saldo da conta.
2. A classe deve fornecer um construtor que recebe um saldo inicial e o utiliza para
inicializar o membro de dados. O construtor deve validar o saldo inicial para
assegurar que ele é maior que ou igual a 0.0. Caso contrário, o saldo deve ser
configurado como 0.0 e o construtor deve exibir uma mensagem de erro, indicando
que o saldo inicial era inválido.
3. A classe deve fornecer três métodos:
a) O método credit() deve adicionar uma quantia ao saldo atual.
b) O método debit() deve retirar dinheiro de Account e assegurar que o valor do débito não
exceda o saldo de Account. Se exceder, o saldo deve permanecer inalterado e a função
deve imprimir a mensagem “Saldo insuficiente”.
c) O método getBalance() deve retornar o saldo atual.
Regras – Classe SavingsAccount
1. A subclasse SavingsAccount deve herdar a funcionalidade de uma Account, mas
também incluir um membro de dados do tipo double para indicar a taxa de juros
(porcentagem) atribuída à Account.
O construtor SavingsAccount deve receber o saldo inicial, bem como um valor inicial
para a taxa de juros de SavingsAccount.
3. SavingsAccount deve fornecer um método public calculateInterest() que retorna um
double para indicar os juros auferidos por uma conta. O método calculateInterest()
deve determinar esse valor multiplicando a taxa de juros pelo saldo da conta. [Nota:
SavingsAccount deve herdar as funções-membro credit e debit exatamente como são
sem redefini-las.].
Regras – Classe CheckingAccount
1. A subclasse CheckingAccount deve herdar da classe básica Account e incluir um
membro adicional de dados do tipo double que representa a taxa cobrada por
transação. O construtor CheckingAccount deve receber o saldo inicial, bem como um
parâmetro que indica o valor de uma taxa.
2. A classe CheckingAccount deve redefinir as funções-membro credit() e debit() para
que subtraiam a taxa do saldo da conta sempre que qualquer uma das transações
for realizada com sucesso.
Regras – Classe CheckingAccount
3. As versões CheckingAccount dessas funções devem invocar a versão Account da
classe básica para realizar as atualizações de saldo de uma conta. A função debit()
de CheckingAccount deve cobrar uma taxa somente se o dinheiro for realmente
retirado (isto é, o valor do débito não exceder ao do saldo da conta).
Dica: Defina a função debit() de Account para que ela retorne um bool indicando se
houve retirada de dinheiro. Em seguida, utilize o valor de retorno para determinar se uma
taxa deve ser cobrada.
 */

public class App {
    public static void main(String[] args)  {
        
    }
}

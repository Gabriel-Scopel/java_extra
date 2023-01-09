import java.util.Scanner;
/* ex1:
possibilidades:
p0,r0 -> C
p0,r1 -> C
p1,r0 -> B
p1,r1 -> A */
public class ex1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("p0 ou p1?");
        String p = input.nextLine();
        System.out.println("r0 ou r1?");
        String r = input.nextLine();
        input.close();

        if("p0".equals(p)){
            System.out.println("Posição: C");
        }
        else if("p1".equals(p) && "r0".equals(r)){
            System.out.println("Posição: B");
        } 
        else if("p1".equals(p) && "r1".equals(r)){
            System.out.println("Posição: A");
        }
        else{
            System.out.println("Entrada inválida");
        }
    }
}


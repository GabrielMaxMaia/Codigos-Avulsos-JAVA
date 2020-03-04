/**
 *
 * @author gabriel.mmcarmo
 */

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.cadastro();
        
        double pesoIdeal = aluno1.pesoIdeal();
        System.out.println("O peso ideal do aluno é "+pesoIdeal);
    }
}

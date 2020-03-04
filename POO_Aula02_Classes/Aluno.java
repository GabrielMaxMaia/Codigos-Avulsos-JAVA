import java.util.Scanner;

/**
 *
 * @author gabriel.mmcarmo
 */

public class Aluno {
    
    public static Scanner sc = new Scanner(System.in);
    
    String nome;
    char sexo;
    double altura, peso, pesoIdeal;
    int anoNascimento, idade;
    
    Aluno(){
    }
    
    int idadeAtual(){
        idade = 2020 - anoNascimento;
        return idade;
    }
    
    double pesoIdeal(){
        if(sexo == 'm' && sexo == 'M')
            return 72.7 * this.altura - 58;
        else if(sexo == 'f' && sexo == 'F')
            return 62.1 * this.altura - 44.7;
        else
            return -1;
    }
    
    void cadastro(){
        System.out.print("Insira o nome do aluno: ");
        nome = sc.nextLine();
        System.out.print("Insira a altura do aluno: ");
        altura = sc.nextDouble();
        System.out.print("Insira a peso do aluno: ");
        peso = sc.nextDouble();
        System.out.print("Qual o sexo do aluno (M/F): ");
        sexo = sc.next().toUpperCase().charAt(0);
        System.out.print("Insira o ano de nascimento do aluno:");
        anoNascimento = sc.nextInt();
    }
}

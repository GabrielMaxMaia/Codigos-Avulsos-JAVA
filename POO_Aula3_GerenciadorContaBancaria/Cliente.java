
import java.util.Scanner;

/**
 *
 * @author gabriel.mmcarmo
 */
class Cliente {
    Scanner sc = new Scanner(System.in);
    
    private String nome;    
    private String cpf;
    private final int numeroConta;

    public Cliente(int numeroConta){
        this.numeroConta = numeroConta;
        cadastro();
    }
    
    private void cadastro(){
        System.out.print("Digite o nome do cliente: ");
        this.nome = sc.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        this.cpf = sc.nextLine();
    }
    
    public String getNome() {
        System.out.println(nome);
        return nome;
    }

    public String getCpf() {
        System.out.println(cpf);
        return cpf;
    }
}

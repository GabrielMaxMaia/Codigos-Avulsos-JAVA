package contabancaria;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author gabriel.mmcarmo
 */
public class ContaBancaria{
    
    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<String> contas = new ArrayList();
    
    public static void main(String[] args) {
        lerMenu();
    }
    
    public static void menu(){
        System.out.println("1 - Cadastrar conta\n"
                + "2 - Depositar\n"
                + "3 - Sacar\n"
                + "4 - Transferir\n"
                + "5 - Sair\n");
    }
    
    public static void lerMenu(){
        int op;
        do{
            menu();
            System.out.print("Digite um opção: ");
            op = sc.nextInt();
            switch(op){
                case 1:
                    cadastrar(contas);
                    break;
                case 2:
                    depositar();
                    break;
                case 3:
                    sacar();
                    break;
                case 4:
                    transferir();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }
        }while(op != 5);
    }

    private static void cadastrar(ArrayList<String> contas) {
        
        int n = contas.size();
        int saldo = 0;
        System.out.print("Digite um nome: ");
        String nome;
        nome = sc.nextLine();
        
        contas.add(n+";"+nome+";"+saldo);
        
        n = contas.size();
        for (int i=0; i<n; i++) {
        System.out.printf("Posição %d- %s\n", i, contas.get(i));
    }
    }

    private static void depositar() {
        
    }

    private static void sacar() {
        
    }

    private static void transferir() {
        
    }
    
}

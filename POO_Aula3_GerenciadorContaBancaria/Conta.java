/**
 *
 * @author gabriel.mmcarmo
 */
class Conta {
    
    private int numeroContaCorrente;
    private final String cpf;
    private double saldo;
    
    public Conta (int valorSaldo, String cpf){
        this.saldo = valorSaldo;
        this.cpf = cpf;
    }
    
    public boolean saque (double valor){
        
        if(valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque efetivado com sucesso!");
            return true;
        }
        
        System.out.println("Falha ao realizar o saque!");
        return false;
    }
    
    public boolean deposito (double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito efetivado com sucesso!");
            return true;
        }
        
        System.out.println("Falha ao realizar o depósito!");
        return false;
    }
}

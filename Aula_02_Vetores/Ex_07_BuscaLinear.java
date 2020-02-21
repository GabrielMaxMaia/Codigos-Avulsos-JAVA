package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.exibirVetor;
import static Aula_02_Vetores.Ex_04_Inverter.lerInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.lerVetorAleatorio;


/**
 *
 * @author gabriel.mmcarmo
 */
public class Ex_07_BuscaLinear {
    public static void main(String[] args) {
        int n = lerInteiroPositivo();
        int v[] = lerVetorAleatorio(n);
        exibirVetor(v);
        System.out.print("Digite o número que deseja buscar: ");
        int x = lerInteiroPositivo();
        int pos = buscaLinear(v,x);
        if(pos==-1)
            System.out.printf("\n%d não está no vetor.",x);
        else
            System.out.printf("\n%d está na posição %d do vetor.",x,pos);
    }

    public static int buscaLinear(int[] v, int x) {
        for (int i = 0; i < v.length; i++) {
            if(v[i] == x)
                return i; //Achou
        }
        return -1; //Não Achou
    }
}

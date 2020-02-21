package Aula_02_Vetores;

import static Aula_02_Vetores.Ex_04_Inverter.lerInteiroPositivo;
import static Aula_02_Vetores.Ex_04_Inverter.lerVetorAleatorio;
import static Aula_02_Vetores.Ex_04_Inverter.exibirVetor;
import static Aula_02_Vetores.Ex_04_Inverter.exibirVetorTam;
import static Aula_02_Vetores.Ex_07_BuscaLinear.buscaLinear;

/**
 *
 * @author gabriel.mmcarmo
 */
public class Ex_08_Inters_Uniao {
    public static void main(String[] args) {
        int n1 = lerInteiroPositivo();
        int v1[] = lerVetorAleatorio(n1);
        exibirVetor(v1);
        int n2 = lerInteiroPositivo();
        int v2[] = lerVetorAleatorio(n2);
        exibirVetor(v2);
        //(a) Intersecção de 2 vetores
        int inter[] = new int[v1.length];
        int nInter = inters2Vetores(v1,v2,inter);
        exibirVetor(inter);
        exibirVetorTam(inter,nInter);
    }
    
    public static int inters2Vetores(int[] v1, int[]v2, int[]inter){
        int k=0;
        //Percorrer o v1 e busca em v2
        for (int i = 0; i < v1.length; i++) {
            //Buscar v
            if(buscaLinear(v2,v1[i])!= -1){
                inter[k]=v1[i];
                k++;
            }
        }
        return k;
    }
}

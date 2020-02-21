package Aula_02_Vetores;

import java.util.Scanner;

/**
 *
 * @author gabriel.mmcarmo
 */
public class Ex_04_Inverter {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = lerInteiroPositivo();
        //int v[] = lerVetor(n);
        int v[] = lerVetorAleatorio(n);
        inverterVetor(v);
        exibirVetor(v);
        //exibirVetorTam(v,n);
    }
    
    public static int lerInteiroPositivo() {
        int n;
        
        do{
            System.out.print("Digite um inteiro positivo: ");
            n=sc.nextInt();
        }while(n<=0||n>100);
        
        return n;
    }
    
    public static int[] lerVetor(int n){
        int v[] = new int[n];
        for (int i=0; i<v.length;i++){
            System.out.printf("v[%d]= ",i);
            v[i] = sc.nextInt();
        }
        return v;
    }

    public static int[] lerVetorAleatorio(int n){
        int v[] = new int[n];
        for (int i=0;i<v.length;i++){
            v[i]=(int)(Math.random()*50);
        }
        return v;
    }
    
    public static void exibirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf(v[i]+" ");
        }
        System.out.println();
    }
    
    public static void exibirVetorTam(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.printf(v[i]+" ");
        }
        System.out.println();
    }
    
    public static void inverterVetor(int[] v){
        int ini = 0;
        int fim = v.length-1;
        
    }
}

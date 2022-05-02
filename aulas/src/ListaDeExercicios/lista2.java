package ListaDeExercicios;

public class lista2 {
	public static void main(String[ ] args) {
	     
        //Lista de Exercícios 2
 
        //1. Para  cada  conjunto  de  valores  abaixo,  escreva  o  código  Java,  usando  laço(s),  que preencha um array com os valores:  
            //a) 10 9 8 7 6 5 4 3 2 1
            System.out.println("1a - =================================================\n");
            int[] numA = new int[10];
            int j = 10;
 
            for (int i = 0; i < numA.length; i++) {
                numA[i]= j;
                j--;
                System.out.println(numA[i]);
            }
            System.out.println("\n");
            System.out.println("1b - =================================================\n");
            //b) 0 1 4 9 16 25 36 49 64 81 100
 
            int[] numB = new int[11];
            int k=0;
 
            for (int l = 0; l < numB.length; l++) {
                k = l*l;
                numB[l] = k;
                System.out.println(numB[l]);
            }
            System.out.println("\n");
            System.out.println("1c - =================================================\n");
 
            //c) 1 2 3 4 5 10 20 30 40 50
 
            System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("\n");
            System.out.println("2 - =================================================\n");
     
        //2. Escreva um trecho Java que exiba os valores de um array a double numa mesma linha.
 
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n");
        System.out.println("3 - =================================================\n");
 
        //3. Crie  um  array  de  inteiros  e  retorna  a  quantidade  de  elementos  do  array  que  são números negativos.
 
        int[] inteiros = {9,-8,74,10,20,-9,-6};
 
        for (int i = 0; i < inteiros.length; i++) {
            if (inteiros[i]<0) {
            System.out.println(inteiros[i]);
        }
        }
        System.out.println("\n");
        System.out.println("4 - =================================================\n");
 
        //4. Crie um array de inteiros a e um valor inteiro x e retorna a quantidade de vezes que x aparece no array a.
 
        int[] a = {9,95,80,21,33,21,65,84,74};
        int x=21, valorX=0;
 
        for (int i = 0; i < a.length; i++) {
            if (a[i]==x) {
                valorX++;
            }
        }
        System.out.println(valorX);
        System.out.println("\n");
        System.out.println("5 - =================================================\n");
 
        //5. Escreva  um  array  de  inteiros  a  e  devolve  um  array  de  boolean  onde,  cada  posição indique true se o elemento da posição correspondente de a é positivo e false caso seja negativo ou zero.
       
        int[] c = {9,95,80,21,33,21,65,84,74};
        boolean[] b = new boolean[8];
   
        for (int i = 0; i < a.length; i++) {
            if (c[i]>0) {
                valorX++;
            }
        }
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n");
        System.out.println("6 - =================================================\n"); 
        
        //6. Escreva um array de números e devolve a posição onde se encontra o maior valor do array.
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("\n");
        System.out.println("7 - =================================================\n"); 
        
        //7. Crie um array de inteiros positivos e substitui seus elementos de valor ímpar por -1 e os pares por +1.
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
       
    }
}


package Anotações;

public class aulaDia1403 {
	public static void main(String[ ] args) {
        System.out.println("Hello Java :) \n");
        //Aula 14/03
        //Operadores aritméticos
 
        int valor1 = 10;
        int valor2 = 5;
 
        System.out.println("Valor1 = 10 / Valor2 = 5\n");
        System.out.println("Nota = 8.5 / Frequencia = 74\n");
        System.out.println("Salario = 2758.33\n");
        System.out.println("-------------------------------------\n");
        System.out.println("Operadores aritméticos\n");
 
        System.out.println("* Resultado soma: "+ (valor1+valor2));
        System.out.println("* Resultado subtração: "+ (valor1-valor2));
        System.out.println("* Resultado multiplicação: "+ (valor1*valor2));
        System.out.println("* Resultado divisão: "+ (valor1/valor2));
        System.out.println("* Resultado MOD (resto): "+ (valor1%valor2) + "\n");
 
        //Operadores relacionais
        System.out.println("=====================================\n");
        System.out.println("Operadores relacionais\n");
 
        System.out.println("- valor1 > valor2: " + (valor1 > valor2));
        System.out.println("- valor1 >= valor2: " + (valor1 >= valor2));
        System.out.println("- valor1 < valor2: " + (valor1 < valor2));
        System.out.println("- valor1 <= valor2: " + (valor1 <= valor2));
        System.out.println("- valor1 == valor2: " + (valor1 == valor2));
        System.out.println("- valor1 != valor2: " + (valor1 != valor2) + "\n");
 
        //Operadores lógicos >>> nota>=7 E frequencia >= 75
        System.out.println("=====================================\n");
        System.out.println("Operadores lógicos\n");
 
        float nota = 8.5f;
        float frequencia = 74.0f;
 
        System.out.println("- nota>=7 && frequencia>=75? " + (nota>=7 && frequencia>=75)); //E
        System.out.println("- nota>=7 || frequencia>=75? " + (nota>=7 || frequencia >=75)); //OU
        System.out.println("- !(nota>=7 && frequencia>=75)? " + ! (nota>=7 && frequencia >=75)); //Negacao E
        System.out.println("- !(nota>=7 || frequencia>=75)? " + ! (nota>=7 || frequencia >=75)); //Negacao OU
 
        System.out.println("\n=====================================\n");
        System.out.println("Estruturas de controle por Decisão\n");
 
        double salario = 2758.33;
        //imprimir acima da media caso o salario seja maior que 2500
 
        //IF
        if (salario >= 2500) {
        System.out.println("Caso IF: Acima da media");}
   
        //IF-ELSE
        if (salario >= 2500)
        System.out.println("Caso IF: Acima da media");
        else
      System.out.println("Caso ELSE: Abaixo da media");
   
        //IF-ELSE-IF
        if (salario >= 2500)
        System.out.println("Caso IF: Acima da media");
        else if(salario < 1000)
        System.out.println("Caso ELSE IF: Muito abaixo da media");
        else
          System.out.println("Caso ELSE: Na media");    
 
        //Forma TERNARIA    
        String resposta = (salario >= 2500) ? "Acima da media":"Abaixo da media";
        System.out.println("Forma ternária: " + resposta);
        System.out.println("\n-------------------------------------\n");
        //Switch Case
        System.out.println("Switch Case com int\n");
 
        int opcao = 2;
 
        switch (opcao) {
            case 1:
                System.out.println("Problema tecnico");
            break;
            case 2:
                System.out.println("Problema financeiro");
            break;
            case 3:
                System.out.println("Promoções");
            break;
            case 9:
                System.out.println("Fale com um de nossos atendentes");
            break;
            default:
                System.out.println("O número digitado é invalido");
        }
 
        System.out.println("\nSwitch Case com String\n");
        String nome = "Antonio";
        switch (nome){
            case "Antonio":
                System.out.println("Excelente! ");
            break;
            case "Maria":
                System.out.println("Bom trabalho! ");
            break;
            case "Jose":
                System.out.println("Pode melhorar! ");
            break;
            default:
                System.out.println("Desculpe, você falhou!");
		
double media = 6;
       int opcao1;
 
        if (media >=7)
        opcao1 = 1;
        else if(media < 5)
            opcao1 = -1;
        else
        opcao1 = 0;
       
        switch(opcao1){
 
            case -1:
                System.out.println("Reprovado");
            break;
            case 0:
                System.out.println("Recuperação");
            break;
            case 1:
                System.out.println("Aprovado");
            break;
        	}
        }
    }
}

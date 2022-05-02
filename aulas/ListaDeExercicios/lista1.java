package ListaDeExercicios;

public class lista1 {
	public static void main(String[ ] args) {
	     
        //Lista de Exercícios 1
 
        //1. Faça  um  programa  que,  dado  o  valor  da  conta  de  uma  refeição  realizada  em  um restaurante, acrescente os 10% do garçom e exiba o valor total da conta.
       
        float valorConta = 60.0f, valorTotal = valorConta*1.1f;
       
        System.out.println("1 - O valor total da conta eh de R$" + valorTotal);
        System.out.println("\n============================================\n");
 
        //2.  Faça um programa que calcule o resto da divisão inteira entre dois números dados.  Exemplo: se dividirmos 25 por 4, temos resto=1
       
        int numA = 25, numB = 4, resto = numA%numB;
 
        System.out.println("2 - O resto da divisao eh " + resto);
        System.out.println("\n============================================\n");
 
        //3.  Construa um programa que, dado o valor de uma mercadoria, sejam aplicados 15% de desconto em uma venda à vista e exiba o valor a ser pago.
       
        float valorMercadoria = 85.0f, valorDesconto = valorMercadoria*0.85f;
 
        System.out.println("3 - O valor a vista eh R$" + valorDesconto);
        System.out.println("\n============================================\n");
 
        //4.  Escreva um programa que, dados o valor da mercadoria e o valor pago, calcule e exiba o troco a ser devolvido.
       
        float valorPago = 100.0f, troco = valorPago-valorMercadoria;
 
        System.out.println("4 - O troco eh de R$" + troco);
        System.out.println("\n============================================\n");
 
        //5.  Escreva um programa que, dados três números, informe o maior e o menor.
 
        int num1 = 4, num2 = 5, num3 = 7;
 
        int maior = num1>num2? num1:num2;
        maior = num2>num3?num2:num3;
 
        int menor = num2<num3?num2:num3;
        menor = num1<num2?num1:num2;
 
        System.out.println("5.1 - O maior numero eh " + maior + " e o menor eh " + menor);
        System.out.println("--------------------------------------------\n");
 
        if (num1>num2 && num1>num3) {
            maior = num1;}
        else if (num2>num3 && num2>num1) {
            maior = num2;}
        else {
            maior = num3;}
 
        if (num1<num2 && num1<num3) {
            menor = num1;}
        else if (num2<num3 && num2<num1) {
            menor = num2;}
        else {
            menor = num3;}
 
        System.out.println("5.2 - O maior numero eh " + maior + " e o menor eh " + menor);
        System.out.println("\n============================================\n");
 
        //6.  Faça um Programa que leia as seguintes informações de um funcionário: matricula, nome, idade, sexo, endereço, bairro e estado civil.  Escreva o nome do funcionário.
       
        int matricula, idade = 21;
        String nome = "Isabela", sexo = "Feminino", endereço, bairro, estadoCivil;
 
        System.out.println("6 - Nome do funcionario: " + nome);
        System.out.println("\n============================================\n");
 
        //7.  Faça um programa que leia dois números inteiros e escreva a soma entre eles.
       
        int valorA = 2, valorB = 6, soma = valorA+valorB;
 
        System.out.println("7 - A soma dos valores eh " + soma);
        System.out.println("\n============================================\n");
 
        //8.  Faça um programa para ler o nome e as três notas de um aluno. Calcular a média e escrever o nome e a média. Variáveis utilizadas: NOME, N1, N2, N3, MEDIA.
       
        float n1 = 9.0f, n2 = 8.5f, n3 = 5.0f, media = (n1+n2+n3)/3;
 
        System.out.println("8 - Aluno: " + nome + " / Media: " + media);
        System.out.println("\n============================================\n");
       
        //9.  Faça  um  programa  para  ler  o  nome,  departamento  e  o  salário  de  um  funcionário. Calcular e informar um abono de 10% (dez por cento) sobre o salário e, ainda, o novo salário acrescido do abono.
       
        String departamento;
        float salario = 6500.0f, abono = salario*1.1f;
 
        System.out.println("9 - Olá! Seu salário de R$" + salario + " recebera um abono de 10% e passará a ser de R$" + abono);
        System.out.println("\n============================================\n");
 
        //10. Faça um programa para ler o código, a descrição, a quantidade, o preço de compra e o  percentual  de  lucro  de  uma  mercadoria.  Calcular  o  valor  da  venda  com  base  no percentual de lucro e, ainda, calcular o preço total em “R$” entre o preço da venda e a quantidade. Ao final, escrever o preço de compra, o percentual de lucro, o preço da venda, a quantidade e o preço total.
       
        int codigo = 85749214, quant = 100;
        String descrição;
        float preçoCompra = 12.30f, percLucro = 20, precoVenda, precoTotal;
 
        precoVenda = preçoCompra*((100+percLucro)/100);
        precoTotal = precoVenda*quant;
 
        System.out.println("10 - Preço de compra - R$" + preçoCompra);
        System.out.println("     Percentual de lucro - " + percLucro + "%");
        System.out.println("     Preço da venda - R$" + precoVenda);
        System.out.println("     Quantidade - " + quant + " unidades");
        System.out.println("     Preço total - R$" + precoTotal);
   
        System.out.println("\n============================================\n");
 
        //11. Faça um programa para ler o nome e o ano, mês e dia de nascimento de um cidadão. Calcular e informar sua idade.
       
        String nome11 = "Jose das Couves";
        int diaNascimento = 20, mesNascimento = 5, anoNascimento = 1980;
        int diaAtual = 16, mesAtual = 3, anoAtual = 2022;
 
        int idade11 = 0;
 
        if ((mesAtual > mesNascimento) || (mesAtual == mesNascimento && diaAtual >= diaNascimento)){
            idade = anoAtual - anoNascimento;
        }else {
            idade = anoAtual - anoNascimento -1;
        }
 
        System.out.println("11 - Idade: "+ idade);
        System.out.println("\n============================================\n");
 
        //12. Considerando um Programa iniciado pelos atributos A = 1, B = 2, C = 3, complete-o de modo que ao final do Programa o conteúdo de A seja 3, de B seja 1 e de C seja 2. Use apenas atribuições entre variáveis.
        //a=3,b=1,c=2
        int A = 1, B = 2, C = 3, auxiliar;
 
        System.out.println("12 - A = " + A + " / B = " + B + " / C = " + C);
 
        auxiliar = A;
        A  = C;
        C = B;
        B = auxiliar;
        System.out.println("     A = " + A + " / B = " + B + " / C = " + C);
        System.out.println("\n============================================\n");
 
        //13. Faça um Programa que obtenha o salário-base e o número de dependentes de um funcionário  e  informe  o  salário  bruto  (igual  ao  salário-base  +  R$  100,00  por dependente), e o salário líquido, sabendo-se que o desconto para o INSS é de 10% sobre o salário-base.
       
        int numDep = 5;
        float salarioBase = 2300.0f, salarioBruto = salarioBase+(100.0f*numDep), salarioLiquido = salarioBase*0.9f;
       
        System.out.println("13 - O salario bruto eh R$" + salarioBruto + " e o salario liquido eh R$" + salarioLiquido);
        System.out.println("\n============================================\n");
       
        //14. Faça um Programa que calcule a quantidade necessária de tinta e o número de latas, para pintar uma parede de Xm de largura por Ym de altura. Considere que o consumo de  tinta  é  de  3  litros  por  metro  quadrado  e  a  quantidade  de  tinta  por  lata  é  de  2 litros.
       
        float quantTinta, numLatas, comp = 2.5f, larg = 3.0f;
 
        quantTinta = (comp*larg)*3;
        numLatas = quantTinta/2;
 
        System.out.println ("14 - Quantidade de tinta a ser usada: "+ quantTinta +"L");
        System.out.println ("     Total de latas: "+ numLatas + " unid");
        System.out.println("\n============================================\n");
       
        //15. Considerando  que  A  =  5,  B  =  8  e  C  =  10,  calcule  e  imprima  o  valor  das  seguintes expressões: • Y = X * A / • X = A + (2 * B) / (C - 6)
        //• Y = X * A
        //• X = A + (2 * B) / (C - 6)
 
        int X, Y;
 
        A = 5;
        B = 8;
        C = 10;
        X = (A + (2*B)) / (C-6);
        Y = X*A;
 
        System.out.println("15 - X = " + X + " / Y = " + Y);
        System.out.println("\n============================================\n");
       
        //16.  Em um aeroporto, a balança de bagagem envia a informação de peso da bagagem desacompanhada para um computador que calcula o valor do excesso de peso com os seguintes parâmetros:  
            //Faixa de Peso da bagagem Valor a pagar por quilo em excesso
               //Até 20 Kg (inclusive) ------------------- 0,00
               //De 20 Kg a 40 Kg (inclusive) ---------- 5.000,00
               //De 40 Kg para cima -------------------- 10.000,00
 
         float pesoBag = 100.0f, valorExc = 0.0f;
 
            if (pesoBag<=20) {
                valorExc = 0;
            }
            else if (pesoBag>20 && pesoBag<=40) {
                valorExc = 5000;
            }
            else {
                valorExc = 10000;
            }
       
        System.out.println("16 - O valor a ser pago pelo excesso de bagagem eh de R$" + valorExc);
        System.out.println("\n============================================\n");
       
        //17.Tendo  como  dados  de  entrada  a  altura  e  o  sexo  de  uma  pessoa,  construa  um programa que calcule seu peso ideal, utilizando as seguintes fórmulas:
            //• Para homens:  (72.7 * altura) – 58;
            //• Para mulheres: (62.1 * altura) – 44.7;
         
            sexo = "Feminino";
            float altura = 1.56f, pesoIdeal=0.0f;
 
            if (sexo == "Feminino") {
                pesoIdeal = (62.1f*altura)-44.7f;
            }
            else if (sexo == "Masculino") {
                pesoIdeal = (72.7f*altura)-58;
            }
       
        System.out.println("17 - Seu peso ideal eh " + pesoIdeal + " kg");
        System.out.println("\n============================================\n");
       
        //18. Elabore um programa que, dada a idade de um nadador, classifique-o em uma das seguintes categorias:
            //• Infantil A   =  5 – 7 anos
            //• Infantil B  =  8 – 10 anos
            //• Juvenil A  =  11 – 13 anos
            //• Juvenil B  =  14 – 17 anos
            //• Sênior   =  maiores de 18 anos  
       
        String categoria="Infantil A";
        idade = 22;
 
        if (idade>=5 && idade<=7) {
            categoria = "Infantil A";
        }
        else if (idade >=8 && idade<=10) {
            categoria = "Infantil B";
        }
        else if (idade >=11 && idade<=13) {
            categoria = "Juvenil A";
        }
        else if (idade >=14 && idade<=17) {
            categoria = "Juvenil B";
        }
        else if (idade >=18) {
            categoria = "Senior";
        }
 
        System.out.println("18 - Voce esta na categoria " + categoria);
        System.out.println("\n============================================\n");
    }
}


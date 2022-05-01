package Anotações;

public class aulaDia1603 {
	public static void main(String[ ] args) {
		 
        //While
    System.out.println("While\n");
        int contador = 1;
 
            while (contador<10) {
                System.out.println("Numero " + contador);
                //contador = contador + 2;
                contador += 2; //acumulador
            }
    System.out.println("\n=====================================\n");
    System.out.println("Do While\n");
        //Do While
        int contador2 = 0;
 
        do {
            System.out.println("Numero " + contador2);
            contador2++;
        } while (contador2 <= 10);
 
    System.out.println("\n=====================================\n");
    System.out.println("For\n");
        //For
 
        for(int contador3 = 0; contador3<10; contador3++) {
            System.out.println("Valor " + contador3);
        }
    System.out.println("\n=====================================\n");
    System.out.println("\n");
    }

}

import java.util.Scanner;

public class Matriz {

  public static void main(String[] args) {
   Scanner entrada = new Scanner(System.in);

    // pedir qual é a matriz ( 2x2, 3x3, 4x4...)
    System.out.print(" Digite qual é a sua matriz: ");
    int ordem = entrada.nextInt();

    int[] []matriz;

   matriz = new int [ordem][ordem];

      // Pedindo para o usuario digitar os numeros de sua matriz
      for ( int i = 0; i < ordem; i++ ) {

         for ( int j = 0; j < ordem; j++ ) {

          System.out.println(" digite o numero da matriz [ " + i + " ] [ " + j + " ]: ");
          matriz[i][j] = entrada.nextInt();

         }
      }
   
      // somar os valores de sua diagonal principal

     int somaDiagonal = 0;
        for (int i = 0; i < ordem; i++) {
            somaDiagonal += matriz[i][i];
        }

        // imprimindo a matriz

        System.out.println(" Matriz: ");
        for (int i = 0; i < ordem; i++) {
          for ( int j = 0; j < ordem; j++ ) {
            System.out.print(matriz[i][j] + " ");
         }
         System.out.println("");
        }


    // Imprimindo na tela o valor da diagonal
    System.out.print(" A soma da diagonal é: " + somaDiagonal);
  }
   
 }
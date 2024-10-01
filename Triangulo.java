 import java.util.Scanner;
 
 public class Triangulo {

	 static void TrianguloRetangulo(int Base ) {

        String a = "*";
		for ( int i = 0; i <= Base; i++ ) {
			 for ( int j = 0; j < i; j++ ) {
				System.out.print(a);
				
			 }
            System.out.println();
		}
  }

  public static void main(String[] args ) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite um numero para a base: ");
			int Base = scanner.nextInt();

			TrianguloRetangulo(Base);
	 }
}
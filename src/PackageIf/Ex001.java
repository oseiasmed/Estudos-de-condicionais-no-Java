package PackageIf;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numberOne, numberTwo;

		System.out.println("Informe o primeiro n�mero");
		numberOne = entrada.nextInt();

		System.out.println("Informe o segundo n�mero");
		numberTwo = entrada.nextInt();

		if (numberOne > numberTwo) {

			System.out.println("O maior n�mero informado foi " + numberOne);

		}else {
			
			System.out.println("O maior n�mero informado foi " + numberTwo);
			
		}

	}

}

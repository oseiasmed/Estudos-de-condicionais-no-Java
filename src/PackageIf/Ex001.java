package PackageIf;

import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numberOne, numberTwo;

		System.out.println("Informe o primeiro número");
		numberOne = entrada.nextInt();

		System.out.println("Informe o segundo número");
		numberTwo = entrada.nextInt();

		if (numberOne > numberTwo) {

			System.out.println("O maior número informado foi " + numberOne);

		}else {
			
			System.out.println("O maior número informado foi " + numberTwo);
			
		}

	}

}

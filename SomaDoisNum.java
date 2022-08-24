import java.util.*;

class SomaDoisNum {

	public static void main(String[] args) {
		int num1, num2, soma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		
		//somar
		soma = num1 + num2;
		
		//mostrar na tela o resultado da soma
		System.out.println("Soma:" + soma);
	}
}

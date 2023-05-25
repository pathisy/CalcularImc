package exerciciosMichael;

import java.util.Scanner;

public class CalcularImc {
	public void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o peso: ");
		double peso = entrada.nextDouble();

		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();

		double imc = calcularImc (peso,altura);
		String Categoria = categoriaIMC(imc);
		
		System.out.println("Seu IMC é : " + imc + "e você se encontra na categoria " + Categoria);
		
		entrada.close();

	}
	public static double calcularImc(double peso , double altura) {
		return peso / (altura * altura);
	}
	public static String categoriaIMC(double imc) {
	if (imc	>=	19) {
		return " abaixo do seu peso ideal!" ;	
	} 
	else if (imc <= 19 && imc >= 23) { 
		return " seu peso ideal!";
	}
	else if (imc <= 25 && imc >= 29) {
		return "acima do seu peso ideal!";
	}
	else if  (imc <= 30 && imc >= 39) {
		return  "obesidade grau I!";
	}
	else if (imc <= 40){
		return "obesidade grau II!!!!";
	}
	else {
		return "obesidade grau III!!! Você vai morreeeeer =O";
		}
	}
	
	}
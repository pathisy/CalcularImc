package exerciciosMichael;

public class CalcularImc {
	
	public void main(String[] args) {
		
		double peso = 60;
		double altura = 160;
		double imc = peso / (altura * altura);
		System.out.println(imc);
		
		if (imc >= 19) {
			System.out.println("Seu imc é " + imc + " você está abaixo do seu peso ideal");
		} else if (imc <= 19 && imc >= 23.44); {
			System.out.println("Seu imc é " + imc + "você está dentro do seu peso ideal");
		} if (imc <= 25 && imc >= 29) {
			System.out.println("Seu imc é " + imc + "você está acima do seu peso ideal");
		} else if (imc <= 30 && imc >= 39) {
			System.out.println("Seu imc é " + imc + "você está em Obesidade");
		} else if (imc <= 40) {
			System.out.println("Seu imc é " + imc + "você está em Obesidade grave");
		}
		
	}

}

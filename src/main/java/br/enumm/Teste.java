package br.enumm;

public class Teste {
	public static void main(String[] args) {
		usandoConstantes();
	}
	
	private static void usandoConstantes() {
		int seguda  = DiaSemanaConstantes.SEGUNDA_FEIRA;
		int terca   = DiaSemanaConstantes.TERCA_FEIRA;
		int quarta  = DiaSemanaConstantes.QUARTA_FEIRA;
		int quinta  = DiaSemanaConstantes.QUINTA_FEIRA;
		int sexta   = DiaSemanaConstantes.SEXTA_FEIRA;
		int sabado  = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java");
		imprimiDiaSemana(seguda);
		imprimiDiaSemana(terca);
		imprimiDiaSemana(quarta);
		imprimiDiaSemana(quinta);
		imprimiDiaSemana(sexta);
		imprimiDiaSemana(sabado);
		imprimiDiaSemana(domingo);
	}
	
	private static void imprimiDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		}
	}
}

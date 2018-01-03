package br.enumm;

public class ExecuteEnum {
	public static void main(String[] args) {
		usandoEnum();
	}
	private static void imprimiDiaSemanaEnum(DiaSemanaEnum dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sábado");
			break;
		case DOMINGO:
			System.out.println("Domingo");
			break;
		}
	}
	
	private static void usandoEnum() {
		DiaSemanaEnum segunda = DiaSemanaEnum.SEGUNDA;
		DiaSemanaEnum terca   = DiaSemanaEnum.TERCA;
		DiaSemanaEnum quarta  = DiaSemanaEnum.QUARTA;
		DiaSemanaEnum quinta  = DiaSemanaEnum.QUINTA;
		DiaSemanaEnum sexta   = DiaSemanaEnum.SEXTA;
		DiaSemanaEnum sabado  = DiaSemanaEnum.SABADO;
		DiaSemanaEnum domingo = DiaSemanaEnum.DOMINGO;

		System.out.println("Teste utilizando Enum no Java");
		imprimiDiaSemanaEnum(segunda);
		imprimiDiaSemanaEnum(terca);
		imprimiDiaSemanaEnum(quarta);
		imprimiDiaSemanaEnum(quinta);
		imprimiDiaSemanaEnum(sexta);
		imprimiDiaSemanaEnum(sabado);
		imprimiDiaSemanaEnum(domingo);
	}
}

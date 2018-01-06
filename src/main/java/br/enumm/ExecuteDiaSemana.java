package br.enumm;

public class ExecuteDiaSemana {
	public static void main(String[] args) {
		DiaSemana dia = DiaSemana.DOMINGO;
		System.out.println(dia.toString()+" - "+dia.getValor());
		
		Data data = new Data(1, 4, 2018,  DiaSemana.DOMINGO);
	}
}

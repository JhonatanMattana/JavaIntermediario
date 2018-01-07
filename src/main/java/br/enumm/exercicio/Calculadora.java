package br.enumm.exercicio;

public class Calculadora {

	public static void main(String[] args) {
		double x = 2.0;
		double y = 3.0;
		
		for (Operacao op : Operacao.values()) {
			System.out.print(x + " "+op.toString());
			System.out.println(" "+y + " = "+op.executarOperacao(x, y));
		}
	}
}

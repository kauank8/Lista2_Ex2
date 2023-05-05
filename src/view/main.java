package view;

import br.com.KauanPaulino.ListaInt.Lista_Int;
import controller.IntersecaoUniaoController;

public class main {

	public static void main(String[] args) {
		Lista_Int listaA = new Lista_Int();
		Lista_Int listaB = new Lista_Int();
		
		//enchendo ListaA
		listaA.addFirst(3);
		try {
			listaA.addLast(5);
			listaA.addLast(8);
			listaA.addLast(12);
			listaA.addLast(9);
			listaA.addLast(7);
			listaA.addLast(16);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Enchendo listaB
		listaB.addFirst(9);
		try {
			listaB.addLast(6);
			listaB.addLast(2);
			listaB.addLast(3);
			listaB.addLast(7);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Executa Operações
		IntersecaoUniaoController op = new IntersecaoUniaoController();
		op.Intersecao(listaA, listaB);
		op.Uniao(listaA, listaB);
	}

}

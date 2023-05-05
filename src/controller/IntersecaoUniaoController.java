package controller;

import br.com.KauanPaulino.ListaInt.Lista_Int;

public class IntersecaoUniaoController {
	
	public void Intersecao(Lista_Int listaA, Lista_Int listaB) {
		//Interseção 
				Lista_Int listaI = new Lista_Int();
				int tamanhoA = listaA.size();
				int tamanhoB = listaB.size();
				int valorA=0;
				int valorB;
				for(int x=0;x<tamanhoA;x++) {
					try {
						valorA = listaA.get(x);
					} catch (Exception e) {
						e.printStackTrace();
					}
					for(int y=0;y<tamanhoB;y++) {
						try {
							valorB=listaB.get(y);
							if(valorA == valorB) {
								listaI.addFirst(valorB);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				//mostra
				int tamanhoI = listaI.size();
				System.out.print("Interseção:");
				for(int i=0;i<tamanhoI;i++) {
					int valor;
					try {
						valor = listaI.get(i);
						System.out.print(valor+" ");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
		}
	
		public void Uniao(Lista_Int listaA, Lista_Int listaB) {
			Lista_Int listaU = new Lista_Int();
			int tamanho = listaA.size();
			for(int i=0;i<tamanho;i++) {
				int valor;
				try {
					valor = listaA.get(i);
					listaU.addFirst(valor);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			tamanho = listaB.size();
			for(int i=0;i<tamanho;i++) {
				int valor;
				try {
					valor = listaB.get(i);
					listaU.addLast(valor);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
			//mostra
			tamanho = listaU.size();
			System.out.print("\nUniao:");
			for(int i=0;i<tamanho;i++) {
				int valor;
				try {
					valor = listaU.get(i);
					System.out.print(valor+" ");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
}

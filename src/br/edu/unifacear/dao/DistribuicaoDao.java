package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;
import br.edu.unifacear.classes.Distribuicao;



public class DistribuicaoDao {

	
	public DistribuicaoDao () {}
	
		
		public void selecionarDistribuicao(Distribuicao distribuicao) {
			System.out.println("Distribuição Selecionado");		
		}
		
		public void salvarDistribuicao(Distribuicao distribuicao) {
			System.out.println("Distribuição Salvo");		
		}
		
//		public void inserirColecao(Colecao colecao) {
//		System.out.println("Colecao Inserido");
//		}
		
		public void editarDistribuicao(Distribuicao distribuicao) {
			System.out.println("Distribuição Editado");		
		}
		
		public void deletarDistribuicao(int id) {
			System.out.println("Distribuição Deletado");		
		}		
		
		public List<Distribuicao> listarDistribuicao() {
			System.out.println("Lista Distribuição");	
			List<Distribuicao> lista = new ArrayList<Distribuicao>(); 
			return lista;
		}	
		
	
}

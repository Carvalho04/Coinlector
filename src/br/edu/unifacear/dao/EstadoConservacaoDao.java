package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;
import br.edu.unifacear.classes.EstadoConservacao;



public class EstadoConservacaoDao {

	public EstadoConservacaoDao () {}
		
		public void selecionarEstadoConservacao(EstadoConservacao estadoConservacao) {
			System.out.println("Estado de Conservação Selecionado");		
		}
	
		public void salvarEstadoConservacao(EstadoConservacao estadoConservacao) {
			System.out.println("Estado de Conservação Salvo");		
		}	
		
//		public void inserirEstadoConservacao(EstadoConservacao estadoConservacao) {
//			System.out.println("Estado de Conservação Inserido");
//		}
		
		public void editarEstadoConservacao(EstadoConservacao estadoConservacao) {
			System.out.println("Estado de Conservação Editado");		
		}
		
		public void deletarEstadoConservacao(int id) {
			System.out.println("Estado de Conservação Deletado");		
		}		
		
		public List<EstadoConservacao> listarEstadoConservacao() {
			System.out.println("Lista de Estado de Conservação");	
			List<EstadoConservacao> lista = new ArrayList<EstadoConservacao>(); 
			return lista;
		}
}

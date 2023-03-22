package br.edu.unifacear.dao;

import java.util.*;

import br.edu.unifacear.classes.TipoBorda;

public class TipoBordaDao {
	
	public TipoBordaDao() { 	}
	
		public void selecionarTipoBorda(TipoBorda tipoBorda) {
			System.out.println("Tipo de Borda Selecionado");		
		}
	
		public void salvarTipoBorda(TipoBorda tpBorda) {
			System.out.println("Tipo Borda Salvo");
		}
		
//		public void inserirTipoBorda(TipoBorda tipoBorda) {
//		System.out.println("Tipo de Borda Inserido");
//		}
		
		public void editarTipoBorda(TipoBorda tpBorda) {
			System.out.println("Tipo de Borda Editado");
		}
		
		public void deletarTipoBorda(int id) {
			System.out.println("Tipo de Borda Deletado");
		}
		
		public List<TipoBorda> listarTipoBorda() {
			System.out.println("Lista Tipo de Borda");	
			List<TipoBorda> lista = new ArrayList<TipoBorda>(); 
			return lista;
		}		
}

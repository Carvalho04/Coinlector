package br.edu.unifacear.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import br.edu.unifacear.classes.Borda;
import br.edu.unifacear.jdbc.Fabrica;

public class BordaDao {
	
	public BordaDao() { 	}
	
		public void selecionarTipoBorda(Borda tipoBorda) {
			System.out.println("Tipo de Borda Selecionado");		
		}
	
		public void salvarTipoBorda(Borda tpBorda) {
			System.out.println("Tipo Borda Salvo");
		}
		
//		public void inserirTipoBorda(TipoBorda tipoBorda) {
//		System.out.println("Tipo de Borda Inserido");
//		}
		
		public void editarTipoBorda(Borda tpBorda) {
			System.out.println("Tipo de Borda Editado");
		}
		
		public void deletarTipoBorda(int id) {
			System.out.println("Tipo de Borda Deletado");
		}
		
		public List<Borda> listarTipoBorda() {
			System.out.println("Lista Tipo de Borda");	
			List<Borda> lista = new ArrayList<Borda>(); 
			return lista;
		}
		
	
}

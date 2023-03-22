package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Forma;


public class FormaDao {
	
	public FormaDao () {}
	
		public void selecionarForma(Forma forma) {
			System.out.println("Forma Selecionado");		
		}
		
		public void salvarForma(Forma forma) {
			System.out.println("Forma Salvo");		
		}
		
//		public void inserirForma(Forma forma) {
//		System.out.println("Forma Inserido");
//	}
		
		public void editarForma(Forma forma) {
			System.out.println("Forma Editado");		
		}
		
		public void deletarForma(int id) {
			System.out.println("Forma Deletado");		
		}	
		
		public List<Forma> listarForma() {
			System.out.println("Lista Forma");	
			List<Forma> lista = new ArrayList<Forma>(); 
			return lista;
		}	

}

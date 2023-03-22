package br.edu.unifacear.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class Venda_Usuario extends JFrame {
	private JTextField txtItens;
	private JTable table;
	public Venda_Usuario() {
		setTitle("Meus Itens a Venda");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblItensVenda = new JLabel("Meus Itens a Venda");
		lblItensVenda.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblItensVenda.setBounds(82, 11, 326, 99);
		getContentPane().add(lblItensVenda);
		
		txtItens = new JTextField();
		txtItens.setBounds(71, 111, 298, 20);
		getContentPane().add(txtItens);
		txtItens.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(379, 110, 100, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblNewLabel_1 = new JLabel("Meus itens");
		lblNewLabel_1.setBounds(10, 114, 51, 14);
		getContentPane().add(lblNewLabel_1);
		
		table = new JTable();
		table.setBounds(57, 142, 383, 363);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
		
		JButton btnCatlogo = new JButton("Catálogo");
		btnCatlogo.setBounds(390, 11, 89, 23);
		getContentPane().add(btnCatlogo);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
	}

	
	public static void main (String []args) {
		Venda_Usuario venda = new Venda_Usuario();
	}
}

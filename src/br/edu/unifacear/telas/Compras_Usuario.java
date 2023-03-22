package br.edu.unifacear.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class Compras_Usuario extends JFrame {
	private JTextField txtCompras;
	private JTable table;
	public Compras_Usuario() {
		setTitle("Minhas Compras");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblMinhasCompras = new JLabel("Minhas Compras");
		lblMinhasCompras.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblMinhasCompras.setBounds(116, 11, 264, 99);
		getContentPane().add(lblMinhasCompras);
		
		txtCompras = new JTextField();
		txtCompras.setBounds(71, 111, 298, 20);
		getContentPane().add(txtCompras);
		txtCompras.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(379, 110, 100, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblCompras = new JLabel("Compras");
		lblCompras.setBounds(10, 114, 51, 14);
		getContentPane().add(lblCompras);
		
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
		Compras_Usuario compras = new Compras_Usuario();
	}
	
}

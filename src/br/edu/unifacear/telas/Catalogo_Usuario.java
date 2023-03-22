package br.edu.unifacear.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Catalogo_Usuario extends JFrame{
	private JTextField txtCompras;
	private JTable table;
	public Catalogo_Usuario() {
		setTitle("Catálogo");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblCatalogo = new JLabel("Catálogo");
		lblCatalogo.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblCatalogo.setBounds(183, 11, 134, 99);
		getContentPane().add(lblCatalogo);
		
		txtCompras = new JTextField();
		txtCompras.setBounds(71, 111, 298, 20);
		getContentPane().add(txtCompras);
		txtCompras.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(379, 110, 100, 23);
		getContentPane().add(btnPesquisar);
		
		JLabel lblMoedas = new JLabel("Moedas");
		lblMoedas.setBounds(10, 114, 51, 14);
		getContentPane().add(lblMoedas);
		
		table = new JTable();
		table.setBounds(57, 142, 383, 363);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
		
		JButton btnSugestão = new JButton("?");
		btnSugestão.setToolTipText("Sugerir nova adição de moeda");
		btnSugestão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSugestão.setBounds(428, 11, 51, 23);
		getContentPane().add(btnSugestão);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	
	public static void main (String []args) {
		
		Catalogo_Usuario catalogo = new Catalogo_Usuario();
	}
}

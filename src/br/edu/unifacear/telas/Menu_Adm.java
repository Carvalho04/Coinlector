package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu_Adm extends JFrame{
	
	public Menu_Adm() {
		setTitle("Menu");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblBemVindo = new JLabel("Bem Vindo");
		lblBemVindo.setForeground(Color.BLACK);
		lblBemVindo.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblBemVindo.setBounds(162, 11, 171, 75);
		getContentPane().add(lblBemVindo);
		
		JButton btnConsultaCatalogo = new JButton("Consultar Catálogo");
		btnConsultaCatalogo.setForeground(new Color(128, 128, 0));
		btnConsultaCatalogo.setBackground(Color.BLACK);
		btnConsultaCatalogo.setBounds(64, 97, 177, 54);
		getContentPane().add(btnConsultaCatalogo);
		
		JButton btnConsultaPerfil = new JButton("Consultar Perfil");
		btnConsultaPerfil.setForeground(new Color(128, 128, 0));
		btnConsultaPerfil.setBackground(Color.BLACK);
		btnConsultaPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultaPerfil.setBounds(251, 97, 177, 54);
		getContentPane().add(btnConsultaPerfil);
		
		JButton btnConsultaColecionador = new JButton("Consultar Colecionadores");
		btnConsultaColecionador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultaColecionador.setForeground(new Color(128, 128, 0));
		btnConsultaColecionador.setBackground(Color.BLACK);
		btnConsultaColecionador.setBounds(251, 162, 177, 54);
		getContentPane().add(btnConsultaColecionador);
		
		JButton btnConsutaAdm = new JButton("Consultar Administradores");
		btnConsutaAdm.setForeground(new Color(128, 128, 0));
		btnConsutaAdm.setBackground(Color.BLACK);
		btnConsutaAdm.setBounds(64, 162, 177, 54);
		getContentPane().add(btnConsutaAdm);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(524, 305);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main (String [] args) {
		
		Menu_Adm menuA = new Menu_Adm();

}

}

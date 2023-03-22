package br.edu.unifacear.telas;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JMenuBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import br.edu.unifacear.telas.TelaCadastro;


public class tela_teste extends JFrame {
	public tela_teste() {
		getContentPane().setBackground(SystemColor.activeCaption);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(getContentPane(), popupMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Dados");
		popupMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Compras");
		popupMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Vendas");
		popupMenu.add(mntmNewMenuItem_2);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Boleto");
		
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e) {
				TelaCadastro tela = new TelaCadastro();
			}
			});
		
		menuBar.add(mntmNewMenuItem_3);
		
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Pix");
		menuBar.add(mntmNewMenuItem_4);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	
	
	
	public static void main (String []args) {
		
		tela_teste teste = new tela_teste();
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

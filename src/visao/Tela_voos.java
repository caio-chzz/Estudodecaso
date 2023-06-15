package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;

public class Tela_voos extends JFrame {

	private JPanel contentPane;

	
	public Tela_voos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnSair);
		
		JButton btnComprarPassagem = new JButton("Comprar Passagens");
		contentPane.add(btnComprarPassagem);
		
		JButton btnAddvoo = new JButton("Adicionar Voô");
		btnAddvoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddVoo cadastrarVoo = new AddVoo();
				cadastrarVoo.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastrarVoo.setVisible(true);
			}
		});
		contentPane.add(btnAddvoo);
	}

}

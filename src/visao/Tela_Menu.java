package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Menu extends JFrame {

	private JPanel contentPane;

	
	public Tela_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(10, 11, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnComprarPassagens = new JButton("Comprar passagens");
		btnComprarPassagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrarPassageiro cadastrarPassageiro = new Tela_CadastrarPassageiro();
				cadastrarPassageiro.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastrarPassageiro.setVisible(true);
			
			}
		});
		btnComprarPassagens.setBounds(10, 45, 154, 23);
		contentPane.add(btnComprarPassagens);
		
		JButton btnAdicionarVoo = new JButton("Adicionar voô");
		btnAdicionarVoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastroDeVoo cadastroDeVoo = new Tela_CadastroDeVoo();
				cadastroDeVoo.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastroDeVoo.setVisible(true);
			}
		});
		btnAdicionarVoo.setBounds(10, 78, 154, 23);
		contentPane.add(btnAdicionarVoo);
		
		JLabel lblVoos = new JLabel("Voôs disponíveis");
		lblVoos.setBounds(224, 32, 111, 14);
		contentPane.add(lblVoos);
		
		JButton btnNewButton = new JButton("VoltarLogin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Login login = new Tela_Login();
				login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				login.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 123, 154, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("JTable com voos cadastrados");
		lblNewLabel.setBounds(189, 78, 196, 138);
		contentPane.add(lblNewLabel);
	}
}

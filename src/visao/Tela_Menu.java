package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class Tela_Menu extends JFrame {

	private JPanel contentPane;
	private JTable table;

	
	public Tela_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1226, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoos = new JLabel("Voôs disponíveis");
		lblVoos.setForeground(new Color(0, 0, 0));
		lblVoos.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblVoos.setBounds(566, 104, 297, 62);
		contentPane.add(lblVoos);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 160));
		panel.setBounds(103, 0, 291, 826);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAdicionarVoo = new JButton("Adicionar voô");
		btnAdicionarVoo.setForeground(new Color(0, 0, 0));
		btnAdicionarVoo.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdicionarVoo.setBackground(new Color(128, 128, 128));
		btnAdicionarVoo.setBounds(78, 403, 203, 35);
		panel.add(btnAdicionarVoo);
		
		JButton btnComprarPassagens = new JButton("Comprar passagens");
		btnComprarPassagens.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnComprarPassagens.setForeground(new Color(0, 0, 0));
		btnComprarPassagens.setBackground(new Color(0, 255, 128));
		btnComprarPassagens.setBounds(78, 272, 203, 35);
		panel.add(btnComprarPassagens);
		
		JButton btnSair = new JButton("Sair do sistema");
		btnSair.setForeground(new Color(0, 0, 0));
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSair.setBackground(new Color(255, 128, 128));
		btnSair.setBounds(78, 136, 203, 35);
		panel.add(btnSair);
		
		table = new JTable();
		table.setBounds(570, 232, 739, 492);
		contentPane.add(table);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnComprarPassagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrarPassageiro cadastrarPassageiro = new Tela_CadastrarPassageiro();
				cadastrarPassageiro.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastrarPassageiro.setVisible(true);
			
			}
		});
		btnAdicionarVoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastroDeVoo cadastroDeVoo = new Tela_CadastroDeVoo();
				cadastroDeVoo.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastroDeVoo.setVisible(true);
			}
		});
	}
}

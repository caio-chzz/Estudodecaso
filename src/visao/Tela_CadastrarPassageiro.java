package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;

public class Tela_CadastrarPassageiro extends JFrame {

	private JPanel contentPane;
	
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textCpf;
	private JTextField textTelefone;
	private JButton btnVoltar;
	private JLabel lblQuatBag;
	private JTextField txtQuantBag;
	private JPanel panel;
	private JLabel lblInformeOsDados;
	
	public Tela_CadastrarPassageiro() {
		setTitle("Cadastro de Passageiros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1254, 735);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(56, 124, 154));
		panel.setBounds(148, 129, 1079, 508);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBackground(new Color(56, 124, 154));
		textNome.setBounds(305, 119, 764, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textTelefone = new JTextField();
		textTelefone.setBackground(new Color(56, 124, 154));
		textTelefone.setBounds(306, 167, 763, 20);
		panel.add(textTelefone);
		textTelefone.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBackground(new Color(56, 124, 154));
		textEmail.setBounds(306, 210, 763, 20);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		textCpf = new JTextField();
		textCpf.setBackground(new Color(56, 124, 154));
		textCpf.setBounds(306, 260, 763, 20);
		panel.add(textCpf);
		textCpf.setColumns(10);
		
		txtQuantBag = new JTextField();
		txtQuantBag.setBackground(new Color(56, 124, 154));
		txtQuantBag.setBounds(305, 372, 86, 20);
		panel.add(txtQuantBag);
		txtQuantBag.setColumns(10);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 128, 128));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVoltar.setBounds(571, 402, 126, 47);
		panel.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBackground(new Color(0, 255, 128));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalvar.setBounds(571, 323, 126, 47);
		panel.add(btnSalvar);
		
		JLabel lblPesoBag = new JLabel("Peso bagagem:");
		lblPesoBag.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPesoBag.setBounds(162, 371, 133, 21);
		panel.add(lblPesoBag);
		
		lblQuatBag = new JLabel("QNTD bagagem:");
		lblQuatBag.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblQuatBag.setBounds(162, 321, 160, 21);
		panel.add(lblQuatBag);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCpf.setBounds(236, 253, 43, 26);
		panel.add(lblCpf);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(225, 209, 81, 14);
		panel.add(lblEmail);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTelefone.setBounds(196, 166, 135, 14);
		panel.add(lblTelefone);
		
		JLabel lblNome = new JLabel("Nome completo:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNome.setBounds(151, 118, 144, 14);
		panel.add(lblNome);
		
		lblInformeOsDados = new JLabel("INFORME OS DADOS DO PASSAGEIRO");
		lblInformeOsDados.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblInformeOsDados.setBounds(22, 10, 825, 39);
		panel.add(lblInformeOsDados);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(56, 124, 154));
		comboBox.setBounds(305, 321, 86, 21);
		panel.add(comboBox);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_EscAssento escolherAssento = new Tela_EscAssento();
				escolherAssento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				escolherAssento.setVisible(true);
			}
		});
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
	}
}



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

public class Tela_CadastrarPassageiro extends JFrame {

	private JPanel contentPane;
	
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textCpf;
	private JTextField textTelefone;
	private JButton btnSair;
	private JButton btnVoltar;
	private JLabel lblQuatBag;
	private JTextField txtQuantBag;
	private JTextField txtPesoBagagem;
	
	public Tela_CadastrarPassageiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 13, 93, 14);
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(127, 10, 246, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(26, 109, 81, 14);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(141, 106, 86, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(26, 153, 43, 14);
		contentPane.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(79, 150, 86, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 67, 135, 14);
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(127, 64, 200, 20);
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(10, 238, 81, 23);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_EscAssento escolherAssento = new Tela_EscAssento();
				escolherAssento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				escolherAssento.setVisible(true);
			}
		});
		contentPane.add(btnSalvar);
		
		btnSair = new JButton("Sair");
		btnSair.setBounds(322, 238, 51, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnSair);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(373, 238, 61, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
		contentPane.add(btnVoltar);
		
		lblQuatBag = new JLabel("Quantidade de bagagem: ");
		lblQuatBag.setBounds(10, 199, 160, 14);
		contentPane.add(lblQuatBag);
		
		txtQuantBag = new JTextField();
		txtQuantBag.setBounds(141, 196, 86, 20);
		contentPane.add(txtQuantBag);
		txtQuantBag.setColumns(10);
		
		JLabel lblPesoBag = new JLabel("Peso bagagem");
		lblPesoBag.setBounds(332, 199, 102, 14);
		contentPane.add(lblPesoBag);
		
		txtPesoBagagem = new JTextField();
		txtPesoBagagem.setBounds(460, 196, 86, 20);
		contentPane.add(txtPesoBagagem);
		txtPesoBagagem.setColumns(10);
	}
}



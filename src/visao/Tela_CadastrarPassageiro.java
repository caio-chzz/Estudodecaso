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

public class Tela_CadastrarPassageiro extends JFrame {

	private JPanel contentPane;
	
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textCpf;
	private JTextField textTelefone;
	private JButton btnVoltar;
	private JLabel lblQuatBag;
	private JTextField txtQuantBag;
	private JTextField txtPesoBagagem;
	
	public Tela_CadastrarPassageiro() {
		setTitle("Cadastro de Passageiros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1177, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome completo:");
		lblNome.setBounds(260, 289, 119, 14);
		
		textNome = new JTextField();
		textNome.setBounds(383, 286, 665, 20);
		textNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(281, 365, 81, 14);
		
		textEmail = new JTextField();
		textEmail.setBounds(383, 362, 763, 20);
		textEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(281, 414, 43, 14);
		
		textCpf = new JTextField();
		textCpf.setBounds(383, 411, 763, 20);
		textCpf.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(281, 327, 135, 14);
		
		textTelefone = new JTextField();
		textTelefone.setBounds(383, 324, 763, 20);
		textTelefone.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(383, 576, 81, 23);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_EscAssento escolherAssento = new Tela_EscAssento();
				escolherAssento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				escolherAssento.setVisible(true);
			}
		});
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(523, 576, 61, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
		
		lblQuatBag = new JLabel("Quantidade de bagagem: ");
		lblQuatBag.setBounds(219, 474, 160, 14);
		
		txtQuantBag = new JTextField();
		txtQuantBag.setBounds(383, 471, 86, 20);
		txtQuantBag.setColumns(10);
		
		JLabel lblPesoBag = new JLabel("Peso bagagem");
		lblPesoBag.setBounds(260, 529, 102, 14);
		
		txtPesoBagagem = new JTextField();
		txtPesoBagagem.setBounds(383, 526, 86, 20);
		txtPesoBagagem.setColumns(10);
		contentPane.setLayout(null);
		contentPane.add(btnVoltar);
		contentPane.add(lblTelefone);
		contentPane.add(lblNome);
		contentPane.add(lblCpf);
		contentPane.add(lblEmail);
		contentPane.add(lblQuatBag);
		contentPane.add(textEmail);
		contentPane.add(textTelefone);
		contentPane.add(textNome);
		contentPane.add(textCpf);
		contentPane.add(txtQuantBag);
		contentPane.add(lblPesoBag);
		contentPane.add(txtPesoBagagem);
		contentPane.add(btnSalvar);
	}
}



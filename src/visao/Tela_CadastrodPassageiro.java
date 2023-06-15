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

public class Tela_CadastrodPassageiro extends JFrame {

	private JPanel contentPane;

	public Tela_CadastrodPassageiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblCadastrarPassageiro = new JLabel("Cadastrar Passageiro");
		contentPane.add(lblCadastrarPassageiro);
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome);
		
		JTextField textNome = new JTextField();
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		contentPane.add(lblEmail);
		
		JTextField textEmail = new JTextField();
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		contentPane.add(lblCpf);
		
		JTextField textCpf = new JTextField();
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone);
		
		JTextField textTelefone = new JTextField();
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnSair);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				AddVoo add = new AddVoo();
				add.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				add.setVisible(true);
			}
		});
		contentPane.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_EscAssento tela_assento = new Tela_EscAssento();
				tela_assento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_assento.setVisible(true);
			
			}
		});
		contentPane.add(btnSalvar);
	}

}

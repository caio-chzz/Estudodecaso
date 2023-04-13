package visao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textCpf;
	private JTextField textTelefone;
	private JTable tabelaUsuarios;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(82, 224, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(82, 272, 31, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("Cpf: ");
		lblCpf.setBounds(82, 323, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(82, 365, 77, 14);
		contentPane.add(lblTelefone);
		
		textNome = new JTextField();
		textNome.setBounds(138, 221, 412, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(138, 269, 412, 20);
		contentPane.add(textEmail);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(138, 320, 412, 20);
		contentPane.add(textCpf);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(138, 362, 412, 20);
		contentPane.add(textTelefone);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(234, 461, 227, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Tela De Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 11, 176, 70);
		contentPane.add(lblNewLabel);
		
		// Adicionando o JTable
		model = new DefaultTableModel();
		tabelaUsuarios = new JTable(model);
		
		// Configurando as colunas do JTable
		model.addColumn("Nome");
		model.addColumn("Email");
		model.addColumn("CPF");
		model.addColumn("Telefone");
		
		// Adicionando o JTable em um JScrollPane
		JScrollPane scrollPane = new JScrollPane(tabelaUsuarios);
		scrollPane.setBounds(600, 100, 550, 500);
		contentPane.add(scrollPane);
	}
}

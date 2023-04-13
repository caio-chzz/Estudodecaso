package visao;

import java.awt.Color;
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

import controle.UsuarioDAO;
import modelo.Usuario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTable tabelaUsuarios;
	private DefaultTableModel model;
	private Usuario user  = new Usuario();
	private UsuarioDAO dao = new UsuarioDAO();

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
		
		setBounds(100, 100, 1473, 899);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(125,0,	0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dao = UsuarioDAO.getFUsuarioDAO();
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setForeground(new Color(255, 255, 255));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(89, 367, 50, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmail.setBounds(89, 415, 50, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("Cpf: ");
		lblCpf.setForeground(new Color(255, 255, 255));
		lblCpf.setBackground(new Color(255, 255, 255));
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCpf.setBounds(101, 466, 34, 14);
		contentPane.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setForeground(new Color(255, 255, 255));
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTelefone.setBounds(65, 508, 77, 14);
		contentPane.add(lblTelefone);
		
<<<<<<< Updated upstream
		txtNome = new JTextField();
		txtNome.setBounds(138, 221, 412, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(138, 269, 412, 20);
		contentPane.add(txtEmail);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(138, 320, 412, 20);
		contentPane.add(txtCpf);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(138, 362, 412, 20);
		contentPane.add(txtTelefone);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setNome(txtNome.getText());
				user.setCpf(Long.valueOf((txtCpf.getText())));
				user.setEmail(txtEmail.getText());
				user.setNumero(Long.valueOf((txtTelefone.getText())));
				dao.insert(user);
			}
		});
		btnNewButton.setBounds(234, 461, 227, 23);
=======
		textNome = new JTextField();
		textNome.setBounds(200, 367, 412, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(200, 415, 412, 20);
		contentPane.add(textEmail);
		
		textCpf = new JTextField();
		textCpf.setColumns(10);
		textCpf.setBounds(200, 466, 412, 20);
		contentPane.add(textCpf);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(200, 508, 412, 20);
		contentPane.add(textTelefone);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(153,203,153));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(273, 697, 281, 54);
>>>>>>> Stashed changes
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Tela De Cadastro");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(22, 11, 343, 70);
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
		scrollPane.setBounds(801, 341, 687, 496);
		contentPane.add(scrollPane);
	}
}

package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Tela_CadastroDeVoo extends JFrame {

	private JPanel contentPane;
	private JTextField txtDestino;
	private JTextField txtHorario;
	private JTextField txtData;
	private JTextField textField;

	
	public Tela_CadastroDeVoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1229, 728);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(56, 124, 154));
		panel.setBounds(177, 124, 1010, 589);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 128, 128));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVoltar.setBounds(652, 488, 144, 47);
		panel.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setForeground(new Color(192, 192, 192));
		btnSalvar.setBackground(new Color(0, 0, 255));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalvar.setBounds(386, 488, 144, 47);
		panel.add(btnSalvar);
		
		txtData = new JTextField();
		txtData.setBackground(new Color(56, 124, 154));
		txtData.setBounds(457, 370, 322, 20);
		panel.add(txtData);
		txtData.setColumns(10);
		
		txtHorario = new JTextField();
		txtHorario.setBackground(new Color(56, 124, 154));
		txtHorario.setBounds(457, 228, 322, 20);
		panel.add(txtHorario);
		txtHorario.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setBackground(new Color(56, 124, 154));
		txtDestino.setBounds(457, 153, 322, 20);
		panel.add(txtDestino);
		txtDestino.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblData.setBounds(290, 372, 206, 14);
		panel.add(lblData);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblHorario.setBounds(290, 227, 206, 14);
		panel.add(lblHorario);
		
		JLabel lblDestino = new JLabel("Destino:");
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDestino.setBounds(290, 155, 206, 14);
		panel.add(lblDestino);
		
		JLabel lblCadastrarVoo = new JLabel("Cadastrar VOÔ");
		lblCadastrarVoo.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblCadastrarVoo.setBounds(35, 27, 254, 39);
		panel.add(lblCadastrarVoo);
		
		textField = new JTextField();
		textField.setBackground(new Color(56, 124, 154));
		textField.setColumns(10);
		textField.setBounds(457, 300, 322, 20);
		panel.add(textField);
		
		JLabel lblPreo = new JLabel("Valor($):");
		lblPreo.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPreo.setBounds(290, 303, 206, 14);
		panel.add(lblPreo);
		
		JLabel lblPreo_1 = new JLabel("*");
		lblPreo_1.setForeground(new Color(255, 0, 0));
		lblPreo_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPreo_1.setBounds(379, 370, 51, 14);
		panel.add(lblPreo_1);
		
		JLabel lblPreo_1_1 = new JLabel("*");
		lblPreo_1_1.setForeground(Color.RED);
		lblPreo_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPreo_1_1.setBounds(379, 156, 51, 14);
		panel.add(lblPreo_1_1);
		
		JLabel lblPreo_1_2 = new JLabel("*");
		lblPreo_1_2.setForeground(Color.RED);
		lblPreo_1_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPreo_1_2.setBounds(386, 231, 51, 14);
		panel.add(lblPreo_1_2);
		
		JLabel lblPreo_1_3 = new JLabel("*");
		lblPreo_1_3.setForeground(Color.RED);
		lblPreo_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPreo_1_3.setBounds(386, 303, 51, 14);
		panel.add(lblPreo_1_3);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
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

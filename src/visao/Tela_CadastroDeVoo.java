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

public class Tela_CadastroDeVoo extends JFrame {

	private JPanel contentPane;
	private JTextField txtDestino;
	private JTextField txtHorario;
	private JTextField txtData;
	private JTextField txtEstimativa;

	
	public Tela_CadastroDeVoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrarVoo = new JLabel("Cadastrar VOO");
		lblCadastrarVoo.setBounds(10, 11, 206, 14);
		contentPane.add(lblCadastrarVoo);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(10, 114, 206, 14);
		contentPane.add(lblDestino);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setBounds(10, 162, 206, 14);
		contentPane.add(lblHorario);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(10, 218, 206, 14);
		contentPane.add(lblData);
		
		JLabel lblEstimativa = new JLabel("Estimativa: ");
		lblEstimativa.setBounds(10, 252, 206, 14);
		contentPane.add(lblEstimativa);
		
		txtDestino = new JTextField();
		txtDestino.setBounds(163, 111, 86, 20);
		contentPane.add(txtDestino);
		txtDestino.setColumns(10);
		
		txtHorario = new JTextField();
		txtHorario.setColumns(10);
		txtHorario.setBounds(163, 159, 86, 20);
		contentPane.add(txtHorario);
		
		txtData = new JTextField();
		txtData.setColumns(10);
		txtData.setBounds(163, 204, 86, 20);
		contentPane.add(txtData);
		
		txtEstimativa = new JTextField();
		txtEstimativa.setColumns(10);
		txtEstimativa.setBounds(163, 249, 86, 20);
		contentPane.add(txtEstimativa);
		
		JLabel lblAvio = new JLabel("Avião:");
		lblAvio.setBounds(421, 11, 206, 14);
		contentPane.add(lblAvio);
		
		JComboBox cmbAviao = new JComboBox();
		cmbAviao.setBounds(632, 7, 30, 22);
		contentPane.add(cmbAviao);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
		btnVoltar.setBounds(484, 366, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
		btnSalvar.setBounds(100, 377, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(160, 11, 89, 23);
		contentPane.add(btnSair);
	}
}

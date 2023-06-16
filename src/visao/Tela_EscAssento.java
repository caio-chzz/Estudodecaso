package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_EscAssento extends JFrame {

	private JPanel contentPane;
	private JTextField txtInfos;

	
	public Tela_EscAssento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEsc = new JLabel("Escolha um assento: ");
		lblEsc.setBounds(59, 24, 238, 14);
		contentPane.add(lblEsc);
		
		JRadioButton rdbtn01 = new JRadioButton("1");
		rdbtn01.setBounds(109, 150, 109, 23);
		contentPane.add(rdbtn01);
		
		JRadioButton rdbtn02 = new JRadioButton("2");
		rdbtn02.setBounds(109, 193, 109, 23);
		contentPane.add(rdbtn02);
		
		JRadioButton rdbtn03 = new JRadioButton("3");
		rdbtn03.setBounds(237, 150, 109, 23);
		contentPane.add(rdbtn03);
		
		JRadioButton rdbtn04 = new JRadioButton("4");
		rdbtn04.setBounds(237, 193, 109, 23);
		contentPane.add(rdbtn04);
		
		JRadioButton rdbtn05 = new JRadioButton("5");
		rdbtn05.setBounds(363, 150, 109, 23);
		contentPane.add(rdbtn05);
		
		JRadioButton rdbtn06 = new JRadioButton("6");
		rdbtn06.setBounds(363, 193, 109, 23);
		contentPane.add(rdbtn06);
		
		JRadioButton rdbtn07 = new JRadioButton("7");
		rdbtn07.setBounds(490, 150, 109, 23);
		contentPane.add(rdbtn07);
		
		JRadioButton rdbtn08 = new JRadioButton("8");
		rdbtn08.setBounds(490, 193, 109, 23);
		contentPane.add(rdbtn08);
		
		txtInfos = new JTextField();
		txtInfos.setEnabled(false);
		txtInfos.setText("Recebe as informações do voo escolhido\r\n");
		txtInfos.setBounds(109, 282, 572, 20);
		contentPane.add(txtInfos);
		txtInfos.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Assento Vip\r\n");
		rdbtnNewRadioButton.setBounds(109, 340, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnAssentoLivre = new JRadioButton("Assento Livre\r\n\r\n");
		rdbtnAssentoLivre.setBounds(280, 340, 109, 23);
		contentPane.add(rdbtnAssentoLivre);
		
		JRadioButton rdbtnAssentoOcupado = new JRadioButton("Assento Ocupado\r\n\r\n");
		rdbtnAssentoOcupado.setBounds(461, 340, 170, 23);
		contentPane.add(rdbtnAssentoOcupado);
		
		JButton btnSalvar = new JButton("Salvar\r\n");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Pagamento pagamento = new Tela_Pagamento();
				pagamento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				pagamento.setVisible(true);
			}
		});
		btnSalvar.setBounds(203, 415, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrarPassageiro cadastrarPassageiro = new Tela_CadastrarPassageiro();
				cadastrarPassageiro.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastrarPassageiro.setVisible(true);	
			}
		});
		btnVoltar.setBounds(398, 415, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(696, 11, 89, 23);
		contentPane.add(btnSair);
	}
}

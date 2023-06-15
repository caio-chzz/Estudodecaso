package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class AddVoo extends JFrame {

	private JPanel contentPane;

	public AddVoo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblCadastrarVoo = new JLabel("Cadastrar voô");
		contentPane.add(lblCadastrarVoo);
		
		JLabel lblDestino = new JLabel("Destino: ");
		contentPane.add(lblDestino);
		
		JComboBox cmbDestino = new JComboBox();
		contentPane.add(cmbDestino);
		
		JLabel lblHorario = new JLabel("Horário: ");
		contentPane.add(lblHorario);
		
		JComboBox cmbHorario = new JComboBox();
		contentPane.add(cmbHorario);
		
		JLabel lblData = new JLabel("Data:\r\n");
		contentPane.add(lblData);
		
		JComboBox cmbData = new JComboBox();
		contentPane.add(cmbData);
		
		JLabel lblEstimativa = new JLabel("Estimativa:");
		contentPane.add(lblEstimativa);
		
		JLabel lblAvião = new JLabel("Avião: ");
		contentPane.add(lblAvião);
		
		JComboBox cmbAviao = new JComboBox();
		contentPane.add(cmbAviao);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrodPassageiro cadastrodPassageiros = new Tela_CadastrodPassageiro();
				cadastrodPassageiros.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastrodPassageiros.setVisible(true);
			
			}
		});
		contentPane.add(btnSalvar);
		
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
				Tela_voos tela_voos = new Tela_voos();
				tela_voos.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_voos.setVisible(true);
			}
		});
		contentPane.add(btnVoltar);
	}

}

package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Acento extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	
                    Acento frame = new Acento();
                    frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Acento() {
    	setBackground(new Color(0, 64, 64));
    	setTitle("Escolha sua opção");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1171, 728);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelBotoes = new JPanel();
        panelBotoes.setBackground(Color.BLACK);
        panelBotoes.setBounds(295, 615, 994, 163);
        contentPane.add(panelBotoes);
        panelBotoes.setLayout(null);
        

        JButton btn1 = new JButton("Adicionar Passageiro");
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Adiciona d = new Adiciona();
        		d.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		d.setVisible(true);
        	}
        });
        btn1.setForeground(new Color(0, 0, 0));
        btn1.setFont(new Font("Californian FB", Font.BOLD, 21));
        btn1.setBackground(new Color(0, 128, 64));
        btn1.setBounds(34, 20, 241, 54);
        //btn1.setBorder(new RounderBorder(10));
        panelBotoes.add(btn1);

        JButton btn2 = new JButton("Editar Passageiro");
        btn2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Editar z = new Editar();
        		z.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		z.setVisible(true);
        	}
        });
        btn2.setForeground(new Color(0, 0, 0));
        btn2.setFont(new Font("Californian FB", Font.BOLD, 21));
        btn2.setBackground(new Color(128, 128, 128));
        btn2.setBounds(366, 20, 247, 54);
        //btn2.setBorder(new RounderBorder(10));
        panelBotoes.add(btn2);
        
        JButton btnExcluirPassageiro = new JButton("Excluir Passageiro");
        btnExcluirPassageiro.setBounds(703, 20, 230, 54);
        panelBotoes.add(btnExcluirPassageiro);
        btnExcluirPassageiro.setForeground(Color.BLACK);
        btnExcluirPassageiro.setFont(new Font("Californian FB", Font.BOLD, 21));
        btnExcluirPassageiro.setBackground(new Color(128, 64, 64));

        JLabel lblPreco1 = new JLabel("Escolha o acento que deseja!");
        lblPreco1.setForeground(Color.WHITE);
        lblPreco1.setFont(new Font("Constantia", Font.BOLD, 30));
        lblPreco1.setBounds(572, 45, 463, 46);
        contentPane.add(lblPreco1);
        
        JButton btn1_1 = new JButton("1º");
        btn1_1.setForeground(new Color(255, 255, 255));
        btn1_1.setFont(new Font("Californian FB", Font.BOLD, 12));
        btn1_1.setBackground(new Color(0, 0, 0));
        btn1_1.setBounds(504, 326, 43, 46);
        contentPane.add(btn1_1);
        
        JButton btn1_1_1_1 = new JButton("2º");
        btn1_1_1_1.setForeground(new Color(255, 255, 255));
        btn1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 11));
        btn1_1_1_1.setBackground(new Color(0, 0, 0));
        btn1_1_1_1.setBounds(504, 387, 43, 46);
        contentPane.add(btn1_1_1_1);
        
        JButton btn1_1_1_2 = new JButton("3º");
        btn1_1_1_2.setForeground(new Color(255, 255, 255));
        btn1_1_1_2.setFont(new Font("Californian FB", Font.BOLD, 11));
        btn1_1_1_2.setBackground(new Color(0, 0, 0));
        btn1_1_1_2.setBounds(587, 326, 43, 46);
        contentPane.add(btn1_1_1_2);
        
        JButton btn1_1_1_3 = new JButton("4º");
        btn1_1_1_3.setForeground(new Color(255, 255, 255));
        btn1_1_1_3.setFont(new Font("Californian FB", Font.BOLD, 9));
        btn1_1_1_3.setBackground(new Color(0, 0, 0));
        btn1_1_1_3.setBounds(587, 387, 43, 46);
        contentPane.add(btn1_1_1_3);
        
        JButton btn1_1_1_4 = new JButton("5º");
        btn1_1_1_4.setForeground(new Color(255, 255, 255));
        btn1_1_1_4.setFont(new Font("Californian FB", Font.BOLD, 11));
        btn1_1_1_4.setBackground(new Color(0, 0, 0));
        btn1_1_1_4.setBounds(673, 326, 43, 46);
        contentPane.add(btn1_1_1_4);
        
        JButton btn1_1_1_5 = new JButton("6º");
        btn1_1_1_5.setForeground(new Color(255, 255, 255));
        btn1_1_1_5.setFont(new Font("Californian FB", Font.BOLD, 9));
        btn1_1_1_5.setBackground(new Color(0, 0, 0));
        btn1_1_1_5.setBounds(673, 387, 43, 46);
        contentPane.add(btn1_1_1_5);
        
        JButton btn1_1_1_6 = new JButton("8º");
        btn1_1_1_6.setForeground(new Color(255, 255, 255));
        btn1_1_1_6.setFont(new Font("Californian FB", Font.BOLD, 10));
        btn1_1_1_6.setBackground(new Color(0, 0, 0));
        btn1_1_1_6.setBounds(764, 387, 43, 46);
        contentPane.add(btn1_1_1_6);
        
        JButton btn1_1_1_9 = new JButton("7º");
        btn1_1_1_9.setForeground(new Color(255, 255, 255));
        btn1_1_1_9.setFont(new Font("Californian FB", Font.BOLD, 10));
        btn1_1_1_9.setBackground(new Color(0, 0, 0));
        btn1_1_1_9.setBounds(764, 326, 43, 46);
        contentPane.add(btn1_1_1_9);
        
        JButton btn1_1_1_10 = new JButton("11º");
        btn1_1_1_10.setForeground(new Color(255, 255, 255));
        btn1_1_1_10.setFont(new Font("Californian FB", Font.BOLD, 8));
        btn1_1_1_10.setBackground(new Color(0, 0, 0));
        btn1_1_1_10.setBounds(941, 326, 43, 46);
        contentPane.add(btn1_1_1_10);
        
        JButton btn1_1_1_11 = new JButton("12º");
        btn1_1_1_11.setForeground(new Color(255, 255, 255));
        btn1_1_1_11.setFont(new Font("Californian FB", Font.BOLD, 7));
        btn1_1_1_11.setBackground(new Color(0, 0, 0));
        btn1_1_1_11.setBounds(941, 387, 43, 46);
        contentPane.add(btn1_1_1_11);
        
        JButton btn1_1_1_12 = new JButton("9º");
        btn1_1_1_12.setForeground(new Color(255, 255, 255));
        btn1_1_1_12.setFont(new Font("Californian FB", Font.BOLD, 10));
        btn1_1_1_12.setBackground(new Color(0, 0, 0));
        btn1_1_1_12.setBounds(850, 326, 43, 46);
        contentPane.add(btn1_1_1_12);
        
        JButton btn1_1_1_13 = new JButton("10º");
        btn1_1_1_13.setForeground(new Color(255, 255, 255));
        btn1_1_1_13.setFont(new Font("Californian FB", Font.BOLD, 7));
        btn1_1_1_13.setBackground(new Color(0, 0, 0));
        btn1_1_1_13.setBounds(850, 387, 43, 46);
        contentPane.add(btn1_1_1_13);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Acento.class.getResource("/imagens/Captura de tela 2023-05-15 164437.png")));
        lblNewLabel.setBounds(310, 140, 837, 415);
        contentPane.add(lblNewLabel);
    }
}

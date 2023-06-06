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

public class Preco extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	
                    Preco frame = new Preco();
                    frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Preco() {
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
        panelBotoes.setBounds(340, 463, 784, 163);
        contentPane.add(panelBotoes);
        panelBotoes.setLayout(null);
        

        JButton btn1 = new JButton("1º Classe");
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Acento a = new Acento();
        		a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		a.setVisible(true);
        	}
        });
        btn1.setForeground(new Color(0, 0, 0));
        btn1.setFont(new Font("Californian FB", Font.BOLD, 21));
        btn1.setBackground(new Color(128, 128, 128));
        btn1.setBounds(34, 20, 327, 100);
        //btn1.setBorder(new RounderBorder(10));
        panelBotoes.add(btn1);

        JButton btn2 = new JButton("2º Classe");
        btn2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Acento a = new Acento();
        		a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		a.setVisible(true);
        	}
        });
        btn2.setForeground(new Color(0, 0, 0));
        btn2.setFont(new Font("Californian FB", Font.BOLD, 21));
        btn2.setBackground(new Color(128, 128, 128));
        btn2.setBounds(438, 20, 307, 100);
        //btn2.setBorder(new RounderBorder(10));
        panelBotoes.add(btn2);

        JLabel lblPreco1 = new JLabel("Classe executiva:  R$4.000,00");
        lblPreco1.setForeground(Color.WHITE);
        lblPreco1.setFont(new Font("Californian FB", Font.BOLD, 30));
        lblPreco1.setBounds(339, 274, 387, 46);
        contentPane.add(lblPreco1);

        JLabel lblPreco2 = new JLabel(" Classe Economica:  R$2.000,00");
        lblPreco2.setForeground(Color.WHITE);
        lblPreco2.setFont(new Font("Californian FB", Font.BOLD, 30));
        lblPreco2.setBounds(774, 274, 373, 46);
        contentPane.add(lblPreco2);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Preco.class.getResource("/imagens/Design sem nome (1).png")));
        lblNewLabel.setBounds(487, 111, 311, 153);
        contentPane.add(lblNewLabel);
    }
}


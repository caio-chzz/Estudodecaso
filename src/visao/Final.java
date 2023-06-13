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
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;

public class Final extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Final frame = new Final();
                    frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Final() {
    	setBackground(new Color(0, 64, 64));
    	setTitle("Obrigado!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1164, 730);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(143, 226, 231));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JButton btnNewButton = new JButton("Sair do Sistema");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnNewButton.setForeground(Color.BLACK);
        btnNewButton.setBackground(Color.WHITE);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnNewButton.setBounds(412, 194, 431, 104);
        contentPane.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Voltar ao Inicio");
        btnNewButton_1.setForeground(Color.BLACK);
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Login gg = new Login();
        		gg.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		gg.setVisible(true);
        	}
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
        btnNewButton_1.setBackground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(412, 486, 431, 104);
        contentPane.add(btnNewButton_1);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setIcon(new ImageIcon(Final.class.getResource("/imagens/sai.png")));
        lblNewLabel.setBounds(884, 139, 204, 179);
        contentPane.add(lblNewLabel);
    }
}

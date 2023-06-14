package visao;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class ViagemHorarios extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> destinoComboBox;
    private JComboBox<String> horarioComboBox;
    private JComboBox<String> classeComboBox;

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ViagemHorarios frame = new ViagemHorarios();
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the frame
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ViagemHorarios() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1314, 914);
        BufferedImage bg = null;
		;
		try {
			bg = ImageIO.read(new File("src/imagens/fundoSalvador.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		contentPane = new VBackGround(bg);
		contentPane.setBackground(new Color(0, 156, 156));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
        JLabel lblDestino = new JLabel("Destino: ");
        lblDestino.setIcon(new ImageIcon(ViagemHorarios.class.getResource("/imagens/Destino-removebg-preview.png")));
        lblDestino.setForeground(Color.BLACK);
        lblDestino.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblDestino.setBounds(588, 91, 497, 342);
        contentPane.add(lblDestino);

        destinoComboBox = new JComboBox<>();
        destinoComboBox.setForeground(Color.BLACK);
        destinoComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal",
                "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul",
                "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
                "São Paulo", "Sergipe", "Tocantins", "New York", "Paris", "Tokyo"
        }));
        destinoComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        destinoComboBox.setBounds(743, 393, 200, 30);
        contentPane.add(destinoComboBox);

        JLabel lblHorario = new JLabel("Horario:");
        lblHorario.setForeground(Color.BLACK);
        lblHorario.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblHorario.setBounds(526, 469, 150, 30);
        contentPane.add(lblHorario);

        horarioComboBox = new JComboBox<>();
        horarioComboBox.setForeground(Color.BLACK);
        horarioComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "10:00 AM", "2:00 PM", "6:00 PM", "10:00 PM"
        }));
        horarioComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        horarioComboBox.setBounds(743, 469, 200, 30);
        contentPane.add(horarioComboBox);

        JLabel lblClasse = new JLabel("Classe:");
        lblClasse.setForeground(Color.BLACK);
        lblClasse.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblClasse.setBounds(537, 571, 150, 30);
        contentPane.add(lblClasse);

        classeComboBox = new JComboBox<>();
        classeComboBox.setForeground(Color.BLACK);
        classeComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "Executive", "Economy"
        }));
        classeComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        classeComboBox.setBounds(743, 571, 200, 30);
        contentPane.add(classeComboBox);

        JButton btnConfirm = new JButton("Confirm");
        btnConfirm.setForeground(Color.BLACK);
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String destination = (String) destinoComboBox.getSelectedItem();
                String time = (String) horarioComboBox.getSelectedItem();
                String ticketClass = (String) classeComboBox.getSelectedItem();

                System.out.println("Destination: " + destination);
                System.out.println("Time: " + time);
                System.out.println("Class: " + ticketClass);

                // Open the Acento class screen
                Acento acento = new Acento();
                acento.setExtendedState(JFrame.MAXIMIZED_BOTH);
                acento.setVisible(true);
                dispose(); // Close the current screen
            }
        });
        btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnConfirm.setBounds(769, 747, 150, 40);
        contentPane.add(btnConfirm);
    }
}
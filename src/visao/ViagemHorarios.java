package visao;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViagemHorarios extends JFrame {

    private JPanel contentPane;
    private JComboBox<String> destinationComboBox;
    private JComboBox<String> timeComboBox;
    private JComboBox<String> classComboBox;

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
        setBounds(100, 100, 600, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblDestination = new JLabel("Destination:");
        lblDestination.setForeground(Color.WHITE);
        lblDestination.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblDestination.setBounds(100, 100, 150, 30);
        contentPane.add(lblDestination);

        destinationComboBox = new JComboBox<>();
        destinationComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal",
                "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul",
                "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro",
                "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina",
                "São Paulo", "Sergipe", "Tocantins", "New York", "Paris", "Tokyo"
        }));
        destinationComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        destinationComboBox.setBounds(250, 100, 200, 30);
        contentPane.add(destinationComboBox);

        JLabel lblTime = new JLabel("Time:");
        lblTime.setForeground(Color.WHITE);
        lblTime.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblTime.setBounds(100, 200, 150, 30);
        contentPane.add(lblTime);

        timeComboBox = new JComboBox<>();
        timeComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "10:00 AM", "2:00 PM", "6:00 PM", "10:00 PM"
        }));
        timeComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        timeComboBox.setBounds(250, 200, 200, 30);
        contentPane.add(timeComboBox);

        JLabel lblClass = new JLabel("Class:");
        lblClass.setForeground(Color.WHITE);
        lblClass.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblClass.setBounds(100, 300, 150, 30);
        contentPane.add(lblClass);

        classComboBox = new JComboBox<>();
        classComboBox.setModel(new DefaultComboBoxModel<>(new String[] {
                "Executive", "Economy"
        }));
        classComboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        classComboBox.setBounds(250, 300, 200, 30);
        contentPane.add(classComboBox);

        JButton btnConfirm = new JButton("Confirm");
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String destination = (String) destinationComboBox.getSelectedItem();
                String time = (String) timeComboBox.getSelectedItem();
                String ticketClass = (String) classComboBox.getSelectedItem();

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
        btnConfirm.setBounds(250, 400, 150, 40);
        contentPane.add(btnConfirm);
    }
}
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class app {

    private JTextField textField1;
    private JRadioButton ONRadioButton;
    private JRadioButton OFFRadioButton;
    private JButton button1;
    private JButton cButton;
    private JButton button3;
    private JButton a7Button;
    private JButton a2Button;
    private JPanel painelPrincipal;
    private JButton a9Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a0Button;
    private JButton ponto;
    private JButton equal;
    private JButton a8Button;

    public app() {
        painelPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
        MouseAdapter listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        };
        a7Button.addMouseListener(listener);
        a9Button.addMouseListener(listener);
        a4Button.addMouseListener(listener);
        a5Button.addMouseListener(listener);
        a6Button.addMouseListener(listener);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }




    public static void main(String[] args) {
        JFrame frame = new JFrame("Principal");
        frame.setContentPane(new app().painelPrincipal);
        //frame.setContentPane(new app().a2Button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //centraliza a inicialização da tela
        frame.setLocationRelativeTo(null);


    }


}

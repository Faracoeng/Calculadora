import javax.swing.*;

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

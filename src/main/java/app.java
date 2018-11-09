import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class app {

    private JTextField textResultado;
    private JRadioButton ONRadioButton;
    private JRadioButton OFFRadioButton;
    private JButton backEpace;
    private JButton limpaTela;
    private JButton sum;
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
    private JButton sub;
    private JButton mult;
    private JButton div;

    public app() {
        painelPrincipal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });


        a7Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"7");
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"8");
            }
        });
        a9Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"9");
            }
        });
        a4Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"4");
            }
        });
        a5Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"5");
            }
        });
        a6Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"6");
            }
        });
        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"1");
            }
        });
        a2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"2");
            }
        });
        a3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"3");
            }
        });
        a0Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"0");
            }
        });
        ponto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //super.mouseClicked(e);
                textResultado.setText(textResultado.getText()+"0");
            }
        });

        MouseAdapter listener = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        };

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

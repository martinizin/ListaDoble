import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListaDobleGUI {
    private JPanel pGenerlal;
    private JTextField textField1;
    private JButton AGREGARButton;
    private JButton ELIMINARButton;
    private JButton ORDENARButton;
    private JButton BUSCARButton;
    private JButton MOSTRARButton;
    private JTextArea textArea1;

    ListaDoble lis=new ListaDoble();

    public ListaDobleGUI() {
        AGREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inp=textField1.getText();
                try {
                    int valor=Integer.parseInt(inp);
                    lis.agregarListaDoble(valor,textArea1);
                    textField1.setText(" ");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        ELIMINARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inp=textField1.getText();
                try {
                    int valor=Integer.parseInt(inp);
                    lis.eliminarListaDoble(valor,textArea1);
                    textField1.setText(" ");
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        ORDENARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    lis.ordenarListaDoble(textArea1);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        BUSCARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        MOSTRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

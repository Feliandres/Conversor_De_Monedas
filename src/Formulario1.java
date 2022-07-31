import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario1 extends JFrame{
    private JPanel mainPanel;
    private JTextField pesoTF;
    private JTextField alturaTF;
    private JButton okBTM;
    private JButton limpiarTF;
    private JLabel pesoTxt;
    private JLabel alturaTxt;
    private JLabel resultadoTxt;
    private JLabel tituloTxt;
    private JLabel resultado1Txt;

    public Formulario1 () {
        setContentPane(mainPanel);
        setTitle("CALCULADORA IMC"); // titulo ventana
        setSize(500,300); // tamaño ventana
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        // Funcionalidad boton Calcular
        okBTM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String peso = pesoTF.getText();
                String altura = alturaTF.getText();
                // casteo de variable STRING - DOUBLE
                double pesoNumber = Double.valueOf(peso);
                double alturaNumber = Double.valueOf(altura);
                double resultado1 = pesoNumber/(alturaNumber*alturaNumber);
                String resultado1Texto = String.valueOf(resultado1);

                resultado1Txt.setText(resultado1Texto);
            }
        });

        // Funcionalidad boton Limpiar
        limpiarTF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pesoTF.setText("");
                alturaTF.setText("");
                resultado1Txt.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Formulario1 myFrame = new Formulario1();
    }
}

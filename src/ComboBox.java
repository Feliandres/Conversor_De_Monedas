import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    private JPanel mainPane;
    private JTextField origenTF;
    private JTextField destinoTF;
    private JComboBox origenCB;
    private JComboBox destinoCB;
    private JButton convertirBTN;
    private JLabel destinoTxt;
    private JLabel origenTxt;
    private JLabel auxiliarTxt;

    public ComboBox() {

        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                auxiliarTxt.setText(""+origenCB.getSelectedItem()+" a "+destinoCB.getSelectedItem());
            }
        });
        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // SI MONEDA DE ORIGEN ES DOLAR
                if (origenCB.getSelectedIndex()==0) {
                    double[] tarifas = {20.47, 4438.50, 131.46, 133.28, 1};
                    double tarifasSeleccionada = tarifas[destinoCB.getSelectedIndex()]; // seleccion de posicion
                    double resultado = Double.parseDouble(origenTF.getText()) * tarifasSeleccionada;
                    destinoTF.setText("" + resultado);
                }
                // SI MONEDA DE ORIGEN ES PESOS MEXICANOS
                else if (origenCB.getSelectedIndex()==1) {
                    double[] tarifas = {1,210.43,6.44,6.54,0.049};
                    double tarifasSeleccionada = tarifas[destinoCB.getSelectedIndex()]; // seleccion de posicion
                    double resultado = Double.parseDouble(origenTF.getText()) * tarifasSeleccionada;
                    destinoTF.setText("" + resultado);

                }
                // SI MONEDA DE ORIGEN ES PESOS COLOMBIANOS
                else if (origenCB.getSelectedIndex()==2) {
                    double[] tarifas = {0.0047,1,0.030,0.030,0.00023};
                    double tarifasSeleccionada = tarifas[destinoCB.getSelectedIndex()]; // seleccion de posicion
                    double resultado = Double.parseDouble(origenTF.getText()) * tarifasSeleccionada;
                    destinoTF.setText("" + resultado);

                }
                // SI MONEDA DE ORIGEN ES PESOS ARGENTINOS
                else if (origenCB.getSelectedIndex()==3) {
                    double[] tarifas = {0.16,32.68,1,1.01,0.0076};
                    double tarifasSeleccionada = tarifas[destinoCB.getSelectedIndex()]; // seleccion de posicion
                    double resultado = Double.parseDouble(origenTF.getText()) * tarifasSeleccionada;
                    destinoTF.setText("" + resultado);

                }
                // SI MONEDA DE ORIGEN ES YEN JAPONES
                else if (origenCB.getSelectedIndex()==4) {
                    double[] tarifas = {0.15,32.20,0.99,1,0.0075};
                    double tarifasSeleccionada = tarifas[destinoCB.getSelectedIndex()]; // seleccion de posicion
                    double resultado = Double.parseDouble(origenTF.getText()) * tarifasSeleccionada;
                    destinoTF.setText("" + resultado);

                }

            }
        });
    }

    // generate format Main
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor de divisas"); // titulo ventana
        frame.setContentPane(new ComboBox().mainPane);
        frame.setSize(800,300); // tamaño ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}

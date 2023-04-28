package packB02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Almacen extends JFrame{
    private JTextField numeroid;
    private JTextField pesoButton;
    private JTextArea textArea1;
    private JTextField empresaremit;
    private JTextField empresarecep;
    private JButton apilar;
    private JButton desapilarButton;
    private JTextField numerocolumna;
    private JButton mostrarDatosButton;
    private JTextField muestraDatos;
    private JButton cuantosButton;
    private JTextField mostrarPais;
    private JTextField numeroCuantos;
    private JTextField paisButton;
    private JCheckBox inspeccionadoCheckBox;
    private JTextField prioridadbutton;
    private JButton crearButtonButton;
    private JPanel panel;
    private Puerto p;

    public Almacen(){
       setContentPane(panel);
       setTitle("Gestion de cotenedores");
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        crearButtonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p=new Puerto();
            }
        });


        apilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id=Integer.parseInt(numeroid.getText());
                float pesob=Float.parseFloat(pesoButton.getText());
                String pais=paisButton.getText();
                boolean inspeccion=Boolean.parseBoolean(inspeccionadoCheckBox.getText());
                int prioridad = Integer.parseInt(prioridadbutton.getText());
                String descripcion = textArea1.getText();
                String envia = empresaremit.getText();
                String recibe = empresarecep.getText();
                Contenedor c=new Contenedor(id,pesob,pais,inspeccion,prioridad,descripcion,envia,recibe);
                p.apilarContenedor(c);
            }
        });


        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int colum=Integer.parseInt(numerocolumna.getText());
                p.desapilarContenedor(colum);
            }
        });

        cuantosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (p != null) {

                    String pais = paisButton.getText();
                    mostrarPais.setText(pais);
                    int contador=p.cuentaContenedores(pais);
                    numeroCuantos.setText(String.valueOf(contador));
                }
            }
        });

        mostrarDatosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (p != null) {
                    int id = Integer.parseInt(numeroid.getText());
                    muestraDatos.setText(String.valueOf(p.mostrarDatos(id)));
                }
            }
        });
    }

    public static void main(String[] args) {
        Almacen contenedor1 = new Almacen();
    }



}

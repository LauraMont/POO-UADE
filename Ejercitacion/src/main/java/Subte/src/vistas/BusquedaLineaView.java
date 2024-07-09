package Subte.src.vistas;

import Subte.src.controladores.Principal;
import Subte.src.controladores.SistemaController;
import Subte.src.excepciones.LineaException;
import Subte.src.modelo.objectView.EstacionViewObject;
import Subte.src.modelo.objectView.LineaObjectView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class BusquedaLineaView extends Frame implements ActionListener {
    private final Panel dynamicPanel;
    private final Panel estaticPanel;
    private SistemaController sistema;

    public BusquedaLineaView(){
        setTitle("Buscar Linea");
        setSize(600, 400); // Establecer tamaño
        setLocationRelativeTo(null); // Centrar en la pantalla
        // Crear componentes
        JLabel bienvenidaLabel = new JLabel("Gestor de lineas de subte");
        JLabel elegirLineaLabel = new JLabel("Ingresa nombre de linea");
        TextField lineaInput = new TextField();
        JButton aceptarButton = new JButton("Buscar");
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    dynamicPanel.removeAll();
                    dynamicPanel.setLayout(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    gbc.insets = new Insets(5, 5, 5, 5); // Añadir márgenes

                    LineaObjectView data = sistema.getLineaData(lineaInput.getText());

                    // Primera fila
                    gbc.gridx = 0;
                    gbc.gridy = 0;
                    dynamicPanel.add(Box.createHorizontalStrut(20), gbc); // Espacio

                    gbc.gridx = 1;
                    dynamicPanel.add(new JLabel(data.getNombre()), gbc);

                    gbc.gridx = 2;
                    dynamicPanel.add(Box.createHorizontalStrut(20), gbc); // Espacio

                    // Segunda fila
                    gbc.gridx = 0;
                    gbc.gridy = 1;
                    dynamicPanel.add(new JLabel("Capacidad total: " + sistema.getCapacidadTotal(data.getNombre())), gbc);

                    gbc.gridx = 1;
                    dynamicPanel.add(Box.createHorizontalStrut(20), gbc); // Espacio

                    gbc.gridx = 2;
                    dynamicPanel.add(Box.createHorizontalStrut(20), gbc); // Espacio

                    // Tercera fila
                    gbc.gridx = 0;
                    gbc.gridy = 2;
                    dynamicPanel.add(new JLabel("Estaciones:"), gbc);

                    gbc.gridx = 1;
                    dynamicPanel.add(Box.createHorizontalStrut(20), gbc); // Espacio

                    gbc.gridx = 2;
                    dynamicPanel.add(Box.createHorizontalStrut(20), gbc); // Espacio

                    // Cuarta fila y siguientes
                    int row = 3;
                    for (EstacionViewObject estacion : data.getEstaciones()) {
                        gbc.gridx = 0;
                        gbc.gridy = row;
                        dynamicPanel.add(new JLabel("Estacion: " + estacion.getNombre()), gbc); // Espacio

                        gbc.gridx = 1;
                        dynamicPanel.add(Box.createHorizontalStrut(20), gbc);

                        gbc.gridx = 2;
                        dynamicPanel.add(Box.createHorizontalStrut(20), gbc); // Espacio

                        row++;
                    }

                } catch (LineaException ex) {
                    dynamicPanel.removeAll();
                    dynamicPanel.setLayout(new BorderLayout());
                    dynamicPanel.add(new JLabel("Linea '" + lineaInput.getText() + "' no existe"), BorderLayout.CENTER);
                }
                dynamicPanel.revalidate();
                dynamicPanel.repaint();
                setVisible(true);
            }
        });
        // Crear el panel dinámico
        estaticPanel = new Panel();
        dynamicPanel = new Panel();
        estaticPanel.setLayout(new GridLayout(0, 1));
        estaticPanel.add(bienvenidaLabel);
        estaticPanel.add(elegirLineaLabel);
        estaticPanel.add(lineaInput);
        estaticPanel.add(aceptarButton);
        add(estaticPanel, BorderLayout.NORTH);
        add(dynamicPanel, BorderLayout.CENTER);
        // Configurar el cierre de la ventana
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
        sistema = new SistemaController();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

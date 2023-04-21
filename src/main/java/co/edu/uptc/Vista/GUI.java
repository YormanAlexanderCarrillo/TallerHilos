package co.edu.uptc.Vista;

import co.edu.uptc.Controlador.Controller;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private final JFrame mainWindow = new JFrame("SISTEMA DE TURNOS");
    private final JPanel mainPanel = new JPanel();
    private final JPanel secondPanel = new JPanel();
    private final JPanel secondPanelOne = new JPanel();
    private final JPanel secondPanelTwo = new JPanel();
    private final JPanel secondPanelThree = new JPanel();
    private final JPanel secondPanelFour = new JPanel();
    private final JPanel thirdPanel = new JPanel();


    private final JButton btnMembership = new JButton("AFILIARSE.");
    private final JButton btnMedicalConsultations = new JButton("CONSULTAS MEDICAS.");
    private final JButton btnAuthorizationProcedures = new JButton("AUTORIZACIÓN DE PROCESOS.");
    private final JButton btnPaymentClaims = new JButton("RECLAMOS DE PAGO.");

    //Elementos del segundo panel.

    private final JLabel txtOnStandbyOne = new JLabel("EN ESPERA DE ATENDER EL TURNO: ");
    private final JLabel txtShiftOnStandByOne = new JLabel("");
    private final JLabel txtAttendingOne = new JLabel("ATENDIENDO AL TURNO: ");
    private final JLabel txtShiftAttendingOne = new JLabel("");
    private final JLabel txtHourOne = new JLabel("00:00:00 ");


    private final JLabel txtOnStandbyTwo = new JLabel("EN ESPERA DE ATENDER EL TURNO:");
    private final JLabel txtShiftOnStandByTwo = new JLabel("");
    private final JLabel txtAttendingTwo = new JLabel("ATENDIENDO AL TURNO: ");
    private final JLabel txtShiftAttendingTwo = new JLabel("");
    private final JLabel txtHourTwo = new JLabel("00:00:00 ");


    private final JLabel txtOnStandbyThree = new JLabel("EN ESPERA DE ATENDER EL TURNO:");
    private final JLabel txtShiftOnStandByThree = new JLabel("");
    private final JLabel txtAttendingThree = new JLabel("ATENDIENDO AL TURNO: ");
    private final JLabel txtShiftAttendingThree = new JLabel("");
    private final JLabel txtHourThree = new JLabel("00:00:00 ");

    private final JLabel txtOnStandbyFour = new JLabel("EN ESPERA DE ATENDER EL TURNO:");
    private final JLabel txtShiftOnStandByFour = new JLabel("");
    private final JLabel txtAttendingFour = new JLabel("ATENDIENDO AL TURNO: ");
    private final JLabel txtShiftAttendingFour = new JLabel("");
    private final JLabel txtHourFour = new JLabel("00:00:00 ");


    //Elementos del tercer panel.
    private final JButton btnAccept = new JButton("ACEPTAR");
    private final JLabel txtId = new JLabel("NUMERO IDENTIFICACIÓN");
    private final JTextField inputId = new JTextField();

    public GUI() {
        initComponents();
        actionBtnMembership();
        actionBtnMedicalConsultations();
        actionBtnAuthorizationProcedures();
        actionBtnPaymentClaims();
        actionBtnAccept();
    }

    public void initComponents() {
        mainWindow.setSize(950, 600);
        mainWindow.setVisible(true);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainPanel.setLayout(null);
        mainWindow.setResizable(false);
        mainWindow.setLocationRelativeTo(null);

        mainPanel.setSize(400, 200);
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.decode("#C3D2EA"));

        btnMembership.setBounds(50, 50, 200, 100);
        btnMembership.setFocusPainted(false);
        mainPanel.add(btnMembership);

        btnMedicalConsultations.setBounds(50, 175, 200, 100);
        btnMedicalConsultations.setFocusPainted(false);
        mainPanel.add(btnMedicalConsultations);

        btnAuthorizationProcedures.setBounds(50, 300, 200, 100);
        btnAuthorizationProcedures.setFocusPainted(false);
        mainPanel.add(btnAuthorizationProcedures);

        btnPaymentClaims.setBounds(50, 425, 200, 100);
        btnPaymentClaims.setFocusPainted(false);
        mainPanel.add(btnPaymentClaims);


        //SEGUNDO PANEL DE LA PANTALLA
        secondPanel.setBounds(300, 40, 600, 500);
        secondPanel.setLayout(null);
        secondPanel.setBackground(Color.decode("#99B7E8"));


        // primer panel en el segundo panel
        secondPanelOne.setBounds(20, 10, 560, 100);
        secondPanelOne.setLayout(null);
        txtOnStandbyOne.setBounds(10, 10, 210, 30);
        txtShiftOnStandByOne.setBounds(230, 10, 30, 30);
        txtAttendingOne.setBounds(10, 50, 200, 30);
        txtShiftAttendingOne.setBounds(230, 50, 30, 30);
        txtHourOne.setBounds(400, 30, 100, 30);
        secondPanelOne.add(txtOnStandbyOne);
        secondPanelOne.add(txtShiftOnStandByOne);
        secondPanelOne.add(txtAttendingOne);
        secondPanelOne.add(txtShiftAttendingOne);
        secondPanelOne.add(txtHourOne);


        // segundo panel en el segundo panel
        secondPanelTwo.setBounds(20, 135, 560, 100);
        secondPanelTwo.setLayout(null);
        txtOnStandbyTwo.setBounds(10, 10, 210, 30);
        txtShiftOnStandByTwo.setBounds(230, 10, 200, 30);
        txtAttendingTwo.setBounds(10, 50, 200, 30);
        txtShiftAttendingTwo.setBounds(230, 50, 200, 30);
        txtHourTwo.setBounds(400, 30, 100, 30);
        secondPanelTwo.add(txtOnStandbyTwo);
        secondPanelTwo.add(txtShiftOnStandByTwo);
        secondPanelTwo.add(txtAttendingTwo);
        secondPanelTwo.add(txtShiftAttendingTwo);
        secondPanelTwo.add(txtHourTwo);

        //tercer panel en el segundo panel
        secondPanelThree.setBounds(20, 260, 560, 100);
        secondPanelThree.setLayout(null);
        txtOnStandbyThree.setBounds(10, 10, 210, 30);
        txtShiftOnStandByThree.setBounds(230, 10, 200, 30);
        txtAttendingThree.setBounds(10, 50, 200, 30);
        txtShiftAttendingThree.setBounds(230, 50, 200, 30);
        txtHourThree.setBounds(400, 30, 100, 30);
        secondPanelThree.add(txtOnStandbyThree);
        secondPanelThree.add(txtShiftOnStandByThree);
        secondPanelThree.add(txtAttendingThree);
        secondPanelThree.add(txtShiftAttendingThree);
        secondPanelThree.add(txtHourThree);


        //cuarto panel en el segundo panel
        secondPanelFour.setBounds(20, 385, 560, 100);
        secondPanelFour.setLayout(null);
        txtOnStandbyFour.setBounds(10, 10, 210, 30);
        txtShiftOnStandByFour.setBounds(230, 10, 210, 30);
        txtAttendingFour.setBounds(10, 50, 200, 30);
        txtShiftAttendingFour.setBounds(230, 50, 200, 30);
        txtHourFour.setBounds(400, 30, 100, 30);
        secondPanelFour.add(txtOnStandbyFour);
        secondPanelFour.add(txtShiftOnStandByFour);
        secondPanelFour.add(txtAttendingFour);
        secondPanelFour.add(txtShiftAttendingFour);
        secondPanelFour.add(txtHourFour);


        //TERCER PANEL DE LA PANTALLA
        thirdPanel.setBounds(450, 140, 300, 200);
        thirdPanel.setLayout(null);
        thirdPanel.setVisible(false);
        thirdPanel.setBackground(Color.decode("#52BEE7"));

        txtId.setBounds(50, 30, 200, 40);
        thirdPanel.add(txtId);
        inputId.setBounds(50, 70, 200, 40);
        thirdPanel.add(inputId);

        //Elementos en el tercer panel

        btnAccept.setBounds(50, 120, 200, 50);
        btnAccept.setFocusPainted(false);
        thirdPanel.add(btnAccept);


        secondPanel.add(secondPanelFour);
        secondPanel.add(secondPanelThree);
        secondPanel.add(secondPanelTwo);
        secondPanel.add(secondPanelOne);
        mainWindow.add(thirdPanel);
        mainWindow.add(secondPanel);
        mainWindow.add(mainPanel);

    }

    int selectedBtnMember = 0;
    int selectedBtnMedical = 0;
    int selectedBtnAutorization = 0;
    int selectedBtnPayment = 0;

    public void actionBtnMembership() {
        btnMembership.addActionListener((ActiveEvent -> {
            thirdPanel.setVisible(true);
            selectedBtnMember = 1;
        }));
    }

    public void actionBtnMedicalConsultations() {
        btnMedicalConsultations.addActionListener((ActiveEvent -> {
            thirdPanel.setVisible(true);
            selectedBtnMedical = 1;
        }));
    }

    public void actionBtnAuthorizationProcedures() {
        btnAuthorizationProcedures.addActionListener((ActiveEvent -> {
            thirdPanel.setVisible(true);
            selectedBtnAutorization = 1;
        }));
    }

    public void actionBtnPaymentClaims() {
        btnPaymentClaims.addActionListener((ActiveEvent -> {
            thirdPanel.setVisible(true);
            selectedBtnPayment = 1;
        }));
    }

    public void actionBtnAccept() {
        btnAccept.addActionListener((ActiveEvent -> {
            String id = inputId.getText();
            if (id.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Turno generado");
                inputId.setText("");
                thirdPanel.setVisible(false);
                if (selectedBtnMember == 1) {
                    Controller cont1 = new Controller(txtHourOne);
                    cont1.addListaAfiliarse(btnMembership.getText(), txtId.getText());
                    new Thread(cont1).start();
                    txtShiftAttendingOne.setText("A"+ cont1.getListaAfiliarse().get(0).getId());
                    try {
                        txtShiftOnStandByOne.setText("A"+ cont1.getListaAfiliarse().get(1).getId());
                        System.out.println("Tamaño de arreglo afiliarse: " + cont1.getListaAfiliarse().size());
                    }catch (Exception e) {
                        System.out.println("Arreglo solo tiene un objeto");
                    }
                    selectedBtnMember = 0;
                } else if (selectedBtnMedical == 1) {
                    Controller cont2 = new Controller(txtHourTwo);
                    cont2.addListaConsultasMedicas(btnMembership.getText(), txtId.getText());
                    new Thread(cont2).start();
                    txtShiftAttendingTwo.setText("B"+ cont2.getListaConsultasMedicas().get(0).getId());
                    try {
                        txtShiftOnStandByTwo.setText("B"+ cont2.getListaConsultasMedicas().get(1).getId());
                        System.out.println("Tamaño de arreglo Consultas medicas: " + cont2.getListaConsultasMedicas().size());
                    }catch (Exception e) {
                        System.out.println("Arreglo solo tiene un objeto");
                    }

                    selectedBtnMedical = 0;
                } else if (selectedBtnAutorization == 1) {
                    Controller cont3 = new Controller(txtHourThree);
                    cont3.addListaAutorizaciones(btnMembership.getText(), txtId.getText());
                    new Thread(cont3).start();
                    txtShiftAttendingThree.setText("C"+ cont3.getListaAutorizaciones().get(0).getId());
                    try {
                        txtShiftOnStandByThree.setText("C"+ cont3.getListaAutorizaciones().get(1).getId());
                        System.out.println("Tamaño de arreglo Autorizaciones: " + cont3.getListaAutorizaciones().size());
                    }catch (Exception e) {
                        System.out.println("Arreglo solo tiene un objeto");
                    }

                    selectedBtnAutorization = 0;
                } else if (selectedBtnPayment == 1) {
                    Controller cont4 = new Controller(txtHourFour);
                    cont4.addListaReclamosDePago(btnMembership.getText(), txtId.getText());
                    new Thread(cont4).start();
                    txtShiftAttendingFour.setText("D"+ cont4.getListaReclamosDePago().get(0).getId());
                    try {
                        txtShiftOnStandByFour.setText("D"+ cont4.getListaReclamosDePago().get(1).getId());
                        System.out.println("Tamaño de arreglo Reclamos de pago: " + cont4.getListaReclamosDePago().size());
                    }catch (Exception e) {
                        System.out.println("Arreglo solo tiene un objeto");
                    }

                    selectedBtnPayment = 0;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una identificación valida");
                inputId.setText("");
            }
        }));
    }


}
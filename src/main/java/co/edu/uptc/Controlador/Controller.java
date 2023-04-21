package co.edu.uptc.Controlador;

import co.edu.uptc.Modelo.Shift;

import javax.swing.*;
import java.util.ArrayList;

public class Controller implements Runnable {
    JLabel time;
    static ArrayList<Shift> listaAfiliarse = new ArrayList<>();
    static ArrayList<Shift> listaConsultasMedicas = new ArrayList<>();
    static ArrayList<Shift> listaAutorizaciones = new ArrayList<>();
    static ArrayList<Shift> listaReclamosDePago = new ArrayList<>();

    public Controller(JLabel time) {
        this.time = time;
    }

    public Controller() {

    }

    int minutes = 5;
    int seconds = minutes * 60;
    int seconds2 = 60;
    int minutes2 = minutes - 1;

    @Override
    public void run() {
        while (seconds > 0) {
            if (seconds2 > 0) {
                time.setText("00" + " : " + minutes2 + " : " + seconds2--);
                seconds--;
                if (seconds % 60 == 0) {
                    seconds2 = 60;
                    minutes2--;
                }
            }
            try {
                Thread.sleep(1000); // esperar 1 segundo antes de continuar
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void addListaAfiliarse(String procedure, String idCc) {
        Shift turn1 = new Shift(procedure, idCc);
        listaAfiliarse.add(turn1);
    }

    public void addListaConsultasMedicas(String procedure, String idCc) {
        Shift turn1 = new Shift(procedure, idCc);
        listaConsultasMedicas.add(turn1);
    }

    public void addListaAutorizaciones(String procedure, String idCc) {
        Shift turn1 = new Shift(procedure, idCc);
        listaAutorizaciones.add(turn1);
    }

    public void addListaReclamosDePago(String procedure, String idCc) {
        Shift turn1 = new Shift(procedure, idCc);
        listaReclamosDePago.add(turn1);
    }

    public ArrayList<Shift> getListaAfiliarse() {
        return listaAfiliarse;
    }

    public  ArrayList<Shift> getListaConsultasMedicas() {
        return listaConsultasMedicas;
    }

    public  ArrayList<Shift> getListaAutorizaciones() {
        return listaAutorizaciones;
    }

    public  ArrayList<Shift> getListaReclamosDePago() {
        return listaReclamosDePago;
    }

    public int getSeconds() {
        return seconds;
    }
}

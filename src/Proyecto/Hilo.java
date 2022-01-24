package Proyecto;

import static Proyecto.ProyectoDepreciacion.ActivoArrayList;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Hilo extends Thread {

    ProyectoDepreciacion proy = new ProyectoDepreciacion();
    //private ArrayList lista;

    String atributo;
    int contaHilo;
    int inicio = 0;
    int fin = 0;

    public Hilo(int i) {
        atributo = "->Procesado por Hilo " + i; //Este es el hilo añadir un if antes del run para que sepa de dodne a donde va cada hilo
        contaHilo = i;
//this.lista = Info;
    }

    public static void main(String[] args) {

    }

    @Override
    public void run() {

        switch (contaHilo) {
            case 1:
                inicio = 0;
                fin = 20;
                break;
            case 2:
                inicio = 20;
                fin = 40;
                break;
            case 3:
                inicio = 40;
                fin = 60;
                break;
            case 4:
                inicio = 60;
                fin = 80;
                break;
            case 5:
                inicio = 80;
                fin = 100;
                break;
        }
        for (int i = inicio; i < fin; i++) {
            String[] data = proy.InfoActivoArrayList.get(i).split(";");

            String codActivo = data[0];
            String nomActivo = data[1];
            String tipoActivo = data[2];
            String valActivo = data[3];
            String valRescate = data[4];
            String responsable = data[5];
            String vidaUtilActivo = data[6];

            float depreAnual;

            depreAnual = proy.LineaRecta(Integer.parseInt(valActivo), Integer.parseInt(valRescate), Integer.parseInt(vidaUtilActivo));

            String datosdepre = codActivo + ";" + nomActivo + ";" + tipoActivo + ";" + valActivo + ";" + valRescate + ";" + responsable + ";" + vidaUtilActivo + ";";

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(VisualizadorXML.class.getName()).log(Level.SEVERE, null, ex);
            }

            for (int k = 0; k < Integer.parseInt(vidaUtilActivo); k++) {
                int year = k + 1;
                float depacum = depreAnual * (k + 1);
                float vfinal = Integer.parseInt(valActivo) - depacum;

                String temp = year + ";" + depreAnual + ";" + depacum + ";" + vfinal + ";";

                proy.DepreciacionXMLArrayList.add(datosdepre + temp);
            }

            System.out.println(datosdepre + atributo);
        }
        //System.out.print("termine"+atributo);
    }
}

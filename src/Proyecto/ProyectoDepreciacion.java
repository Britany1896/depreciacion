package Proyecto;

import java.awt.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ProyectoDepreciacion {

    String nombre;
    String codigo;
    String tipoActivo;
    String valorActivo;
    String valorRescate;
    String responsable;
    String vidaUtil;

    static ArrayList<String> ActivoArrayList = new ArrayList<String>();
    ArrayList<String> BusquedaArrayList = new ArrayList<String>();
    static ArrayList<String> DepreciacionArrayList = new ArrayList<String>();//arraylist que guarda la depreciación en linea recta de los activos
    ArrayList<String> LecturaArrayList = new ArrayList<String>();
    static CopyOnWriteArrayList<String> InfoActivoArrayList = new CopyOnWriteArrayList<String>();//guarada informacion de activos depreciados en xml
    
   static CopyOnWriteArrayList<String> DepreciacionXMLArrayList = new CopyOnWriteArrayList<String>();

    public String CapturarDatos(String pnombre, String pcodigo, String ptipoActivo, String pValorActivo, String pValorRescate, String presponsable, String pvidaUtil) {

        String datos = pnombre + ";" + pcodigo + ";" + ptipoActivo + ";" + pValorActivo + ";" + pValorRescate + ";" + presponsable + ";" + pvidaUtil;

        ActivoArrayList.add(datos);

        return pcodigo;
    }

    public void Buscar(String code) {

        for (int i = 0; i < ActivoArrayList.size(); i++) {

            String[] data = ActivoArrayList.get(i).split(";");
            String cod = data[1];
            if (code.equals(cod)) {
                nombre = data[0];
                codigo = data[1];
                tipoActivo = data[2];
                valorActivo = data[3];
                valorRescate = data[4];
                responsable = data[5];
                vidaUtil = data[6];
            }
        }
    }

    public boolean BuscarDepreciacion(String code) {

        boolean isthere = false;
        for (int i = 0; i < DepreciacionArrayList.size(); i++) {

            String[] data = DepreciacionArrayList.get(i).split(";");
            String cod = data[0];
            if (code.equals(cod)) {
                isthere = true;
            }
        }
        return isthere;
    }

    public boolean BuscarMantenimiento(String code, String tipo) {

        BusquedaArrayList.clear();
        boolean rest = false;

        for (int i = 0; i < ActivoArrayList.size(); i++) {

            String[] data = ActivoArrayList.get(i).split(";");
            String cod;

            if (tipo == "codigo") {
                cod = data[1];

                if (code.equals(cod)) {
                    nombre = data[0];
                    codigo = data[1];
                    tipoActivo = data[2];
                    valorActivo = data[3];
                    valorRescate = data[4];
                    responsable = data[5];
                    vidaUtil = data[6];

                    rest = true;
                }

            } else if (tipo == "nombre") {
                cod = data[0];
                String datatemp[] = {};

                if (code.equals(cod)) {

                    String nombres = data[0] + ";" + data[1] + ";" + data[2] + ";" + data[3] + ";" + data[4] + ";" + data[5] + ";" + data[6];

                    BusquedaArrayList.add(nombres);
                    rest = true;
                }
            }

        }

        return rest;
    }

    public void BuscarEliminar(String code) {

        for (int i = 0; i < ActivoArrayList.size(); i++) {

            String[] data = ActivoArrayList.get(i).split(";");
            String cod = data[1];
            if (code.equals(cod)) {

                ActivoArrayList.remove(i);
                JOptionPane.showMessageDialog(null, "Activo eliminado correctamente.");
            }
        }
    }

    public void BuscarEliminarDepreciacion(String code) {

        for (int i = 0; i < DepreciacionArrayList.size(); i++) {

            String[] data = DepreciacionArrayList.get(i).split(";");
            String cod = data[0];
            if (code.equals(cod)) {

                DepreciacionArrayList.remove(i);
                //JOptionPane.showMessageDialog(null, "Activo eliminado correctamente."); 
            }
        }
    }

    public void BuscarModificar(String pnombre, String pcodigo, String ptipoActivo, String pValorActivo, String pValorRescate, String presponsable, String pvidaUtil) {

        for (int i = 0; i < ActivoArrayList.size(); i++) {

            String[] data = ActivoArrayList.get(i).split(";");
            String cod = data[1];
            if (pcodigo.equals(cod)) {

                ActivoArrayList.remove(i);

                String datos = pnombre + ";" + pcodigo + ";" + ptipoActivo + ";" + pValorActivo + ";" + pValorRescate + ";" + presponsable + ";" + pvidaUtil;

                ActivoArrayList.add(datos);

                JOptionPane.showMessageDialog(null, "Activo ha sido modificado correctamente.");
            }
        }
    }

    public float LineaRecta(int valorActivo, int valorRescate, int vidaUtil) {

        float depreciacion = (valorActivo - valorRescate) / vidaUtil;
        return depreciacion;
    }

    public float[] SumaDigitos(int valorActivo, int valorRescate, int vidaUtil) {

        float sum = vidaUtil * ((vidaUtil + 1) / 2);
        float depreAnual[] = new float[vidaUtil + 1];

        for (int i = 0; i <= vidaUtil; i++) {

            depreAnual[i] = ((valorActivo - valorRescate) * (i + 1)) / sum;
        }
        return depreAnual;
    }

    public boolean validartexto(String campoTexto) {
        boolean hay = true;
        if (campoTexto.length() == 0) {
            hay = false;
            //JOptionPane.showMessageDialog(null, "Algunos campos estan vacios");
        }
        return hay;
    }

    public void GenerarXML() {

        try {

            Element Depreciacion = new Element("Depreciacion");
            Document document = new Document(Depreciacion);

            for (int i = 0; i < DepreciacionArrayList.size(); i++) {
                Element Activo = new Element("Activo");
                String[] data = DepreciacionArrayList.get(i).split(";");
                String cod = data[0];
                Buscar(cod);

                //Activo.setAttribute(new Attribute("Activo",(i+1))); 
                Activo.addContent(new Element("Codigo").setText(codigo));
                Activo.addContent(new Element("Nombre").setText(nombre));
                Activo.addContent(new Element("TipoActivo").setText(tipoActivo));
                Activo.addContent(new Element("ValorActivo").setText(valorActivo));
                Activo.addContent(new Element("ValorRescate").setText(valorRescate));
                Activo.addContent(new Element("Responsable").setText(responsable));
                Activo.addContent(new Element("VidaUtil").setText(vidaUtil));

                int max = 4;
                int min = 1;
                int k;
                int j = 0;

                for (j = 0; j < Integer.parseInt(vidaUtil); j++) {

                    int annio = j + 1;
                    Element Anio = new Element("AniosVidaUtil");
                    //Anio.setAttribute(new Attribute("Numero", String.valueOf(annio)));

                    for (k = min; k < max; k++) {
                        if (max == min) {
                            break;
                        }
                        Anio.addContent(new Element("Anio").setText(String.valueOf(annio)));
                        Anio.addContent(new Element("DepreciacionAnual").setText(data[k + 1]));
                        Anio.addContent(new Element("DepreciacionAcumulada").setText(data[k + 2]));
                        Anio.addContent(new Element("ValorPeriodo").setText(data[k + 3]));
                        min = max;//Para hacer que la condicion de arriba haga el break luego de asignar cada año
                    }
                    min = max + 1;
                    max = max + 4;

                    Activo.addContent(Anio);
                }
                document.getRootElement().addContent(Activo);
            }

            XMLOutputter xmlOutput = new XMLOutputter();

            xmlOutput.output(document, System.out);

            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(document, new FileWriter(
                    "infoDepreciacion.xml"));
            JOptionPane.showMessageDialog(null, "Archivo XML se ha generado exitosamente");
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    public void LeerXML() {

        LecturaArrayList.clear();
        try {

            SAXParserFactory spfactory = SAXParserFactory.newInstance();

            SAXParser saxParser = spfactory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                String codActivo, nomActivo, tipActivo, valActivo, valRescate, responsable, vidaUtilActivo, anioActivo, depreAnualActivo, depreAcumuActivo, valPeriodoActivo;

                int cont = 0;
                boolean activo = false;
                boolean Codigo = false;
                boolean nombre = false;
                boolean tipoActivo = false;
                boolean ValorActivo = false;
                boolean ValorRescate = false;
                boolean Responsable = false;
                boolean VidaUtil = false;
                boolean anio = false;
                boolean DepreAnual = false;
                boolean DepreAcumu = false;
                boolean ValorPeriodo = false;

                public void startElement(String uri, String localName,
                        String qName, Attributes attributes) throws SAXException {

                    if (qName.equalsIgnoreCase("Activo")) {
                        activo = true;
                    }
                    if (qName.equalsIgnoreCase("Codigo")) {
                        Codigo = true;
                    }

                    if (qName.equalsIgnoreCase("Nombre")) {
                        nombre = true;
                    }

                    if (qName.equalsIgnoreCase("TipoActivo")) {
                        tipoActivo = true;
                    }

                    if (qName.equalsIgnoreCase("ValorActivo")) {
                        ValorActivo = true;
                    }

                    if (qName.equalsIgnoreCase("ValorRescate")) {
                        ValorRescate = true;
                    }

                    if (qName.equalsIgnoreCase("Responsable")) {
                        Responsable = true;
                    }

                    if (qName.equalsIgnoreCase("VidaUtil")) {
                        VidaUtil = true;
                    }
                    if (qName.equalsIgnoreCase("Anio")) {
                        anio = true;
                    }
                    if (qName.equalsIgnoreCase("DepreciacionAnual")) {
                        DepreAnual = true;
                    }
                    if (qName.equalsIgnoreCase("DepreciacionAcumulada")) {
                        DepreAcumu = true;
                    }
                    if (qName.equalsIgnoreCase("ValorPeriodo")) {
                        ValorPeriodo = true;
                    }
                }

                public void endElement(String uri, String localName,
                        String qName) throws SAXException {

                    if (qName.equalsIgnoreCase("act")) {
                        activo = false;
                    }
                    if (qName.equalsIgnoreCase("cod")) {
                        Codigo = false;
                    }

                    if (qName.equalsIgnoreCase("nom")) {
                        nombre = false;
                    }

                    if (qName.equalsIgnoreCase("tipo")) {
                        tipoActivo = false;
                    }

                    if (qName.equalsIgnoreCase("ValorAc")) {
                        ValorActivo = false;
                    }
                    if (qName.equalsIgnoreCase("ValorRe")) {
                        ValorRescate = false;
                    }
                    if (qName.equalsIgnoreCase("Resp")) {
                        Responsable = false;
                    }
                    if (qName.equalsIgnoreCase("VidaU")) {
                        VidaUtil = false;
                    }
                    if (qName.equalsIgnoreCase("ano")) {
                        anio = false;
                    }
                    if (qName.equalsIgnoreCase("depAn")) {
                        DepreAnual = false;
                    }
                    if (qName.equalsIgnoreCase("depac")) {
                        DepreAcumu = false;
                    }
                    if (qName.equalsIgnoreCase("valorPe")) {
                        ValorPeriodo = false;
                    }
                }

                public void characters(char ch[], int start,
                        int length) throws SAXException {

                    if (activo) {

                        activo = false;
                    }
                    if (Codigo) {

                        codActivo = new String(ch, start, length);
                        Codigo = false;
                    }

                    if (nombre) {

                        nomActivo = new String(ch, start, length);
                        nombre = false;
                    }

                    if (tipoActivo) {

                        tipActivo = new String(ch, start, length);
                        tipoActivo = false;
                    }

                    if (ValorActivo) {

                        valActivo = new String(ch, start, length);
                        ValorActivo = false;
                    }

                    if (ValorRescate) {

                        valRescate = new String(ch, start, length);
                        ValorRescate = false;
                    }
                    if (Responsable) {

                        responsable = new String(ch, start, length);
                        Responsable = false;
                    }
                    if (VidaUtil) {

                        vidaUtilActivo = new String(ch, start, length);
                        VidaUtil = false;

                    }
                    if (anio) {

                        anioActivo = new String(ch, start, length);
                        anio = false;
                    }
                    if (DepreAnual) {

                        depreAnualActivo = new String(ch, start, length);
                        DepreAnual = false;
                    }
                    if (DepreAcumu) {

                        depreAcumuActivo = new String(ch, start, length);
                        DepreAcumu = false;
                    }
                    if (ValorPeriodo) {

                        valPeriodoActivo = new String(ch, start, length);
                        ValorPeriodo = false;
                        System.out.println("\n");
                        String valor = codActivo + ";" + nomActivo + ";" + tipActivo + ";" + valActivo + ";" + valRescate + ";" + responsable + ";" + vidaUtilActivo + ";" + anioActivo + ";" + depreAnualActivo + ";" + depreAcumuActivo + ";" + valPeriodoActivo + ";";
                        LecturaArrayList.add(valor);

                        cont++; //

                    }

                }

            };

            saxParser.parse("infoDepreciacion.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void InfoActivoXML() {

        try {

            SAXParserFactory spfactory = SAXParserFactory.newInstance();

            SAXParser saxParser = spfactory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                String codActivo, nomActivo, tipActivo, valActivo, valRescate, responsable, vidaUtilActivo;

                int cont = 0;
                boolean activo = false;
                boolean Codigo = false;
                boolean nombre = false;
                boolean tipoActivo = false;
                boolean ValorActivo = false;
                boolean ValorRescate = false;
                boolean Responsable = false;
                boolean VidaUtil = false;

                public void startElement(String uri, String localName,
                        String qName, Attributes attributes) throws SAXException {

                    if (qName.equalsIgnoreCase("Activo")) {
                        activo = true;
                    }
                    if (qName.equalsIgnoreCase("Codigo")) {
                        Codigo = true;
                    }

                    if (qName.equalsIgnoreCase("Nombre")) {
                        nombre = true;
                    }

                    if (qName.equalsIgnoreCase("TipoActivo")) {
                        tipoActivo = true;
                    }

                    if (qName.equalsIgnoreCase("ValorActivo")) {
                        ValorActivo = true;
                    }

                    if (qName.equalsIgnoreCase("ValorRescate")) {
                        ValorRescate = true;
                    }

                    if (qName.equalsIgnoreCase("Responsable")) {
                        Responsable = true;
                    }

                    if (qName.equalsIgnoreCase("VidaUtil")) {
                        VidaUtil = true;
                    }
                }

                public void endElement(String uri, String localName,
                        String qName) throws SAXException {

                    if (qName.equalsIgnoreCase("act")) {
                        activo = false;
                    }
                    if (qName.equalsIgnoreCase("cod")) {
                        Codigo = false;
                    }

                    if (qName.equalsIgnoreCase("nom")) {
                        nombre = false;
                    }

                    if (qName.equalsIgnoreCase("tipo")) {
                        tipoActivo = false;
                    }

                    if (qName.equalsIgnoreCase("ValorAc")) {
                        ValorActivo = false;
                    }
                    if (qName.equalsIgnoreCase("ValorRe")) {
                        ValorRescate = false;
                    }
                    if (qName.equalsIgnoreCase("Resp")) {
                        Responsable = false;
                    }
                    if (qName.equalsIgnoreCase("VidaU")) {
                        VidaUtil = false;
                    }
                }

                public void characters(char ch[], int start,
                        int length) throws SAXException {

                    if (activo) {

                        activo = false;
                    }
                    if (Codigo) {

                        codActivo = new String(ch, start, length);
                        Codigo = false;
                    }

                    if (nombre) {

                        nomActivo = new String(ch, start, length);
                        nombre = false;
                    }

                    if (tipoActivo) {

                        tipActivo = new String(ch, start, length);
                        tipoActivo = false;
                    }

                    if (ValorActivo) {

                        valActivo = new String(ch, start, length);
                        ValorActivo = false;
                    }

                    if (ValorRescate) {

                        valRescate = new String(ch, start, length);
                        ValorRescate = false;
                    }
                    if (Responsable) {

                        responsable = new String(ch, start, length);
                        Responsable = false;
                    }
                    if (VidaUtil) {

                        vidaUtilActivo = new String(ch, start, length);
                        VidaUtil = false;

                        System.out.println("\n");
                        String valor = codActivo + ";" + nomActivo + ";" + tipActivo + ";" + valActivo + ";" + valRescate + ";" + responsable + ";" + vidaUtilActivo;
                        //System.out.println(valor);
                        
                        InfoActivoArrayList.add(valor);

                        cont++; //
                    }
                }
            };
            saxParser.parse("infoDepreciacion.xml", handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

}

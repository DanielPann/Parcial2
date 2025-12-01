package implementos;

import interfaces.Reporte;

public class ReportePDF implements Reporte {
    @Override
    public String generarContenido() {
        return "Contenido del Reporte en formato PDF.";
    }
}

package implementos;

import interfaces.Reporte;

public class ReporteHTML implements Reporte {
    @Override
    public String generarContenido() {
        return "Contenido del Reporte en formato HTML.";
    }
}

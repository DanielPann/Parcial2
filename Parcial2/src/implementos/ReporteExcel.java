package implementos;

import interfaces.Reporte;

public class ReporteExcel implements Reporte {
    @Override
    public String generarContenido() {
        return "Contenido del Reporte en formato Excel.";
    }

}

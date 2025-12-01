package factory;

import interfaces.Reporte;
import implementos.ReporteHTML;
import implementos.ReportePDF;
import implementos.ReporteExcel;

public class ReporteFactory {
    public static Reporte crearReporte(String tipo) {
        if (tipo == null) {
            return null;
        }
        if (tipo.equalsIgnoreCase("PDF")) {
            return new ReportePDF();
        } else if (tipo.equalsIgnoreCase("Excel")) {
            return new ReporteExcel();
        } else if (tipo.equalsIgnoreCase("HTML")) {
            return new ReporteHTML();
        }
        return null;
    }
}

package decorator;

import interfaces.Reporte;
import java.util.Date;

public class PieConFechaDecorador extends ReporteDecorador {
    public PieConFechaDecorador(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String generarContenido() {
        return super.generarContenido() + "\n[PIE DE PÁGINA: " + new Date() + "]";
    }
}

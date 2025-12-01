package decorator;

import interfaces.Reporte;

public abstract class ReporteDecorador implements Reporte {
    protected Reporte reporteDecorado;

    public ReporteDecorador(Reporte reporteDecorado) {
        this.reporteDecorado = reporteDecorado;
    }

    @Override
    public String generarContenido() {
        return reporteDecorado.generarContenido();
    }
}

package decorator;

import interfaces.Reporte;

public class EncabezadoDecorador extends ReporteDecorador {
    public EncabezadoDecorador(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String generarContenido() {
        return "[ENCABEZADO: Empresa XYZ] \n" + super.generarContenido();
    }
}

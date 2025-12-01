package decorator;

import interfaces.Reporte;

public class MarcaAguaDecorador extends ReporteDecorador {
    public MarcaAguaDecorador(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String generarContenido() {
        return super.generarContenido() + "\n(Marca de Agua: CONFIDENCIAL)";
    }
}

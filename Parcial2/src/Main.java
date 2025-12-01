import decorator.EncabezadoDecorador;
import decorator.PieConFechaDecorador;
import decorator.MarcaAguaDecorador;
import factory.ReporteFactory;
import interfaces.Reporte;
import singleton.ConfiguracionSistema;

public class Main {
    public static void main(String[] args) throws Exception {
        ConfiguracionSistema config = ConfiguracionSistema.getInstancia();
        
        System.out.println("Configuración Global:");
        System.out.println("Directorio: " + config.getDirectorioSalida());
        System.out.println("Formato Default: " + config.getFormatoPorDefecto());
        System.out.println("-------------------------------------------------");

        Reporte reporteBasico = ReporteFactory.crearReporte(config.getFormatoPorDefecto());

        if (reporteBasico != null) {
            Reporte reporteCompleto = new EncabezadoDecorador(
                new PieConFechaDecorador(reporteBasico)
            );

            if (config.isMostrarMarcaAgua()) {
                reporteCompleto = new MarcaAguaDecorador(reporteCompleto);
            }

            System.out.println(reporteCompleto.generarContenido());
        }
    }
}

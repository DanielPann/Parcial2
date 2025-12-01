package singleton;

public class ConfiguracionSistema {
    private static ConfiguracionSistema instancia;
    private String directorioSalida;
    private String formatoPorDefecto;
    private boolean mostrarMarcaAgua;

    private ConfiguracionSistema() {
        this.directorioSalida = "/user/docs/reportes";
        this.formatoPorDefecto = "PDF";
        this.mostrarMarcaAgua = true;
    }

    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    public String getDirectorioSalida() {
        return directorioSalida;
    }

    public void setDirectorioSalida(String directorioSalida) {
        this.directorioSalida = directorioSalida;
    }

    public String getFormatoPorDefecto() {
        return formatoPorDefecto;
    }

    public void setFormatoPorDefecto(String formatoPorDefecto) {
        this.formatoPorDefecto = formatoPorDefecto;
    }

    public boolean isMostrarMarcaAgua() {
        return mostrarMarcaAgua;
    }

    public void setMostrarMarcaAgua(boolean mostrarMarcaAgua) {
        this.mostrarMarcaAgua = mostrarMarcaAgua;
    }
}

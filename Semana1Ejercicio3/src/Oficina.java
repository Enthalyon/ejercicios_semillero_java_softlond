public class Oficina extends Local{

    protected boolean perteneceAlGobierno;


    public Oficina(boolean perteneceAlGobierno, String localizacionLocal, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(localizacionLocal, identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.perteneceAlGobierno = perteneceAlGobierno;
    }
}

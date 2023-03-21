public class LocalComercial extends Local{

    protected String ubicacionCentroComercial;


    public LocalComercial(String ubicacionCentroComercial, String localizacionLocal, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(localizacionLocal, identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.ubicacionCentroComercial = ubicacionCentroComercial;
    }
}

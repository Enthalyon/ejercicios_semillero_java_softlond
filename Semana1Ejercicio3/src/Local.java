public class Local extends Inmueble{

    protected String localizacionLocal;


    public Local(String localizacionLocal, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.localizacionLocal = localizacionLocal;
    }
}

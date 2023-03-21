public class Inmueble {
    protected int identificadorInmueble;
    protected int areaMetrosCuadrados;
    protected String direccion;
    protected double valorPorMetroCuadrado;


    public Inmueble(int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado){
        this.identificadorInmueble = identificadorInmueble;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
        this.valorPorMetroCuadrado = valorPorMetroCuadrado;
    }

    public double calcularValorCompra(){
        return this.valorPorMetroCuadrado * this.areaMetrosCuadrados;
    }

}

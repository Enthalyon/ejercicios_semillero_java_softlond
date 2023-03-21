public class casaRural extends Casa{
    protected double distanciaALaCabeceraMunicipal;
    protected double altitudSobreElNivelDelMar;


    public casaRural(double distanciaALaCabeceraMunicipal, double altitudSobreElNivelDelMar, int cantidadDePisos, int numeroDeHabitaciones, int numeroDeBanos, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(cantidadDePisos, numeroDeHabitaciones, numeroDeBanos, identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.distanciaALaCabeceraMunicipal = distanciaALaCabeceraMunicipal;
        this.altitudSobreElNivelDelMar = altitudSobreElNivelDelMar;
    }
}

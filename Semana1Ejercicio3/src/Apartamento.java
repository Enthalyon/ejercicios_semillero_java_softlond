public class Apartamento extends Vivienda{
    protected double valorAdministracion;


    public Apartamento(double valorAdministracion, int numeroDeHabitaciones, int numeroDeBanos, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(numeroDeHabitaciones, numeroDeBanos, identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.valorAdministracion = valorAdministracion;
    }
}

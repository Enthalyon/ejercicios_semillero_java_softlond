public class Vivienda extends Inmueble{
    protected int numeroDeHabitaciones;
    protected int numeroDeBanos;


    public Vivienda(int numeroDeHabitaciones , int numeroDeBanos, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.numeroDeHabitaciones = numeroDeHabitaciones;
        this.numeroDeBanos = numeroDeBanos;
    }
}

public class Casa extends Vivienda{
    protected int cantidadDePisos;


    public Casa(int cantidadDePisos ,int numeroDeHabitaciones, int numeroDeBanos, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(numeroDeHabitaciones, numeroDeBanos, identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.cantidadDePisos = cantidadDePisos;
    }
}

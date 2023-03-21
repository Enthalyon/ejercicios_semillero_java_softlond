public class ConjuntoCerrado extends CasaUrbana{

    protected double valorAdministracion;
    protected boolean areasComunes;


    public ConjuntoCerrado(double valorAdministracion, boolean areasComunes,int cantidadDePisos, int numeroDeHabitaciones, int numeroDeBanos, int identificadorInmueble, int areaMetrosCuadrados, String direccion, double valorPorMetroCuadrado) {
        super(cantidadDePisos, numeroDeHabitaciones, numeroDeBanos, identificadorInmueble, areaMetrosCuadrados, direccion, valorPorMetroCuadrado);
        this.valorAdministracion = valorAdministracion;
        this.areasComunes = areasComunes;
    }
}

public class Main {

    public static void main(String[] args) {

        CuentaDeAhorros cuentaAhorros1 = new CuentaDeAhorros(11000, 12);

        cuentaAhorros1.consignarDineroCuenta(50000);
        cuentaAhorros1.retirarDineroCuenta(50000);
        cuentaAhorros1.extractoMensual();
        cuentaAhorros1.imprimirCuentaBancaria();

    }
}
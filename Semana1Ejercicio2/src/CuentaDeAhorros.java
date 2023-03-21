public class CuentaDeAhorros extends CuentaBancaria {
    protected boolean cuentaActiva;


    public CuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.cuentaActiva = estaLaCuentaActiva();
    }

    public boolean estaLaCuentaActiva(){
        if(this.saldo < 10000){
            this.cuentaActiva = false;
            //System.out.println("La cuenta esta inactiva");
        }else{
            this.cuentaActiva = true;
            //ystem.out.println("La cuenta esta activa");
        }
        return this.cuentaActiva;
    }

    @Override
    public float consignarDineroCuenta(float consignacion){
        if (this.cuentaActiva){
            super.consignarDineroCuenta(consignacion);
            numeroDeConsignaciones++;
        }
        return this.saldo;
    }

    @Override
    public float retirarDineroCuenta(float retiro){
        if(this.cuentaActiva){
            super.retirarDineroCuenta(retiro);
            numeroDeRetiros++;
        }
        return this.saldo;
    }

    @Override
    public float extractoMensual(){
        if (this.numeroDeRetiros > 4){
            int retiroExtra = this.numeroDeRetiros - 4;
            this.saldo -= 1000*retiroExtra;
        }else{
            super.extractoMensual();
        }
        estaLaCuentaActiva();
        return this.saldo;
    }

    @Override
    public void imprimirCuentaBancaria(){
        int numeroTransacciones = this.numeroDeConsignaciones + this.numeroDeRetiros;
        System.out.println("CUENTA DE AHORROS" + "\n" +
                "Saldo de la cuenta: " + this.saldo + "\n" +
                "Comision mensual: " + this.comisionMensual + "\n" +
                "Transacciones realizadas: " + numeroTransacciones);
    }

}

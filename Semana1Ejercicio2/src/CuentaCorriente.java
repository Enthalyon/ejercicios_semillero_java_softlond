public class CuentaCorriente extends CuentaBancaria{

    protected float sobregiro = 0;


    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }


    @Override
    public float consignarDineroCuenta(float consignacion){
        if (this.sobregiro > 0){

            if(consignacion > this.sobregiro){
                this.saldo += consignacion - this.sobregiro;
                this.sobregiro = 0;
            } else {
                this.sobregiro -= consignacion;
            }
            numeroDeConsignaciones++;
        }else{
            super.consignarDineroCuenta(consignacion);
        }
        return this.saldo;
    }


    @Override
    public float retirarDineroCuenta(float retiro){
        if (retiro > this.saldo){
            this.sobregiro += retiro - this.saldo;
            this.saldo = 0;
            numeroDeRetiros++;
        } else {
            super.retirarDineroCuenta(retiro);
        }
        return this.saldo;
    }


    @Override
    public float extractoMensual(){
        return super.extractoMensual();
    }


    @Override
    public void imprimirCuentaBancaria(){
        int numeroTransacciones = this.numeroDeConsignaciones + this.numeroDeRetiros;
        System.out.println("CUENTA CORRIENTE" + "\n" +
                "Saldo de la cuenta: " + this.saldo + "\n" +
                "Comision mensual: " + this.comisionMensual + "\n" +
                "Transacciones realizadas: " + numeroTransacciones + "\n" +
                "Sobregiro: " +  this.sobregiro);
    }
}

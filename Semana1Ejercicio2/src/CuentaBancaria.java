public class CuentaBancaria {
    protected float saldo;
    protected int numeroDeConsignaciones = 0;
    protected int numeroDeRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;

    public CuentaBancaria(float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float consignarDineroCuenta(float consignacion){
        this.saldo += consignacion;
        numeroDeConsignaciones++;
        return this.saldo;
    }

    public float retirarDineroCuenta(float retiro){
        if(retiro > this.saldo){
            System.out.println("Transacción errada, saldo insuficiente");
        }else{
            this.saldo -= retiro;
            numeroDeRetiros++;
        }
        return this.saldo;
    }

    public float calcularInteresMensualCuenta(float a){
        this.comisionMensual = ((this.saldo * this.tasaAnual)/100)/12;
        return this.saldo;
    }

    public float extractoMensual(){
        calcularInteresMensualCuenta(this.saldo);
        this.saldo -= this.comisionMensual;
        return this.saldo;
    }

    public void imprimirCuentaBancaria(){
        System.out.println("CUENTA BANCARIA" + "\n" +
                "Saldo: " + saldo + "\n" +
                "Consignaciones: " + numeroDeConsignaciones + "\n" +
                "Retiros: " + numeroDeRetiros + "\n" +
                "Tasa anual: " + tasaAnual + "\n" +
                "Comision mensual: " + comisionMensual);
    }
}

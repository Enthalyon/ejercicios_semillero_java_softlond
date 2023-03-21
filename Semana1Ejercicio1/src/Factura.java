public class Factura extends Precio {
    protected String emisor;
    protected String cliente;

    public Factura(String emisor, String cliente, double valorTotal, double descuento){
        super(valorTotal, descuento);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public void imprimirFactura(){
        System.out.println("Emisor: " + emisor + "\n" + "Cliente: " + cliente);
    }
}

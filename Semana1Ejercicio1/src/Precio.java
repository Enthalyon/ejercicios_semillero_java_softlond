public class Precio {
    protected double valorTotal;
    protected double descuento;

    protected Precio(double valorTotal, double descuento){
        this.valorTotal = valorTotal;
        this.descuento = descuento;
    }

    protected double calcularPrecio(){
        return valorTotal;
    }

    protected double calcularPrecioConDescuento(){
        double valorTotalConDescuento = valorTotal - descuento;
        return valorTotalConDescuento;
    }

    public void imprimirPrecios(){
        System.out.println("Valor total: " + calcularPrecio() + "\n" + "Valor total con descuentos: " + calcularPrecioConDescuento());
    }
}
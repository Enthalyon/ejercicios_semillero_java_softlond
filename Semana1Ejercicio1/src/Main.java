public class Main {
    public static void main(String[] args) {
        Factura factura1 = new Factura("Insumos de Colombia", "Pedro Pascal", 250000, 50000);
        factura1.imprimirFactura();
        factura1.imprimirPrecios();
    }
}
import java.util.ArrayList;


public class CalculosNumericos {


    public static double calcularRaizCuadrada(double numero){

        if(numero < 0){
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        }

        return Math.sqrt(numero);
    }

    public static double calcularPendienteRecta(double punto1X1, double punto1X2, double punto2Y1, double punto2Y2){
        if (punto1X2 - punto1X1 == 0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return (punto2Y2 - punto2Y1)/(punto1X2 - punto1X1);
    }

    public static double[] calcularPuntoMedioRecta(double punto1X1, double punto1X2, double punto2Y1, double punto2Y2){
        return new double[] {
            ((punto1X1 + punto1X2) / 2),
            ((punto2Y1 + punto2Y2) / 2)
        };
    }

    public static String calcularRaicesEcuacionCuadratica(double a, double b, double c){
        double discriminante = (Math.pow(b, 2) -4 * a * c);
        if (discriminante == 0){
            double x = -b/(2+a);
            return "La raiz unica es: " + x;

        } else if (discriminante > 0) {
            double x1 =(-b + Math.sqrt(discriminante))/(2*a);
            double x2 =(-b - Math.sqrt(discriminante))/(2*a);
            return "La raiz de x1 es: " + x1 + "\n" + ", la raiz de x2 es: " + x2;

        } else {
            Math.abs(discriminante);
            double parteReal = -b/(2*a);
            double parteImaginaria = Math.sqrt(discriminante) /(2*a);
            return "Raiz imaginaria x1: " + parteReal + " + " +parteImaginaria + "\n" +
                   "Raiz imaginaria x2: " + parteReal + " - " +parteImaginaria;
        }
    }


    public static String convertirBaseDiezABaseN(int numeroAConvertir, int sistemaDestino){

        if (sistemaDestino < 2 || sistemaDestino > 9){
            throw new IllegalArgumentException("Solo se permiten bases entre 2 y 10");
        }

        int cociente = 0;
        ArrayList<Integer> resultado = new ArrayList<>();

        do {
            cociente = numeroAConvertir/sistemaDestino;
            resultado.add(numeroAConvertir%sistemaDestino);
            numeroAConvertir = cociente;
        }while (cociente >= sistemaDestino);
        resultado.add(cociente);

        String resultadoInvertido = "";
        for (int i = resultado.size() - 1; i >= 0 ; i--) {
            resultadoInvertido += resultado.get(i);
        }

        return resultadoInvertido;
    }
}

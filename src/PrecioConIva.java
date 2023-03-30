public class PrecioConIva {

    public static void main(String[] args) {
        double precio1 = 150;
        double precio2 = 350;
        double iva = 0.21;

double precioConIva1 = calcularPrecioConIva (precio1, iva);
double precioConIva2 = calcularPrecioConIva (precio2, iva);

        System.out.println("Precio 1: " + precio1);
        System.out.println("Precio 1 con IVA: " + precioConIva1);
        System.out.println("Precio 2: " + precio2);
        System.out.println("Precio 2 con IVA: " + precioConIva2);

    }

    public static double calcularPrecioConIva(double precio, double iva) {
        double precioConIva = precio * (1 + iva);
        return precioConIva;

    }
}
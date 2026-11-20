package Bolsillo;

public class Tarjeta extends MedioPago {

    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {

        if (monto > 0) {

            System.out.println("Tipo de pago: Tarjeta");
            System.out.println("Titular: " + getTitular());
            System.out.println("Últimos cuatro dígitos: " + ultimosCuatroDigitos);
            System.out.println("Monto: $" + monto);
            System.out.println("Pago procesado correctamente");

        } else {

            System.out.println("El monto debe ser mayor que cero");

        }
    }
}

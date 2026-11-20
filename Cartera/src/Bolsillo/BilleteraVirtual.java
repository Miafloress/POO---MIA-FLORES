package Bolsillo;

public class BilleteraVirtual extends MedioPago {

    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {

        if (monto > 0) {

            System.out.println("Tipo de pago: Billetera Virtual");
            System.out.println("Titular: " + getTitular());
            System.out.println("Aplicación: " + nombreAplicacion);
            System.out.println("Monto: $" + monto);
            System.out.println("Pago procesado correctamente");

        } else {

            System.out.println("El monto debe ser mayor que cero");

        }
    }
}
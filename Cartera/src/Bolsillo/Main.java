package Bolsillo;

public class Main {

    public static void main(String[] args) {

        Tarjeta tarjeta = new Tarjeta("Sofia", "1267");

        BilleteraVirtual billetera = new BilleteraVirtual("Mia", "Mercado Pago");

        tarjeta.procesarPago(77000);

        billetera.procesarPago(6700);

        tarjeta.procesarPago(-400);
    }
}
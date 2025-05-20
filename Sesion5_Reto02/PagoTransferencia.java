public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionBancariaExitosa;

    public PagoTransferencia(double monto, boolean validacionBancariaExitosa) {
        super(monto);
        this.validacionBancariaExitosa = validacionBancariaExitosa;
    }

    @Override
    public boolean autenticar() {
        return validacionBancariaExitosa;
    }

    @Override
    public void procesarPago() {
        System.out.println("🏦 Procesando transferencia bancaria por $" + monto);
    }
}

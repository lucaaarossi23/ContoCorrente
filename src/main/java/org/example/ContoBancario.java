
package org.example;

public class ContoBancario {
    private double Saldo;

    public ContoBancario(double saldo) {
        this.Saldo = saldo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void preleva(double Importo) throws SaldoInsufficienteException {
        if (Importo <= 0) {
            throw new ImportoNonValidoException();
        }

        if (Importo > Saldo) {
            throw new SaldoInsufficienteException(Saldo, Importo);
        }

        Saldo -= Importo;
    }
}

package org.example;

public class SaldoInsufficienteException extends Exception{
    private double SaldoAttuale;
    private double ImportoRichiesto;

    public double getSaldoAttuale() {
        return SaldoAttuale;
    }

    public double getImportoRichiesto() {
        return ImportoRichiesto;
    }
    public SaldoInsufficienteException(double saldo, double importo) {
        SaldoAttuale = saldo;
        ImportoRichiesto = importo;
    }
}

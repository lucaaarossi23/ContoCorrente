import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;

import static java.lang.IO.println;

void main() {
    ContoBancario conto = new ContoBancario(100);

    println("Saldo disponibile --> 100\n\n");

    try {
        println("Prelevo 150...");
        conto.preleva(150);
        println("Prelevo effettuato, Saldo --> " + conto.getSaldo());
    } catch(SaldoInsufficienteException e) {
        double deficit = e.getImportoRichiesto() -  e.getSaldoAttuale();
        println("Saldo insufficiente, mancano " + deficit + " euro");
    } catch(ImportoNonValidoException e) {
        println("Importo negativo");
    }

    try {
        println("Prelevo -50...");
        conto.preleva(-50);
        println("Prelevo effettuato, Saldo --> " + conto.getSaldo());
    } catch(SaldoInsufficienteException e) {
        double deficit = e.getImportoRichiesto() -  e.getSaldoAttuale();
        println("Saldo insufficiente, mancano " + deficit + " euro");
    } catch(ImportoNonValidoException e) {
        println("Importo negativo");
    }

    try {
        println("Prelevo 100...");
        conto.preleva(100);
        println("Prelevo effettuato, Saldo --> " + conto.getSaldo());
    } catch(SaldoInsufficienteException e) {
        double deficit = e.getImportoRichiesto() -  e.getSaldoAttuale();
        println("Saldo insufficiente, mancano " + deficit + " euro");
    } catch(ImportoNonValidoException e) {
        println("Importo negativo");
    }
}
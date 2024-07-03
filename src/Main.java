//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Cliente Carlos = new Cliente();
    Carlos.setNome("Carlos");
    Conta cc = new ContaCorrente(Carlos);
    Conta poupanca = new ContaPoupanca(Carlos);
    cc.Depositar(100);
    cc.ImprimirExtrato();
    cc.Transferir(100, poupanca);
    cc.ImprimirExtrato();
    poupanca.ImprimirExtrato();
    }
}
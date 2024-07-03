public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    public Conta( Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    @Override
    public void Sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void Depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void Transferir(double valor, IConta contaDestino){
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void ImprimirConta(){
        System.out.println("Titular: "+this.cliente.getNome());
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número: "+this.numero);
        System.out.println("Saldo: "+this.saldo);
    }
}

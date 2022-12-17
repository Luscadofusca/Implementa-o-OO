public class ContaC extends Conta{
    
    private Double limite;
    private Double saldoConta;
    public ContaC(String numero, Double saldo, Double limite) {
        super(numero, saldo);
        this.setLimite(limite);
    }

    public Double getLimite() {
        return limite;
    }
    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Double getsaldoConta(){
        return saldoConta;
    }
    public void setsaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }
    public Double calcSaldo(ContaC conta){
        Double total = 0.;

        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total + limite;
    }

    public static void transferencia(Conta contaOrigem, Conta contaDestino, Double valor){
        contaOrigem.transferir(contaDestino, valor);
    }
}

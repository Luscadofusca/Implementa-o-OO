import java.util.ArrayList;
import java.util.Collection;

public abstract class Conta {

    private String numero;
    protected Double saldo;

    public Collection<Debito> debito = new ArrayList<Debito>();
    public Collection<Credito> credito = new ArrayList<Credito>();

    public Conta(String numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double deposito(Credito valorDep){
        this.saldo += valorDep.getValor();

        return this.saldo;
    }
    public Double saque(Debito valorSac){
        if(valorSac.getValor() > this.saldo){
            System.out.println("Saldo insuficiente " + numero);
            return this.saldo;
        }
        this.saldo -= valorSac.getValor();

        return this.saldo;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void transferir(Conta contaReceb, Double valor){
        if(valor > 0 && this.getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            contaReceb.saldo = contaReceb.getSaldo() + valor;
        }
            System.out.println("Não foi possível realizar a transferência!");
    }
}

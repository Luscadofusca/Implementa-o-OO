public class Poupanca extends Conta{
    private Double rentabilMes;

    public Poupanca(String numero, Double saldo, Double rentabilMes){
        super(numero, saldo);
        this.rentabilMes = rentabilMes;
    }

    public Double calcSaldo(Poupanca conta){
        Double total = 0.0;

        for (Debito e : debito){
            total -= e.getValor();

        }
        for (Credito e : credito){
            total += e.getValor();
        }

        return total;
    }

    public Double getRentabilMes() {
        return rentabilMes;
    }

    public void setRentabilMes(Double rentabilMes) {
        this.rentabilMes = rentabilMes;
    }
}

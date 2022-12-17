public class AplicacaoIV {
    public static void main(String[] args) {

        ContaC corrente2 = new ContaC("582", 0., 800.);

        Poupanca cpoupanca = new Poupanca("116", 0., 0.3);

        Credito cdt4 = new Credito(1000.);
        Credito cdt5 = new Credito(1000.);
        corrente2.credito.add(cdt4);
        cpoupanca.credito.add(cdt5);

        corrente2.deposito(cdt4);
        cpoupanca.deposito(cdt5);

        corrente2.transferir(cpoupanca, 500.);
    }
}

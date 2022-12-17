public class AplicacaoIII {
    public static void main(String[] args) {
        ContaC corrente1 = new ContaC("934", 0., 500.);

        Credito cdt1 = new Credito(100.);
        Credito cdt2 = new Credito(100.);
        Credito cdt3 = new Credito(100.);
        corrente1.credito.add(cdt1);
        corrente1.credito.add(cdt2);
        corrente1.credito.add(cdt3);

        Debito dbt1 = new Debito(50.);
        corrente1.debito.add(dbt1);

        corrente1.deposito(cdt1);
        corrente1.deposito(cdt2);
        corrente1.deposito(cdt3);
        corrente1.saque(dbt1);
        System.out.println("Número da Conta:" + corrente1.getNumero() + " / Saldo:" + corrente1.calcSaldo(corrente1));
    }
}

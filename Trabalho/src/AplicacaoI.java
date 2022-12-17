public class AplicacaoI {

    public static void main(String[] args) {

        Cargo ger = new Cargo();
        ger.setNomeC("Gerente");

        Cargo at = new Cargo();
        at.setNomeC("Atendente");

        Funcionario f1 = new Funcionario("165.732.801-28", "Eustácio", "(32)98457-0932", 2.500);
        f1.setCargoF(ger);
        Funcionario f2 = new Funcionario("217.406.541-34", "Muriel", "(32)98996-6458", 1.200);
        f2.setCargoF(at);
    }
}

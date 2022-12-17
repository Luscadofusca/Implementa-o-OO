public class AplicacaoII {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("155.604.217-58", "Juliana", "(32)99809-0645");

        Endereco e1 = new Endereco("20961-540", "Rua 1", "31", "Casa A", "Cabo Frio", "RJ");
        Endereco e2 = new Endereco("36026-450", "Rua 2", "71", "Apto. 1204", "Juiz de Fora", "MG");
        Endereco e3 = new Endereco("36195-000", "Rua 3", "44", "Casa B", "Além Paraíba", "MG");

        c1.listaE.add(e1);
        c1.listaE.add(e2);
        c1.listaE.add(e3);

        c1.imprimirEndereco(c1);
    }
}

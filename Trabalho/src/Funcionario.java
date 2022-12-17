public class Funcionario extends Pessoa implements IUsuario{

    private Double salario;
    private Cargo cargoF;

    public Funcionario(String cpf, String nome, String telefone, Double salario) {
        super(cpf, nome, telefone);
        this.setSalario(getSalario());
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Cargo getCargoF() {
        return cargoF;
    }

    public void setCargoF(Cargo cargoF) {
        this.cargoF = cargoF;
    }

    @Override
    public Boolean autentc() {
        return true;
    }
}

import java.util.ArrayList;
import java.util.Collection;

public class Cliente extends Pessoa implements IUsuario{

    private Boolean vip;

    public Collection<Endereco> listaE = new ArrayList<Endereco>();
    public Collection<Conta> listaC = new ArrayList<Conta>();

    public Cliente(String cpf, String nome, String telefone) {
        super(cpf, nome, telefone);
    }

    public Boolean getVip() {
        return vip;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }
    public void imprimirEndereco(Cliente e) {

        Collection<Endereco> enderecoC = e.listaE;

        for (Endereco i : enderecoC) {

            System.out.println(e.getNome() + " mora na Cidade de " + i.getCidade() + " / Logradouro: " + i.getLogradouro() + " / Numero: " + i.getNumero() + " / Complemento: " + i.getComplemento() + " / CEP: " + i.getCep() + " / UF: " + i.getUf());

        }
    }
    @Override
    public Boolean autentc() {
        return true;
    }

}

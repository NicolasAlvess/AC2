
public class Funcionario extends FuncionarioBase {

    public Funcionario(String Nome, double salario) {

        setNome(Nome);
        setSalarioBase(salario);
    }

    @Override
    public double calcularSalario() {

        return getSalarioBase();
    }

    public String toString() {
        return ("Nome:" + this.getNome() + "Salario: R$ " + this.calcularSalario());
    }
}

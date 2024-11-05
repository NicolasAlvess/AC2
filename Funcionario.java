
public class Funcionario extends FuncionarioBase {

    //Construtor
    public Funcionario(String Nome, double salario) {

        setNome(Nome);
        setSalarioBase(salario);
    }

    //Método para calcular salario 
    @Override
    public double calcularSalario() {

        return getSalarioBase();
    }

    //Sobrecarga do metodo calcular salario 
    public double calcularSalario(double salario) {

        setSalarioBase(salario);
        return getSalarioBase();
    }

    //definindo a saida do object Funcionario com o metodo toString
    public String toString() {
        return ("Nome:" + this.getNome() + ", Salario: R$ " + this.calcularSalario());
    }
}

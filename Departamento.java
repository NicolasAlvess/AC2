
import java.util.ArrayList;

public class Departamento {

    private String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    // Construtor
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    // Métodos
    // Getter para o nome do departamento
    public String getNome() {
        return nome;
    }

    // Método para adicionar um funcionário ao departamento
    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    // Método para remover um funcionário do departamento
    public void removerFuncionario(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
    }

    // Método para obter a lista de funcionários
    public ArrayList<FuncionarioBase> getFuncionarios() {
        return funcionarios;
    }

    //método para calcular e imprimir a folha de pagamento dos funcionarios do departamento
    public void calcularEImprimirFolhaPagamento() {
        double folhaPagamento = 0;
        for (FuncionarioBase funcionario : funcionarios) {
            double salario = funcionario.getSalarioBase();
            folhaPagamento += salario;
        }
        System.out.println("A folha de pagamento total do departamento de Tecnologia é de: R$ " + folhaPagamento);
    }

}

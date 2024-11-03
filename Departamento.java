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

    // Outros métodos úteis podem ser adicionados aqui, como:
    // - calcular a média salarial do departamento
    // - encontrar o funcionário com maior salário
    // - etc...
}

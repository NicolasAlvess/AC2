
public class Main {

    public static void main(String[] args) {

        Departamento departamentoTi = new Departamento("Tecnologia");

        FuncionarioBase colaborador = new Funcionario("João", 3000);
        FuncionarioBase gerente = new Gerente("Maria", 5000);
        FuncionarioBase diretor = new Diretor("Carlos", 10000.00);

        colaborador.calcularSalario();
        gerente.calcularSalario();
        diretor.calcularSalario();

        departamentoTi.adicionarFuncionario(colaborador);
        departamentoTi.adicionarFuncionario(gerente);
        departamentoTi.adicionarFuncionario(diretor);

        System.out.println("Funcionários do departamento de Tecnologia:");
        for (FuncionarioBase funcionario : departamentoTi.getFuncionarios()) {
            System.out.println(funcionario);
        }

        departamentoTi.calcularEImprimirFolhaPagamento();

    }
}

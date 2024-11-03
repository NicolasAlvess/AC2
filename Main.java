public class Main {
    public static void main(String[] args) {
     
        Departamento departamentoTI = new Departamento ("TI");

        FuncionarioBase novoFuncionario = new Funcionario();
        
        novoFuncionario.setNome("robertinho");
        novoFuncionario.calcularSalario();

        departamentoTI.adicionarFuncionario(novoFuncionario);

       

        System.out.println("Funcionários do departamento TI:");
        for (FuncionarioBase funcionario : departamentoTI.getFuncionarios()) {
            System.out.println(funcionario);

        }
            
    }
}

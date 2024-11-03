public class Main {
    public static void main(String[] args) {
     
        Departamento departamentoTi = new Departamento ("Tecnologia");

        FuncionarioBase novoFuncionario = new Funcionario();
        
        novoFuncionario.setNome("Robertinho");
        novoFuncionario.setSalarioBase(3000);
        novoFuncionario.calcularSalario();

        departamentoTi.adicionarFuncionario(novoFuncionario);

       

        System.out.println("Funcionários do departamento de Tecnologia:");
        for (FuncionarioBase funcionario : departamentoTi.getFuncionarios()) {
            System.out.println(funcionario);

        }
            
    }
}

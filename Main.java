public class Main {
    public static void main(String[] args) {
     
        Departamento departamentoTi = new Departamento ("Tecnologia");

        FuncionarioBase novoFuncionario = new Funcionario("João", 1200);
        FuncionarioBase gerente = new Gerente("Maria", 5000);

        novoFuncionario.calcularSalario();
        gerente.calcularSalario();
        
        departamentoTi.adicionarFuncionario(novoFuncionario);
        departamentoTi.adicionarFuncionario(gerente);

     

        System.out.println("Funcionários do departamento de Tecnologia:");
        for (FuncionarioBase funcionario : departamentoTi.getFuncionarios()) {
            System.out.println(funcionario);
            
            

        }
            
    }
}

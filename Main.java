public class Main {
    public static void main(String[] args) {
        
        Departamento departamento = new Departamento("TI");

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario1.calcularSalario();
        funcionario2.calcularSalario();

    

        departamento.adicionarFuncionario(funcionario1);
        departamento.adicionarFuncionario(funcionario2);
       
        System.out.println("Funcionários do departamento " + departamento.getNome() + ":" + departamento.getFuncionarios());


        
    }
}

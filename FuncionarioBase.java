public abstract class FuncionarioBase{
    
    private String nome;
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
 //Método para calcular Salario do funcionario
    public abstract double calcularSalario();

    //get e set da variavel nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
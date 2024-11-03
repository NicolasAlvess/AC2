public class Funcionario extends FuncionarioBase{

    @Override
    public double calcularSalario() {
       return 20.00;
    }
    
    public String toString(){
        return ("Nome:"+ this.getNome() + " " + this.calcularSalario());
    }
}

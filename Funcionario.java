public class Funcionario extends FuncionarioBase{

    @Override
    
    public double calcularSalario() {

       return getSalarioBase();
    }
    
    public String toString(){
        return ("Nome:"+ this.getNome() + " R$ " + this.calcularSalario());
    }
}

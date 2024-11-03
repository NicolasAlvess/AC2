public class Diretor extends FuncionarioBase implements Beneficios{
    private double bonus;
    private double salario;

    public Diretor(String nome, double salario){
        setNome(nome);
        setSalarioBase(salario);

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double Bonus) {
        this.bonus = Bonus;
    }

 
    @Override
    public double calcularBonus(double porcentual) {
        double bonus;
       bonus = getSalarioBase() * porcentual;
        setSalarioBase(getSalarioBase() + bonus);
        this.bonus = bonus;

       return this.bonus; // fazer a logica para calcular o bonus tendo como base o salario base 
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
       setSalarioBase(getSalarioBase() + valorFixado);
       
        return valorFixado; //fazer a logica para calcular o auxilio moradia tendo como base o salrio base.
    }

    @Override
    public double calcularSalario() {
     
      this.calcularBonus(0.20);
      this.calcularAuxilioMoradia(2000);
       return this.salario; 
    }

    public String toString(){
        return ( "Nome: " + getNome() + ", Salario R$ " + getSalarioBase());

    }
    
}

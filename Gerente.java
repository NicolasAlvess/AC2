
public class Gerente extends FuncionarioBase implements Beneficios {

  //Construtor
  public Gerente(String nome, double salario) {
        setNome(nome);
        setSalarioBase(salario);
    }

    //Variaveis
    private double bonus;

     //Sobre Ecrita de metodo implementado pela interface Departamento(classe abstrata)
    @Override
    public double calcularBonus(double porcentual) {

        this.bonus = getSalarioBase() * porcentual;
        setSalarioBase(getSalarioBase() + this.bonus);

        return this.bonus; 
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 0; 
    }
     
    //Sobre Ecrita de metodo herdado pela classe FuncionarioBase
    @Override 
    public double calcularSalario() {

        this.calcularBonus(0.20);
        return getSalarioBase();
    }
     
    //sobrecarga do metodo calcular salario Gerente
    public double calcularSalario(double salario) {

      setSalarioBase(salario);
      this.calcularBonus(0.20);
      return getSalarioBase();
  }

    // Formatando a saida do Object utilizando o metodo toString
    public String toString() {
        return ("Nome: " + getNome() + ", Salario R$ " + getSalarioBase());
    }

}

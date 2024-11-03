public class Gerente extends FuncionarioBase implements Beneficios {


  public Gerente(String nome, double salario){
    setNome(nome);
    setSalarioBase(salario);
  }

  
  private double bonus;


    //sobre escrita do metodo calcularBonus herdado da classe FuncionarioBase para calcular o bonus do gerente
    @Override
    public double calcularBonus(double porcentual) {

        this.bonus = getSalarioBase() * porcentual;
        setSalarioBase(getSalarioBase() + this.bonus);
          
         return this.bonus; // fazer a logica para calcular o bonus tendo como base o salario base 
      }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
       return 20;  //fazer a logica para calcular o auxilio moradia tendo como base o salrio base.
    }
    
    @Override // classe calcular Salario herdada da classe funcionarioBase 
    public double calcularSalario() {

     this.calcularBonus(0.20); 
     return getSalarioBase();

    }
     
    // classe calcular Salario herdada da classe funcionarioBase que aceita parametro de bonus 
    

     public String toString(){
        return ( "Nome: " + getNome() + ", Salario R$ " + getSalarioBase());
    }





   

    
}

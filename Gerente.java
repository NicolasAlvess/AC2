public class Gerente extends FuncionarioBase implements Beneficios {


  public Gerente(String nome, double salario){
    setNome(nome);
    setSalarioBase(salario);
  }

  
  private double bonus;

  public double getBonus() {
    return bonus;
}

public void setBonus(double bonus) {
    this.bonus = bonus;
}
    

     
    //sobre escrita do metodo calcularBonus herdado da classe FuncionarioBase para calcular o bonus do gerente
    @Override
    public double calcularBonus(double porcentual) {

        porcentual = getSalarioBase() * 0.20;
        setSalarioBase(getSalarioBase() + porcentual);
        setBonus(porcentual);

       return getBonus();
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
       return 20;  //fazer a logica para calcular o auxilio moradia tendo como base o salrio base.
    }
    
    @Override // classe calcular Salario herdada da classe funcionarioBase 
    public double calcularSalario() { 
     return getSalarioBase() + calcularBonus(0.);
    }
     
    // classe calcular Salario herdada da classe funcionarioBase que aceita parametro de bonus 
    

     public String toString(){
        return ( "Nome: " + getNome() + ", Salario R$ " + getSalarioBase());
    }





   

    
}

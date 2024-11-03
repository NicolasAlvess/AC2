public class Gerente extends FuncionarioBase implements Beneficios {

  public Gerente(String nome, double salario){
    setNome(nome);
    setSalarioBase(salario);
  }
    @Override
    public double calcularSalario() {
       
       
        return getSalarioBase();
    }
     
    //sobre escrita do metodo calcularBonus herdado da classe FuncionarioBase para calcular o bonus do gerente
    @Override
    public double calcularBonus(double porcentual) {

        porcentual = getSalarioBase() * 0.25;
        return porcentual; // variavel temporaria "porcentual" armazenara o valor do bonus do gerente"
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 10;  //fazer a logica para calcular o auxilio moradia tendo como base o salrio base.
    }
    
}

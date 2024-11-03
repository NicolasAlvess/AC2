
public class Diretor extends FuncionarioBase implements Beneficios {

    //variaveis encapsualdas
    private double bonus;
    private double salario;
    
    //Construtor
    public Diretor(String nome, double salario) {
        setNome(nome);
        setSalarioBase(salario);

    }

     //Sobre Ecrita de metodo herdado pela classe FuncionarioBase
    @Override
    public double calcularBonus(double porcentual) {
       
        this.bonus = getSalarioBase() * porcentual;
        setSalarioBase(getSalarioBase() + this.bonus);

        return this.bonus; // fazer a logica para calcular o bonus tendo como base o salario base 
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        setSalarioBase(getSalarioBase() + valorFixado);

        return valorFixado; //fazer a logica para calcular o auxilio moradia tendo como base o salrio base.
    }

    @Override
    public double calcularSalario() {

        this.calcularBonus(0.30);
        this.calcularAuxilioMoradia(2000);
        return this.salario;
    }
     //definindo a saida do object Diretor com o metodo toString
    public String toString() {
        return ("Nome: " + getNome() + ", Salario R$ " + getSalarioBase());

    }

}

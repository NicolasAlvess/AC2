
public class Diretor extends FuncionarioBase implements Beneficios {

    //variaveis encapsualdas
    private double bonus;
    private double porcentagemBonus;

    //get e set de calcular Bonus
    public double getPorcentagemBonus() {
        return porcentagemBonus;
    }

    public void setPorcentagemBonus(double calcularBonus) {
        this.porcentagemBonus = calcularBonus;
    }

    //Construtor
    public Diretor(String nome, double salario) {

        setNome(nome);
        setSalarioBase(salario);
    }

    //sobrecarga de construtor
    public Diretor(String nome, double salario, double porcentagem) {
        setNome(nome);
        setSalarioBase(salario);
        setPorcentagemBonus(porcentagem);
    }

    //Sobre Ecrita de metodo herdado pela classe FuncionarioBase
    @Override
    public double calcularBonus(double porcentual) {

        this.bonus = getSalarioBase() * porcentual;
        setSalarioBase(getSalarioBase() + this.bonus);

        return this.bonus;
    }

    //Método para calcular auxilio Moradia 
    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        setSalarioBase(getSalarioBase() + valorFixado);

        return valorFixado; //fazer a logica para calcular o auxilio moradia tendo como base o salrio base.
    }

    //Método para calcular salario com bonus e auxilio moradia 
    @Override
    public double calcularSalario() {

        if (this.porcentagemBonus == 0) {

            this.calcularBonus(0.30);

        } else {

            this.calcularBonus(getPorcentagemBonus());
        }

        this.calcularAuxilioMoradia(2000);
        return getSalarioBase();
    }

    //definindo a saida do object Diretor com o metodo toString
    public String toString() {
        return ("Nome: " + getNome() + ", Salario R$ " + getSalarioBase());

    }

}

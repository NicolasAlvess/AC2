
public class Gerente extends FuncionarioBase implements Beneficios {

    //Variaveis
    private double bonus;
    private double porcentagemBonus;

    public double getPorcentagemBonus() {
        return porcentagemBonus;
    }

    public void setPorcentagemBonus(double porcentagemBonus) {
        this.porcentagemBonus = porcentagemBonus;
    }

    //Construtor
    public Gerente(String nome, double salario) {
        setNome(nome);
        setSalarioBase(salario);

    }

    //sobrecarga de construtor
    public Gerente(String nome, double salario, double porcentagem) {
        setNome(nome);
        setSalarioBase(salario);
        setPorcentagemBonus(porcentagem);
    }

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

        if (this.porcentagemBonus == 0) {

            this.calcularBonus(0.20);
        } else {

            this.calcularBonus(getPorcentagemBonus());
        }
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

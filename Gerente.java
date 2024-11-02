public class Gerente extends FuncionarioBase implements Beneficios {

    @Override
    public double calcularSalario() {
        return 30.00;
    }

    @Override
    public double calcularBonus(double porcentual) {
        return 10.00; // fazer a logica para calcular o bonus tendo como base o salario base 
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado) {
        return 10;  //fazer a logica para calcular o auxilio moradia tendo como base o salrio base.
    }
    
}
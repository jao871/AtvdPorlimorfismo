
public class Gerente extends Funcionario {

    private String matricula;

    public Gerente(String nome, String cpf, double salario, String matricula) {
    	super(nome, cpf, salario);
    	this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
    	this.matricula = matricula;
    }

    public double aumentarSalario() {
        return getSalario() * 0.20;
    }
}

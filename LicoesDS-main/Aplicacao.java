
public class Aplicacao {

    public static void main(String[] args) {
    	Gerente g = new Gerente("Roberth", "098.765.432-12", 5000, "G001");
    	Funcionario f = new Funcionario("João", "123.456.678-11", 4000);
    	
    	ControleDeAumento controle = new ControleDeAumento();
    	
    	controle.registrar(f);
    	controle.registrar(g);
    	
    	double salarioInicial = f.getSalario();
    	double aumento = f.aumentarSalario();
    	double salarioFinal = salarioInicial + aumento;
    	
		System.out.println("Funcionário: " + f.getNome());
		System.out.println("Salário inicial: R$ " + salarioInicial);
		System.out.println("Aumento: R$ " + aumento);
		System.out.println("Salário final: R$ " + salarioFinal);
		
		System.out.println("---------------");
		
		double salarioGerente = g.getSalario();
		double aumentoGerente = g.aumentarSalario();
		double salarioFinalGerente = salarioGerente + aumentoGerente;

		System.out.println("Gerente: " + g.getNome());
		System.out.println("Salário inicial: R$ " + salarioGerente);
		System.out.println("Aumento: R$ " + aumentoGerente);
		System.out.println("Salário final: R$ " + salarioFinalGerente);
		
		System.out.println("---------------");
		
		System.out.println("Total de Aumento: " +controle.getTotalDeAumento());
    }
}

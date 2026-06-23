import javax.swing.JOptionPane;
public class Aplicacao {

    public static void main(String[] args) {
    	ControleDeAumento controle = new ControleDeAumento();
    	String opc;
    	
    	do {
	    	opc = JOptionPane.showInputDialog(
	    			"=== Sistema de Aumento === \n\n" + 
	    			"1 - Cadastrar Gerente\n" +
	    			"2 - Cadastrar Funcionário\n" +
	    			"3 - Ver Total de Aumentos\n" +
	    			"0 - Sair\n\n" +
	    			"Digite uma opção: "
	    			);
	    	
	    	if (opc == null || opc.equals("0")) break; 
	    	
	    	switch (opc) {
	    		case "1":
	    			String nomeG = JOptionPane.showInputDialog("Digite o nome do Gerente: ");
	    			String idadeG = JOptionPane.showInputDialog("Digite a idade do Gerente: ");
	    			double salarioG = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Gerente: "));
	    			String matriculaG = JOptionPane.showInputDialog("Digite a matricula do gerente: ");
	    			
	    			Gerente g = new Gerente(nomeG, idadeG, salarioG, matriculaG);
	    			controle.registrar(g);
	    		
	    			JOptionPane.showMessageDialog(null,
	    					"Gerente cadastrado!\n" +
	    					"Salário atual:  R$ " + (g.aumentarSalario() + g.getSalario()) + "\n" +
	    					"Aumento (20%):  R$ " + g.aumentarSalario() + "\n" 
	    				);
	                break;
	                
	    		case "2":
	    			String nomeF = JOptionPane.showInputDialog("Digite o nome do Funcionario: ");
	    			String idadeF = JOptionPane.showInputDialog("Digite a idade do Funcionario: ");
	    			double salarioF = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do Funcionario: "));
	    			
	    			Funcionario f = new Funcionario(nomeF, idadeF, salarioF);
	    			controle.registrar(f);
	    			
	    			JOptionPane.showMessageDialog(null,
	    					"Funcionario Cadastrado!\n" +
	    					"Salário atual:  R$ " + (f.aumentarSalario() + f.getSalario() + "\n" +
	    					"Aumento (10%):  R$ " + f.aumentarSalario() + "\n" 
	    				);
	                break;
	    		case "3":
	    			JOptionPane.showMessageDialog(null,
	    					"Total de Aumentos: \n" +
	    					controle.getTotalDeAumento()
	    				);
	    			break;
	    			
	    		default:
	    			JOptionPane.showMessageDialog(null,
	                        "Opção inválida! Digite 1, 2, 3 ou 0.", "Erro",
	                        JOptionPane.ERROR_MESSAGE
	                 );
	    	}
	    	
	    	
    	} while(true);
    		
    	
    	
    }
}

package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Models.Funcionario;

public class FuncionaraioController implements ActionListener {

	private JTextField fName;
	private JTextField fMatricula;
	private Funcionario funcionario;
	
	public FuncionaraioController(JTextField name, JTextField matricula) {
		this.fName = name;
		this.fMatricula = matricula;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
				
		System.out.print(e.getActionCommand());
		switch(e.getActionCommand()) {
		case "Cadastrar": this.createFuncionario();
			break;
		case "Limpar": this.limparFormulario();
			break;
		case "Exibir": this.exibirFuncionario();
			break;
		default: System.out.println("NADA");
		}
		
	}
	
	public void createFuncionario () {
		
		funcionario = new Funcionario(
				this.fName.getText(),
				Integer.parseInt(fMatricula.getText())
				);
		
		System.out.print(funcionario.toString());
	}
	
	public void limparFormulario () {
		this.fName.setText("");
		this.fMatricula.setText("");
		
	}
	
	public void exibirFuncionario () {
		this.fName.setText(this.funcionario.getName());
		this.fMatricula.setText(Integer.toString(this.funcionario.getMatricula()));
	}

}

package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.FuncionaraioController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FuncionarioFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField matriculaTextField;
	
	private JButton btnCadastrar;
	private JButton btnLimpar;
	private JButton btnExibir;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FuncionarioFrame frame = new FuncionarioFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FuncionarioFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(33, 73, 61, 16);
		contentPane.add(lblNome);
		
		JLabel lblMatrcula = new JLabel("Matrícula");
		lblMatrcula.setBounds(33, 120, 61, 16);
		contentPane.add(lblMatrcula);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(135, 68, 130, 26);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		matriculaTextField = new JTextField();
		matriculaTextField.setBounds(135, 115, 130, 26);
		contentPane.add(matriculaTextField);
		matriculaTextField.setColumns(10);
		
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(274, 215, 117, 29);
		contentPane.add(btnCadastrar);
		

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(158, 215, 117, 29);
		contentPane.add(btnLimpar);
		
		btnExibir = new JButton("Exibir");
		btnExibir.setBounds(33, 215, 117, 29);
		contentPane.add(btnExibir);
		
		this.setButtonListeners();
	}
	
	private void setButtonListeners() {
		FuncionaraioController fController = new FuncionaraioController(nameTextField, matriculaTextField);

		btnCadastrar.addActionListener(fController);
		btnLimpar.addActionListener(fController);
		btnExibir.addActionListener(fController);
	}
}

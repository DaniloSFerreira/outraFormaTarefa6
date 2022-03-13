import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import Aluno.Aluno;

import Aluno.Frequencia;

public class Main {

	public static void main (String[]args) throws ParseException {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar novo aluno?");
		while (opcao == 0) {
			String nomeAluno1 = JOptionPane.showInputDialog("Insira o nome do aluno:");
			
			Aluno aluno = new Aluno();
			
			aluno.setNomeAluno(nomeAluno1);
			System.out.println(nomeAluno1);
			
			String qtdFrequencia1 = JOptionPane.showInputDialog
					("Informe a quantidade de datas a serem lançadas:");
			
			int qtdFrequenciaInt1 = Integer.valueOf(qtdFrequencia1);
			
					
			for (int i = 1; i <= qtdFrequenciaInt1; i++) {
				String dataFrequencia1 = JOptionPane.showInputDialog("Informe a data:");
				String presenca1 = JOptionPane.showInputDialog("Informe a frequência:");
							
				Date dataDate = new SimpleDateFormat("dd/MM/yyyy").parse(dataFrequencia1);
				Frequencia frequencia = new Frequencia();
				frequencia.setFrequencia(dataFrequencia1, presenca1);
								
				System.out.println(aluno.getNomeAluno()+ " " + frequencia.getDataFrequencia());
				
			}
			int opcao2 = JOptionPane.showConfirmDialog(null, "Deseja adicionar novo aluno?");
			if (opcao2 == 1) {
				break;
			}

		}		
	}
}


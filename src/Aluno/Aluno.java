package Aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	String nomeAluno;
	
	List<Frequencia> frequencia = new ArrayList<Frequencia>();

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public List<Frequencia> getFrequencia() {
		return frequencia;
	}

	@Override
	public String toString() {
		return "Aluno [nomeAluno=" + nomeAluno + ", frequencia=" + frequencia + "]";
	}
	

}

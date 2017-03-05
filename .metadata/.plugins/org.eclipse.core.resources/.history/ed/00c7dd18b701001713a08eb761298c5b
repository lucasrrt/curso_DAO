package curso_DAO.app.controllers;

import java.util.ArrayList;

import javax.swing.JPanel;

import curso_DAO.app.models.Aluno;
import curso_DAO.app.views.aluno.Index;
import curso_DAO.lib.DAO;

public class AlunoController {
	public static JPanel index(){
		ArrayList<? extends DAO> alunos = new Aluno().retrieveAll();
		return new Index((ArrayList<Aluno>) alunos);
		
	}
}

package curso_DAO.app.views.aluno;

import javax.swing.JPanel;

import curso_DAO.app.models.Aluno;

import javax.swing.JList;
import java.awt.BorderLayout;
import java.util.ArrayList;

public class Index extends JPanel {

	public ArrayList<Aluno> alunos;
	
	public Index(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
		setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		add(list);

	}

}

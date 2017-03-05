package curso_DAO.app.views.aluno;

import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import curso_DAO.app.models.Aluno;

import javax.swing.JList;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JPanel {

	public ArrayList<Aluno> alunos;
	
	public Index(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
		setLayout(new BorderLayout(0, 0));
		
		this.setVisible(true);
		
		JList list = new JList(alunos.toArray());
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setVisibleRowCount(-1);
		
		add(list);
		
		JLabel lblAlunos = new JLabel("Alunos");
		add(lblAlunos, BorderLayout.NORTH);
		
		JButton btnNovoAluno = new JButton("Novo Aluno");
		btnNovoAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnNovoAluno, BorderLayout.SOUTH);

	}

}

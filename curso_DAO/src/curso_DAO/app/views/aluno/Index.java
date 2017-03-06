package curso_DAO.app.views.aluno;

import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import curso_DAO.app.controllers.AlunoController;
import curso_DAO.app.controllers.NovoAlunoController;
import curso_DAO.app.models.Aluno;
import curso_DAO.lib.View;

import javax.swing.JList;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends View {

	
	public Index(AlunoController controller) {
		super(controller);
		this.setLayout(new BorderLayout(0, 0));
		
		this.setVisible(true);
		
		JList list = new JList(controller.getAlunos().toArray());
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setVisibleRowCount(-1);
		
		this.add(list);
		
		JLabel lblAlunos = new JLabel("Alunos");
		this.add(lblAlunos, BorderLayout.NORTH);
		
		JButton btnNovoAluno = new JButton("Novo Aluno");
		btnNovoAluno.addActionListener(controller);
		this.add(btnNovoAluno, BorderLayout.SOUTH);

	}

}

package curso_DAO.app.controllers;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import curso_DAO.app.models.Aluno;
import curso_DAO.app.views.aluno.Form;
import curso_DAO.app.views.aluno.Index;
import curso_DAO.lib.Controller;

public class NovoAlunoController extends Controller{

	public NovoAlunoController(JFrame container) {
		super(container);
		this.view = new Form(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "Cancelar":
			new AlunoController(container).render();
			break;
		case "Criar Aluno":
			break;
		}
	}

}

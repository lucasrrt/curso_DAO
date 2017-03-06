package curso_DAO.app.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import curso_DAO.app.models.Aluno;
import curso_DAO.app.views.aluno.Index;
import curso_DAO.lib.Controller;
import curso_DAO.lib.DAO;

public class AlunoController extends Controller{
	public AlunoController(JFrame container) {
		super(container);
		
		this.view = new Index(this);
		System.out.println("view:" + view);
		System.out.println("container" + container);

		// TODO Auto-generated constructor stub
	}
	public ArrayList<? extends DAO> getAlunos(){
		 return new Aluno().retrieveAll();
	}

}

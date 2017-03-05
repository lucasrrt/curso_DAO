package curso_DAO.app.models;

import curso_DAO.lib.DAO;

public class Aluno extends DAO{
	static String TABLE_NAME = "aluno";
	public Aluno(){

	}
	protected static String getTableName(){
		return "alunos";
	}

}

insert into disciplina(nome, carga) values ('disciplinaA',40);
insert into disciplina(nome, carga) values ('disciplinaB',30);
insert into disciplina(nome, carga) values ('disciplinaC',20);

insert into professor(nome) values ('professorA');
insert into professor(nome) values ('professorB');
insert into professor(nome) values ('professorC');

insert into aluno(nome, curso, professor_id) values ('alunoA', 'cursoA', 1);
insert into aluno(nome, curso, professor_id) values ('alunoB', 'cursoA', 3);
insert into aluno(nome, curso, professor_id) values ('alunoC', 'cursoB', 1);

insert into aluno_disciplina(aluno_id, disciplina_id) values (1, 1);
insert into aluno_disciplina(aluno_id, disciplina_id) values (1, 2);
insert into aluno_disciplina(aluno_id, disciplina_id) values (1, 3);
insert into aluno_disciplina(aluno_id, disciplina_id) values (2, 1);
insert into aluno_disciplina(aluno_id, disciplina_id) values (3, 1);
insert into aluno_disciplina(aluno_id, disciplina_id) values (3, 3);

create sequence disciplina_id_seq;
create table disciplina(
	id integer not null default nextval('disciplina_id_seq'),
	nome varchar(255),
	carga integer,
	constraint disciplina_pk primary key (id)
);

create sequence professor_id_seq;
create table professor(
	id integer not null default nextval('professor_id_seq'),
	nome varchar(255),
	titulacao varchar(255),
	constraint professor_pk primary key (id)
);

create sequence aluno_id_seq;
create table aluno(
	id integer not null default nextval('aluno_id_seq'),
	nome varchar(255),
	curso varchar(255),
	professor_id integer,
	constraint professor_fk foreign key (professor_id) references professor (id),
	constraint aluno_pk primary key (id)
);

create sequence aluno_disciplina_id_seq;
create table aluno_disciplina(
	id integer not null default nextval('aluno_disciplina_id_seq'),
	aluno_id integer,
	disciplina_id integer,
	constraint aluno_fk foreign key (aluno_id) references aluno (id),
	constraint professor_fk foreign key (disciplina_id) references disciplina (id),
	constraint aluno_id primary key (id)
);

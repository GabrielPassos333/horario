[localhost](http://localhost:8080/h2)
Database:horario
USER: admin
PWD: admin

INSERT INTO Prof (nome) VALUES ('Carlos Silva'), ('Ana Souza');
INSERT INTO Curso (nome) VALUES ('ADS'), ('Engenharia');
INSERT INTO Sala (nome, lugares) VALUES ('Mini 1', 120), ('Lab 4', 50);
INSERT INTO Materia (nome, id_curso, id_prof) VALUES ('Algoritmos', 1, 1);
INSERT INTO Materia (nome, id_curso, id_prof) VALUES ('Cálculo', 2, 2);
INSERT INTO Materia (nome, id_curso, id_prof) VALUES ('Cavalo', 1, 2);

select * from materia

select nome
from materia
where id_Materia = 1;
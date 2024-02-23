DROP TABLE IF EXISTS ODONTOLOGOS;
CREATE TABLE ODONTOLOGOS (id INT AUTO_INCREMENT PRIMARY KEY, num_matricula VARCHAR(100) NOT NULL, nombre VARCHAR(100) NOT NULL, apellido VARCHAR(100) NOT NULL);

-- Test

INSERT INTO ODONTOLOGOS (num_matricula, nombre, apellido) VALUES ('1234', 'Moro', 'Hernandez');
INSERT INTO ODONTOLOGOS (num_matricula, nombre, apellido) VALUES ('5678', 'Carlos', 'Barboza');
INSERT INTO ODONTOLOGOS (num_matricula, nombre, apellido) VALUES ('666', 'Fernando', 'Palmas');




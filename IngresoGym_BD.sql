DROP TABLE IF EXISTS usuario;
DROP TABLE IF EXISTS asistencia;
CREATE TABLE usuario (
	Id_usuario CHAR(10),
	nombre_usuario VARCHAR(100),
	estamento_usuario VARCHAR(30),
	dependencia VARCHAR(20),
	genero VARCHAR(20),
	Estado VARCHAR(100),
	PRIMARY KEY (Id_usuario));
	
CREATE TABLE asistencia (
	Id_usuario_asistencia CHAR(10),
	fecha_asistencia VARCHAR(100),
	FOREIGN KEY (Id_usuario_asistencia) REFERENCES usuario(Id_usuario));
	
--Registros

--usuarios

INSERT INTO usuario (Id_usuario, nombre_usuario, estamento_usuario,dependencia,genero,Estado)  
VALUES
	('201841743','Franklin Aguirre Ortiz','Estudiante','3743','Masculino','Activo'),
	('201842208','Martin Davila','Estudiante','3744','Masculino','Activo'),
	('202025462','Lina Mendez Muñoz','Estudiante','3491','Femenino','Activo');
	
--Asistencia
INSERT INTO asistencia (Id_usuario_asistencia, fecha_asistencia)  
VALUES
	('201841743','7/05/2023'),
	('201841743','5/06/2023'),
	('201841743','7/06/2023'),
	('201842208','2/04/2023'),
	('201842208','4/05/2023'),
	('201842208','7/06/2023'),
	('202025462','5/06/2023'),
	('202025462','6/05/2023');
SELECT * from Estudiantes e WHERE e.activo = "n" and e.edad >= 18 and identificacion like "1%" 

SELECT * from Estudiantes e WHERE e.activo = "s" and email LIKE "%gmail%"

SELECT e.idEstudiante, e.nombres, e.apellidos, e.activo, m.idMateria, m.nombre, m.activo FROM Estudiantes e, MateriasEstudiantes me, Materias m WHERE e.idEstudiante = me.idEstudiante AND me.idMateria = m.idMateria AND e.activo = 's' AND m.activo = 's';
use biblioteca;


SELECT titulo, editorial, año
FROM libro
where año = (SELECT MAX(año) - 1 FROM libro);


select li.titulo, li.editorial, ed.direccion, año from libro li
join editorial ed on li.editorial = ed.nombre
WHERE li.año = 
(SELECT MAX(año) - 1 FROM libro);

 select * from ejemplar;
select * from autorlibro;
select * from autor;
select * from libro;
select li.titulo, li.año, au.nombre, au.apellidos, primer_solicitante from libro li
join autorlibro al on li.id=al.libro
join autor au on al.autor=au.id
where primer_solicitante is null and año >2000;

SELECT 
    li.titulo AS titulo_libro, 
    ej.ejemplar AS numero_ejemplar, 
    al.autor AS codigo_autor
FROM libro li
JOIN autorlibro al ON al.libro = li.id
JOIN ejemplar ej ON ej.libro = li.id
WHERE ej.biblioteca = 2 
  AND li.precio > 80;
  

SELECT li.titulo, MAX(ej.biblioteca) AS biblioteca, MAX(pr.fecha_prestado) AS fecha_prestado
FROM libro li
JOIN ejemplar ej ON ej.libro = li.id
JOIN prestamo pr ON ej.libro = pr.libro
WHERE pr.fecha_devuelto IS NULL 
  AND li.precio > 50
GROUP BY li.titulo;



SELECT li.titulo, li.año, le.id
FROM libro li
JOIN prestamo pe ON pe.libro = li.id
JOIN lector le ON pe.lector = le.id
WHERE 
(li.año = (SELECT MAX(año) - 1 FROM libro) 
OR li.año = (SELECT MAX(año) FROM libro))
AND li.titulo LIKE 'El %';




SELECT 
    bi.nombre AS nombre_biblioteca, 
    bi.direccion AS direccion_biblioteca, 
    le.nombre AS nombre_lector, 
    le.apellidos AS apellidos_lector
FROM 
    biblioteca bi
JOIN 
    lector le 
ON 
    SUBSTR(bi.direccion, INSTR(bi.direccion, ', ') + 2) = SUBSTR(le.direccion, INSTR(le.direccion, ', ') + 2);

select * from libro;
select * from prestamo;

/*8*/
SELECT
le.apellidos as apellido_lector,
le.nombre as nombre_lector,
li.titulo as titulo_libro
FROM
	libro li
JOIN
	prestamo pe
ON
	pe.libro = li.id
JOIN
	lector le
ON
	le.id = pe.lector
WHERE
	primer_solicitante = le.id
ORDER BY (le.apellidos);
    

/*ejercicio custo*/
select li.titulo, li.editorial,  li.año, li.primer_solicitante, li.precio, au.nombre, au.apellidos from libro li
join autorlibro aul
on li.id = aul.libro
JOIN autor au
on aul.autor = au.id
where li.primer_solicitante is not null && precio>=20;


USE nba;
/*1. Obtener el nombre de los equipos de la NBA.*/
select nombre from equipos;
/*2. Obtener el nombre de los jugadores franceses que juegan en la NBA.*/
select nombre,procedencia from jugadores where procedencia like "France";
/*3. Obtener la altura del jugador más bajo de la NBA.*/
select nombre,altura from jugadores order by altura limit 1;
/*4. Obtener el nombre de los jugadores de los Lakers.*/
select nombre,nombre_equipo from jugadores where nombre_equipo like "Lakers";
/*5. Obtener cuántos equipos tiene cada conferencia de la NBA (se han de conseguir
dos columnas, una con el número de equipos y otra con la conferencia a la que
pertenece ese número o al revés)*/
SELECT conferencia, COUNT(nombre) AS numero_equipos
FROM equipos
GROUP BY conferencia;
/*6. Obtener cuánto pesa el jugador más pesado de toda la NBA.*/
select nombre,peso from jugadores order by peso desc limit 1 ;

/*7. Obtener cuánto mide el jugador más bajo de cada equipo NBA (se han de
conseguir dos columnas, una con el nombre del equipo y otra con la altura de
su jugador más bajo).*/
SELECT nombre_equipo,MIN(altura) as alturamin FROM jugadores group by nombre_equipo;
/*8. Obtener el peso medio de los jugadores de los Celtics.*/
SELECT nombre_equipo, AVG(peso) AS peso_medio FROM jugadores where nombre_equipo = "Celtics";
/*9. Obtener la altura media de los jugadores españoles y alemanes de la NBA (se
han de conseguir dos columnas como con otras consultas).*/
SELECT procedencia, AVG(altura) as altura_media from jugadores where procedencia = "Germany" or procedencia = "Spain" group by procedencia;
/*10. Obtener los nombres y procedencia de todos los jugadores cuya procedencia
contenga la sílaba “pa” en cualquier posición.*/
SELECT nombre, procedencia from jugadores where procedencia like "%pa%";
/*11. Obtener los nombres y procedencia de todos los jugadores cuya procedencia
contenga los caracteres “pa” en cualquier posición.*/
SELECT nombre, procedencia from jugadores where procedencia like "%p%" and procedencia like "%a%";
/*12. Obtener la media de puntos marcados por los equipos visitantes en la
temporada 02/03.*/
SELECT equipo_visitante, avg(puntos_visitante) as puntos from partidos where temporada like "02/03" group by equipo_visitante;
/*13. Obtener la media de puntos marcados por los Lakers como locales en la
temporada 00/01.*/
SELECT equipo_local, avg(puntos_local) as puntos from partidos where temporada = "00/01" and equipo_local="Lakers";
/*14. Conseguir el mayor número de asistencias que se han efectuado entre todos
los registrados.*/
select jugador, asistencias_por_partido from estadisticas order by asistencias_por_partido DESC limit 1;
/*15. Mostrar el código del jugador y la temporada en la que se obtuvo el mayor
número de asistencias por partido sabiendo el dato de la consulta anterior.*/
select jugador, temporada, asistencias_por_partido from estadisticas order by asistencias_por_partido DESC limit 1;
/*16. Obtén la media de puntos que ha recibido cada equipo en su campo en la
temporada 01/02. Debe aparecer en los resultados primero el equipo que más
puntos haya recibido en contra.*/
select equipo_local,temporada, avg(puntos_visitante) as puntos from partidos where temporada="01/02" group by equipo_local order by puntos DESC;
/*17. Obtén la media de puntos que ha anotado cada equipo en campo contrario en
la temporada 01/02. Debe aparecer en los resultados primero el equipo que más
puntos haya anotado a su favor.*/
select equipo_local,temporada, avg(puntos_local) as puntos from partidos where temporada="01/02" group by equipo_local order by puntos DESC;

/*18. Encuentra la altura del base (posición G) más alto de cada equipo.*/
select nombre_equipo, nombre, posicion, altura from jugadores where posicion = "G" order by altura DESC;
/*19. Obtén el número de puntos más alto de anotación que haya conseguido un
jugador por temporada.*/
SELECT temporada, MAX(puntos_por_partido) as puntos from estadisticas group by temporada order by temporada;
/*20. Recupera la altura del jugador más bajo de cada procedencia.*/
select procedencia , min(altura) as altura from jugadores group by procedencia;
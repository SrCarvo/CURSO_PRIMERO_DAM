use oficina;
/*1*/ select * FROM clientes;
/*2*/select * FROM oficinas;
/*3*/ select Nombre, Apellido1, Apellido2 FROM empleados;
/*4*/select FechaPago, Cantidad FROM pagos;
/*5*/ select concat (Nombre , " " , Apellido1 , " " , Apellido2)  AS nombre_completo FROM empleados;
/*6*/select Nombre, " ", PrecioVenta FROM productos;
/*7*/Select concat (Nombre , " " , Apellido1 , " " , Apellido2) as nombre_completo  from empleados where apellido1 = 'LOPEZ' or  apellido2 = 'LOPEZ';
/*8*/Select concat (Nombre , " " , Apellido1 , " " , Apellido2) as nombre_completo from empleados where nombre = "CARLOS" and apellido1 ="SORIA" and apellido2 ="JIMENEZ";
/*9*/Select concat (NombreContacto , " " , ApellidoContacto) as nombre_cliente from clientes where NombreContacto='LUIS' and ApellidoContacto !='JIMENEZ';
/*10*/Select concat (Nombre, " tiene un precio de ", PrecioVenta, "$" ) as Productos from productos where Precioventa<100;
/*11*/Select concat (Nombre, " tiene un precio de ", PrecioVenta, "$" ) as Productos from productos where Precioventa=5;
/*12*/Select concat (Nombre, " tiene un precio de ", PrecioVenta, "$" ) as Productos from productos where gama="HERRAMIENTAS" AND PrecioVenta<2.5 AND proveedor like "c%";
/*13*/Select concat (Nombre, " tiene un precio de ", PrecioVenta, "$" ) as Productos from productos where Precioventa%2=0;
/*14*/Select concat (Nombre, " ", PrecioVenta, 
CASE
	WHEN PrecioVenta < 1 THEN '. Es un producto barato.'
    WHEN PrecioVenta > 20 THEN '. Es un producto caro.'
    END )
AS Clasificacion
 FROM productos
WHERE PrecioVenta < 1 OR PrecioVenta > 20;
/*15*/Select concat (Nombre, " tiene un precio de ", PrecioVenta, "$" ) as Productos from productos where gama = "HERRAMIENTAS" OR gama ="ORNAMENTALES " OR gama ="FRUTALES";
/*16*/Select CodigoPedido from pedidos WHERE FechaPedido BETWEEN '2008-04-03' AND '2009-05-20';
/*17*/SELECT Nombre, Descripcion  FROM productos WHERE Descripcion LIKE '%VULGAR%';
/*18*/SELECT Nombre, Descripcion  FROM productos WHERE Descripcion LIKE '%VULGAR%' and PrecioVenta<2;
/*19*/Select concat (Nombre, " tiene un precio de ", PrecioVenta, "$" ) as Productos from productos where Precioventa between 1 and 4.34;
/*20*/Select concat (Nombre, " tiene un precio de ", ROUND(PrecioVenta,0), "$" ) as Productos from productos where (Precioventa)<2;
/*21*/Select concat (Nombre, " CONTIENE AL MENOS 2 LETRAS E" ) as Nombres from productos where (Nombre) LIKE "%E%""%E%";
/*22*/Select concat (Nombre, " CONTIENE 7 LETRAS" ) as Nombres from productos where LENGTH(Nombre) = 7;
/*23*/Select concat (Nombre, Apellido1, " TERMINAN POR LA LETRA A" ) as Nombres from empleados where (Nombre) LIKE "%A" AND (APELLIDO1) LIKE "%A";
/*24*/Select concat (NombreCliente, " NO TIENE LA LETRA A EN SU NOMBRE" ) as Nombres from clientes where (NombreCliente) NOT LIKE "%A%";
/*25*/Select concat (Nombre, PrecioVenta ) as Nombres from productos where (PrecioVenta) not between 3 and 4;
/*26 ya lo hice sin operadores de comparación*/
/*27*/Select FechaPago from pagos WHERE FechaPago like '%-15';
/*28*/Select concat (YEAR(FechaPago), " ", Cantidad) from pagos where Cantidad < 300;
/*29*/Select FechaPago from pagos WHERE FechaPago like '2008-08-%';
/*30*/Select FechaPago from pagos WHERE DATE_FORMAT(FechaPago, '%Y%m') = '200808';
/*31*/Select concat (Nombre , " " , Apellido1 , " " , Apellido2) as nombre_completo from empleados where CodigoJefe is null;
/*32*/Select concat (Nombre , " " , Apellido1 , " " , Apellido2) as nombre_completo from empleados where CodigoJefe is not null;
/*33*/Select concat (NOMBRECLIENTE, " " ,PAIS) as SinRegion from clientes where pais = "USA" and region is null;
/*34*/Select Ciudad from clientes where lineadireccion2 is null;
/*35*/Select NombreCliente, Region, Ciudad from clientes where Region = "Madrid";
/*36*/Select NombreCliente, Region, Ciudad from clientes where Ciudad = "Madrid";
/*37*/Select NombreCliente from clientes order by NombreCliente;
/*38*/Select NombreCliente, Region, Ciudad, Telefono from clientes where Ciudad = "Madrid" order by Telefono;
/*39*/Select NombreCliente, Region, Ciudad, Telefono, LimiteCredito from clientes where Region = "Madrid" and LimiteCredito>1000 order by Telefono;
/*40*/Select NombreCliente, CodigoPostal, LimiteCredito from clientes order by CodigoPostal, LimiteCredito desc;
/*EN CASO DE QUERER ORDENAR LOS CODIGOS POSTALES POR CANTIDAD:*/
/*40*/Select NombreCliente, CodigoPostal, LimiteCredito from clientes order by length(CodigoPostal), CodigoPostal  ASC, LimiteCredito desc;
/*41*/Select Nombre, Puesto, Extension from empleados where puesto like "representante ventas" order by Extension;
/*42*/Select CodigoOficina , LineaDireccion2 from oficinas;
/*43 el anterior ejercicio trataba de lo mismo*/
/*44*/Select Nombre, CantidadEnStock from productos where CantidadEnStock="0";
/*45*/Select Nombre, CantidadEnStock from productos where CantidadEnStock = null;
/*46*/Select Nombre, CantidadEnStock from productos order by CantidadEnStock DESC limit 10;
/*47*/Select Nombre, PrecioVenta, PrecioProveedor, (precioventa - precioproveedor) as beneficio from productos order by beneficio DESC;
/*48*/Select CodigoPedido, Estado, FechaEntrega from pedidos where FechaEntrega is null;
/*49*/Select CodigoPedido, Estado, FechaEsperada, FechaEntrega from pedidos where FechaEntrega=FechaEsperada;
/*50*/Select CodigoPedido, Estado, FechaEsperada, FechaEntrega from pedidos where FechaEntrega<FechaEsperada;
/*51*/Select CodigoPedido, Estado, FechaEsperada, FechaEntrega , datediff(FechaEntrega, FechaEsperada) AS DiasEntrega from pedidos where datediff(FechaEntrega, FechaEsperada)>=3;
/*52*/Select CodigoPedido, Estado, FechaEsperada, FechaEntrega , datediff(FechaEntrega, FechaEsperada) AS DiasEnterga FROM pedidos order by datediff(FechaEntrega, FechaEsperada) desc limit 5;
/*53*/Select CodigoPedido, Estado, FechaEsperada, FechaEntrega FROM pedidos where FechaEntrega like"2009-%-%" order by FechaEntrega limit 20 ;

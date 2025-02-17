use comercio;

select cl.nombr_client , cl.apell1  from cliente cl
join venta ve
on cl.ident_client = ve.ident_client
where cl.ident_client=3;
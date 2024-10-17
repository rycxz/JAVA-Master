select * from pelicula;
select director from pelicula
 where director like "Cosme";
 select * from pelicula
 where director like "M%";
  select * from pelicula
 where director like "Ana" OR
 director like "Eva";
 select directores from peliucla;
 select * from peliculas
 where precio > 20 AND precio <60;
 
 /*Consultadas de la tienda*/
select nombre from articulos;
select nombre,precio from articulos;
select precio from articulos 
where precio <=200;
select * from articulos 
where precio >=60 and precio <= 120;
select nombre,(precio*166.386) from articulos;
select avg(precio) from articulos;
select avg(precio) from articulos
join fabricantes on articulos.codigo = fabicantes.codigo
where fabicante.codigo = "2";
select count(*) from productos 
where precio>= 180;

select  nombre  from productos
where precio>= 180
order by nombre asc;
select  nombre  from productos
where precio>= 180
order by precio desc;


select *,fabricante.* from articulos
join fabricantes on articulos.codigo = fabicantes.codigo;

select articulos.nombre,articulos.precio,fabricantes.nombre from articulos
join fabricantes on articulos.codigo = fabicantes.codigo;

select avg(precio),fabricante.codigo as 'codigo fabiracante' from articulos
join fabricantes on articulos.codigo = fabicantes.codigo
group by fabricantes.codigo;

select avg(precio),fabricante.nombre as 'nombre fabiracante' from articulos
join fabricantes on articulos.codigo = fabicantes.codigo
group by fabricantes.codigo;



select avg(precio) as 'precio_medio',fabricante.nombre as 'nombre fabiracante' from articulos
join fabricantes on articulos.codigo = fabicantes.codigo
group by fabricantes.codigo
having precio_medio >= 15;

 
select min(precio) from articulos;

select max(precio),fabricante.nombre as 'nombre fabiracante' from articulos
join fabricantes on articulos.codigo = fabicantes.codigo
group by fabricantes.codigo;

INSERT INTO articulo (codigo, nombre, precio,fabricante) 
    VALUES (last_insert_id()+1,'Altavoces', '70',"2") ;
 
UPDATE  articulo   
    SET nombe  = "Impresora laser"
    where id = 8;
    
    delimiter |
create  procedure aplicarDescuento()
begin
declare exit handler for sqlexception
begin
rollback ;
end ;
start transaction;
 
	UPDATE  articulo   
    SET precio = precio -(precio *0,10);
    
    commit;
end;
|
delimiter ;
drop procedure aplicarDescuento;
call aplicarDescuento();
select * from articulo;


/*comprobamos */
    select * from articulo;
    delimiter |
create  procedure aplicarDescuentoDiezEsuros()
begin
declare exit handler for sqlexception
begin
rollback ;
end ;
start transaction;
 if(articulo.precio >=120) then 
	UPDATE  articulo   
    SET precio = precio -10;
    end if;
    commit;
end;
|
delimiter ;
drop procedure aplicarDescuentoDiezEsuros;
call aplicarDescuentoDiezEsuros();
/*comprobamos */
select * from articulo;
    
 
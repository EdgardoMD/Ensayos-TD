insert into categoria(categoria_id, nombre) values (1,'Electrónica');
insert into categoria(categoria_id, nombre) values (2,'Dormitorio');
insert into categoria(categoria_id, nombre) values (3,'Tecno');

insert into producto(producto_id, nombre, valor, categoria_id) values (1,'Ventilador sobremesa',19990,1);
insert into producto(producto_id, nombre, valor, categoria_id) values (2,'Horno eléctrico',25480,1);
insert into producto(producto_id, nombre, valor, categoria_id) values (3,'Tostadora',10990,1);
insert into producto(producto_id, nombre, valor, categoria_id) values (4,'Cama 1 plaza',99990,2);
insert into producto(producto_id, nombre, valor, categoria_id) values (5,'Juego de sábanas',12790,2);
insert into producto(producto_id, nombre, valor, categoria_id) values (6,'Almohada',5470,2);
insert into producto(producto_id, nombre, valor, categoria_id) values (7,'Televisor',150000,3);
insert into producto(producto_id, nombre, valor, categoria_id) values (8,'Consola multiuso',200000,3);
insert into producto(producto_id, nombre, valor, categoria_id) values (9,'Cámara reflex',50000,3);

insert into factura(factura_id, cliente, fecha) values (1,'Diego Abarca','04-08-2020');
insert into factura(factura_id, cliente, fecha) values (2,'Estefania Berrios','01-08-2020');
insert into factura(factura_id, cliente, fecha) values (3,'Francisca Cordero','30-07-2020');
insert into factura(factura_id, cliente, fecha) values (4,'Gastón Durán','10-08-2020');

insert into detalle_factura(factura_id, producto_id, cantidad) values (1,5,2);
insert into detalle_factura(factura_id, producto_id, cantidad) values (1,4,1);
insert into detalle_factura(factura_id, producto_id, cantidad) values (1,1,3);
insert into detalle_factura(factura_id, producto_id, cantidad) values (2,9,3);
insert into detalle_factura(factura_id, producto_id, cantidad) values (2,1,2);
insert into detalle_factura(factura_id, producto_id, cantidad) values (3,2,1);
insert into detalle_factura(factura_id, producto_id, cantidad) values (3,4,1);
insert into detalle_factura(factura_id, producto_id, cantidad) values (3,7,2);
insert into detalle_factura(factura_id, producto_id, cantidad) values (3,6,3);
insert into detalle_factura(factura_id, producto_id, cantidad) values (4,3,1);
-- crear nuestra base de datos
create database bd_sistema_facturacion;
-- usamos la base de datos
use bd_sistema_facturacion;

-- crear tabla usuarios
create table tb_usuario(
idUsuario int (11) auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
usuario varchar(15) not null,
password varchar(15) not null,
telefono varchar(15) not null,
estado int(1) not null
);

insert into tb_usuario(nombre, apellido, usuario, password, telefono, estado)
values("Carlos", "Saint-Hilaire", "carlos", "12345","8291230000",1);

select * from tb_usuario;

select usuario, password from tb_usuario where usuario = "carlos" and password = "12345";

-- crear tabla cliente
create table tb_cliente(
idCliente int (11) auto_increment primary key,
nombre varchar(30) not null,
apellido varchar(30) not null,
cedula varchar(15) not null,
telefono varchar(15) not null,
direccion varchar(100) not null,
estado int(1) not null
);
select * from tb_cliente;

-- crear tabla categoria
create table tb_categoria(
idCategoria int (11) auto_increment primary key,
descripcion varchar(200) not null,
estado int(1) not null
);

select * from tb_categoria;
select descripcion from tb_categoria where descripcion = '';
truncate table tb_categoria;

-- crear tabla producto
create table tb_producto(
idProducto int (11) auto_increment primary key,
nombre varchar(100) not null,
cantidad int(11) not null,
precio double(10,2) not null,
descripcion varchar(200) not null,
porcentajeItbis int(2) not null,
idCategoria int(11) not null,
estado int(1) not null
);
    
select * from tb_producto;

select p.idProducto, p.nombre, p.cantidad, p.precio, p.descripcion, p.porcentajeItbis, c.descripcion, p.estado
from tb_producto As p, tb_categoria As c
where p.idCategoria = c.idCategoria;

-- crear tabla cabecera de venta
create table tb_cabecera_venta(
idCabeceraVenta int (11) auto_increment primary key,
idCliente int(11) not null,
valorPagar double(10,2) not null,
fechaVenta date not null,
estado int(1) not null
);

-- crear tabla detalle de venta
create table tb_detalle_venta(
idDetalleVenta int (11) auto_increment primary key,
idCabeceraVenta int (11) not null,
idProducto int (11) not null,
cantidad int(11) not null,
precioUnitario double(10,2) not null,
subtotal double(10,2) not null,
descuento double(10,2) not null,
itbis double(10,2) not null,
totalPagar double(10,2) not null,
estado int(1) not null
);

select * from tb_cabecera_venta;
select * from tb_detalle_venta;
-- mostrar todas las tablas de mi base de datos
show tables;
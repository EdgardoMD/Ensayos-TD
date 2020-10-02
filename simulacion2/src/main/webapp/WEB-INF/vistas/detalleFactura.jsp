<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detalle factura</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<h3 class="text-center">Detalle Factura N° ${factura.facturaId}</h3>
<div class="card bg-light mb-3">
  <div class="card-header">
  <h6>Fecha Emisión:  ${factura.fecha}
		</h6>
		<h6>Nombre Cliente: <strong>${factura.nombreCliente}</strong></h6>
  </div>
  <div class="card-body">
    
			<table class="table table-striped">
			<thead>
			<tr>
			<th scope="col">Nombre Producto</th>
			<th scope="col">Cantidad</th>
			<th scope="col">Valor Unitario</th>
			</tr>
			</thead>
			
			<tbody>
			<c:forEach items="${factura.detallesFactura}" var="df">
			<tr>
			<th scope="row">${df.producto.nombre}</th>
			<th scope="row">${df.cantidad}</th>
			<th scope="row">${df.producto.valor}</th>
			</tr>
			</c:forEach>
			</tbody>
			</table>
			
  </div>
  
  <div class="card-footer bg-transparent border-success">
  <table>

  <tbody>
  <tr>
  <th class="table-active">Subtotal: ${factura.subtotal}</th>
  </tr>
  <tr>
  <th class="table-active">Impuesto: ${factura.impuesto}</th>
  </tr>
  <tr>
  <th class="table-active">Total Factura: ${factura.total}</th>
  </tr>
  </tbody>
  </table>
  </div>

			
			
			
			
			
</body>
</html>
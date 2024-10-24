<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Vamos a recoger la informacion para la creacion de los productos</h1>
<form action="CrearProducto.java" method="post">

        <label for="ID">ID del Producto:</label>
        <input type="number" id="ID" name="ID" required><br><br>

        <label for="tipo">tipo:</label>
        <input type="text" id="tipo" name="tipo" required><br><br>

        <label for="nombre">Nombre del Producto:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>

        
        <label for="precio">Precio (€):</label>
        <input type="number" step="0.01" id="precio" name="precio" required><br><br>

        <label for="imagen">URL de la Imagen:</label>
        <input type="text" id="imagen" name="imagen"><br><br>

        <label for="stock">En Stock:</label>
        <input type="checkbox" id="stock" name="stock"><br><br>

        <button type="submit">Crear Producto</button>

</form>
</body>
</html>
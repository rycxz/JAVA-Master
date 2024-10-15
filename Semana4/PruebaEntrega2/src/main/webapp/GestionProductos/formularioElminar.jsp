<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Vamos a recoger la informacion para eleminar.</h1>
<form action="EliminarProductos.java" method="post">

        <label for="ID">ID del Producto:</label>
        <input type="number" id="ID" name="ID" required><br><br>

        <button type="submit">Crear Producto</button>

</form>
</body>
</html>
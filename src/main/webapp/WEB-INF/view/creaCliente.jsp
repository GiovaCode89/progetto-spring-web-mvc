
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
</head>
<body>

	<h1>Nuovo cliente</h1>


	<!-- form con gli elementi di 'taglib'-->


	<!---action = indica il nome del metodo del controller dove verrà mandato il model
		 model = nome del modello  -->

	<form:form method="POST" action="justCreate" modelAttribute="datiCliente">
		<div>
			<form:label path="nome">nome</form:label>
			<form:input path="nome"/>
		</div>
		<div>
			<form:label path="cognome">cognome</form:label>
			<form:input path="cognome"/>
		</div>
		<div>
			<form:label path="numTelefono">numero di telefono</form:label>
			<form:input path="numTelefono"/>
		</div>
		<div>
			<form:label path="email">email</form:label>
			<form:input path="email"/>
		</div>
		<div>
			<input type="submit" name="registrati"/>
		</div>
	</form:form>
</body>
</html>
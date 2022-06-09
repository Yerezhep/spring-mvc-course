<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h2>Hello Emplayee, Please enter your name!</h2>
    <form:form action="showDetails" modelAttribute="emplayee">
        Name <form:input path="name"/>
        <form:errors path="name"/>
        <br><br>
        Surname <form:input path="surname"/>
        <form:errors path="surname"/>
        <br><br>
        Age <form:input path="age"/>
        <form:errors path="age"/>
        <br><br>
        Phone number <form:input path="phoneNumber"/>
        <form:errors path="phoneNumber"/>
        <br><br>
        email <form:input path="email"/>
        <form:errors path="email"/>
        <br><br>
        Department
        <form:select path="department">
            <form:options items="${emplayee.departments}"/>
        </form:select> <br><br>
        <form:radiobuttons path="car" items="${emplayee.cars}"/> <br><br>
        <form:checkboxes path="language" items="${ emplayee.languages }"/> <br><br>
    <button>Send</button>
</form:form>
</body>
</html>
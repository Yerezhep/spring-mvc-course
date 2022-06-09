<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <h2>Dear Emplayee , your are welcome</h2>
    <br>
    <br>
    <p>
        Your name : ${emplayee.name} <br>
        Your surname : ${emplayee.surname} <br>
        Your age : ${emplayee.age} <br>
        Your department : ${emplayee.department} <br>
        Your car : ${emplayee.car} <br>
        Your phone number : ${ emplayee.phoneNumber } <br>
        Your  email : ${ emplayee.email } <br>

        Your language(s) :
        <ul>
            <c:forEach var="lang" items="${ emplayee.language }">
                <li>${ lang }</li>
            </c:forEach>
        </ul>





    </p>

</body>
</html>
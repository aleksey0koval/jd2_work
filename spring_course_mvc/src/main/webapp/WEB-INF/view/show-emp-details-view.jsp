<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">

<body>
<h1>Dear Employee, you are WELCOME!!!</h1>
<hr>

<h3>Your name: ${employee.name}</h3>
<hr>
<h3>Your surname: ${employee.surname}</h3>
<hr>
<h3>Your name: ${employee.salary}</h3>
<hr>
<h3>Your department: ${employee.department}</h3>
<hr>
<h3>Your car: ${employee.carBrand}</h3>
<hr>
<h3>Language(s):
    <ul>
        <c:forEach var="lang" items="${employee.languages}">
            <li>${lang}</li>
        </c:forEach>
    </ul>
</h3>
<hr>
<h3>Phone number: ${employee.phoneNumber}</h3>
<hr>
<h3>Email: ${employee.email}</h3>
</body>
</html>
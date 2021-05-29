<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="en">

<body>

<h1>Information for all employees</h1>
<br><br>
<security:authorize access="hasRole('HR')">
    <input type="button" value="Salary"
           onclick="window.location.href = 'hr_info'">
    Only for HR staff
    <br><br>
</security:authorize>



<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="Performance"
           onclick="window.location.href = 'manager_info'">
    Only for Managers
</security:authorize>


</body>
</html>

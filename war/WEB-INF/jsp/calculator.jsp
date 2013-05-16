<%@ include file="/WEB-INF/jsp/include.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Syed Shah</title>
</head>
<body>
<h2>Calculator</h2>
<form:form method="post" action="addNumbers.html">
 
    <table>
    <tr>
        <td><form:label path="a">First Number</form:label></td>
        <td><form:input path="a" /></td>
    </tr>
    <tr>
        <td><form:label path="b">Second Number</form:label></td>
        <td><form:input path="b" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Add Numbers"/>
        </td>
    </tr>
</table> 
     
</form:form>

<form:form method="post" action="subtractNumbers.html">
 
    <table>
    <tr>
        <td><form:label path="a">First Number</form:label></td>
        <td><form:input type="integer" path="a" /></td>
    </tr>
    <tr>
        <td><form:label path="b">Second Number</form:label></td>
        <td><form:input type="integer" path="b" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Subtract Numbers"/>
        </td>
    </tr>
</table> 
     
</form:form>
</body>
</html>
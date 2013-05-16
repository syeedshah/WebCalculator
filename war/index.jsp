<%@ include file="/WEB-INF/jsp/include.jsp" %>

<%-- Redirected because we can't set the welcome page to a virtual URL. --%>
<%--  

<html>
<head>
    <title>Spring 3.0 MVC Series: Index - ViralPatel.net</title>
</head>
<body>
    <a href="calculator.html">Click Me Please</a>
</body>
</html>

--%>
<c:redirect url="/calculator.html"/>
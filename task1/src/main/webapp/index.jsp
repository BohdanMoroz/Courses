<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Task 1</title>
    </head>
    <body>
        <h2>Hello World!</h2>
        <c:forEach var="offer" items="${requestScope.offerList}">
            <ul>
                <li><c:out value="${offer.days()}"/></li>
            </ul>
        </c:forEach>
    </body>
</html>

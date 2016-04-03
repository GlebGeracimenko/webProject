<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>
    <h2>Result: </h2>

    <table>
        <tr>
            <td>List result: </td>
            <td>
                <c:forEach var="list" items="${allItems}">
                    ${allItems} <br/>
                </c:forEach>
            </td>
        </tr>
    </table>
</body>
</html>

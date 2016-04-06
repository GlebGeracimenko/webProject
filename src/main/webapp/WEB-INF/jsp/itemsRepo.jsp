<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title></title>
</head>
<body>
<h2>All items</h2>
<form:form method="POST" commandName="itemsRepoList">
  <table>

      <td><form:label path="differentList">All items: </form:label></td>
      <td>
          <c:forEach var="list" items="${allItems}">
              <form:checkbox path="differentList" value="${list}" label="${list.name}" /> <br/>
          </c:forEach>
      </td>

    <tr>
      <td colspan="2"><input type="submit" value="Submit"></td>
    </tr>
  </table>
</form:form>
</body>
</html>

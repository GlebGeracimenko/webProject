<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title></title>
</head>
<body>
<h1>All items</h1>
<form:form method="post" commandName="allItems">
  <table>
    <tr>
      <td><form:label path="items">All items: </form:label></td>
      <td><form:checkboxes path="items" items="${allItems}"/></td>
    </tr>

    <tr>
      <td colspan="2"><input type="submit" value="Submit"></td>
    </tr>
  </table>
</form:form>
</body>
</html>

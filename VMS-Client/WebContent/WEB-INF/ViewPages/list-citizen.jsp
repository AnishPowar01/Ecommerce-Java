<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Data</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>User Data</h2>
    <table>
        <thead>
            <tr>
                <th>User ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Phone Number</th>
                <th>Address</th>
                <th>Date of Birth</th>
                <th>Status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="user" items="${citizenData}">
                <tr>
                    <td><c:out value="${user.userId}"/></td>
                    <td><c:out value="${user.name}"/></td>
                    <td><c:out value="${user.email}"/></td>
                    <td><c:out value="${user.phoneNumber}"/></td>
                    <td><c:out value="${user.address}"/></td>
                    <td><c:out value="${user.dateOfBirth}"/></td>
                    <td><c:out value="${user.status}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
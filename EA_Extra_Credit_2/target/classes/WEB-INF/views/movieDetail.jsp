<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a Movie</title>
    </head>
    <body>
        <form:form commandName="movie" action="../movies/${movie.id}" method="post">
            <form:errors path="*" cssClass="errorblock" element="div" />

            <table>
                <tr>
                    <td>Title:</td>
                    <td><form:input type="text" path="title" value="${movie.title}"/> </td>
                    <td><form:errors path="title" cssClass="error" /> </td>

                </tr>
                <tr>
                    <td>Description:</td>
                    <td><form:input type="text" path="description" value="${movie.description}"/> </td>
                    <td><form:errors path="description" cssClass="error" /> </td>

                </tr>
            </table>
            <input type="submit" value="update"/>
        </form:form>
        <form action="delete?movieId=${movie.id}" method="post">
            <button type="submit">Delete</button>
        </form>
    </body>
</html>
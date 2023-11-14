<%--
  Created by IntelliJ IDEA.
  User: waemc
  Date: 10/31/2023
  Time: 7:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Liquid Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Convert Liquid</h1>
            <p class="lead">Select from list, and enter the liquid amount.
                <br />Press enter to see the result.</p>
            <form method="POST" action="convert-liquids-caspian">
                <select name="liquidType" class="form-select" aria-label="Select a Liquid Type">
                    <option>Select a liquid measurement</option>
                    <option ${results.conversion=='Gallon' ? 'selected' : ''} value="Gallon">Gallon</option>
                    <option ${results.conversion=='Cup' ? 'selected' : ''} value="Cup">Cup</option>
                    <option ${results.conversion=='Ounce' ? 'selected' : ''} value="Ounce">Ounce</option>
                </select>

                <div class="form-group mb-2">
                    <label for="liquid">Liquid Amount:</label>
                    <input value="${results.liquid}" type="text" class="form-control" id="liquid" name="liquid">
                </div>

                <button type="submit" class="btn btn-primary">Convert the liquid!</button>
            </form>


            <c:if test="${results.liquidConverted != ''}">
                <p><c:out value="${results.liquidConverted}"/></p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p><c:out value="${results.conversionError}"/></p>
            </c:if>
            <c:if test="${results.liquidError != ''}">
                <p><c:out value="${results.liquidError}"/></p>
            </c:if>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 10/31/2023
  Time: 12:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sagan's Imperial Unit Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>

<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Sagan's Imperial Unit Converter</h1>
            <p class="lead">Please select a unit type and enter a number to convert it to another type.</p>
            <form method="POST" action="sagan-converter">
                <select name="inputUnit" class="form-select" aria-label="Select an input unit type.">
                    <option>Select an input unit.</option>
                    <option ${results.inputUnit == 'Meter' ? 'selected' : ''} value="Meter">Meters</option>
                    <option ${results.inputUnit == 'Mile' ? 'selected' : ''} value="Mile">Miles</option>
                    <option ${results.inputUnit == 'Kilometer' ? 'selected' : ''} value="Kilometer">Kilometers</option>
                </select>
                <div class="form-group mb-2">
                    <label for="inputNum">Number of units:</label>
                    <input name="inputNum" value="${results.get("inputNum")}" type="text" class="form-control" id="inputNum">
                </div>
                <br>
                <select name="outputUnit" class="form-select" aria-label="Select an output unit type.">
                    <option>Select an output unit.</option>
                    <option ${results.outputUnit == 'Meter' ? 'selected' : ''} value="Meter">Meters</option>
                    <option ${results.outputUnit == 'Mile' ? 'selected' : ''} value="Mile">Miles</option>
                    <option ${results.outputUnit == 'Kilometer' ? 'selected' : ''} value="Kilometer">Kilometers</option>
                </select>
                <br>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <c:if test="${results.containsKey('outputNum')}">
                <p>${results.get("outputNum")}</p>
            </c:if>
            <c:if test="${results.containsKey('error')}">
                <p>${results.get("error")}</p>
            </c:if>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>

</body>
</html>

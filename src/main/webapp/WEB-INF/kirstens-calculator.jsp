<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Measurement Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Convert Measurement</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the measurement.
                <br />Press enter to see the result.</p>
            <form method="POST" action="kirstens-calculator">
                <select name="conversion" class="form-select" aria-label="Select a conversion">
                    <option>Select a conversion</option>
                    <option ${results.conversion == 'Inches2Feet' ? 'selected' : ''} value="inches2feet">Inches to Feet</option>
                    <option ${results.conversion == 'Inches2Yards' ? 'selected' : ''} value="inches2yards">Inches to Yards</option>
                    <option ${results.conversion == 'Feet2Inches' ? 'selected' : ''} value="feet2inches">Feet to Inches</option>
                    <option ${results.conversion == 'Feet2Yards' ? 'selected' : ''} value="feet2yards">Feet to Yards</option>
                    <option ${results.conversion == 'Yards2Inches' ? 'selected' : ''} value="yards2inches">Yards to Inches</option>
                    <option ${results.conversion == 'Yards2Feet' ? 'selected' : ''} value="yards2feet">Yards to Feet</option>
                </select>

                <div class="form-group mb-2">
                    <label for="measurement">Measurement:</label>
                    <input value="<c:out value="${results.measurement}"/>" type="text" class="form-control" id="measurement" name="measurement">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <c:if test="${results.tempConverted != ''}">
                <p><c:out value="${results.measurementConverted}"/></p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p><c:out value="${results.conversionError}"/></p>
            </c:if>
            <c:if test="${results.temperatureError != ''}">
                <p><c:out value="${results.measurementError}"/></p>
            </c:if>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>
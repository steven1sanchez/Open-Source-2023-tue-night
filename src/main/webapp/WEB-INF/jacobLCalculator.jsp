<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JacobL Seconds Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="row">
    <div class="col-6">
        <h1>Convert Seconds</h1>
        <p class="lead">Enter in the amount of seconds and then select what you would like to convert them to:</p>
        <form method="POST" action="jlCalc">
            <select name="secConvert" class="form-select" aria-label="Select a Conversion">
                <option>Select Conversion</option>
                <option ${results.secConvert == 'min' ? 'selected' : ''} value="min">Minutes</option>
                <option ${results.secConvert == 'hour' ? 'selected' : ''} value="hour">Hours</option>
                <option ${results.secConvert == 'day' ? 'selected' : ''} value="day">Days</option>
            </select>

            <label for="seconds">Seconds:</label>
            <input value="<c:out value="${results.seconds}" />" type="text" class="form-control"
                   id="seconds" name="seconds">

            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <c:if test="${results.secConverted != ''}">
            <p><c:out value="${results.secConverted}"/></p>
        </c:if>
        <c:if test="${results.secondsError != ''}">
            <p><c:out value="${results.secondsError}"/></p>
        </c:if>
        <c:if test="${results.conversionError != ''}">
            <p><c:out value="${results.conversionError}"/></p>
        </c:if>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>

<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    Map<String, String> results = (Map<String, String>) request.getAttribute("results");
    if(results == null) {
        results = new HashMap<>();
    }
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Distance Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Convert Distances</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the initial distance.
                <br />Press enter to see the result.</p>
            <form method="post" action="nathan-calculator">
                <div class="btn-group mb-2" role="group" aria-label="Basic radio toggle button group">
                    <input type="radio" class="btn-check" name="conversionFrom" id="fromMm" autocomplete="off" value="fromMm" <c:out value="${results.conversionFrom =='fromMm' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromMm">Millimeters</label>

                    <input type="radio" class="btn-check" name="conversionFrom" id="fromCm" autocomplete="off" value="fromCm" <c:out value="${results.conversionFrom=='fromCm' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromCm">Centimeters</label>

                    <input type="radio" class="btn-check" name="conversionFrom" id="fromIn" autocomplete="off" value="fromIn" <c:out value="${results.conversionFrom=='fromIn' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromIn">Inches</label>

                    <input type="radio" class="btn-check" name="conversionFrom" id="fromFt" autocomplete="off" value="fromFt" <c:out value="${results.conversionFrom=='fromFt' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromFt">Feet</label>

                    <input type="radio" class="btn-check" name="conversionFrom" id="fromYd" autocomplete="off" value="fromYd" <c:out value="${results.conversionFrom=='fromYd' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromYd">Yards</label>

                    <input type="radio" class="btn-check" name="conversionFrom" id="fromM" autocomplete="off" value="fromM" <c:out value="${results.conversionFrom=='fromM' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromM">Meters</label>

                    <input type="radio" class="btn-check" name="conversionFrom" id="fromKm" autocomplete="off" value="fromKm" <c:out value="${results.conversionFrom=='fromKm' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromKm">Kilometers</label>

                    <input type="radio" class="btn-check" name="conversionFrom" id="fromMi" autocomplete="off" value="fromMi" <c:out value="${results.conversionFrom=='fromMi' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="fromMi">Miles</label>
                </div> <!-- end button group -->


                <div class="btn-group mb-2" role="group" aria-label="Basic radio toggle button group">
                    <input type="radio" class="btn-check" name="conversionTo" id="toMm" autocomplete="off" value="toMm" <c:out value="${results.conversionTo =='toMm' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toMm">Millimeters</label>

                    <input type="radio" class="btn-check" name="conversionTo" id="toCm" autocomplete="off" value="toCm" <c:out value="${results.conversionTo=='toCm' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toCm">Centimeters</label>

                    <input type="radio" class="btn-check" name="conversionTo" id="toIn" autocomplete="off" value="toIn" <c:out value="${results.conversionTo=='toIn' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toIn">Inches</label>

                    <input type="radio" class="btn-check" name="conversionTo" id="toFt" autocomplete="off" value="toFt" <c:out value="${results.conversionTo=='toFt' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toFt">Feet</label>

                    <input type="radio" class="btn-check" name="conversionTo" id="toYd" autocomplete="off" value="toYd" <c:out value="${results.conversionTo=='toYd' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toYd">Yards</label>

                    <input type="radio" class="btn-check" name="conversionTo" id="toM" autocomplete="off" value="toM" <c:out value="${results.conversionTo=='toM' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toM">Meters</label>

                    <input type="radio" class="btn-check" name="conversionTo" id="toKm" autocomplete="off" value="toKm" <c:out value="${results.conversionTo=='toKm' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toKm">Kilometers</label>

                    <input type="radio" class="btn-check" name="conversionTo" id="toMi" autocomplete="off" value="toMi" <c:out value="${results.conversionTo=='toMi' ? 'checked' : ''}" />>
                    <label class="btn btn-outline-primary" for="toMi">Miles</label>
                </div> <!-- end button group -->

                <div class="form-group mb-2">
                    <label for="initialDistance">Initial Distance:</label>
                    <input type="text" class="form-control" id="initialDistance" name="initialDistance" value="<c:out value='${results.initialDistance}' />">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <c:if test="${results.distanceConverted != ''}">
                <p><c:out value="${results.distanceConverted}" /></p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p><c:out value="${results.conversionError}" /></p>
            </c:if>
            <c:if test="${results.invalidNumber != ''}">
                <p><c:out value="${results.invalidNumber}" /></p>
            </c:if>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>
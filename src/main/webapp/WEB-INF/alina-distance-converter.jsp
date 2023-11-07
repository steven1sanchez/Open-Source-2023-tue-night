<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <h1>Convert Distance</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the distance.
                <br/>Press enter to see the result.</p>
            <form method="POST" action="alina-convert-distance">

                <div class="form-group mb-3 d-flex align-items-center">
                    <label for="conversionFrom" class="me-2">From: </label>
                    <select name="conversionFrom" id="conversionFrom" class="form-select" aria-label="Default select example">
                        <option value="none">--- Please choose an option ---</option>
                        <option <c:out value="${results.conversionFrom=='m' ? 'selected' : ''}"/> value="m">meter</option>
                        <option <c:out value="${results.conversionFrom=='mi' ? 'selected' : ''}"/> value="mi">mile</option>
                        <option <c:out value="${results.conversionFrom=='km' ? 'selected' : ''}"/> value="km">kilometer</option>
                    </select>
                </div>

                <div class="form-group mb-3 d-flex align-items-center">
                    <label for="conversionTo" class="me-2">To: </label>
                    <select name="conversionTo" id="conversionTo" class="form-select" aria-label="Default select example">
                        <option value="none">--- Please choose an option ---</option>
                        <option <c:out value="${results.conversionTo=='m' ? 'selected' : ''}"/> value="m">meter</option>
                        <option <c:out value="${results.conversionTo=='mi' ? 'selected' : ''}"/> value="mi">mile</option>
                        <option <c:out value="${results.conversionTo=='km' ? 'selected' : ''}"/> value="km">kilometer</option>
                    </select>
                </div>

                <div class="form-group mb-3">
                    <label for="distance">Distance:</label>
                    <input type="text" value="<c:out value="${results.distance}"/>" class="form-control" id="distance" name="distance">
                </div>

                <button type="submit" class="btn btn-primary mb-3">Submit</button>

            </form>
            <c:if test="${results.distanceConverted != ''}">
                <p><c:out value="${results.distanceConverted}"/></p>
            </c:if>
            <c:if test="${results.conversionError != 'none'}">
                <p><c:out value="${results.conversionError}"/></p>
            </c:if>
            <c:if test="${results.distanceError != ''}">
                <p><c:out value="${results.distanceError}"/></p>
            </c:if>


        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>

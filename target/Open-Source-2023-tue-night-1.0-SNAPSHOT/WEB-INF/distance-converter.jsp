<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
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
        <br />Press enter to see the result.</p>
      <form method="POST" action="convert-distance">
        <select name="conversion" class="form-select" aria-label="Select which measurements you wish to convert">
          <option>Select which measurements you wish to convert</option>
          <option ${results.conversion == 'm-km' ? 'selected' : ''} value="m-km">Meters to Kilometers</option>
          <option ${results.conversion == 'm-mi' ? 'selected' : ''} value="m-mi">Meters to Miles</option>
          <option ${results.conversion == 'km-m' ? 'selected' : ''} value="km-m">Kilometers to Meters</option>
          <option ${results.conversion == 'km-mi' ? 'selected' : ''} value="km-mi">Kilometers to Miles</option>
          <option ${results.conversion == 'mi-m' ? 'selected' : ''} value="mi-m">Miles to Meters</option>
          <option ${results.conversion == 'mi-km' ? 'selected' : ''} value="mi-km">Miles to Kilometers</option>
        </select>

        <div class="form-group mb-2">
          <label for="distance">Distance:</label>
          <input value="<c:out value="${results.distance}" />" type="text" class="form-control" id="distance" name="distance">
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
      </form>


      <c:if test="${results.distanceConverted != ''}">
        <p><c:out value="${results.distanceConverted}"/></p>
      </c:if>
      <c:if test="${results.conversionError != ''}">
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

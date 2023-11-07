<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Baylee's Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>Baylee's Calculator</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the amount.
                <br />Press enter to see the result.</p>
            <form method="POST" action="baylee-calculator">
                <select name="conversionType" class="form-select" aria-label="Select a conversion type">
                    <option>Select a conversion type</option>
                    <option ${results.conversionType == 'InToFt' ? 'selected' : ''} value="InToFt">Inches to Feet</option>
                    <option ${results.conversionType == 'InToYd' ? 'selected' : ''} value="InToYd">Inches to Yards</option>
                    <option ${results.conversionType == 'FtToYd' ? 'selected' : ''} value="FtToYd">Feet to Yards</option>
                    <option ${results.conversionType == 'FtToIn' ? 'selected' : ''} value="FtToIn">Feet to Inches</option>
                    <option ${results.conversionType == 'YdToIn' ? 'selected' : ''} value="YdToIn">Yards to Inches</option>
                    <option ${results.conversionType == 'YdToFt' ? 'selected' : ''} value="YdToFt">Yards to Feet</option>
                </select><!-- end button group -->


                <div class="form-group mb-2">
                    <label for="amount">Amount:</label>
                    <input type="text" class="form-control" id="amount" name="amount">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            <c:if test="${results.convertedAmount != ''}">
                <p><c:out value="${results.convertedAmount}" /></p>
            </c:if>
            <c:if test="${results.conversionError != ''}">
                <p><c:out value="${results.conversionError}"/></p>
            </c:if>
            <c:if test="${results.amountError != ''}">
                <p><c:out value="${results.amountError}"/></p>
            </c:if>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
</body>
</html>

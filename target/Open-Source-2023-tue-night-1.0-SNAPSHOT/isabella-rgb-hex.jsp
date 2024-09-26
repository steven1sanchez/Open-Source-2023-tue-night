<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Isabella's RGB & Hex Converter</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <style>
        .hidden {
            visibility: hidden;
        }

        .results {
            color: red;
            font-size: 20px;
        }

        #color {
            width: 200px;
            height: 200px;
        }
    </style>
</head>
<body>
<div class="container my-4">
    <div class="row">
        <div class="col-6">
            <h1>RGB Hex Converter</h1>
            <p class="lead">Select the type of conversion you would like to perform and enter the color values.
                <br/>Press enter to see the result.</p>
            <form method="POST" action="isabella-rgb-hex">
                <select name="conversion" class="form-select" aria-label="Select a conversion type"
                        onchange="showConvertType()" id="selectConversionType">
                    <option>Select a conversion type</option>
                    <option ${results.conversion == 'hex' ? 'selected' : ''} value="hex">Hex to RGB</option>
                    <option ${results.conversion == 'rgb' ? 'selected' : ''} value="rgb">RGB to Hex</option>
                </select>

                <div class="form-group mb-2">
                    <label for="txtHex" class="txtHex hidden">Hex Value:</label>
                    <input value="<c:out value="${results.txtHex}" />" type="text" class="form-control txtHex hidden"
                           id="txtHex" name="txtHex">

                    <label for="colorValueR" class="numRGB hidden">Red Color Value:</label>
                    <input value="<c:out value="${results.colorValueR}" />" type="text"
                           class="form-control numRGB hidden"
                           id="colorValueR" name="colorValueR">

                    <label for="colorValueG" class="numRGB hidden">Green Color Value:</label>
                    <input value="<c:out value="${results.colorValueG}" />" type="text"
                           class="form-control numRGB hidden"
                           id="colorValueG" name="colorValueG">

                    <label for="colorValueB" class="numRGB hidden">Blue Color Value:</label>
                    <input value="<c:out value="${results.colorValueB}" />" type="text"
                           class="form-control numRGB hidden"
                           id="colorValueB" name="colorValueB">
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
            </form>

            <div class="results">
                <c:if test="${results.hexConverted != ''}">
                    <p id="hexResult"><c:out value="${results.hexConverted}"/></p>
                </c:if>
                <c:if test="${results.RGBConverted != ''}">
                    <p id="RBGResult"><c:out value="${results.RGBConverted}"/></p>
                </c:if>
                <c:if test="${results.hexError != ''}">
                    <p><c:out value="${results.hexError}"/></p>
                </c:if>
                <c:if test="${results.RGBError != ''}">
                    <p><c:out value="${results.RGBError}"/></p>
                </c:if>
                <c:if test="${results.conversionError != ''}">
                    <p><c:out value="${results.conversionError}"/></p>
                </c:if>
                <div id="color"></div>
            </div>

        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
<script>
    function showConvertType() {
        const selectElement = document.getElementById('selectConversionType');
        let selectValue = selectElement.value;
        const numRGBEls = document.getElementsByClassName('numRGB');
        const txtHexEls = document.getElementsByClassName('txtHex');

        if (selectValue === 'hex') {
            for (const el of numRGBEls) {
                el.classList.add('hidden');
            }
            for (const el of txtHexEls) {
                el.classList.remove('hidden');
            }
        } else if (selectValue === 'rgb') {
            for (const el of numRGBEls) {
                el.classList.remove('hidden');
            }
            for (const el of txtHexEls) {
                el.classList.add('hidden');
            }
        } else {
            for (const el of numRGBEls) {
                el.classList.add('hidden');
            }
            for (const el of txtHexEls) {
                el.classList.add('hidden');
            }
        }
    }
    // function showColor(){
    //     const getRGBResult = document.getElementById('#RBGResult').text();
    //     const getHexResult = document.getElementById('#hexResult').text();
    //     if(getRGBResult != null){
    //         document.getElementById('#color').css('backgroundColor: ' + getRGBResult);
    //     }
    //     else if(getHexResult != null){
    //         document.getElementById('#color').css('backgroundColor: ' + getHexResult);
    //     }
    //     else{
    //         document.getElementById('#color').css('backgroundColor: white');
    //
    //     }
    //
    // }

</script>
</body>
</html>

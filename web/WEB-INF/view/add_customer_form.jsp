<%@ taglib   uri="http://www.springframework.org/tags/form"   prefix=""%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Save Customer</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>

<div class="col-sm-12" >
    <div class="col-sm-12" >
        <a href="${pageContext.request.contextPath}/customer/list"><button class="button">Back To List</button></a>
    </div>
    <div class="col-sm-12">
        <form:form method="post" modelAttribute="customer" action="saveCustomer">
            <tabel class="table table-responsive">
                <tr>
                    <td><label >First Name</label></td>
                    <td><form:input path="firstName"  cssClass="form-control" /></td>
                </tr>
                <tr>
                    <td><label >Last Name</label></td>
                    <td><form:input path="lastName" cssClass="form-control"  /></td>
                </tr>
                <tr>
                    <td><label >Email</label></td>
                    <td><form:input path="email" cssClass="form-control"  /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Save" /></td>
                </tr>

            </tabel>

        </form:form>


    </div>



</div>



</body>
</html>
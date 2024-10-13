<%@ include file="common/header.jspf" %>

<body>
    <div class="container">
        <h2>Login</h2>
        <pre>${errorMessage}</pre>
        <form method="post">
            Name : <input type="text" name="name">
            Password : <input type="password" name="password">
            <input type="submit" class="btn btn-success">
        </form>
    </div>
    <%@ include file="common/footer.jspf" %>

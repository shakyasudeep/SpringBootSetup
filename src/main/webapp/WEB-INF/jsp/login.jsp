<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>TrueSGNL</title>
    <%-- <link type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" /> --%>
</head>
<body>
<div class="login_container" id="modal_login">
    <div class="login_block">
        <div class="login_head">Login to TrueSGNL</div>
        <div class="login_form">
            <form id="login_form" method="POST" action="/j_spring_security_check">
                <div class="form-group">
                    <input type="email" class="form-control" id="email" name="email" placeholder="Email">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                </div>
                <div class="clearfix">
                    <button type="submit" class="btn btn-default form-control">SIGN IN</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time</title>
 <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>

<body>
 <h1 class="center"><c:out value="${time}"></c:out></h1>
 <script type="text/javascript" src="/js/time.js"></script>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: z'y'f
  Date: 2020/9/17
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>电子元器件文档库</title>
    <style type="text/css">
        #css1 {
            background-color: #3CD8FF;
            margin: 10px;

        }
        #css2{
            margin-left: 150px;
        }

    </style>
</head>
<body>
<div id="css1">
    <br>
    电子元器件文档列表如下：<br><br>
</div>
<hr size="3">
<br><br>
<div id="css2">
    <c:forEach items="${ files }" var="file">
        ${ file.file_name} <a href="../download/cdownloadController?filename=${ file.file_name}" >下载</a> <br><br>
    </c:forEach>
</div>
<%-- <hr>
 测试：
&lt;%&ndash;    <a href="${pageContext.request.contextPath}/js/login.js">下载测试文件</a>&ndash;%&gt;
 <a href="${pageContext.request.contextPath}/js/login.js">下载测试文件</a><br>
 <a href="../download/downloadController?filename=cat1.jpg" >点击此处测试下载服务器文件</a>--%>
</body>
</html>

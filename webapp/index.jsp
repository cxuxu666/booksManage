<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>首页</title>

    <style>
      a{
        text-decoration: none;
        color: black;
        font-size: 36px;
      }
      h3{
        width: 360px;
        height: 76px;
        margin: 200px auto;
        text-align: center;
        line-height: 76px;
        background: deepskyblue;
        border-radius: 10px;
      }
    </style>
  </head>
  <body>
  <h3>
    <a href="${pageContext.request.contextPath}/book/allBook">进入书籍页面</a>
  </h3>
  </body>
</html>

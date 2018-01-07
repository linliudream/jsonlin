
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <title>用户列表</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>id</th><th>用户名</th><th>密码</th><th>邮箱</th>
        </tr>
        <#list userList as user>
        <tr>
            <td>${user.id}</td> <td>${user.username}</td><td>${user.password}</td><td>${user.email}</td>
        </tr>
        </#list>
  </table>
  <a href="http://www.baidu.com"  >百度</a>
  <input type="submit" value="试试">
  
</body>
<script type="text/javascript">
$(function(){
alert("a");
});

</script>
</html>

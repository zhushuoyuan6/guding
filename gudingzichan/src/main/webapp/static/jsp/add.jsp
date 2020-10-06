<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="doAdd">
    <table border="1px">
        <tr>
            <td colspan="3" align="center">新增固定资产</td>
        </tr>
        <tr>
            <td>
                资产编号
            </td>
            <td>
                <input type="text" name="assetid">
            </td>
        </tr>
        <tr>
            <td>
                资产名称
            </td>
            <td>
                <input type="text" name="assetname">
            </td>
        </tr>
        <tr>
            <td>
                资产类型
            </td>
            <td>
                <input type="text" name="assettype">
            </td>
        </tr>
        <tr>
            <td>
                入库时间
            </td>
            <td>
                <input type="text" name="intodate">
            </td>
        </tr>
        <tr>
            <td colspan="3" align="center">
                <input type="submit" value="提交">
                <input type="reset">
            </td>
        </tr>
    </table>
</form>
</body>
</html>

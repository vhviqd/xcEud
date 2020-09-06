<!DOCTYPE html>
<html>
<head>
    <meta charset="utf‐8">
    <title>Hello World!</title>
</head>
<body>
<p>在test1.ftl模板中使用list指令遍历数据模型中的数据：</p>
<table>
    <thead>
        <td>序号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>钱包</td>
    </thead>
    <#list stus as stu>
        <tr>
    <#--使用 _index 来遍历的序号-->
        <td>${stu_index + 1}</td>
        <td <#if stu.name == '小明'>style="background: red" </#if>>${stu.name}</td>
        <td>${stu.name}</td>
        <td>${stu.age}</td>
        <td>${stu.money}</td>
        </tr>
    </#list>
</table>

通过Map输出stu1的学生信息：<br/>
姓名：${stuMap['stu1'].name}<br/>
年龄：${stuMap['stu1'].age}<br/>

通过Map输出stu1的学生信息：<br/>
姓名：${stuMap.stu1.name}<br/>
年龄：${stuMap.stu1.age}<br/>
姓名：${stuMap.stu2.name}<br/>
年龄：${stuMap.stu2.age}<br/>

</body>
</html>
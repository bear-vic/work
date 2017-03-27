<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="abc.jsp"></jsp:include>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<title>Template</title>
<script type="text/javascript">
function handleResult(data){
var result=data;
//alert(data);
 //console.log( data.result);
 var list=$.parseJSON(data.result);
/*for(var i=0;i<data.length;i++){
	console.log(data[i].goods.gId);
} */
	console.log(list[1].goods.gId);
	$("#t1").html("");
	var a = "";
	$.each(list,function(i,n){
	a+="<tr><td>"+list[i].goods.gId+"</td>"
	+"<td>"+list[i].goods.gName+"</td>"
	+"<td>"+list[i].goods.gPrice+"</td></tr>";
	});
	$("#t1").append(
		a
		);
}
	$(function() {
	var user={
	uName:$("#uname").val(),
	uTelphone:$("#utel").val()
};
		$("#btn2").click(function() {
			$.post(
			"/schoolbargin/goods/clookall",
			{test:"^^^"},
			 function(data, status) {
			 handleResult(data);
			}

			);
		});
	});

	// data 可以是 xmlDoc, jsonObj, html, text, 等等.
	//this; // 这个Ajax请求的选项配置信息，请参考jQuery.get()说到的this
	/* for(var i=0,i<data1.length(),i++){
	 } */
	/* $.each(data1,function(i,n){
	 console.log(data1[i]);
	 });
	 });
	 });
	 }); */
</script>
</head>

<body>
	<div id="div1"></div>
	<br>
	<button id="btn1">click</button>
	<table>
		
	<table>
	<form id='addForm'  >
     <label for='uname'>用户名</label>：<input type='text'  id='uname'><br>
     <label for='utel'>手机号：</label><input type='text' id='utel'><br>
     <input id="btn2" type='button' value='提交' >
</form>

<table id="t1">
<tr>
<td>id</td>
<td>名称</td>
<td>价格</td>
</tr>


</table>
</body>
</html>

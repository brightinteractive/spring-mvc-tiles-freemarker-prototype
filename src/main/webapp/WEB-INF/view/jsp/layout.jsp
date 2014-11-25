<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE html>
<html>
<head>
<title>Three Column Layout</title>
<style type="text/css">
body {
	font-family: Arial, Verdana, sans-serif;
}

.header,.footer,.leftPane,.rightPane {
	border: 1px solid gray;
}

.header,.main,.footer {
	width: 960px;
	color: #665544;
	margin: 0px auto;
	clear: both;
}

.leftPane,.rightPane {
	float: left;
	margin: 10px;
	height: 400px;
}

.leftPane {
	width: 100px;
}

.rightPane {
	width: 815px;
}

.leftMenu {
	list-style: none;
	padding: 0;
	margin: 10px;
}
</style>
</head>
<body>
<tiles:insertAttribute name="header"/>
	<div class="main">
		<tiles:insertAttribute name="menu"/>
		<div class="rightPane">
			<tiles:insertAttribute name="body"/>
		</div>
	</div>
<tiles:insertAttribute name="footer" />
	
</body>
</html>
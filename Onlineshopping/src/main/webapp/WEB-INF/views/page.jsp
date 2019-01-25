<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<c:set var="contextroot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping ${title}</title>


<script>
	window.menu = '${title}';
	
	window.contextroot = '${contextroot}';
	
	
</script>



<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- my Theme ref -->
<link href="${css}/theme.css" rel="stylesheet">

<!--  now changing it ot bootstrap datatable theme -->

<link href="//cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">
</head>

<body>

	<div class="wrapper">

		<!-- Navigation -->

		<%@ include file="./shared/navbar.jsp"%>


		<!-- Page Content -->

		<div class="content">
			<!--  Loading the Page COntent -->


			<!-- test  for home jsp page -->
			<c:if test="${userClickHome == true }">
				<%@ include file="home.jsp"%>
			</c:if>

			<!-- test  for about us jsp page -->
			<c:if test="${userClickAbout == true }">
				<%@ include file="about.jsp"%>
			</c:if>


			<!-- test  for contact us jsp page -->
			<c:if test="${userClickContact == true }">
				<%@ include file="contact.jsp"%>
			</c:if>


			<!-- test  for contact us jsp page -->
			<c:if
				test="${userClickAllProducts == true or userClickCategoryProducts == true }">
				<%@ include file="listProducts.jsp"%>
			</c:if>



              <!-- test  for the click of singleproduct jsp apge -->
			<c:if
				test="${userClickShowProduct== true}">
				<%@ include file="singleProduct.jsp"%>
			</c:if>
 




		</div>
		<!-- Footer -->

		<%@include file="./shared/footer.jsp"%>


		<!-- Juqery JavaScript -->
		<script src="${js}/jquery.js"></script>


		<!--  bootstrp  core javascript  -->
		<script src="${js}/bootstrap.bundle.min.js"></script>




		<!--  Datatable bootstrap  js ref -->
		<script src="//cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>

		<!-- my own javascript code  -->
		<script src="${js}/myapp.js"></script>



	</div>

</body>

</html>

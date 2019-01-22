<div class="container">

	<div class="row">


		<!--  sidebar -->

		<div class="col-lg-3">

			<%@ include file="./shared/sidebar.jsp"%>


		</div>

		<div class="col-md-9">



			<div class="row">

				<div class="col-lg-9">

					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${contextroot}/home"> HOME </a> </li>
							<li class="active">All Products</li>

						</ol>

					</c:if>


					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${contextroot}/home"> HOME </a></li> /
							<li class="active">Category</li> / 
							<li class="active">${category.name}</li>

						</ol>

					</c:if>



				</div>


			</div>



		</div>




	</div>


</div>
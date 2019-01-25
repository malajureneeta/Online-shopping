<div class="container">

	<div class="row">


		<!--  sidebar -->

		<div class="col-lg-3">

			<%@ include file="./shared/sidebar.jsp"%>


		</div>
		<!-- actual products -->

		<div class="col-md-9">

			<!-- added breadcrumb component -->

			<div class="row">
				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true}">
					
					<script>
					
					  window.categoryId= '';
					
					</script>
						<ol class="breadcrumb">

							<li><a href="${contextroot}/home"> HOME </a></li>
							<li class="active">All Products</li>

						</ol>

					</c:if>


					<c:if test="${userClickCategoryProducts == true}">
					
					<script>					
					  window.categoryId='${category.id}';					
					</script>
						<ol class="breadcrumb">

							<li><a href="${contextroot}/home"> HOME </a></li> /
							<li class="active">Category</li> /
							<li class="active">${category.name}</li>

						</ol>

					</c:if>



				</div>


			</div>

			<div class="row">
				<div class="col-xs-12">

					<table id="dt-select" class="table table-striped table-bordered"
						cellspacing="0" width="100%">
						<thead>
							<tr> 
							    <th></th>
								<th>Name</th>

								<th>Brand</th>
								
								<th>Price</th>

								<th>Availabe Quantity</th>
								<th></th>
							</tr>
						</thead>



                            <tfoot>
                            
                            <tr>
								<th>Name</th>

								<th>Brand</th>
								
								<th>Price</th>

								<th>Availabe Quantity</th>
								<th></th>
							</tr>
                            </tfoot>
					</table>
				</div>


			</div>

		</div>




	</div>


</div>
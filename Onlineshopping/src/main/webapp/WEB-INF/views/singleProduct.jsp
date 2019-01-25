<div class="container">


	<!-- one row for breadcrumb component of bootstrap -->
	<div class=row">

		<div class="col-xs-12">
			<ol class="breadcrumb">

				<li><a href="${contextroot}/home">Home</a>/</li>
				<li><a href="${contextroot}/show/all/products">Products</a>/</li>
				${product.name}
				</li>

			</ol>


		</div>
	</div>

	<div class="row">
		<!-- display product image  -->
		<div class="col-xs-12 col-sm-4">
			<div class="thumbnail">

				<img src="${images}/${product.code}.jpg" class="img img-responsive" />

			</div>

		</div>

		<!-- display the product description -->
		<div class="col-xs-12 col-sm-8">
		
			<h3>${product.name}</h3>
			<hr />
			<p>${product.description}</p>
			<hr/>

			<h5>
				Price :<strong>&#8377; ${product.unitPrice} /-</strong>
			</h5>
			<hr/>

			<h6>Quantity available : ${product.quantity}</h6>

			<!--  add to cart for the process -->

			<a href="${contextroot}/cart/add/${prouct.id}/product"
				class="btn btn-success"> <span
				class="glyphicon glyphicon-shopping-cart">Add To Cart</span></a>

			<!-- back tp products home page -->
			<a href="${contextroot}/show/all/products" class="btn btn-primary">
				Back</a>


		</div>



	</div>



</div>
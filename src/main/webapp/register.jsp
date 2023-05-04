<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<jsp:include page="home.jsp" />
	
	<section class="h-100 gradient-form" style="background-color: #eee;">
		<div class="container py-5 h-100">
			<div
				class="row d-flex justify-content-center align-items-center h-100">
				<div class="col-xl-10">
					<div class="card rounded-3 text-black">
						<div class="row g-0">
							<div class="col-lg-6">
								<div class="card-body p-md-5 mx-md-4">

									<div class="text-center">
										<img
											src="data:image/jpeg;base64,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"
											style="width: 185px;" alt="logo">
										<h4 class="mt-1 mb-5 pb-1">We are The One Team</h4>
									</div>

									<form action="register" method="post">
										<p>Please Register Your Account</p>

										<div class="form-outline mb-4">
											<label class="form-label" for="form2Example11">Id</label> <input
												type="text" name="id" id="form2Example11"
												class="form-control" placeholder="enter your id" />
										</div>

										<div class="form-outline mb-4">
											<label class="form-label" for="form2Example22">Name</label> <input
												type="text" name="name" id="form2Example22"
												class="form-control" placeholder="enter your name" />
										</div>

										<div class="form-outline mb-4">
											<label class="form-label" for="form2Example22">Email</label>
											<input type="text" name="email" id="form2Example22"
												class="form-control" placeholder="enter your email" />
										</div>

										<div class="form-outline mb-4">
											<label class="form-label" for="form2Example22">Phone</label>
											<input type="text" name="phone" id="form2Example22"
												class="form-control" placeholder="enter your phone" />
										</div>

										<div class="text-center pt-1 mb-5 pb-1">
											<button
												class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3"
												type="submit">Register</button>
										</div>

									</form>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
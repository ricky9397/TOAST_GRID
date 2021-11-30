<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link href="/css/boot/bootstrap.min.css" rel="stylesheet">
<link href="/css/boot/signin.css" rel="stylesheet">

</head>
<body class="text-center">
	<main class="form-signin">
	  <form id="formData">
	    <img class="mb-4" src="../assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">
	    <h1 class="h3 mb-3 fw-normal">로그인</h1>
	
	    <div class="form-floating">
	      <input type="text" class="form-control" id="id" name="id" placeholder="text">
	      <label for="floatingInput">Id</label>
	    </div>
	    <div class="form-floating">
	      <input type="password" class="form-control" id="pw" name="pw" placeholder="Password">
	      <label for="floatingPassword">Password</label>
	    </div>
	
	    <div class="checkbox mb-3">
	      <label>
	        <input type="checkbox" value="remember-me"> Remember me
	      </label>
	    </div>
	    <button class="w-100 btn btn-lg btn-primary" type="submit" id="submitBtn">Sign in</button>
	    <p class="mt-5 mb-3 text-muted">&copy; 2021–2022</p>
	  </form>
	</main>
	
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>
 <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script> 

<script type="text/javascript">
	$('#submitBtn').click(function(e){
		e.preventDefault();
		var formData = $("#formData").serialize();
		$.ajax({
			type : 'POST',
			url : 'login.do',
			data : formData,
			dataType : 'JSON',
			success : function(data){
				console.log(data);
				if(data == 1){
					window.location.href = "";
					alert('성공');
				} else {
					alert('아이디 또는 비번이 다릅니다. 다시확인해주세요.')
				}
			}
		});
	});
</script>
</body>
</html>
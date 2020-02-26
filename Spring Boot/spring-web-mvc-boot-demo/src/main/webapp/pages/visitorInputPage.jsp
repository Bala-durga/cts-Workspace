
<jsp:include page="/header"/>
<section style="padding:10px; min-height:400px;">
<h3>Visitor Registration</h3>
<form method="post">
<label>Name:
<input type="text" name="firstName" placeholder="First Name" required>
<input type="text" name="lastName" placeholder="Last Name" required>
</label>
<br/>
<label>Date of Birth:
<input type="date" name="DateOfBirth" required>
</label>
<br/>
<button>REGISTER</button>
</form>

</section>

<jsp:include page="/footer"/>
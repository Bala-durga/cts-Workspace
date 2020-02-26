<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<jsp:include page="/header"/>
<section style="padding:10px; min-height:400px;">
<%-- <h2>${pageTitle }</h2>
<h3>Developers</h3> --%>
<h2>${msg}</h2>
<form method="get">
<label>Select Salutation:
<select name="salut">
<option value="">...........Select......</option>
<option value="Mr.">Mister</option>
<option value="Mrs.">Mistress</option>
<option value="Miss.">Miss</option>
</select>
</label>
<label>Enter Username: <input type="text" name="unm"/></label>
<button>Done</button> 
</form>
<%-- <ol>
<c:forEach var="d" items="${developers }">
<li>${d}</li>
</c:forEach>
</ol> --%>
</section>

<jsp:include page="/footer"/>
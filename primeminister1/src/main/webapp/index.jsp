<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h4>DATA OF PRIMEMINISTER</h4>
<br>
 <a href="success.jsp">Show Details</a>
<form action="prime" method="post">
<label>Name</label>
<input type="text" name="name">
<br><br>
<label>Country</label>
                <select  name="country">
				<option >--Select Country----</option>
				<option value="India">India</option>
				<option value="Shrilanka">Shrilanka</option>
				<option value="Nepal">Nepal</option>
				<option value="Bangladesh">Bangladesh</option>
				<option value="Bhootan">Bhootan</option>
				<option value="China">China</option>
				<option value="SouthKorea">SouthKorea</option>
				<option value="America">America</option>
				</select>
				<br><br>
<label>Marriage Status</label> 
			<input type="radio"  id = "married"  name="marriage">
			<label for ="married">Married</label>
			<input type="radio" id="married" name="marriage">
			<label for="married">Unmarried</label>	
			<br><br>
<label>Party</label>			
                <select  name="party">
				<option >--Select Party----</option>
				<option value="BJP(Bharatiya Janata Party)">BJP(Bharatiya Janata Party)</option>
				<option value="INC(India National Congress)">INC(India National Congress)</option>
				<option value="CPI(Communist Party of India)">CPI(Communist Party of India)</option>
				<option value="AIP(American Independent Party)">AIP(American Independent Party)</option>
				<option value="CPN(Communist Party Nepal)">CPN(Communist Party Nepal)</option>
				<option value="CCP(Chinese Communist Party)">CCP(Chinese Communist Party)</option>
				<option value="BNP(Bangladesh National Party)">BNP(Bangladesh National Party)</option>
				</select>
				<br><br>
	<label>Age</label>	
	<input type="text" id="age" name="age">	
	<br><br>
	<label>Select gender</label> 
			<input type="radio"  id = "gen" value="Male" name="gender">
			<label for ="gen">Male</label>
			<input type="radio" id="gen"  value="female" name="gender">
			<label for="gen">Female</label>
		    <input type="radio" id="gen"  value="others" name="gender">
			<label for="gen">Others</label>
		<br><br>	
<label>Period</label>
<input type="text" id="period" name="period">
<br><br>	
		
<label>Time Represented</label>
                <select  name="time">
				<option >--Select Time Represented ----</option>
				<option value="0-5">0-5</option>
				<option value="5-10">5-10</option>
				<option value="10-15">10-15</option>
				<option value="15-20">15-20</option>
				<option value="20-25">20-25</option>
				<option value="25-30">25-30</option>	
				</select>
				<br><br>
<input type="submit" value="save">							
</form>
</body>
</html>
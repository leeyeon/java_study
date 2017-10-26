<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="service.user.vo.UserVO" %>
<%@ page import="service.user.dao.UserDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<% 
	request.setCharacterEncoding("EUC_KR");

	UserDao userDao = new UserDao();
	UserVO userVO = (UserVO)session.getAttribute("user");
	
%>

<html lang="ko">
<head><title>Client/Server Relation</title>

<style>
@import url(//fonts.googleapis.com/earlyaccess/nanumgothic.css);

body {
	font-family: 'Nanum Gothic';
}


.table_div {
	background-color: #FDFDFD;
	margin: auto 0px;
	align: center;
	padding: 20px;
}

input {
	box-sizing: border-box;
	width: 50px;
    border: 1px solid #bcbcbc;
	padding: 3px;
}

select {
	box-sizing: border-box;
    border: 1px solid #c6c6c6;
	border-radius: 3px;
	padding: 3px;
	width: 70px;
}

.informaion_table {
	position: relative;
	border-collapse: collapse;
	align:center;
	font-size: 14px;
	width: 800px;
	height: 500px;
}

.informaion_table th, .informaion_table td {
	border:1px solid #e0e0e0;
	padding-left: 10px;
	padding-top: 5px;
	padding-bottom: 5px;
	margin: 2px;
}

.informaion_table th {
	background-color: #84DCC8;
	width: 140px;
	text-align: left;
	font-weight: normal;
}

.informaion_table td {
	vertical-align:middle;
}

.radiobtn {
	width: 15px;
	height: 15px;
}

</style>
</head>
<body>
<center>

	<div class="table_div" >
		<h2>내 정보 수정</h2>
		<hr width="800px">
	
		<form name ="frm" action="updateUser.jsp" method="POST">
			<table class="informaion_table" colspan="4">
	
				<tr>
					<th>* 이름(한글실명)</th>
					<td colspan="3">
						<%= userVO.getName() %>
					</td>
				</tr>
	
				<tr>
					<th>* 성별</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="gender" value="남자"
						<%= ("남자".equals(userVO.getGender()))? "checked":""%>/>남</label>
						<label><input type="radio" class="radiobtn" name="gender" value="여자"
						<%= ("여자".equals(userVO.getGender()))? "checked":"" %>/>여</label>
					</td>
				</tr>
	
				<tr>
					<th>* 생년월일</th>
					<td colspan="3">
						<input type="text" name="year" value="<%=userVO.getYear() %>"/>&nbsp;년

						<select name="month">
							<option value='' selected>선택</option>
							<% for(int i=1; i<=12; i++) {%>
								<option value="<%= i %>"><%= i %></option>
							<% } %>
						</select>&nbsp;월
						<select name="day">
							<option value='' selected>선택</option>
							<% for(int i=1; i<=30; i++) {%>
								<option value="<%= i %>"><%= i %></option>
							<% } %>
						</select>&nbsp;일
						<label><input type="radio" class="radiobtn" name="calendar" value="양력"
							<%= ("양력".equals(userVO.getCalendar()))? "checked":""%>/>양력</label>
						<label><input type="radio" class="radiobtn" name="calendar" value="음력"
							<%= ("음력".equals(userVO.getCalendar()))? "checked":""%>/>음력</label>
						(<label><input type="radio" class="radiobtn" name="calendar" value="윤달"
							<%= ("윤달".equals(userVO.getCalendar()))? "checked":""%>/>윤달</label>)
					</td>
				</tr>
	
				<tr>
					<th>* 최종학력</th>
					<%
						String[] edu = new String[] {"선택하세요.","초등학교", "중학교", "고등학교", "대학교"};
					%>
					<td colspan="3">
						<select name= "education"  id="education" style="width: 150px" >
						<% for(int i=0; i<edu.length; i++) { %>
							<option value="<%= edu[i] %>"
								<%= (edu[i].equals(userVO.getEducation()))? "selected":""%>>
								<%= edu[i] %> </option>
						<% } %>
						</select>
					</td>
				</tr>
	
				<tr>
					<th>* 직업</th>
					<td>
					<%
						String[] job = new String[] {"선택하세요.","학생", "교직", "공무원", "전문직","무직"};
					%>
						<select name="job" id="job" style="width: 150px">
						<% for(int i=0; i<job.length; i++) { %>
							<option value="<%= job[i] %>"
								<%= (job[i].equals(userVO.getJob()))? "selected":""%>>
								<%= job[i] %> </option>
						<% } %>
						</select>
					</td>
	
					<th>소속</th>
					<td>
						<input type="text" name="position" value="<%= userVO.getPosition()%>" style="width: 150px"/>
					</td>
				</tr>
	
				<tr>
					<th>* 결혼여부</th>
					<td>
						<label><input type="radio" name="married" class="radiobtn" value="미혼"
								<%= ("미혼".equals(userVO.getMarried()))? "checked":""%>/>미혼</label>
						<label><input type="radio" name="married" class="radiobtn" value="기혼"
								<%= ("기혼".equals(userVO.getMarried()))? "checked":""%>/>기혼</label>
					</td>
	
					<th>자녀수</th>
					<td>
						<select name="children">
							<option value=''>선택</option>
							<option value='0'>없음</option>
							<% for(int i=1; i<=5; i++) {%>
								<option value="<%= i %>"><%= i %></option>
							<% } %>
						</select>&nbsp;&nbsp;명
					</td>
				</tr>
	
				<tr>
					<th rowspan="3">* 연락처</th>
					<td colspan="3">전화번호&nbsp;
						<input type="text" name="tel_first" value="<%= userVO.getTelFirst()%>"/>&nbsp;-&nbsp;
						<input type="text" name="tel_second" value="<%= userVO.getTelSecond()%>"/>&nbsp;-&nbsp;
						<input type="text" name="tel_third" value="<%= userVO.getTelThird()%>"/>&nbsp;&nbsp;
						<label><input type="radio" class="radiobtn" name="tel_check" value="집"
						 		<%= ("집".equals(userVO.getTelCheck()))? "checked":""%>/>집</label>
						<label><input type="radio" class="radiobtn" name="tel_check" value="직장"
								<%= ("직장".equals(userVO.getTelCheck()))? "checked":""%>/>직장</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3">휴대폰&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" name="mobile_first" value="<%= userVO.getMobileFirst()%>"/>&nbsp;-&nbsp;
						<input type="text" name="mobile_second" value="<%= userVO.getMobileSecond()%>"/>&nbsp;-&nbsp;
						<input type="text" name="mobile_third" value="<%= userVO.getMobileThird()%>"/>&nbsp;
						&nbsp;&nbsp;&nbsp;이동통신사
						<label><input type="radio" class="radiobtn" name="mobile_check" value="SKT"
								<%= ("SKT".equals(userVO.getMobileCheck()))? "checked":""%>/>SKT</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="KTF"
								<%= ("KTF".equals(userVO.getMobileCheck()))? "checked":""%>/>KTF</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="LGT"
								<%= ("LGT".equals(userVO.getMobileCheck()))? "checked":""%>/>LGT</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3" style="color:red">※ 전화번호나 휴대폰번호 2가지 중 하나는 반드시 입력하셔야 합니다.</td>
				</tr>
	
				<tr>
					<th>* 거주지주소</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="country" value="국내"
								<%= ("국내".equals(userVO.getCountry()))? "checked":""%>/>국내</label>
						<label><input type="radio" class="radiobtn" name="country" value="국외"
								<%= ("국외".equals(userVO.getCountry()))? "checked":""%>/>국외</label>
						<input type="text" name="address" value="<%= userVO.getAddress()%>" style="width: 300px"/>
					</td>
				</tr>
	
			</table>
	
			<br><input type="submit" value="수정하기" style="width:150px; height:30px"/>
		</form>

	</div>

</body>
</html>


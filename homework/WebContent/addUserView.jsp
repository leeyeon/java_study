<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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

<script type="text/javascript">

function checkInfo(form) {
	var name = form.name.value;
	if(name=='') {
		alert('이름을 입력해주세요.');
		return false;
	}
	<!-- 
	if(telFirst =='' || telSecond == '' || telThrid == '') {
		alert('전화번호나 휴대폰번호 2가지 중 하나는 반드시 입력하셔야 합니다.');
		return false;
	} else if(mobileFirst == '' || mobileSecond == '' || mobileThird == '') {
		alert('전화번호나 휴대폰번호 2가지 중 하나는 반드시 입력하셔야 합니다.');
		return false;
	}
	-->
}

</script>

</head>
<body>
<center>

	<div class="table_div" >
		<h2>회원가입</h2>
		<hr width="800px">
	
		<form action="addUser.jsp" method="POST"  onSubmit='return checkInfo(this)'>
			<table class="informaion_table" colspan="4">
	
				<tr>
					<th>* 이름(한글실명)</th>
					<td colspan="3">
						<input type="text" name="name" value="" style="width: 150px"/>
					</td>
				</tr>
	
				<tr>
					<th>* 성별</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="gender" value="남자"
						 checked="checked"/>남</label>
						<label><input type="radio" class="radiobtn" name="gender" value="여자"/>여</label>
					</td>
				</tr>
	
				<tr>
					<th>* 생년월일</th>
					<td colspan="3">
						<input type="text" name="year" value=""/>&nbsp;년
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
						 checked="checked"/>양력</label>
						<label><input type="radio" class="radiobtn" name="calendar" value="음력"/>음력</label>
						(<label><input type="radio" class="radiobtn" name="calendar" value="윤달"/>윤달</label>)
					</td>
				</tr>
	
				<tr>
					<th>* 최종학력</th>
					<td colspan="3">
						<select name="education"  style="width: 150px">
							<option value='' selected>선택하세요.</option>
							<option value='초등학교'>초등학교</option>
							<option value='중학교'>중학교</option>
							<option value='고등학교'>고등학교</option>
							<option value='대학교'>대학교</option>
						</select>
					</td>
				</tr>
	
				<tr>
					<th>* 직업</th>
					<td>
						<select name="job" style="width: 150px">
							<option value='' selected>선택하세요.</option>
							<option value='학생'>학생</option>
							<option value='교직'>교직</option>
							<option value='공무원'>공무원</option>
							<option value='전문직'>전문직</option>
							<option value='무직'>무직</option>
						</select>
					</td>
	
					<th>소속</th>
					<td>
						<input type="text" name="position" value="" style="width: 150px"/>
					</td>
				</tr>
	
				<tr>
					<th>* 결혼여부</th>
					<td>
						<label><input type="radio" name="married" class="radiobtn" value="미혼"
								checked="checked"/>미혼</label>
						<label><input type="radio" name="married" class="radiobtn" value="기혼"/>기혼</label>
					</td>
	
					<th>자녀수</th>
					<td>
						<select name="children">
							<option value='' selected>선택</option>
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
						<input type="text" name="tel_first" value=""/>&nbsp;-&nbsp;
						<input type="text" name="tel_second" value=""/>&nbsp;-&nbsp;
						<input type="text" name="tel_third" value=""/>&nbsp;&nbsp;
						<label><input type="radio" class="radiobtn" name="tel_check" value="집"
						 checked="checked"/>집</label>
						<label><input type="radio" class="radiobtn" name="tel_check" value="직장"/>직장</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3">휴대폰&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" name="mobile_first" value=""/>&nbsp;-&nbsp;
						<input type="text" name="mobile_second" value=""/>&nbsp;-&nbsp;
						<input type="text" name="mobile_third" value=""/>&nbsp;
						&nbsp;&nbsp;&nbsp;이동통신사
						<label><input type="radio" class="radiobtn" name="mobile_check" value="SKT"
						 checked="checked"/>SKT</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="KTF"/>KTF</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="LGT"/>LGT</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3" style="color:red">※ 전화번호나 휴대폰번호 2가지 중 하나는 반드시 입력하셔야 합니다.</td>
				</tr>
	
				<tr>
					<th>* 거주지주소</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="country" value="국내"/>국내</label>
						<label><input type="radio" class="radiobtn" name="country" value="국외"/>국외</label>
						<input type="text" name="address" value="" style="width: 300px"/>
					</td>
				</tr>
	
			</table>
	
			<br><input type="submit" value="회원가입" style="width:150px; height:30px"/>
			&nbsp;&nbsp;<input type="reset" value="다시 입력" style="width:100px; height:30px"/>
		</form>

	</div>

</body>
</html>
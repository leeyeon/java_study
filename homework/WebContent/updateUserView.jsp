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
		<h2>�� ���� ����</h2>
		<hr width="800px">
	
		<form name ="frm" action="updateUser.jsp" method="POST">
			<table class="informaion_table" colspan="4">
	
				<tr>
					<th>* �̸�(�ѱ۽Ǹ�)</th>
					<td colspan="3">
						<%= userVO.getName() %>
					</td>
				</tr>
	
				<tr>
					<th>* ����</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="gender" value="����"
						<%= ("����".equals(userVO.getGender()))? "checked":""%>/>��</label>
						<label><input type="radio" class="radiobtn" name="gender" value="����"
						<%= ("����".equals(userVO.getGender()))? "checked":"" %>/>��</label>
					</td>
				</tr>
	
				<tr>
					<th>* �������</th>
					<td colspan="3">
						<input type="text" name="year" value="<%=userVO.getYear() %>"/>&nbsp;��

						<select name="month">
							<option value='' selected>����</option>
							<% for(int i=1; i<=12; i++) {%>
								<option value="<%= i %>"><%= i %></option>
							<% } %>
						</select>&nbsp;��
						<select name="day">
							<option value='' selected>����</option>
							<% for(int i=1; i<=30; i++) {%>
								<option value="<%= i %>"><%= i %></option>
							<% } %>
						</select>&nbsp;��
						<label><input type="radio" class="radiobtn" name="calendar" value="���"
							<%= ("���".equals(userVO.getCalendar()))? "checked":""%>/>���</label>
						<label><input type="radio" class="radiobtn" name="calendar" value="����"
							<%= ("����".equals(userVO.getCalendar()))? "checked":""%>/>����</label>
						(<label><input type="radio" class="radiobtn" name="calendar" value="����"
							<%= ("����".equals(userVO.getCalendar()))? "checked":""%>/>����</label>)
					</td>
				</tr>
	
				<tr>
					<th>* �����з�</th>
					<%
						String[] edu = new String[] {"�����ϼ���.","�ʵ��б�", "���б�", "����б�", "���б�"};
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
					<th>* ����</th>
					<td>
					<%
						String[] job = new String[] {"�����ϼ���.","�л�", "����", "������", "������","����"};
					%>
						<select name="job" id="job" style="width: 150px">
						<% for(int i=0; i<job.length; i++) { %>
							<option value="<%= job[i] %>"
								<%= (job[i].equals(userVO.getJob()))? "selected":""%>>
								<%= job[i] %> </option>
						<% } %>
						</select>
					</td>
	
					<th>�Ҽ�</th>
					<td>
						<input type="text" name="position" value="<%= userVO.getPosition()%>" style="width: 150px"/>
					</td>
				</tr>
	
				<tr>
					<th>* ��ȥ����</th>
					<td>
						<label><input type="radio" name="married" class="radiobtn" value="��ȥ"
								<%= ("��ȥ".equals(userVO.getMarried()))? "checked":""%>/>��ȥ</label>
						<label><input type="radio" name="married" class="radiobtn" value="��ȥ"
								<%= ("��ȥ".equals(userVO.getMarried()))? "checked":""%>/>��ȥ</label>
					</td>
	
					<th>�ڳ��</th>
					<td>
						<select name="children">
							<option value=''>����</option>
							<option value='0'>����</option>
							<% for(int i=1; i<=5; i++) {%>
								<option value="<%= i %>"><%= i %></option>
							<% } %>
						</select>&nbsp;&nbsp;��
					</td>
				</tr>
	
				<tr>
					<th rowspan="3">* ����ó</th>
					<td colspan="3">��ȭ��ȣ&nbsp;
						<input type="text" name="tel_first" value="<%= userVO.getTelFirst()%>"/>&nbsp;-&nbsp;
						<input type="text" name="tel_second" value="<%= userVO.getTelSecond()%>"/>&nbsp;-&nbsp;
						<input type="text" name="tel_third" value="<%= userVO.getTelThird()%>"/>&nbsp;&nbsp;
						<label><input type="radio" class="radiobtn" name="tel_check" value="��"
						 		<%= ("��".equals(userVO.getTelCheck()))? "checked":""%>/>��</label>
						<label><input type="radio" class="radiobtn" name="tel_check" value="����"
								<%= ("����".equals(userVO.getTelCheck()))? "checked":""%>/>����</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3">�޴���&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" name="mobile_first" value="<%= userVO.getMobileFirst()%>"/>&nbsp;-&nbsp;
						<input type="text" name="mobile_second" value="<%= userVO.getMobileSecond()%>"/>&nbsp;-&nbsp;
						<input type="text" name="mobile_third" value="<%= userVO.getMobileThird()%>"/>&nbsp;
						&nbsp;&nbsp;&nbsp;�̵���Ż�
						<label><input type="radio" class="radiobtn" name="mobile_check" value="SKT"
								<%= ("SKT".equals(userVO.getMobileCheck()))? "checked":""%>/>SKT</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="KTF"
								<%= ("KTF".equals(userVO.getMobileCheck()))? "checked":""%>/>KTF</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="LGT"
								<%= ("LGT".equals(userVO.getMobileCheck()))? "checked":""%>/>LGT</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3" style="color:red">�� ��ȭ��ȣ�� �޴�����ȣ 2���� �� �ϳ��� �ݵ�� �Է��ϼž� �մϴ�.</td>
				</tr>
	
				<tr>
					<th>* �������ּ�</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="country" value="����"
								<%= ("����".equals(userVO.getCountry()))? "checked":""%>/>����</label>
						<label><input type="radio" class="radiobtn" name="country" value="����"
								<%= ("����".equals(userVO.getCountry()))? "checked":""%>/>����</label>
						<input type="text" name="address" value="<%= userVO.getAddress()%>" style="width: 300px"/>
					</td>
				</tr>
	
			</table>
	
			<br><input type="submit" value="�����ϱ�" style="width:150px; height:30px"/>
		</form>

	</div>

</body>
</html>


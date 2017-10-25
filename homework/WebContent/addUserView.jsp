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
		alert('�̸��� �Է����ּ���.');
		return false;
	}
	<!-- 
	if(telFirst =='' || telSecond == '' || telThrid == '') {
		alert('��ȭ��ȣ�� �޴�����ȣ 2���� �� �ϳ��� �ݵ�� �Է��ϼž� �մϴ�.');
		return false;
	} else if(mobileFirst == '' || mobileSecond == '' || mobileThird == '') {
		alert('��ȭ��ȣ�� �޴�����ȣ 2���� �� �ϳ��� �ݵ�� �Է��ϼž� �մϴ�.');
		return false;
	}
	-->
}

</script>

</head>
<body>
<center>

	<div class="table_div" >
		<h2>ȸ������</h2>
		<hr width="800px">
	
		<form action="addUser.jsp" method="POST"  onSubmit='return checkInfo(this)'>
			<table class="informaion_table" colspan="4">
	
				<tr>
					<th>* �̸�(�ѱ۽Ǹ�)</th>
					<td colspan="3">
						<input type="text" name="name" value="" style="width: 150px"/>
					</td>
				</tr>
	
				<tr>
					<th>* ����</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="gender" value="����"
						 checked="checked"/>��</label>
						<label><input type="radio" class="radiobtn" name="gender" value="����"/>��</label>
					</td>
				</tr>
	
				<tr>
					<th>* �������</th>
					<td colspan="3">
						<input type="text" name="year" value=""/>&nbsp;��
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
						 checked="checked"/>���</label>
						<label><input type="radio" class="radiobtn" name="calendar" value="����"/>����</label>
						(<label><input type="radio" class="radiobtn" name="calendar" value="����"/>����</label>)
					</td>
				</tr>
	
				<tr>
					<th>* �����з�</th>
					<td colspan="3">
						<select name="education"  style="width: 150px">
							<option value='' selected>�����ϼ���.</option>
							<option value='�ʵ��б�'>�ʵ��б�</option>
							<option value='���б�'>���б�</option>
							<option value='����б�'>����б�</option>
							<option value='���б�'>���б�</option>
						</select>
					</td>
				</tr>
	
				<tr>
					<th>* ����</th>
					<td>
						<select name="job" style="width: 150px">
							<option value='' selected>�����ϼ���.</option>
							<option value='�л�'>�л�</option>
							<option value='����'>����</option>
							<option value='������'>������</option>
							<option value='������'>������</option>
							<option value='����'>����</option>
						</select>
					</td>
	
					<th>�Ҽ�</th>
					<td>
						<input type="text" name="position" value="" style="width: 150px"/>
					</td>
				</tr>
	
				<tr>
					<th>* ��ȥ����</th>
					<td>
						<label><input type="radio" name="married" class="radiobtn" value="��ȥ"
								checked="checked"/>��ȥ</label>
						<label><input type="radio" name="married" class="radiobtn" value="��ȥ"/>��ȥ</label>
					</td>
	
					<th>�ڳ��</th>
					<td>
						<select name="children">
							<option value='' selected>����</option>
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
						<input type="text" name="tel_first" value=""/>&nbsp;-&nbsp;
						<input type="text" name="tel_second" value=""/>&nbsp;-&nbsp;
						<input type="text" name="tel_third" value=""/>&nbsp;&nbsp;
						<label><input type="radio" class="radiobtn" name="tel_check" value="��"
						 checked="checked"/>��</label>
						<label><input type="radio" class="radiobtn" name="tel_check" value="����"/>����</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3">�޴���&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="text" name="mobile_first" value=""/>&nbsp;-&nbsp;
						<input type="text" name="mobile_second" value=""/>&nbsp;-&nbsp;
						<input type="text" name="mobile_third" value=""/>&nbsp;
						&nbsp;&nbsp;&nbsp;�̵���Ż�
						<label><input type="radio" class="radiobtn" name="mobile_check" value="SKT"
						 checked="checked"/>SKT</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="KTF"/>KTF</label>
						<label><input type="radio" class="radiobtn" name="mobile_check" value="LGT"/>LGT</label>
					</td>
				</tr>
	
				<tr>
					<td colspan="3" style="color:red">�� ��ȭ��ȣ�� �޴�����ȣ 2���� �� �ϳ��� �ݵ�� �Է��ϼž� �մϴ�.</td>
				</tr>
	
				<tr>
					<th>* �������ּ�</th>
					<td colspan="3">
						<label><input type="radio" class="radiobtn" name="country" value="����"/>����</label>
						<label><input type="radio" class="radiobtn" name="country" value="����"/>����</label>
						<input type="text" name="address" value="" style="width: 300px"/>
					</td>
				</tr>
	
			</table>
	
			<br><input type="submit" value="ȸ������" style="width:150px; height:30px"/>
			&nbsp;&nbsp;<input type="reset" value="�ٽ� �Է�" style="width:100px; height:30px"/>
		</form>

	</div>

</body>
</html>
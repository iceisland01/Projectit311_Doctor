<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://fonts.googleapis.com/css?family=Prompt&display=swap" rel="stylesheet">
  <link rel="shortcut icon" href="img/favicon.png">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<meta charset="UTF-8">
	<title>สำหรับเจ้าหน้าที่</title>

	  <style>
      a.ex1 {
        margin-left:25px;
      }
      h4.textside{
        margin-top: 35px;
        margin-bottom: 35px;
      }
      .textside{
        margin-top: 35px;
        margin-bottom: 35px;
      }
      .textside1{
        margin-left: 15px;
        margin-right: 15px;
        width: 250px;
        height: 250px;
      }
      .textside2{
        margin-left: 15px;
        margin-right: 15px;
      }
      .imgsize{
        margin-left: 25px;
        margin-right: 25px;
        margin-bottom: 15px;
        width: 20%;
      }
      .footer{
        background-color: #dddffa;
        padding: 10px;
        text-align: center;
      }
      .footer1{
        background-color: #b3d9ff;
        padding: 10px;
        text-align: center;
      }
      body{
         font-family: 'Prompt', sans-serif;
         background-color: #dbeefc;
      }
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light container">
  <img src="img/cropped-sanpakoi-logo-web.png" alt="logo" style="width: 30%;">
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle ex1" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          ความรู้หมอเก่ง 
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <a class="dropdown-item" href="http://taninnit.com/category/infographic">Infographic</a>
          <a class="dropdown-item" href="http://taninnit.com/category/general-knowledge-menu/back_pain">ปวดหลัง</a>
          <a class="dropdown-item" href="http://taninnit.com/category/general-knowledge-menu/knee-km">ปวดเข่า</a>
          <a class="dropdown-item" href="http://taninnit.com/category/general-knowledge-menu/osteoporosis-km">กระดูกพรุน</a>
          <a class="dropdown-item" href="http://taninnit.com/category/general-knowledge-menu/neck-km">ปวดคอ</a>
          <a class="dropdown-item" href="http://taninnit.com/category/general-knowledge-menu/shoulder_pain">ปวดไหล่</a>
          <a class="dropdown-item" href="http://taninnit.com/category/general-knowledge-menu/general-km">ทั่วไป</a>
        </div>
      </li>
      <li class="nav-item ">
        <a class="nav-link ex1" href="index.jsp">หน้าเเรก</a>
      </li>
       <li class="nav-item ">
        <a class="nav-link ex1" href="profileThai.jsp">รู้จักหมอเก่ง</a>
      </li>
      <li class="nav-item">
        <a class="nav-link ex1" href="profileEng.jsp">Doctor's Profile</a>
      </li>
      <li class="nav-item">
        <a class="nav-link ex1" href="contact.jsp">ติดต่อ</a>
      </li>
      <li class="nav-item ">
        <a class="nav-link ex1" href="employeelogin.jsp">เฉพาะเจ้าหน้าที่</a>
    </ul>
  </div>
</nav>
		<div class=" container textside">
			<h3 style="text-align:center;">สำหรับเจ้าหน้าที่</h3>
			<table>
				<tr>
					<td><img src="img/iconFinish/ทำบัตรผู้ป่วย.png" alt="logo"></td>
          			<td><img src="img/iconFinish/จัดคิวผู้ป่วย.png" alt="logo"></td>
					<td><img src="img/iconFinish/ชำระค่ารักษา.png" alt="logo"></td>
				</tr>
			</table>
		</div>
<!-- Footer -->
    <footer class="footer container">
      <div class="footer1 ">
        <div class="row">
          <div class="col-md-6">
            <p>สันป่าข่อยคลินิก (หมอเก่ง)คลินิกกระดูกและข้อ จ.เชียงใหม่ <br> ที่ตั้ง 271 ถ.เจริญเมือง ต.วัดเกต อ.เมือง จ.เชียงใหม่ 50000<br>โทร. 081-5303666, 053-266725</p>

            <p>
              เวลาทำการ<br>จันทร์-ศุกร์ เวลา 17:00-19:00 น.<br>เสาร์-อาทิตย์ เวลา 09:00-12:00 น.
            </p>
            	<img src="img\minilogo.png" alt="logo" style="text-align:center;">
          </div>
    <div class="col-md-6 ">
            <p>
              Sanpakoi Clinic (Doctor Keng) <br> 271, Cha Roen Muang Road, Tambon Watket, Muang District, Chiang Mai, Thailand<br> Tel. +6681-5303666, +6653-266725
            </p>
            	<p><B>สเเกน QR CODE FB :Taninnit Leerapun ด้านล่าง</B></p>
            <img class="textside2" src="img\taninit.png" alt="qrcode">
            <p> FB: <a href="https://www.facebook.com/taninnit">Taninnit Leerapun</a></p>
          </div>
        </div>
      </div>
      <!-- Copyright -->
      <div class="footer-copyright text-center py-3"> ITSCI Server Side Programming IT311 © 2019 Copyright:</a>
      </div>
      <!-- Copyright -->

    </footer>
    <!-- Footer -->

</body>

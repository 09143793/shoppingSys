<%@ page language="java" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>产品</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.useso.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<!--//fonts-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
				<script type="text/javascript">
					jQuery(document).ready(function($) {
						$(".scroll").click(function(event){		
							event.preventDefault();
							$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
						});
					});
				</script>

<script>$(document).ready(function(c) {
	$('.alert-close').on('click', function(c){
		$('.message').fadeOut('slow', function(c){
	  		$('.message').remove();
		});
	});	  
});
</script>
<script>$(document).ready(function(c) {
	$('.alert-close1').on('click', function(c){
		$('.message1').fadeOut('slow', function(c){
	  		$('.message1').remove();
		});
	});	  
});
</script>
</head>
<body>
<%@include file="dj.jsp" %>
	<!---->
		<div class="container">
			<div class="single">
				<div class="col-md-9 top-in-single">
					<div class="col-md-5 single-top">	
						<!-- start product_slider -->
				    <div class="flexslider">
							        <!-- FlexSlider -->
										<script src="js/imagezoom.js"></script>
										  <script defer src="js/jquery.flexslider.js"></script>
										<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

										<script>
										// Can also be used with $(document).ready()
										$(window).load(function() {
										  $('.flexslider').flexslider({
											animation: "slide",
											controlNav: "thumbnails"
										  });
										});
										</script>
									<!-- //FlexSlider-->

							  <ul class="slides">
								<li data-thumb="images/si1.jpg">
									<div class="thumb-image"> <img src="images/si1.jpg" data-imagezoom="true" class="img-responsive"> </div>
								</li>
								<li data-thumb="images/si2.jpg">
									 <div class="thumb-image"> <img src="images/si2.jpg" data-imagezoom="true" class="img-responsive"> </div>
								</li>
								<li data-thumb="images/si.jpg">
								   <div class="thumb-image"> <img src="images/si.jpg" data-imagezoom="true" class="img-responsive"> </div>
								</li>
								<li data-thumb="images/si1.jpg">
								   <div class="thumb-image"> <img src="images/si1.jpg" data-imagezoom="true" class="img-responsive"> </div>
								</li>
							  </ul>
							<div class="clearfix"></div>
					</div>
				<!-- end product_slider -->

					</div>	
					<div class="col-md-7 single-top-in">
						<div class="single-para">
							<h4>商品1</h4>
							<div class="para-grid">
								<span  class="add-to">$32.8</span>
								<a href="#" class="hvr-shutter-in-vertical cart-to">加入购物车</a>					
								<div class="clearfix"></div>
							 </div>
							<h5>100 商品</h5>
							<div class="available">
								<h6>你能选的 :</h6>
								<ul>
									<li>颜色:
										<select>
										<option>银色</option>
										<option>黑色</option>
										<option>特别黑的色 </option>
										<option>红</option>
									</select></li>
								<li>型号:<select>
									<option>L</option>
									<option>M</option>
									<option>S</option>
									<option>XL</option>
									<option>SM</option>
								</select></li>
								<li>质量:<select>
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select></li>
							</ul>
						</div>
							<p>这里写的应该是商品描述。</p>
							
								<a href="#" class="hvr-shutter-in-vertical ">更多细节</a>	<br>		
						</div><br/>
		<form action="PL" method="post">
		<table>
		<tr>商品评论：<input type="text" value="" name="pinglun"></tr>
		<tr><input type="submit" value="提交"></tr>
		</table>
		</form>
					</div>
				<div class="clearfix"> </div>
				<div class="content-top-in">
						<div class="col-md-4 top-single">
							<div class="col-md">
								<img  src="images/pic8.jpg" alt="" />	
								<div class="top-content">
									<h5>Mascot Kitty - White</h5>
									<div class="white">
										<a href="#" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">ADD TO CART</a>
										<p class="dollar"><span class="in-dollar">$</span><span>2</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
						<div class="col-md-4 top-single">
							<div class="col-md">
								<img  src="images/pic9.jpg" alt="" />	
								<div class="top-content">
									<h5>Mascot Kitty - White</h5>
									<div class="white">
										<a href="#" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">$</span><span>2</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
						<div class="col-md-4 top-single-in">
							<div class="col-md">
								<img  src="images/pic10.jpg" alt="" />	
								<div class="top-content">
									<h5>Mascot Kitty - White</h5>
									<div class="white">
										<a href="#" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">$</span><span>2</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
						
					<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-3">
					<div class="single-bottom">
						<h4>分类</h4>
						<ul>
						<li><a href="#"><i> </i>春季新品</a></li>
						<li><a href="#"><i> </i>上装</a></li>
						<li><a href="#"><i> </i>裙装</a></li>
						<li><a href="#"><i> </i>裤装</a></li>
						<li><a href="#"><i> </i>配饰</a></li>
						</ul>
					</div>
					<div class="single-bottom">
						<h4>产品</h4>
						<ul>
						<li><a href="#"><i> </i>1</a></li>
						<li><a href="#"><i> </i>2</a></li>
						<li><a href="#"><i> </i>3</a></li>
						<li><a href="#"><i> </i>4</a></li>
						<li><a href="#"><i> </i> 5</a></li>
						</ul>
					</div>
					<div class="single-bottom">
						<h4>这个</h4>
							<div class="product">
								<img class="img-responsive fashion" src="images/st1.jpg" alt="">
							<div class="grid-product">
								<a href="#" class="elit">elite1</a>
								<span class="price price-in"><small>$500.00</small> $400.00</span>
							</div>
							<div class="clearfix"> </div>
							</div>
							<div class="product">
								<img class="img-responsive fashion" src="images/st2.jpg" alt="">
							<div class="grid-product">
								<a href="#" class="elit">eliter2</a>
								<span class="price price-in"><small>$500.00</small> $400.00</span>
							</div>
							<div class="clearfix"> </div>
							</div>
							<div class="product">
								<img class="img-responsive fashion" src="images/st3.jpg" alt="">
							<div class="grid-product">
								<a href="#" class="elit">eliter3</a>
								<span class="price price-in"><small>$500.00</small> $400.00</span>
							</div>
							<div class="clearfix"> </div>
							</div>
				</div>
				</div>
				<div class="clearfix"> </div>
		</div>
	</div>
		<div class="footer">
			<div class="footer-top">
				<div class="container">
					<div class="col-md-4 footer-in">
						<h4><i> </i>消费者保障</h4>
						<p>保障范围 &nbsp;&nbsp;&nbsp;&nbsp;  退货退款范围 &nbsp;&nbsp;&nbsp;&nbsp;  服务中心 &nbsp&nbsp&nbsp&nbsp 更多特色服务   </p>
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="cross"> </i>支付方式</h4>
						<p>快捷支付 &nbsp;&nbsp;&nbsp;&nbsp; 支付宝 &nbsp;&nbsp;&nbsp;&nbsp; 银行卡支付 &nbsp;&nbsp;&nbsp;&nbsp; 借条支付 &nbsp;&nbsp;&nbsp;&nbsp;</p>
					</div>
					<div class="col-md-4 footer-in">
						<h4><i class="down"> </i>新手上路</h4>
						<p>新手专区 &nbsp;&nbsp;&nbsp;&nbsp; 消费警示 &nbsp;&nbsp;&nbsp;&nbsp; 交易安全 &nbsp;&nbsp;&nbsp;&nbsp; 新手24小时在线帮助 &nbsp;&nbsp;&nbsp;&nbsp; 免费开店  </p>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!---->
			<div class="footer-middle">
				<div class="container">
					<div class="footer-middle-in">
						<h6>关于我们</h6>
						<p>一个B2C网站</p>
					</div>
					<div class="footer-middle-in">
						<h6>服务保障</h6>
						<ul>
							<li><a href="#">品牌真品防伪码</a></li>
							<li><a href="#">正品保证</a></li>
							<li><a href="#">30天无条件退货</a></li>
							<li><a href="#">邮箱***@so.com</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>客服服务</h6>
						<ul>
							<li><a href="contact.html">联系我们</a></li>
							<li><a href="#">返回顶部</a></li>
							<li><a href="#">差看地图</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>支付管理</h6>
						<ul>
							<li><a href="account.html">我的账户</a></li>
							<li><a href="#">历史订单</a></li>
							<li><a href="wishlist.html">我的收藏</a></li>
							<li><a href="#">我的足迹</a></li>
						</ul>
					</div>
					<div class="footer-middle-in">
						<h6>配送服务	</h6>
						<ul>
							<li><a href="#">包邮政策</a></li>
							<li><a href="#">配送说明</a></li>
							<li><a href="#">运费说明</a></li>
							<li><a href="#">验货签收</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<p class="footer-class"><a target="_blank" href="http://sc.chinaz.com/moban/"></a></p>
			<script type="text/javascript">
						$(document).ready(function() {
							/*
							var defaults = {
					  			containerID: 'toTop', // fading element id
								containerHoverID: 'toTopHover', // fading element hover id
								scrollSpeed: 1200,
								easingType: 'linear' 
					 		};
							*/
							
							$().UItoTop({ easingType: 'easeOutQuart' });
							
						});
					</script>
				<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>

		</div>
</body>
</html>
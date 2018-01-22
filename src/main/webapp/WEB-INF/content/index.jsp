<%@ page language="java" contentType="text/html; charset=utf-8" import="java.util.*,cn.edu.cumt.ec.service.SessionListener,cn.edu.cumt.ec.entity.ApplicationConstants,cn.edu.cumt.ec.action.login"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
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
<!--slider-script-->
		<script src="js/responsiveslides.min.js"></script>
			<script>
				$(function () {
				  $("#slider1").responsiveSlides({
					auto: true,
					speed: 500,
					namespace: "callbacks",
					pager: true,
				  });
				});
			</script>
<!--//slider-script-->
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



 
 <!--header-->
	<div class="header">
		<div class="header-top">
			<div class="container">	
			<div class="header-top-in">			
				<div class="logo">
					<a href="index.html"><img src="images/logo.png" alt=" " ></a>
				</div>
				<div class="header-in">
					<ul class="icon1 sub-icon1">
							<li  ><a href="wishlist.html">我的收藏 (0)</a> </li>
							<li  ><a href="account.html"> 我的账户</a></li>
							<li ><a href="cart" > 购物车</a></li>
							<li ><a href="adminlogin" > 管理员登录</a></li>
							<li > <a href="checkout.html" >退出</a> </li>	
							<li><div class="cart">
									<a href="#" class="cart-in"> </a>
									<span> 0</span>
								</div>
								<ul class="sub-icon1 list">
						  <h3>Recently added items(2)</h3>
						  <div class="shopping_cart">
							  <div class="cart_box">
							   	 <div class="message">
							   	     <div class="alert-close"> </div> 
					                <div class="list_img"><img src="images/14.jpg" class="img-responsive" alt=""></div>
								    <div class="list_desc"><h4><a href="#">velit esse molestie</a></h4>1 x<span class="actual">
		                             $12.00</span></div>
		                              <div class="clearfix"></div>
                                </div>
                            </div>
	                            <div class="cart_box1">
								  <div class="message1">
							   	     <div class="alert-close1"> </div> 
					                <div class="list_img"><img src="images/15.jpg" class="img-responsive" alt=""></div>
								    <div class="list_desc"><h4><a href="#">velit esse molestie</a></h4>1 x<span class="actual">
		                             $12.00</span></div>
		                              <div class="clearfix"></div>
	                              </div>
	                            </div>
	                        </div>
	                        <div class="total">
	                        	<div class="total_left">CartSubtotal : </div>
	                        	<div class="total_right">$250.00</div>
	                        	<div class="clearfix"> </div>
	                        </div>
                            <div class="login_buttons">
							  <div class="check_button"><a href="checkout.html">Check out</a></div>
							  <div class="clearfix"></div>
						    </div>
					      <div class="clearfix"></div>
						</ul>
							</li>
				  </ul>
				</div>
				<div class="clearfix"> </div>
			</div>
			</div>
		</div>
		<div class="header-bottom">
		<div class="container">
			<div class="h_menu4">
				<a class="toggleMenu" href="#">Menu</a>
				<ul class="nav">
					<li class="active"><a href="index.html"><i> </i>首页</a></li>
						<li ><a href="#" >商品</a>
						<ul class="drop">
							<li><a href="show">春季新品</a></li>
							<li><a href="show">上装</a></li>
							<li><a href="show">裙装</a></li>
							<li><a href="show"> 裤装</a></li>
							<li><a href="show">配饰</a></li>
						</ul>
						</li> 						
						<li><a href="contact.html" >与我联系</a></li>
				</ul>
				<script type="text/javascript" src="js/nav.js"></script>
			</div>
		</div>
		</div>
<p class="wel">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;在线人数为：${applicationScope.counter}</p>
		<div class="header-bottom-in">
			<div class="container">
			<div class="header-bottom-on">		
			<p class="wel"><a href="registerForm">欢迎进入，您可以登陆/注册</a></p>
			<div class="header-can">
<				<ul class="social-in">
						<li><a href="#"><i> </i></a></li>
						<li><a href="#"><i class="facebook"> </i></a></li>
						<li><a href="#"><i class="twitter"> </i></a></li>					
						<li><a href="#"><i class="skype"> </i></a></li>
			  </ul>	
					
					<div class="search">
						<form>
							<input type="text" value="搜索" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '';}" >
							<input type="submit" value="">
						</form>
					</div>
					<div class="clearfix"> </div>
			</div>
			<div class="clearfix"></div>
		</div>
		</div>
		</div>
	</div>
	
	<div class="banner-mat">
		<div class="container">
			<div class="banner">
	
				<!-- Slideshow 4 -->
			   <div class="slider">
			<ul class="rslides" id="slider1">
			  <li><img src="images/banner.jpg" alt="" width="1000" height="350">			  </li>
			  <li><img src="images/banner1.jpg" alt="">
			  </li>
			  <li><img src="images/banner2.jpg" alt="">
			  </li>
			  <li><img src="images/banner3.jpg" alt="">
			  </li>
			</ul>
		</div>

				<div class="banner-bottom">
					<div class="banner-matter">
						<p>暮春初夏&nbsp&nbsp;&nbsp&nbsp;夏季焕新&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp&nbsp;</p> 
						<a href="single.html" class="hvr-shutter-in-vertical ">购买</a>
				  </div>
					<div class="purchase">
						<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">购买</a>					</div>
					<div class="clearfix"></div>
				</div>
			</div>				
			<!-- //slider-->
		</div>
	</div>
		<!---->
		<div class="container">
			<div class="content">
				<div class="content-top">
					<h3 class="future">精选</h3>
					<div class="content-top-in">
						<div class="col-md-3 md-col">
							<div class="col-md">
								<a href="single.html"><img  src="images/pi.jpg" alt="" /></a>	
								<div class="top-content">
									<h5><a href="single.html">T恤1</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2 ">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span>99</p>
										<div class="clearfix"></div>
									</div>

								</div>							
							</div>
						</div>
						<div class="col-md-3 md-col">
							<div class="col-md">
								<a href="single.html"><img  src="images/pi1.jpg" alt="" />	</a>
								<div class="top-content">
									<h5><a href="single.html">T恤2</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span><span>9</span><span>0</span></p>
										<div class="clearfix"></div>
								  </div>
								</div>							
							</div>
						</div>
						<div class="col-md-3 md-col">
							<div class="col-md">
								<a href="single.html"><img  src="images/pi2.jpg" alt="" /></a>	
								<div class="top-content">
									<h5><a href="single.html">Little Fella</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span><span>5</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
						<div class="col-md-3 md-col">
							<div class="col-md">
								<a href="single"><img  src="images/si11.jpg" alt="" /></a>	
								<div class="top-content">
									<h5><a href="single.html">Astral Cruise</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span>9<span>5</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div>
						</div>
					<div class="clearfix"></div>
					</div>
				</div>
				<!---->
				<div class="content-middle">
					<h3 class="future">品牌</h3>
					<div class="content-middle-in">
					<ul id="flexiselDemo1">			
						<li><img src="images/ap.png"/></li>
						<li><img src="images/ap1.png"/></li>
						<li><img src="images/ap2.png"/></li>
						<li><img src="images/ap3.png"/></li>
					
					</ul>
            		<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo1").flexisel({
				visibleItems: 4,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	</script>
	<script type="text/javascript" src="js/jquery.flexisel.js"></script>

					</div>
				</div>
				<!---->
				<div class="content-bottom">
					<h3 class="future">最新</h3>
					<div class="content-bottom-in">
					<ul id="flexiselDemo2">			
						<li><div class="col-md men">
								<a href="single.html" class="compare-in "><img  src="images/pi4.jpg" alt="" />
								<div class="compare in-compare">
									<span>同款比较</span>
									<span>加入收藏</span>
								</div></a>
								<div class="top-content bag">
									<h5><a href="single.html">Symbolic Bag</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2" action="buy">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span><span>24</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
						<li><div class="col-md men">
								<a href="single.html" class="compare-in "><img  src="images/pi5.jpg" alt="" />
								<div class="compare in-compare">
									<span>同款比较</span>
									<span>加入收藏</span>
								</div></a>	
								<div class="top-content bag">
									<h5><a href="single.html">Interesting Read</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span><span>15</span><span>5</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
						<li><div class="col-md men">
								<a href="single.html" class="compare-in "><img  src="images/pi6.jpg" alt="" />
								<div class="compare in-compare">
									<span>同款比较</span>
									<span>加入收藏</span>
								</div></a>	
								<div class="top-content bag">
									<h5><a href="single.html">The Carter</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span><span>11</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
						<li><div class="col-md men">
								<a href="single.html" class="compare-in "><img  src="images/pi7.jpg" alt="" />
								<div class="compare in-compare">
									<span>同款比较</span>
									<span>加入收藏</span>
								</div></a>	
								<div class="top-content bag">
									<h5><a href="single.html">Onesie</a></h5>
									<div class="white">
										<a href="single.html" class="hvr-shutter-in-vertical hvr-shutter-in-vertical2">加入购物车</a>
										<p class="dollar"><span class="in-dollar">¥</span><span>13</span><span>0</span></p>
										<div class="clearfix"></div>
									</div>
								</div>							
							</div></li>
					
					</ul>
					<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo2").flexisel({
				visibleItems: 4,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,    		
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
		    	responsiveBreakpoints: { 
		    		portrait: { 
		    			changePoint:480,
		    			visibleItems: 1
		    		}, 
		    		landscape: { 
		    			changePoint:640,
		    			visibleItems: 2
		    		},
		    		tablet: { 
		    			changePoint:768,
		    			visibleItems: 3
		    		}
		    	}
		    });
		    
		});
	</script>
					</div>
				</div>
				<ul class="start">
					<li ><a href="#"><i></i></a></li>
					<li><span>1</span></li>
					<li class="arrow"><a href="#">2</a></li>
					<li class="arrow"><a href="#">3</a></li>
					<li class="arrow"><a href="#">4</a></li>
					<li class="arrow"><a href="#">5</a></li>
					<li ><a href="#"><i  class="next"> </i></a></li>
				</ul>
			</div>
		</div>
		<!---->
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
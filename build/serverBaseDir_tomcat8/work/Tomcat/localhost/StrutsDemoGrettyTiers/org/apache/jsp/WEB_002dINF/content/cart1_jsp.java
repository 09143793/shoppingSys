/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-19 09:07:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class cart1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/content/dj.jsp", Long.valueOf(1468918071494L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("<html>  \r\n");
      out.write("  <head>  \r\n");
      out.write("    <title>我的收藏</title>  \r\n");
      out.write("  </head>  \r\n");
      out.write("  ");
  
            //加载数据库驱动
    Class.forName("com.mysql.jdbc.Driver").newInstance();  
    //建立数据库连接  
    String url ="jdbc:mysql://localhost:3306/wy?user=root&password=123456&useUnicode=true&characterEncoding=utf-8";  
    Connection conn= DriverManager.getConnection(url);  
    //建立一个Statement对象，用于执行SQL语句  
    Statement stat = conn.createStatement();  
    //执行查询并得到查询结果  
    String sql = "select * from cart1";  
    ResultSet rs = stat.executeQuery(sql);    
  
      out.write("     \r\n");
      out.write("  <body> \r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<!-- Custom Theme files -->\r\n");
      out.write("<!--theme-style-->\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\r\n");
      out.write("<!--//theme-style-->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!--fonts-->\r\n");
      out.write("<link href='http://fonts.useso.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>\r\n");
      out.write("<!--//fonts-->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("\t\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\tjQuery(document).ready(function($) {\r\n");
      out.write("\t\t\t\t\t\t$(\".scroll\").click(function(event){\t\t\r\n");
      out.write("\t\t\t\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\t\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script>\r\n");
      out.write("<!--slider-script-->\r\n");
      out.write("\t\t<script src=\"js/responsiveslides.min.js\"></script>\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\t\t$(function () {\r\n");
      out.write("\t\t\t\t  $(\"#slider1\").responsiveSlides({\r\n");
      out.write("\t\t\t\t\tauto: true,\r\n");
      out.write("\t\t\t\t\tspeed: 500,\r\n");
      out.write("\t\t\t\t\tnamespace: \"callbacks\",\r\n");
      out.write("\t\t\t\t\tpager: true,\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("<!--//slider-script-->\r\n");
      out.write("<script>$(document).ready(function(c) {\r\n");
      out.write("\t$('.alert-close').on('click', function(c){\r\n");
      out.write("\t\t$('.message').fadeOut('slow', function(c){\r\n");
      out.write("\t  \t\t$('.message').remove();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\t  \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<script>$(document).ready(function(c) {\r\n");
      out.write("\t$('.alert-close1').on('click', function(c){\r\n");
      out.write("\t\t$('.message1').fadeOut('slow', function(c){\r\n");
      out.write("\t  \t\t$('.message1').remove();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\t  \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--header-->\r\n");
      out.write("\t<div class=\"header\">\r\n");
      out.write("\t\t<div class=\"header-top\">\r\n");
      out.write("\t\t\t<div class=\"container\">\t\r\n");
      out.write("\t\t\t<div class=\"header-top-in\">\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"index.html\"><img src=\"images/logo.png\" alt=\" \" ></a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"header-in\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"icon1 sub-icon1\">\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"cart1\">我的收藏</a> </li>\r\n");
      out.write("\t\t\t\t\t\t\t<li  ><a href=\"account.html\"> 我的账户</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"cart\" > 购物车</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li ><a href=\"adminlogin\" > 管理员登录</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li > <a href=\"checkout.html\" >退出</a> </li>\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><div class=\"cart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"cart-in\"> </a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span> 0</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"sub-icon1 list\">\r\n");
      out.write("\t\t\t\t\t\t  <h3>最近购买(2)</h3>\r\n");
      out.write("\t\t\t\t\t\t  <div class=\"shopping_cart\">\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"cart_box\">\r\n");
      out.write("\t\t\t\t\t\t\t   \t <div class=\"message\">\r\n");
      out.write("\t\t\t\t\t\t\t   \t     <div class=\"alert-close\"> </div> \r\n");
      out.write("\t\t\t\t\t                <div class=\"list_img\"><img src=\"images/1.jpg\" class=\"img-responsive\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <div class=\"list_desc\"><h4><a href=\"#\">velit esse molestie</a></h4>1 x<span class=\"actual\">\r\n");
      out.write("\t\t                             $12.00</span></div>\r\n");
      out.write("\t\t                              <div class=\"clearfix\"></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\t                            <div class=\"cart_box1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"message1\">\r\n");
      out.write("\t\t\t\t\t\t\t   \t     <div class=\"alert-close1\"> </div> \r\n");
      out.write("\t\t\t\t\t                <div class=\"list_img\"><img src=\"images/15.jpg\" class=\"img-responsive\" alt=\"\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t    <div class=\"list_desc\"><h4><a href=\"#\">velit esse molestie</a></h4>1 x<span class=\"actual\">\r\n");
      out.write("\t\t                             $12.00</span></div>\r\n");
      out.write("\t\t                              <div class=\"clearfix\"></div>\r\n");
      out.write("\t                              </div>\r\n");
      out.write("\t                            </div>\r\n");
      out.write("\t                        </div>\r\n");
      out.write("\t                        <div class=\"total\">\r\n");
      out.write("\t                        \t<div class=\"total_left\">CartSubtotal : </div>\r\n");
      out.write("\t                        \t<div class=\"total_right\">$250.00</div>\r\n");
      out.write("\t                        \t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t                        </div>\r\n");
      out.write("                            <div class=\"login_buttons\">\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"check_button\"><a href=\"checkout.html\">Check out</a></div>\r\n");
      out.write("\t\t\t\t\t\t\t  <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t\t      <div class=\"clearfix\"></div>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"header-bottom-in\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"header-bottom-on\">\r\n");
      out.write("\t\t\t<div class=\"header-can\">\r\n");
      out.write("\t\t\t\t<ul class=\"social-in\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"facebook\"> </i></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twitter\"> </i></a></li>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"skype\"> </i></a></li>\r\n");
      out.write("\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" value=\"搜索\" onFocus=\"this.value = '';\" onBlur=\"if (this.value == '') {this.value = '';}\" >\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t<div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write(" \r\n");
      out.write("    <h2 align=\"center\">我的收藏</h2>  \r\n");
      out.write("    <hr>  \r\n");
      out.write("    <table border=\"1\" width=\"600\" align=\"center\">  \r\n");
      out.write("        <tr bgcolor=\"#dddddd\">  \r\n");
      out.write("            <td align=\"center\" width=\"80\">商品名称</td>   \r\n");
      out.write("            <td align=\"center\">商品单价</td>  \r\n");
      out.write("            <td align=\"center\" width=\"100\"></td>  \r\n");
      out.write("            <td align=\"center\" width=\"100\">金额</td>  \r\n");
      out.write("            <td align=\"center\" width=\"100\">删除商品</td>  \r\n");
      out.write("        </tr>  \r\n");
      out.write("        ");
  
            String id,name,count; 
        		int price,num;
        		int cp=0;
            //将查询结果集中的记录输出到页面上  
            while (rs.next()){  
                //从当前记录中读取各字段的值  
                id = rs.getString("id");  
                name = rs.getString("name");  
                price = rs.getInt("price");  
                num = rs.getInt("num");  
                count = rs.getString("count");  
                 cp=cp+num*price; 
                out.println("<tr>");  
                out.println("<td>"+ name +"</td>");  
                out.println("<td>"+ price +"</td>");  
                out.println("<td><input type=text value="+ num +" onChange=\"updatenum('"+id+"',this.value,'"+price+"')\"></td>");  
                out.println("<td>"+ count +"</td>");  
                out.println("<td><a href='buy?sp=del&id="+id+"'>取消收藏</a></td>");  
                out.println("</tr>");  
            }  
           
        
      out.write("       \r\n");
      out.write("    </table>  \r\n");
      out.write("    <br>  \r\n");
      out.write("   <div align=\"center\"><a href=\"show\" >继续逛逛</a>    \r\n");
      out.write("    <a href=\"buy?sp=clear\" >全部取消</a>  \r\n");
      out.write("\t<input type=\"submit\" value=\"确认购买并生成订单\">\r\n");
      out.write("\t</div> \t\t\t\t\t\t\t            \r\n");
      out.write("  </body>  \r\n");
      out.write("  <script language=\"javascript\">  \r\n");
      out.write("    function updatenum(id,num,price){  \r\n");
      out.write("        var url = \"buy?sp=update&id=\"+id+\"&num=\"+num+\"&price=\"+price;  \r\n");
      out.write("        window.location = url;  \r\n");
      out.write("    }  \r\n");
      out.write("  </script>    \r\n");
      out.write("</html>  ");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
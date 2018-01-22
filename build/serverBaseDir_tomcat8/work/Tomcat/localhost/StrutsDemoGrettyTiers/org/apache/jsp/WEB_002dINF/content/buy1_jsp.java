/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2016-07-19 09:07:50 UTC
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

public final class buy1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html;charset=utf-8");
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
  
    //装载MySQL5.5的JDBC驱动  
    Class.forName("com.mysql.jdbc.Driver").newInstance();  
    //建立数据库连接  
    String url ="jdbc:mysql://localhost:3306/wy?user=root&password=123456&useUnicode=true&characterEncoding=utf-8";  
    Connection conn= DriverManager.getConnection(url);  
    PreparedStatement pstat = null;  
    ResultSet rs = null;  
    String sql = null;  
    String sp = request.getParameter("sp");  
       
    
    	
 if (sp.equals("add")){  
        //从商品库中取出所选购商品的数据  
        String bm = request.getParameter("bm");  
        String name=request.getParameter("r1"); 
        String price=request.getParameter("r2");
        
      
       
        //将所选购商品加入到购物车中  
        sql = "insert into cart(name,price,num,count) values(?,?,?,?)";  
        pstat = conn.prepareStatement(sql);  
        pstat.setString(1,name);  
        pstat.setString(2,price);  
        pstat.setInt(3,1);  
        pstat.setString(4,price);
        pstat.executeUpdate();  
        pstat.close();  
          
        //关闭数据库连接  
        conn.close();  
          
        //重定向到购物车页面  
        response.sendRedirect("cart2");    
    }
    //更改商品的数量  
    if (sp.equals("update")){  
        int id = Integer.parseInt(request.getParameter("id"));  
        int num = Integer.parseInt(request.getParameter("num"));  
        double price=Double.parseDouble(request.getParameter("price"));  
        sql = "update cart set num = ?, count = ? where id=?";  
        pstat = conn.prepareStatement(sql);  
        pstat.setInt(1,num);  
        pstat.setString(2,new Double(price*num).toString());  
        pstat.setInt(3,id);  
        pstat.executeUpdate();  
        pstat.close();  
          
        //关闭数据库连接  
        conn.close();  
          
        //重定向到购物车页面  
        response.sendRedirect("cart2");  
    }     
      
    //将商品退回到商品架(将商品从购物车中删除)  
    if (sp.equals("del")){  
        int id = Integer.parseInt(request.getParameter("id"));  
        sql = "delete from cart where id=?";  
        pstat = conn.prepareStatement(sql);  
        pstat.setInt(1,id);  
        pstat.executeUpdate();  
        pstat.close();    
          
        //关闭数据库连接  
        conn.close();  
          
        //重定向到购物车页面  
        response.sendRedirect("cart1");  
    }  
      
    //清空购物车  
    if (sp.equals("clear")){  
        sql = "delete from cart";  
        pstat = conn.prepareStatement(sql);  
        pstat.executeUpdate();  
        pstat.close();  
          
        //关闭数据库连接  
        conn.close();  
          
        //重定向到购物车页面  
        response.sendRedirect("cart2");  
    }  

      out.write(' ');
      out.write(' ');
      out.write(' ');
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

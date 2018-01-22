package cn.edu.cumt.ec.action;


import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.junit.Test;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.entity.User;
import cn.edu.cumt.ec.service.UserService;

public class logintest {

	@Test
	public void execute() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		ServletContext sc=request.getSession().getServletContext();
		sc.setAttribute("username","1");//
	    UserDaoJDBCImpl userDaojdbcimpl=new UserDaoJDBCImpl();
	    UserService userService=new UserService();
	    User user=new User();
		userService.setUserDao(userDaojdbcimpl);
		
		if( userService.loginDatabase("1","2")==true){
			HttpSession session=request.getSession();
			user.setUsername("1");
			user.setPassword("2");
			session.setAttribute("username", "1");
			// Ìí¼ÓCookie
						if ("3"!=null){
							
						Cookie a = new Cookie("username" , "1");
						Cookie b = new Cookie("password" , "2");
						a.setMaxAge(365 * 24 * 60 * 60);
						b.setMaxAge(365 * 24 * 60 * 60);
						ServletActionContext.getResponse().addCookie(a);
					    ServletActionContext.getResponse().addCookie(b);
						}
						else{
							Cookie a=new Cookie("username","1");
							Cookie b=new Cookie("password","2");
							a.setMaxAge(0);
							b.setMaxAge(0);
							ServletActionContext.getResponse().addCookie(a);
						    ServletActionContext.getResponse().addCookie(b);
						}
				ActionContext ctx=ActionContext.getContext();
					Integer counter=(Integer)ctx.getApplication().get("counter");
					if(counter==null){counter=1;}
					else{
						counter=counter+1;
					}
					//¼ÆÊý
					
					ctx.getApplication().put("counter", counter);

					
						System.out.println("success");
					}else{
						System.out.println("success");
					}	
				}

}



package cn.edu.cumt.ec.action;

import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.UserDaoJDBCImpl;
import cn.edu.cumt.ec.service.UserService;
import cn.edu.cumt.ec.entity.User;

public class login extends ActionSupport  {
	private String username;
	private String password;
	private String isUseCookie;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIsUseCookie() {
		return isUseCookie;
	}
	public void setIsUseCookie(String isUseCookie) {
		this.isUseCookie = isUseCookie;
	}
	public String execute() throws Exception{
		HttpServletRequest request=ServletActionContext.getRequest();
		ServletContext sc=request.getSession().getServletContext();
		sc.setAttribute("username",getUsername());//
	    UserDaoJDBCImpl userDaojdbcimpl=new UserDaoJDBCImpl();
	    UserService userService=new UserService();
	    User user=new User();
		userService.setUserDao(userDaojdbcimpl);
		
		if( userService.loginDatabase(getUsername(),getPassword())==true){
			HttpSession session=request.getSession();
			user.setUsername(username);
			user.setPassword(password);
			session.setAttribute("username", username);
			// 添加Cookie
						if (getIsUseCookie()!=null){
							
						Cookie a = new Cookie("username" , getUsername());
						Cookie b = new Cookie("password" , getPassword());
						a.setMaxAge(365 * 24 * 60 * 60);
						b.setMaxAge(365 * 24 * 60 * 60);
						ServletActionContext.getResponse().addCookie(a);
					    ServletActionContext.getResponse().addCookie(b);
						}
						else{
							Cookie a=new Cookie("username",getUsername());
							Cookie b=new Cookie("password",getPassword());
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
					//计数
					
					ctx.getApplication().put("counter", counter);

					
						return SUCCESS;
					}else{
						return ERROR;
					}	
				}

			}

	/*		ActionContext.getContext().getSession().put("username", getUsername());
			//设置cookie记住密码
			if(getIsUseCookie()!=null){
				
			        Cookie cookiename = new Cookie("username", getUsername());
			        Cookie cookieword = new Cookie("password", getPassword());
			        cookiename.setMaxAge(60*60*24);
			        cookieword.setMaxAge(60*60*24);
			        ServletActionContext.getResponse().addCookie(cookiename);
			        ServletActionContext.getResponse().addCookie(cookieword); 
				
			}	*/	
// 	当前访问人数：<%=ApplicationConstants.current_login_counter %> 

package cn.edu.cumt.ec.service;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import cn.edu.cumt.ec.entity.ApplicationConstants;
public class SessionListener  implements  HttpSessionListener,HttpSessionAttributeListener  {
	 //session创建的时候调用
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        //在线人数++
        ApplicationConstants.current_login_counter++;
       
        }
 

    //session销毁的时候调用
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
    	 ApplicationConstants.current_login_counter--;//当前用户总数--
    }

    //添加属性的时候被调用
    public void attributeAdded(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        //如果是person
        if(event.getName().equals("user")){
            //当前在线人数++
            ApplicationConstants.current_login_counter++;
            //得到session
            HttpSession session = event.getSession();
           
            //查询该账户有没有在别的机器上登录
            for(HttpSession sess:ApplicationConstants.SESSION_MAP.values()){
               
                if(event.getValue().equals(sess.getAttribute("user"))
                        &&sess.getId()!=session.getId()){
                    sess.invalidate();//销毁session
                }
            }
        }
    }

    //移除属性是被调用
    public void attributeRemoved(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        if(event.getName().equals("user")){
            ApplicationConstants.current_login_counter--;//当前用户总数--
           
        }
    }

    //修改的时候调用
    public void attributeReplaced(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        if(event.getName().equals("user"))
        {
            HttpSession session = event.getSession();
            //重新登录session
            for(HttpSession sess:ApplicationConstants.SESSION_MAP.values()){
               
                //如果新账号在其他机器上登录过，则一切的登录失效
                if(event.getValue().equals(sess.getAttribute("user"))
                        &&sess.getId()!=session.getId()){
                    sess.invalidate();
                }
            }
        }
    }

}


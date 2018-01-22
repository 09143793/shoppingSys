package cn.edu.cumt.ec.service;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import cn.edu.cumt.ec.entity.ApplicationConstants;
public class SessionListener  implements  HttpSessionListener,HttpSessionAttributeListener  {
	 //session������ʱ�����
    public void sessionCreated(HttpSessionEvent sessionEvent) {
        //��������++
        ApplicationConstants.current_login_counter++;
       
        }
 

    //session���ٵ�ʱ�����
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {
    	 ApplicationConstants.current_login_counter--;//��ǰ�û�����--
    }

    //������Ե�ʱ�򱻵���
    public void attributeAdded(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        //�����person
        if(event.getName().equals("user")){
            //��ǰ��������++
            ApplicationConstants.current_login_counter++;
            //�õ�session
            HttpSession session = event.getSession();
           
            //��ѯ���˻���û���ڱ�Ļ����ϵ�¼
            for(HttpSession sess:ApplicationConstants.SESSION_MAP.values()){
               
                if(event.getValue().equals(sess.getAttribute("user"))
                        &&sess.getId()!=session.getId()){
                    sess.invalidate();//����session
                }
            }
        }
    }

    //�Ƴ������Ǳ�����
    public void attributeRemoved(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        if(event.getName().equals("user")){
            ApplicationConstants.current_login_counter--;//��ǰ�û�����--
           
        }
    }

    //�޸ĵ�ʱ�����
    public void attributeReplaced(HttpSessionBindingEvent event) {
        // TODO Auto-generated method stub
        if(event.getName().equals("user"))
        {
            HttpSession session = event.getSession();
            //���µ�¼session
            for(HttpSession sess:ApplicationConstants.SESSION_MAP.values()){
               
                //������˺������������ϵ�¼������һ�еĵ�¼ʧЧ
                if(event.getValue().equals(sess.getAttribute("user"))
                        &&sess.getId()!=session.getId()){
                    sess.invalidate();
                }
            }
        }
    }

}


package cn.edu.cumt.ec.entity;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

public class ApplicationConstants {
	public static Map<String,HttpSession>
	SESSION_MAP=new HashMap<String,HttpSession>();
	public static int current_login_counter=0;
}

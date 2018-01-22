package cn.edu.cumt.ec.action;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.edu.cumt.ec.service.AdminService;

public class ShanchuTest {
	@Test
	public void execute() throws Exception{
		AdminService AdminService=new AdminService();
		if(AdminService.shanchu(1)==true){
			System.out.println("success");
			
			
		}else{
			System.out.println("error");
		}
	}
}

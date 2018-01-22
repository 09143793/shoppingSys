package cn.edu.cumt.ec.action;



import org.junit.Test;

import cn.edu.cumt.ec.service.AdminService;

public class tianJIATest {

	@Test 
	public void execute() throws Exception{
		AdminService AdminService=new AdminService();
		if(AdminService.tianjia(1,"2","3",4,5,"6","7")==true){
			
			
			
		}else{
			System.out.println("error");
		}
	}

}
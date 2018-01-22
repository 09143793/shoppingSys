package cn.edu.cumt.ec.service;

import cn.edu.cumt.ec.dao.AdminDao;

import cn.edu.cumt.ec.dao.AdminDaoJDBCImpl;

public class AdminService {
	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public AdminService(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public AdminService() {
		super();
	}

	public boolean tianjia(int id,  String name, String categoryID, int price,int number,String picture,String picture1) {
		adminDao = new AdminDaoJDBCImpl();
		return adminDao.tianjia(id, name, categoryID, price, number, picture,picture1);

	}

	public boolean shanchu(int id) {
		adminDao = new AdminDaoJDBCImpl();
		return adminDao.shanchu(id);
	}
    public boolean alterItem(int id,String newname, String newcategoryID,int newprice,int newnumber,String newpicture,String newpicture1){
    	return adminDao.alterItem(id,newname,newcategoryID,newprice,newnumber,newpicture,newpicture1);
}
}
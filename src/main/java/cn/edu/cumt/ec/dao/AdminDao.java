package cn.edu.cumt.ec.dao;


public interface AdminDao {
	public  boolean tianjia ( int id,  String name, String categoryID, int price,int number,String picture,String picture1);
    public boolean shanchu(int id);
    public boolean alterItem(int id,String newname, String newcategoryID,int newprice,int newnumber,String newpicture,String newpicture1);
}

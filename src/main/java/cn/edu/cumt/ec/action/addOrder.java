package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.DingdanDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Dingdan;
import cn.edu.cumt.ec.service.DingdanService;

public class addOrder extends ActionSupport {
	private Integer id;
	private String username;
	private String name;
	private String shr;
	private String address;
	private String tel;
	private String zt;

	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShr() {
		return shr;
	}
	public void setShr(String shr) {
		this.shr = shr;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String execute() throws Exception{
		DingdanDaoJDBCImpl dingdandaojdbcimpl=new DingdanDaoJDBCImpl();
		DingdanService dingdanService=new DingdanService();
		dingdanService.setDingdanDao(dingdandaojdbcimpl);
		Dingdan dingdan=new Dingdan();
		dingdan.setId(id);
		dingdan.setUsername(username);
		dingdan.setName(name);
		dingdan.setAddress(address);
		dingdan.setShr(shr);
		dingdan.setTel(tel);
		dingdan.setZt(zt);
	    boolean b1=dingdanService.add(dingdan);
	    return SUCCESS;
	}

}

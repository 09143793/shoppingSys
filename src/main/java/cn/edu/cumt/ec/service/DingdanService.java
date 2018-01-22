package cn.edu.cumt.ec.service;

import cn.edu.cumt.ec.dao.DingdanDao;
import cn.edu.cumt.ec.entity.Dingdan;

public class DingdanService {
	public DingdanService() {
		super();
	}
	private DingdanDao dingdanDao;
	public DingdanDao getDingdanDao() {
		return dingdanDao;
	}
	public void setDingdanDao(DingdanDao dingdanDao) {
		this.dingdanDao = dingdanDao;
	}
	//Éú³É¶©µ¥
	public boolean add(Dingdan dingdan){
		return dingdanDao.add(dingdan);
	}

}

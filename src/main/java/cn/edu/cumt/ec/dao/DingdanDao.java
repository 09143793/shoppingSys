package cn.edu.cumt.ec.dao;

import java.util.ArrayList;

import cn.edu.cumt.ec.entity.Dingdan;
public interface DingdanDao {
	public boolean add(Dingdan dingdan);//���ɶ���

	ArrayList<Dingdan> getAllDingdan();
	

}

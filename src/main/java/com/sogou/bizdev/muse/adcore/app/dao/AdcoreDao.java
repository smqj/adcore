package com.sogou.bizdev.muse.adcore.app.dao;

import java.util.List;

import com.sogou.bizdev.muse.adcore.app.po.Adcore;

public interface AdcoreDao{	
	public Adcore addAdcore(Adcore adcore);
	public void delAdcore(Long id);
	public void updateAdcore(Adcore adcore);	
	public Adcore findById(Long id);
	public List<Adcore> getAll(Integer curPage, Integer pageSize);
}

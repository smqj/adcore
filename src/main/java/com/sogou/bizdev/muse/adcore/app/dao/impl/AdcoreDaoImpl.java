package com.sogou.bizdev.muse.adcore.app.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sogou.bizdev.muse.adcore.app.dao.AdcoreDao;
import com.sogou.bizdev.muse.adcore.app.dto.AdcoreDto;
import com.sogou.bizdev.muse.adcore.app.po.Adcore;

public class AdcoreDaoImpl extends HibernateDaoSupport implements AdcoreDao {

	@Override
	public Adcore addAdcore(Adcore adcore) {
		if (adcore != null) {
			HibernateTemplate ht = getHibernateTemplate();
			Long cpcId = (Long) getHibernateTemplate().save(adcore);
			adcore.setId(cpcId);
		}		
		return adcore;
	}

	@Override
	public void delAdcore(Long id) {
		Adcore adcore = this.findById(id);
		if (adcore != null) {
			getHibernateTemplate().delete(adcore);
		}
	}

	@Override
	public void updateAdcore(Adcore adcore) {		
		if (adcore != null) {
			getHibernateTemplate().update(adcore);
		}	
	}

	@Override
	public Adcore findById(Long id) {		
		String hql = "from Adcore where cpcId=? ";
		List<Adcore> aList = getHibernateTemplate().find(hql,new Object[]{id});
		if (aList != null&&aList.size() > 0) {
			return aList.get(0);
		}
		return null;
		
	}

	@Override
	public List<Adcore> getAll(Integer curPage, Integer pageSize) {
		final String countHql = "select COUNT(*) from Adcore";
		final String hql = "from Adcore order by cpcid";
		final Integer b = ((curPage-1)*pageSize);
		final Integer size = pageSize;
		List<Long> cList = getHibernateTemplate().find(countHql,new Object[]{});
		final Adcore countAdcore = new Adcore();
		if (cList != null&&cList.size() > 0) {
			countAdcore.setAccountId(cList.get(0));
		}
		Object oList = this.getHibernateTemplate().execute(new HibernateCallback() {
			   public Object doInHibernate(final Session session) throws HibernateException, SQLException {
			    final Query query = session.createQuery(hql);
			    query.setMaxResults(size);
			    query.setFirstResult(b); 
			    List<Adcore> aList = query.list();
			    aList.add(countAdcore);
			    return aList;
			   }
		});
		
		return (List<Adcore>) oList;
	}
}

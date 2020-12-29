package com.test.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.test.demo.Entity.KhoangSan_Huu;

@Repository
public class KhoangSanDaoImp implements KhoangSanDao{

	@PersistenceContext
	private EntityManager currentSession;
	
	@Override
	@Transactional
	public List<KhoangSan_Huu> getAll() {
		// TODO Auto-generated method stub
		return currentSession.createQuery("from khoangsan_huu").getResultList();
	}

	@Override
	@Transactional
	public KhoangSan_Huu getKSByID(String maks) {
		// TODO Auto-generated method stub
		return currentSession.find(KhoangSan_Huu.class, maks);
	}

	@Override
	@Transactional
	public void saveKs(KhoangSan_Huu ks) {
		// TODO Auto-generated method stub
		currentSession.merge(ks);
	}

	@Override
	@Transactional
	public List<KhoangSan_Huu> search(String key) {
		// TODO Auto-generated method stub
		return currentSession.createQuery("from khoangsan_huu where masks = '"+key+"' or so_luong = '" +"' or tenks = '"+key+"' or ten_tinh = '"+key+"'").getResultList();
	}

	@Override
	@Transactional
	public void delete(String maks) {
		// TODO Auto-generated method stub
		currentSession.createQuery("delete from khoangsan_huu where masks = '"+maks+"'").executeUpdate();
	}

}

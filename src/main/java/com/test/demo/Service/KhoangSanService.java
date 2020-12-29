package com.test.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.Dao.KhoangSanDao;
import com.test.demo.Entity.KhoangSan_Huu;

@Service
public class KhoangSanService implements KhoangSanDao{

	@Autowired
	private KhoangSanDao ksDao;
	
	@Override
	public List<KhoangSan_Huu> getAll() {
		// TODO Auto-generated method stub
		return ksDao.getAll();
	}

	@Override
	public KhoangSan_Huu getKSByID(String maks) {
		// TODO Auto-generated method stub
		return ksDao.getKSByID(maks);
	}

	@Override
	public void saveKs(KhoangSan_Huu ks) {
		// TODO Auto-generated method stub
		ksDao.saveKs(ks);
	}

	@Override
	public List<KhoangSan_Huu> search(String key) {
		// TODO Auto-generated method stub
		return ksDao.search(key);
	}

	@Override
	public void delete(String maks) {
		// TODO Auto-generated method stub
		ksDao.delete(maks);
	}

}

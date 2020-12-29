package com.test.demo.Dao;

import java.util.List;

import com.test.demo.Entity.KhoangSan_Huu;

public interface KhoangSanDao {
	public List<KhoangSan_Huu> getAll();
	public KhoangSan_Huu getKSByID(String maks);
	public void saveKs(KhoangSan_Huu ks);
	public List<KhoangSan_Huu> search(String key);
	public void delete(String maks);
}

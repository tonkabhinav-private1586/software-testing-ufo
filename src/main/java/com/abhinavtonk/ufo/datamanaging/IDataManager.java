package com.abhinavtonk.ufo.datamanaging;

/**
 * Test Doc
 * @author atonk
 *
 */
public interface IDataManager {
	IDataManager getDataSourceHandle(String dataSource);
	
	@SuppressWarnings("unchecked")
	<U,T> U getData(T... t);
	
	//<T> T getData(T... t);
	
}

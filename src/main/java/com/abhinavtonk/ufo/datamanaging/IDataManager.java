package com.abhinavtonk.ufo.datamanaging;

/**
 * Test Doc
 * @author atonk
 *
 */
public interface IDataManager {
	@SuppressWarnings("unchecked")
	//IDataManager populateData(String dataSource);
	<S,T> S getData(T... t);
	
}

package com.abhinavtonk.ufo.datamanaging;

/**
 * Test Doc
 * @author atonk
 *
 */
public interface IDataManager {
	IDataManager populateData(String dataSource);
	<T> T getData(T... t);
}

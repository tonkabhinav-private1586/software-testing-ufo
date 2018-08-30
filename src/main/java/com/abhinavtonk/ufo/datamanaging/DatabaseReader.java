package com.abhinavtonk.ufo.datamanaging;

public class DatabaseReader implements IDataManager{

	private DatabaseReader databaseReader;
	private String filePath;

	public DatabaseReader(String filePath){
		this.filePath = filePath;
	}

	@Override
	public DatabaseReader getDataSourceHandle() {
		if(databaseReader == null){
			databaseReader = new DatabaseReader(filePath);
		}
		return databaseReader;
	}
	
	@SuppressWarnings("unchecked")
	public <U, T> U getData(T... t) {
		// TODO Auto-generated method stub
		return null;
	}




}

package com.foursquare.fongo;

import org.springframework.dao.DataAccessException;
import org.springframework.data.mongodb.MongoDbFactory;

import com.mongodb.DB;

/**
 * Simple wrapper to implement spring datas factory interface
 * so that fongo may be injected into daos in a test scenario
 * requiring a spring data MongoDbFactory instance. 
 * @author VPAPIFR
 *
 */
public class FongoDBFactory extends Fongo implements MongoDbFactory{

	private static String DEFAULT = "default";
	public FongoDBFactory() {
		super(DEFAULT);
	}

	@Override
	public DB getDb() throws DataAccessException {

		return super.getDB(DEFAULT);

	}

	@Override
	public DB getDb(String dbName) throws DataAccessException {
		// TODO Auto-generated method stub
		
		return super.getDB(dbName);
	}
	
	

}

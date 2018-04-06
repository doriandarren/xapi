package com.app.backend.datastore;

import java.util.List;

import com.google.appengine.api.datastore.Key;

public interface DAOInf {

	public interface InfCRUD<T>{
		public void create(T clazz);
		public void delete(Key key);	
		public void update(T clazz);			
	}
	
	
	public interface InfCRUDRelation<T>{
		public void create(Key keyClient, T clazz);
		public void delete(Key key);
		public void update(T clazz);
	}
		
	public <T> T find(Class<T> clazz,Object id);
	public <T> List<T> findAll(Class<T> clazz);
}

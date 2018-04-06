package com.app.backend.model;

import java.util.Date;

import com.google.appengine.api.datastore.Key;

//@Entity
public class Client {

	//@Id
		//@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Key key;
		private String name;
		private String description;
		private Date createAt;
		
		public Key getKey() {
			return key;
		}
		public String getName() {
			return name;
		}
		public String getDescription() {
			return description;
		}
		public Date getCreateAt() {
			return createAt;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public void setCreateAt(Date createAt) {
			this.createAt = createAt;
		}
	
}

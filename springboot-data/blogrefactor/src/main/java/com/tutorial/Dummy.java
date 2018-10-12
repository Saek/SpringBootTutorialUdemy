package com.tutorial;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dummy {
	@Id
	private int aId;
	private String aname;
	
	public int getaId() {
		return aId;
	}
	
	public void setaId(int aId) {
		this.aId = aId;
	}
	
	public String getAname() {
		return aname;
	}
	
	public void setAname(String aname) {
		this.aname = aname;
	}
}

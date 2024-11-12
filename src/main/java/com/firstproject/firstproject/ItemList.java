package com.firstproject.firstproject;


public class ItemList {
	private long id;
	private String name;
	private String desc;
	

	public ItemList(long id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return "ItemList [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

	
}

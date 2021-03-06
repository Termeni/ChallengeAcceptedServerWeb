package com.ignitionentertainment.dao;
// Generated 09-dic-2015 23:36:54 by Hibernate Tools 4.3.1

/**
 * Tag generated by hbm2java
 */
public class Tag  implements java.io.Serializable {


     private int id;
     private String tag;

    public Tag() {
    }

	
    public Tag(int id) {
        this.id = id;
    }
    public Tag(int id, String tag) {
       this.id = id;
       this.tag = tag;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTag() {
        return this.tag;
    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }
    
    public static class TagBuilder {
    	private int id;
    	private String tag;

    	public TagBuilder(){
    	}
       
    	public TagBuilder setId(int id) {
    		this.id = id;
    		return this;
    	}
    	
    	public TagBuilder setTag(String tag) {
    		this.tag = tag;
    		return this;
    	}
    	
    	public Tag Build() {
    		return new Tag(id, tag);
    	}
    }
}



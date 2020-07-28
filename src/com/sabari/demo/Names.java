package com.sabari.demo;

public class Names {
    private String name;
    private int likes;
    
    
    
	public Names(String name,int likes) {
		this.name=name;
		this.likes=likes;
		//this.likes=likes;
	}
	
 public String getName(){
	 return name;
 }
 
 public int getLikes(){
	 return this.likes;
 }
 
public void setLikes(int likes){
	this.likes=likes;
}
}

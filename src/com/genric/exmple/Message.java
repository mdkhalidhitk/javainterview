package com.genric.exmple;

public class Message {
   

private String string;
    
    public Message(String string) {
	this.string = string;
    }

    public String getString() {
	return string;
    }

    public void setString(String string) {
	this.string = string;
    }
    @Override
    public String toString() {
	return "Message [string=" + string + "]";
    }
    

}

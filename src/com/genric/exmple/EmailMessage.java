package com.genric.exmple;

public class EmailMessage extends Message {

    public EmailMessage(String string) {
	super(string);
	
    }

    @Override
    public String toString() {
	return "EmailMessage [getString()=" + getString() + "]";
    }

    

}

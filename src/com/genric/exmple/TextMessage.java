package com.genric.exmple;

public class TextMessage extends Message {

    public TextMessage(String string) {
	super(string);
	
    }

    @Override
    public String toString() {
	return "TextMessage [getString()=" + getString() + "]";
    }



}

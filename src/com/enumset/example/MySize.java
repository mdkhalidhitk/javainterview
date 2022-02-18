package com.enumset.example;

public enum MySize  {
	 YES,
	 NO;
	
	  @Deprecated
	  public MySize increase() {
		  MySize sizes[] = this.values();
	    int pos = this.ordinal();
	    if (pos < sizes.length - 1)
	      pos++;
	    return sizes[pos];
	  }

}

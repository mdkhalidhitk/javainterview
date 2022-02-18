package com.comparableInterpratice;

public class MyComparatorClass implements Comparable<MyComparatorClass> {
    private double rating;
    private String name;
    private int year;
 
    // Used to sort movies by year
    public int compareTo(MyComparatorClass m)
    {
        return this.year - m.year;
    }
 
    // Constructor
    public MyComparatorClass(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
 
    // Getter methods for accessing private data
    public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }

   

}

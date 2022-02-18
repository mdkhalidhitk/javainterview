package com.comparableInterpratice;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args)
    {
	 int myvariavle=9;
	int a=2;
	int b=1;
	if(a%b==1) {
	    
	    
	}
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.getName() + " " +
                               movie.getRating() + " " +
                               movie.getYear());
        }
    }

}

package com.cts.mp.Services;

import java.util.Comparator;

import com.cts.mp.model.Movies;

public class MoviesReleaseComparator implements Comparator<Movies> 
	{ 
	@Override
	public int compare(Movies a, Movies b) 
	    { 
	        return a.getReleaseDate().compareTo(b.getReleaseDate());
	    } 
}

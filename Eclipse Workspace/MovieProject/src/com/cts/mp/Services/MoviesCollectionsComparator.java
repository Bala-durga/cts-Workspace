package com.cts.mp.Services;

import java.util.Comparator;

import com.cts.mp.model.Movies;

public class MoviesCollectionsComparator implements Comparator<Movies> 
{ 
	@Override
    public int compare(Movies a, Movies b) 
    { 
    	return a.getCollection()-b.getCollection();
    } 

}




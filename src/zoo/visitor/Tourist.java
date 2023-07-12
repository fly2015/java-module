/*
 * Tourist.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package zoo.visitor;

import java.util.List;

import zoo.tours.api.Tour;
import zoo.tours.reservations.TourFinder;



/**
 * @author nhqhien
 * @version $Revision: $
 */
public class Tourist
{
    public static void main(String[] args)
    {
        Tour tour = TourFinder.findSingleTour();
        System.out.println("Single tour: " + tour);
        List<Tour> tours = TourFinder.findAllTours();
        System.out.println("# tours: " + tours.size());
    }
}


/*
 * Changes:
 * $Log: $
 */
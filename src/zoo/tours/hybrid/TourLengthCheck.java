/*
 * TourLengthCheck.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package zoo.tours.hybrid;

import java.util.OptionalInt;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

import zoo.tours.api.Tour;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TourLengthCheck
{
    public static void main(String[] args)
    {
        OptionalInt max = ServiceLoader.load(Tour.class).stream().map(Provider::get).mapToInt(Tour::length).max();
        max.ifPresent(System.out::println);
        OptionalInt min = ServiceLoader.load(Tour.class).stream().map(Provider::get).mapToInt(Tour::length).min();
        min.ifPresent(System.out::println);
    }
}



/*
 * Changes:
 * $Log: $
 */
/*
 * TourImpl.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package zoo.tours.agency;

import zoo.tours.api.Souvenir;
import zoo.tours.api.Tour;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class TourImpl implements Tour 
{

    /**
     * @see zoo.tours.api.Tour#name()
     */
    @Override
    public String name()
    {
        return "Behind the Scenes";
    }

    /**
     * @see zoo.tours.api.Tour#length()
     */
    @Override
    public int length()
    {
        return 120;
    }

    /**
     * @see zoo.tours.api.Tour#getSouvenir()
     */
    @Override
    public Souvenir getSouvenir()
    {
        Souvenir gift = new Souvenir();
        gift.setDescription("stuffed animal");
        return gift;
    }

}



/*
 * Changes:
 * $Log: $
 */
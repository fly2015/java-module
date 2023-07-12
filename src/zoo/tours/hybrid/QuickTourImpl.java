/*
 * QuickTourImpl.java
 *
 * Copyright by Hien Ng
 * Da Nang
 * All rights reserved.
 */
package zoo.tours.hybrid;

import zoo.tours.api.Souvenir;
import zoo.tours.api.Tour;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class QuickTourImpl implements Tour
{
    public String name()
    {
        return "Short Tour";
    }


    public int length()
    {
        return 40;
    }


    public Souvenir getSouvenir()
    {
        Souvenir gift = new Souvenir();
        gift.setDescription("keychain");
        return gift;
    }
}



/*
 * Changes:
 * $Log: $
 */
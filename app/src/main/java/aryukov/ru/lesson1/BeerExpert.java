package aryukov.ru.lesson1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 14.03.17.
 */

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if(color.equals("light")){
            brands.add("Baltica Light");
            brands.add("Cronenburg");
        } else if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }
        return brands;
    }
}

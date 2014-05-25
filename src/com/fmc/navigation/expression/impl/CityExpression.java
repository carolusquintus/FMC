package com.fmc.navigation.expression.impl;

import com.fmc.navigation.expression.Expression;
import com.fmc.navigation.location.City;

/**
 *
 * Foo Motor Company
 *
 * Based on: "Java Design Pattern Essentials", Tony Bevis
 *
 * Date: May 25, 2014
 *
 * @author carolus
 *
 */
public class CityExpression implements Expression{

    private City city;

    public CityExpression(City city){
        this.city = city;
    }

    @Override
    public City interpret() {
        return city;
    }
}

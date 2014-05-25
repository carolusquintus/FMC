package com.fmc.navigation.expression;

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
public interface Expression {

    public City interpret();
}

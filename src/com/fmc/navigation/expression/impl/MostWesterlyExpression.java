package com.fmc.navigation.expression.impl;

import com.fmc.navigation.expression.Expression;
import com.fmc.navigation.location.City;

import java.util.List;

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
public class MostWesterlyExpression implements Expression {

    private List<Expression> expressions;

    public MostWesterlyExpression(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public City interpret() {
        City resultingCity = new City("Nowhere", 999.9, 999.9);

        for (Expression currentExpression : expressions) {
            City currentCity = currentExpression.interpret();

            if (currentCity.getLongitude() < resultingCity.getLongitude()) {
                resultingCity = currentCity;
            }
        }

        return resultingCity;
    }
}
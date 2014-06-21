package com.fmc.navigation.interpreter;

import com.fmc.navigation.expression.Expression;
import com.fmc.navigation.expression.impl.*;
import com.fmc.navigation.location.City;

import java.util.*;

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
public class DirectionalEvaluator {

    private Map<String, City> cities;

    public DirectionalEvaluator() {
        cities = new HashMap<>();

        cities.put("aberdeen", new City("Aberdeen", 57.15, -2.15));
        cities.put("belfast", new City("Belfast", 54.62, -5.93));
        cities.put("birmingham", new City("Birmingham", 52.42, -1.92));
        cities.put("dublin", new City("Dublin", 53.33, -6.25));
        cities.put("edinburgh", new City("Edinburgh", 55.92, -3.02));
        cities.put("glasgow", new City("Glasgow", 55.83, -4.25));
        cities.put("london", new City("London", 51.53, -0.08));
        cities.put("liverpool", new City("Liverpool", 53.42, -3.0));
        cities.put("manchester", new City("Manchester", 53.5, -2.25));
        cities.put("southampton", new City("Southampton", 50.9, -1.38));
    }

    public City evaluate(String route) {
        Stack<Expression> expressionStack = new Stack<>();

        String[] routes = route.split("\\s");

        for (String token : routes) {

            String expression = token.toLowerCase();

            switch (expression) {
                case "northerly":
                    expressionStack.push(new MostNortherlyExpression(loadExpressions(expressionStack)));
                    break;
                case "southerly":
                    expressionStack.push(new MostSoutherlyExpression(loadExpressions(expressionStack)));
                    break;
                case "westerly":
                    expressionStack.push(new MostWesterlyExpression(loadExpressions(expressionStack)));
                    break;
                case "easterly":
                    expressionStack.push(new MostEasterlyExpression(loadExpressions(expressionStack)));
                    break;
                default:
                    if (cities.containsKey(expression)) {
                        City city = cities.get(expression);
                        expressionStack.push(new CityExpression(city));
                    }
                    break;
            }
        }

        return expressionStack.pop().interpret();
    }

    private List<Expression> loadExpressions(Stack<Expression> expressionStack) {
        return new ArrayList<>(expressionStack);
    }
}

package com.kkjavatutorials.client;

import com.kkjavatutorials.pizza.NonVegPizza;
import com.kkjavatutorials.pizza.PizzaTemplate;
import com.kkjavatutorials.pizza.VegPizza;
/**
 * 
 * @author Kishan Kumar
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		
		PizzaTemplate pizzaTemplate = new VegPizza();
		pizzaTemplate.preparePizza();
		
		System.out.println("--------------------------------");
		
		pizzaTemplate = new NonVegPizza();
		pizzaTemplate.preparePizza();
	}

}

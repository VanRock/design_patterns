package net.metrosystems.designpattern.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItem();
		System.out.println("Total cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNoVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItem();
		System.out.println("Total cost: " + nonVegMeal.getCost());
	}
}

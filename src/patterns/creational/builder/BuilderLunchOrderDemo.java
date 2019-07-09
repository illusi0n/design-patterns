package patterns.creational.builder;

import patterns.creational.builder.LunchOrder.Builder;

public class BuilderLunchOrderDemo {

	public static void main(String[] args) {
		Builder builder = new LunchOrder.Builder();
		builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

		LunchOrder order = builder.build();

		System.out.println(order.getBread());
		System.out.println(order.getCondiments());
		System.out.println(order.getDressing());
		System.out.println(order.getMeat());
	}

}

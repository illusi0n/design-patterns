package patterns.structural.composite;

public class Menu extends MenuComponent {

	public Menu(String name, String url) {
		super(name, url);
	}

	@Override
	public MenuComponent add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
		return menuComponent;
	}

	@Override
	public MenuComponent remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
		return menuComponent;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(print());

		for (MenuComponent component : menuComponents) {
			stringBuilder.append(component.toString());
		}

		return stringBuilder.toString();
	}

}

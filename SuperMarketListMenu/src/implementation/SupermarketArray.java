package implementation;

public class SupermarketArray implements Supermarket {

	private final String[] items;
	private int lastIndex;

	public SupermarketArray(final int size) {
		items = new String[size];
		lastIndex = -1;
	}

	@Override
	public void add(String item) {
		// TODO Auto-generated method stub
		if (lastIndex == items.length - 1) {
			System.err.println("Lista de Supermercado cheio!");
		} else {
			lastIndex++;
			items[lastIndex] = item;
		}

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("############################");
		if (lastIndex < 0)
			System.out.println("Lista de Supermercado vazia");
		for (int i = 0; i <= lastIndex; i++) {
			System.out.println(i + " - " + items[i]);
		}
		System.out.println("############################");
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		if (index >= 0 && index <= lastIndex) {
			shift(index);
			lastIndex--;
		} else {
			System.err.println("Índice Inválido " + index);
		}
	}

	private void shift(final int index) {
		for (int i = index; i < lastIndex; i++) {
			items[i] = items[i + 1];
		}
	}

}

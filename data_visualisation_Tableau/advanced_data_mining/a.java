public class Fruit {

	private String fruitName;
	public static Comparator<Fruit> FruitNameComparator;

	public Fruit(String fruitName) {
		this.fruitName = fruitName;
		FruitNameComparator = new Comparator<Fruit>() {
			@Override
			public int compare() {

			}
		}
	
	}

}


Comparator<Integer> comparator = new Comparator<Integer>() {
	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg0 - arg1;
	}
}

PriorityQueue<Integer> ascending = new PriorityQueue<Integer>(comparator);



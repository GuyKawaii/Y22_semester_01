import java.util.ArrayList;

public class SWOT {
	private ArrayList<String> strengths = new ArrayList<>();
	private ArrayList<String> weaknesses = new ArrayList<>();
	private ArrayList<String> opportunities = new ArrayList<>();
	private ArrayList<String> threads = new ArrayList<>();
	
	SWOT() {
		strengths.add("STRENGTHS");
		weaknesses.add("WEAKNESSES");
		threads.add("THREADS");
		opportunities.add("OPPORTUNITIES");
	}
	
	// Add one entry to a selected category
	void addEntry(Category category, String entry) {
		switch (category) {
			case STRENGTHS -> strengths.add(strengths.size() + ": " + entry);
			case WEAKNESSES -> weaknesses.add(weaknesses.size() + ": " + entry);
			case THREADS -> threads.add(threads.size() + ": " + entry);
			case OPPORTUNITIES -> opportunities.add(opportunities.size() + ": " + entry);
			default -> throw new IllegalStateException("Unexpected value: " + category);
		}
	}
	
	// Get complete entry-list for each S,W,O,T-list
	String getLists() {
		return getList(Category.STRENGTHS) + "\n\n" +
				getList(Category.WEAKNESSES) + "\n\n" +
				getList(Category.OPPORTUNITIES) + "\n\n" +
				getList(Category.THREADS);
	}
	
	// Get a selected categories given entry-list
	String getList(Category category) {
		switch (category) {
			case STRENGTHS -> {
				return Colors.ANSI_BLUE + String.join("\n", strengths) + Colors.ANSI_BLACK;
			}
			case WEAKNESSES -> {
				return Colors.ANSI_RED + String.join("\n", weaknesses) + Colors.ANSI_BLACK;
			}
			case THREADS -> {
				return Colors.ANSI_PURPLE + String.join("\n", threads) + Colors.ANSI_BLACK;
			}
			case OPPORTUNITIES -> {
				return Colors.ANSI_GREEN + String.join("\n", opportunities) + Colors.ANSI_BLACK;
			}
			default -> throw new IllegalStateException("Unexpected value: " + category);
		}
	}
	
}

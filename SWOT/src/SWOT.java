import java.util.ArrayList;

public class SWOT {
	private ArrayList<String> strengths = new ArrayList<>();
	private ArrayList<String> weaknesses = new ArrayList<>();
	private ArrayList<String> opportunities = new ArrayList<>();
	private ArrayList<String> threads = new ArrayList<>();
	private final int[] indexes; // indexes for next new insert for categories [s,w,o,t]
	
	SWOT() {
		strengths.add("STRENGTHS");
		weaknesses.add("WEAKNESSES");
		threads.add("THREADS");
		opportunities.add("OPPORTUNITIES");
		indexes = new int[]{1, 1, 1, 1};
	}
	
	// Add one entry to a selected category
	void addEntry(Categories category, String entry) {
		switch (category) {
			case STRENGTHS -> {
				strengths.add(indexes[0] + ": " + entry);
				indexes[0]++;
			}
			case WEAKNESSES -> {
				weaknesses.add(indexes[1] + ": " + entry);
				indexes[1]++;
			}
			case THREADS -> {
				threads.add(indexes[2] + ": " + entry);
				indexes[2]++;
			}
			case OPPORTUNITIES -> {
				opportunities.add(indexes[3] + ": " + entry);
				indexes[3]++;
			}
		}
	}
	
	// Get complete entry-list for each S,W,O,T list
	String getLists() {
		return getList(Categories.STRENGTHS) + "\n\n" +
				getList(Categories.WEAKNESSES) + "\n\n" +
				getList(Categories.OPPORTUNITIES) + "\n\n" +
				getList(Categories.THREADS);
	}
	
	// Get a selected categories given entry-list
	String getList(Categories category) {
		switch (category) {
			case STRENGTHS -> {
				return Colors.ANSI_BLUE + String.join("\n", strengths);
			}
			case WEAKNESSES -> {
				return Colors.ANSI_RED + String.join("\n", weaknesses);
			}
			case THREADS -> {
				return Colors.ANSI_PURPLE + String.join("\n", threads);
			}
			case OPPORTUNITIES -> {
				return Colors.ANSI_GREEN + String.join("\n", opportunities);
			}
			default -> throw new IllegalStateException("Unexpected value: " + category);
		}
	}
	
}

public class SWOTTest {
	public static void main(String[] args) {
		SWOT swot = new SWOT();
		
		// Add entries
		swot.addEntry(Category.STRENGTHS, "1");
		swot.addEntry(Category.STRENGTHS, "1");
		swot.addEntry(Category.STRENGTHS, "1");
		swot.addEntry(Category.STRENGTHS, "1");
		
		swot.addEntry(Category.WEAKNESSES, "2");
		swot.addEntry(Category.WEAKNESSES, "2");
		swot.addEntry(Category.OPPORTUNITIES, "3");
		swot.addEntry(Category.OPPORTUNITIES, "3");
		swot.addEntry(Category.THREADS, "4");
		swot.addEntry(Category.THREADS, "4");
		
		System.out.println(swot.getLists());
	}
}

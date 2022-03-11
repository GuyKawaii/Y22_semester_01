public class SWOTTest {
	public static void main(String[] args) {
		SWOT swot = new SWOT();
		
		// Add entries
		swot.addEntry(Categories.STRENGTHS, "1");
		swot.addEntry(Categories.STRENGTHS, "1");
		swot.addEntry(Categories.STRENGTHS, "1");
		swot.addEntry(Categories.STRENGTHS, "1");
		
		swot.addEntry(Categories.WEAKNESSES, "2");
		swot.addEntry(Categories.WEAKNESSES, "2");
		swot.addEntry(Categories.OPPORTUNITIES, "3");
		swot.addEntry(Categories.OPPORTUNITIES, "3");
		swot.addEntry(Categories.THREADS, "4");
		swot.addEntry(Categories.THREADS, "4");
		
		System.out.println(swot.getLists());
	}
}

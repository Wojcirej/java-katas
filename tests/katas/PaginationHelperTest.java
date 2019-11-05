package tests.katas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import katas.paginationHelper.PaginationHelper;

@DisplayName("PaginationHelper")
class PaginationHelperTest {
	
	private final int perPage = 4;
	private final List<Integer> collection = new ArrayList<Integer>();
	private final PaginationHelper<Integer> helper = new PaginationHelper<Integer>(this.collection, this.perPage);
	
    @BeforeEach
    public void initList(){
    	for(int i = 0; i < 6; ++i) {
    		this.collection.add(i + 1);
    	};
    }

	@Test
	@DisplayName("#pageCount()")
	void testPageCount() {
		assertEquals(this.helper.pageCount(), 2);
	};
	
	@Test
	@DisplayName("#itemCount()")
	void testPageSize() {
		assertEquals(this.helper.itemCount(), collection.size());
	};
	
	@DisplayName("#pageItemCount()")
	@ParameterizedTest(name = "when page = {0} it returns {1}")
	@CsvSource({"0,4", "1,2", "2,-1", "3,-1"})
	void testPageItemCount(int page, int expectedCount) {
		assertEquals(this.helper.pageItemCount(page), expectedCount);
	};
	
	@DisplayName("#pageIndex()")
	@ParameterizedTest(name = "when pageIndex = {0} it returns {1}")
	@CsvSource({"5,1", "2,0", "10,-1"})
	void testPageIndex(int pageIndex, int expectedItemIndex) {
		assertEquals(this.helper.pageIndex(pageIndex), expectedItemIndex);
	};
}

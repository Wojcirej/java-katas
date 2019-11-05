package katas.paginationHelper;

import java.util.List;

public class PaginationHelper<I> {
	
	private List<I> collection;
	private int itemsPerPage;

	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
	};
	
	public int pageCount() {
		return (int) Math.ceil(this.itemCount() / (float) this.itemsPerPage);
	};
	
	public int itemCount() {
		return this.collection.size();
	};
	
	public int pageItemCount(int pageIndex) {
        if (pageIndex >= pageCount()) {
            return -1;
        }
        if (pageIndex == pageCount() - 1) {
            return collection.size() % this.itemsPerPage;
        }
		return this.itemsPerPage;
	};
	
	public int pageIndex(int itemIndex) {
        int res = (int) Math.floor((float) itemIndex / this.itemsPerPage);
        return res >= 0 && this.pageCount() >= res && itemIndex < this.itemCount() ? res : -1;
	};
}

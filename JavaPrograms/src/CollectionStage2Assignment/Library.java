package CollectionStage2Assignment;

public class Library {
	private int libNum;
	private int totalBooks;

	public Library(int ln,int tb) {
		this.libNum=ln;
		this.totalBooks=tb;
	}

	public int getLibNum() {
		return libNum;
	}

	public void setLibNum(int libNum) {
		this.libNum = libNum;
	}

	public int getTotalBooks() {
		return totalBooks;
	}

	public void setTotalBooks(int totalBooks) {
		this.totalBooks = totalBooks;
	}
}

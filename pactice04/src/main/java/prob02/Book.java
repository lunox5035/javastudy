package prob02;

public class Book extends BookShop {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	public Book() {
		
	}

	//===================================================================

	public Book(int bookNo, String title, String author) {
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		stateCode=1;

	}
	
	//===================================================================
	
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	//===================================================================

	// 대출여부 확인
	public void rent() {
		if (stateCode == 1) {
			stateCode=0;
			System.out.println(title+"이(가) 대여 됐습니다.");						
		}
	}

	public void showInfo() {
		System.out.println(
				"책 제목:" +title+ ", 작가:" + author + ", 대여 여부:" + (stateCode==1?"재고있음":"대여중")
				);
	}
	
	
//	// 도서정보 출력
//	public void displayBookInfo() {
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("책 제목:" +title+ ", 작가:" + author + ", 대여 여부:" + rent(i));
////			System.out.println(books[i]);
//		}
//	}
}

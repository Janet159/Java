package Ex02;

import java.util.ArrayList;

public class Library {

	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("123123","이게 자바냐","김자바","자바 김자바",33000));
		bookList.add(new Book("112112","정보처리기사","김휴먼","국가기술자격",45000));
		bookList.add(new Book("001001","실무DB","박디비","디비디비딥",60000));
		
		for (Book book : bookList) {
			System.out.println(book.isbn+"|"+book.title+"|"+book.writer+"|"+book.content+"|"+book.price);
		}
	}
}

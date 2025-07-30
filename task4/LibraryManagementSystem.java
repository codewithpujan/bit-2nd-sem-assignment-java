

import java.util.*;
public class LibraryManagementSystem {
    public static void main(String[] args) {
    
        List<Book> libraryBooks = new ArrayList<>();
        libraryBooks.add(new Book("1984", "George Orwell", "ISBN001"));
        libraryBooks.add(new Book("To Kill a Mockingbird", "Harper Lee", "ISBN002"));
        libraryBooks.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN003"));
        libraryBooks.add(new Book("Java Programming", "James Gosling", "ISBN004"));

        
        Set<Book> borrowedBooks = new HashSet<>();

        
        Map<Integer, List<Book>> memberBorrowMap = new HashMap<>();

        
        int memberId1 = 101;
        List<Book> member1Books = new ArrayList<>();
        member1Books.add(libraryBooks.get(0));
        member1Books.add(libraryBooks.get(1));
        borrowedBooks.addAll(member1Books);
        memberBorrowMap.put(memberId1, member1Books);

        
        int memberId2 = 102;
        List<Book> member2Books = new ArrayList<>();
        member2Books.add(libraryBooks.get(2));
        borrowedBooks.addAll(member2Books);
        memberBorrowMap.put(memberId2, member2Books);

        
        System.out.println("All Library Books:");
        for (Book book : libraryBooks) {
            System.out.println(book);
        }

        
        System.out.println("\n Borrowed Books:");
        Iterator<Book> iterator = borrowedBooks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("\n Member-wise Borrowed Books:");
        for (Map.Entry<Integer, List<Book>> entry : memberBorrowMap.entrySet()) {
            System.out.println("Member ID: " + entry.getKey());
            displayBooks(entry.getValue());  
        }
    }

    
    public static void displayBooks(List<? extends Book> books) {
        for (Book book : books) {
            System.out.println("  -> " + book);
        }
    }
}

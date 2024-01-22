class Library1 {
    String[] bookname;
    int no_of_books;

    Library1() {
        this.bookname = new String[100];
        this.no_of_books = 0;
    }

    void addbook(String bookname) {
        this.bookname[no_of_books] = bookname;
        no_of_books++;
        System.out.println(bookname+"has been added");
    }

    void showAvailableBook() {
        System.out.println("The available books are:");
        for (int i = 0; i < bookname.length; i++) {
            if (bookname[i] != null) {
                System.out.println(bookname[i]);
            }
        }
    }
    void issueBook(String issuingBook){
     for(int i=0;i<bookname.length;i++){
        if(bookname[i]==issuingBook){
            System.out.println(bookname[i]+" book has been issued");
            System.out.println();
            bookname[i]=null;
        }
     }
    }

    void returnBook(String returningBook){
    addbook(returningBook);
    }
}

public class Library {
    public static void main(String[] args) {
        Library1 lib = new Library1();
        lib.addbook("java programming by mc graw and balaguruswami");
        lib.addbook("discrete mathematics");
        lib.addbook("critical thinking and communication");
        lib.addbook("university physics");
        lib.issueBook("discrete mathematics");
        lib.showAvailableBook();
        // lib.returnBook("university physics");
    }
}

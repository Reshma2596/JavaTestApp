class Library {
    private Book[] books;
    private int count;

    
    public Library() {
        this.books = new Book[5]; 
        this.count = 0;
    }

    
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full.");
        }
    }

    
    public void removeBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = books[count - 1]; // Replace with last book
                books[count - 1] = null;
                count--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

   
    public void searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book Found:");
                books[i].displayBook();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books available in the library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            books[i].displayBook();
        }
    }
}

package by.belyaev.L03_02_2025.libryary;

public class Library {
    private Book[] books;
    private int size;


    public Library(int size) {
        books = new Book[9];
    }

    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            Book[] books1 = new Book[books.length + 1];
            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }
            books1[size++] = book;
            books = books1;
        }
    }

    public boolean printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
        return false;
    }


        public void sortByYear () {
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = 0; j < books.length - i - 1; j++) {
                    if (books[j] == null || books[j + 1] == null) {
                        continue;
                    }
                    if (books[j].getYear() > books[j + 1].getYear()) {
                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }
        }

        public Book findBook (String bookTitle) {
            for (Book book : books) {
                if (book == null) {
                    continue;
                }
                if (bookTitle.equals(book.getTitle())) {
                    return book;
                }
            }
            return null;
        }

        public void sortByBirthYear () {
            for (int i = 0; i < books.length - 1; i++) {
                for (int j = 0; j < books.length - i - 1; j++) {
                    if (books[j] == null || books[j + 1] == null) {
                        continue;
                    }
                    if (books[j].getAuthor().getBirthYear() > books[j + 1].getAuthor().getBirthYear()) {
                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }
        }

        public int getSize () {
            return size;
        }

        public Book[] getBooks () {
            return books;
        }
    }
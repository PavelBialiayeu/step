package by.belyaev.L03_02_2025.libryary;

public class Task00 {
    public static void main(String[] args) {
        Library library = new Library(9);

        Author berrouz = new Author("Эдгар Райз", "Берроуз", 1956);
        Book marsWar = new Book("Марсианские войны", berrouz, 1955);
        Book marsWar2 = new Book("марсианские войны 2", berrouz, 1960);
        Book marsianin = new Book("Марсианин", berrouz, 1970);
        library.addBook(marsWar);
        library.addBook(marsWar2);
        library.addBook(marsianin);

        EBook lEBook = new EBook("Властелин колец", berrouz, 1955, 40);
        library.addBook(lEBook);
        //System.out.println(lEBook.getDeccription());


        Author belyaev = new Author("Александр", "Беляев", 1936);
        Book amfibiya = new Book("Человек-амфибия", belyaev, 1980);
        Book ihtiandr = new Book("Ихтиандр", belyaev, 1994);
        Book ostrov = new Book("Остров погибших кораблей", belyaev, 1989);
        library.addBook(amfibiya);
        library.addBook(ihtiandr);
        library.addBook(ostrov);

        Author kiyosaki = new Author("Роберт", "Кийосаки", 1954);
        Book podrostok = new Book("Богатый папа, бедный папа - для подростков", kiyosaki, 1990);
        Book papa = new Book("Богатый папа, бедный папа", kiyosaki, 1991);
        Book kvadrant = new Book("Квадрант денежного потока", kiyosaki, 1995);
        library.addBook(podrostok);
        library.addBook(papa);
        library.addBook(kvadrant);

        System.out.println("Все книги:");
        library.printBooks();

        System.out.println("Поиск книги 'Марсианин':");
        System.out.println(library.findBook("Марсианин"));

        System.out.println("Книги после сортировки по году издания:");
        library.sortByYear();
        System.out.println(library.printBooks());

        System.out.println("Книги после сортировки по году рождения автора:");
        library.sortByBirthYear();
        System.out.println(library.printBooks());
    }
}

package functional.interfaces.custom;

public class Book implements CustomComparator<Book>{

    private String name;
    private int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }


    @Override
    public int comparator(Book o1, Book o2) {
        if(o1.year<o2.year){
            return -1;
        } else if (o1.year>o2.year) {
            return 1;
        }else{
            return 0;
        }
    }
}

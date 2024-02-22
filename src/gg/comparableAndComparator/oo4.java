package gg.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Writer{
    String firstName;
    String bookName;
    int authorAge;
    public Writer(String firstName, String bookName, int authorAge) {
        this.firstName = firstName;
        this.bookName = bookName;
        this.authorAge = authorAge;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }

    @Override
    public String toString() {
        return "Writer{" +
                "firstName='" + firstName + '\'' +
                ", bookName='" + bookName + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }
}

class AuthorAgeComparator implements Comparator<Writer> {
    /*
    * comparable affects the memory of the class, comparator doesn't (we have to create a new class and
    * then implement comparator class
    * */
    @Override
    public int compare(Writer o1, Writer o2) {
        if (o1.authorAge < o2.authorAge)return -1;
        if (o1.authorAge == o2.authorAge)return 0;
        return 1;
    }
}
class BookNameComparator implements Comparator<Writer>{

    @Override
    public int compare(Writer o1, Writer o2) {
        return o1.bookName.compareTo(o2.bookName);
    }
}
public class oo4 {
    public static void main(String[] args) {
        List<Writer> writers = new ArrayList<>();
        writers.add(new Writer("raiven","leetcode: how to fail interviews",19));
        writers.add(new Writer("f.scott","the great gatsby",123));
        writers.add(new Writer("bill","how to survive epstein's island",70));
        writers.add(new Writer("stephen","calculus guide for midgets",132));

        Collections.sort(writers,new AuthorAgeComparator());
        System.out.println("authors sorted by age");
        for (Writer writer : writers) {
            System.out.println(writer.toString());
        }
        System.out.println();
        Collections.sort(writers,new BookNameComparator());
        System.out.println("authors sorted by book name");
        for (Writer writer : writers) {
            System.out.println(writer.toString());
        }
        System.out.println();
        Collections.sort(writers,(o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        System.out.println("authors sorted by name using lambda");
        for (Writer writer : writers) {
            System.out.println(writer.toString());
        }
    }
}

package gg.comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Author implements Comparable<Author>{
    String firstName;
    String lastName;
    String bookName;

    public Author(String firstName, String lastName, String bookName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bookName = bookName;
    }

    @Override
    public int compareTo(Author o) {
        return this.lastName.compareTo(o.lastName);
    }
}
public class oo2 {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        authors.add(new Author("raiven","simbajon","how to fail programming"));
        authors.add(new Author("julian","riccardi","how to pass programming"));
        authors.add(new Author("natacha","stoever","how to skip programming"));
        authors.add(new Author("michel","al khouri","how to barely pass programming"));
        Collections.sort(authors);
        for (Author author : authors){
            System.out.println(author.firstName+"    "+author.lastName+"    "+author.bookName);
        }
    }
}

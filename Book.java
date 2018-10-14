import java.util.ArrayList;
import java.util.List;

public class Book {
String titlu;
List<Author> a;
List<Chapter> c;
public Book(String titlu) {
	this.a=new ArrayList<>();
	this.c=new ArrayList<>(); 
	this.titlu = titlu;
}
public void addAuthor(Author a1)
{
a.add(a1);
}
public int createChapter(String chp) {
	// TODO Auto-generated method stub
	Chapter c0=new Chapter(chp);
	c.add(c0);
	return c.indexOf(c0);
}
public Chapter getChapter(int indexChapter) {
	// TODO Auto-generated method stub
	return c.get(indexChapter);
}

}

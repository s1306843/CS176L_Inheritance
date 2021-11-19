package labproject7.writtenworks;
//WrittenWork.java: Superclass

public class WrittenWork {

 private String title;
 private String author;
 private int year;


 // constructors:
 public WrittenWork(String title, String author, int year) {

     setTitle( title );
     setAuthor( author );
     setYear( year );
 }

 public WrittenWork() {
 }


 // accessor methods:
 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 public int getyear() {
     return year;
 }

 public void setTitle(String titles) {
     title = titles;
 }

 public void setAuthor(String authors) {
     author = authors;
 }
public int getYear()
{
	return year;
}
 public void setYear(int years)
 {
     year = years;
 }
 public String toString()
 {
	 return "title: " + title + "\nauthor: " + author + "\nyear: " + year;
 }
}
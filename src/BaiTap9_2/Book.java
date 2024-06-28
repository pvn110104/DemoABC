package BaiTap9_2;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Chapter> chapters;

    public Book(String title){
        this.title = title;
        this.chapters = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    // Tạo phương thức "addChapter" để thêm 1 Chapter vào Book
    public void addChapter(Chapter chapter){
        chapters.add(chapter);
    }

    // Tạo phương thức "getNumberOfChapters" để tính số chapter trong một book
    public int getNumberOfChapters(){
        return chapters.size();
    }

    // Tạp phương thức "getTotalNumberOfPages" để tính số trang cho book
    public int getTotalNumberOfPages(){
        int totalPages = 0;
        for(Chapter chapter : chapters){
            totalPages += chapter.getNumberOfPages();
        }
        return totalPages;
    }

    public List<Chapter> getChapters(){
        return chapters;
    }
}
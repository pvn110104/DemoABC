package BaiTap9_2;
import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String title;
    private List<Page> pages;

    public Chapter(String title){
        this.title = title;
        this.pages = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    // Tạo phương thức "addPage" để thêm trang
    public void addPage(Page page){
        pages.add(page);
    }

    // Tạo phương thức "getNumberOfPages" để tính số trang trong 1 Chapter
    public int getNumberOfPages(){
        return pages.size();
    }

    public List<Page> getPages(){
        return pages;
    }
}
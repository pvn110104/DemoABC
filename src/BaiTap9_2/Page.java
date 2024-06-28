package BaiTap9_2;

public class Page {
    private int pageNumber;
    private String content;

    public Page(int pageNumber, String content){
        this.pageNumber = pageNumber;
        this.content = content;
    }

    public int getPageNumber(){
        return pageNumber;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
}
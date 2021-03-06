public abstract class TextPost extends Post {
    private String text;
    
    public TextPost(String username, String text) {
        super(username);
        this.text = text;
    }
    
    public String toString() {
        return this.text + "\n"+
                super.toString();
    }
    
    public abstract String render();
}
package demo;
public class AccessExample {
    public String publicText = "public";
    protected String protectedText = "protected";
    String defaultText = "default/package-private";
    private String privateText = "private";
    public String getPrivateText() { return privateText; }
}

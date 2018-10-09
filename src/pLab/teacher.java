package pLab;

public class teacher{
    private String subject = "";
    private String title = "";

    public teacher (String subject, String title) {
        this.subject = subject;
        this.title = title;
    }

    public String getSubject(); {
        return this.subject;
    }
    public String getTitle(); {
        return this.title + "." + this.getFamilyName();
    }
}

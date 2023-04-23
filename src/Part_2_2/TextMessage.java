package Part_2_2;

public class TextMessage extends BaseMessage {
    protected String text;

    public TextMessage(String date, String author, String text) {
        super(date, author);
        this.text = text;
    }

    public String output()
    {
        return this.author + " : " + this.text + "\nDate sent: " + this.date + "\n";
    }
}
package Part_2_2;

public class ContactMessage extends BaseMessage{
    protected String number;
    protected String contactName;

    public ContactMessage(String date, String author, String number, String contactName) {
        super(date, author);
        this.number = number;
        this.contactName = contactName;
    }
    @Override
    public String output() {
        return this.author + " : Contact '" + this.contactName + "' - " + this.number + "\nDate sent: " + this.date + "\n";
    }
}

package Part_2_2;

import java.util.Date;

abstract class BaseMessage extends Messages
{
    protected String date;
    protected String author;

    public BaseMessage(String date, String author)
    {
        this.date = date;
        this.author = author;
    }
    public abstract String output();
}

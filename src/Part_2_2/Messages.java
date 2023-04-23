package Part_2_2;

import java.util.ArrayList;

public class Messages extends User{
    private ArrayList<BaseMessage> messageList;

    public Messages()
    {
        messageList = new ArrayList<BaseMessage>();
    }

    public void addMessage(BaseMessage message)
    {
        messageList.add(message);
    }

    public ArrayList<BaseMessage> getMessageList()
    {
        return messageList;
    }

    public void showMessages()
    {
        for(int i = 0; i < messageList.size(); i++)
        {
            System.out.println(messageList.get(i).output());
        }
    }
}

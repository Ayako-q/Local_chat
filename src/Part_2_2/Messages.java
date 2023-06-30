package Part_2_2;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Messages {
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

    public JLabel showMessages()
    {
        JLabel chatLabel = new JLabel();
        for(int i = 0; i < messageList.size(); i++)
        {
            chatLabel.setText(chatLabel + "\n" + messageList.get(i).output());
        }
        return chatLabel;
    }

    public void exportChat()
    {
        try {
            FileWriter writer = new FileWriter("messagesExport.txt");
            for (BaseMessage m : messageList) {
                writer.write(m.output() + "\n");
            }
            writer.close();
            System.out.println("CHats exported to file.");
        } catch (IOException e) {
            System.out.println("Error expoting to file.");
            throw new RuntimeException(e);
        }
    }
}

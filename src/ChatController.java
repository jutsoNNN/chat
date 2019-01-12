import com.google.gson.Gson;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;

public class ChatController {
    Chat chat;
    File chatFile;

    public ChatController(String nazvanie) {
        chatFile = new File("Z:\\chats\\" + nazvanie);
        // Если чат существует, то открываем его и загружаем сообщения
        if((chatFile.exists())&&(!chatFile.isDirectory())){
            // to do something
            obnovitChat();

        }
        // Иначе, создаем новый чат
        else{
            chat = new Chat(nazvanie, "Avtor", new Date());
        }
    }
    public void sohranitChat(){
        Gson gson = new Gson();
        String chatJson = gson.toJson(chat);
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            fw = new FileWriter(chatFile.getAbsolutePath());
            bw = new BufferedWriter(fw);
            bw.flush();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void obnovitChat(){
        try {
            byte[] encoded = Files.readAllBytes(Paths.get(chatFile.getAbsolutePath()));
            String chatJson = new String(encoded, StandardCharsets.UTF_8);
            Gson gson1 = new Gson();
            chat = gson1.fromJson(chatJson, Chat.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void addSoobsch(String soobsch){
        obnovitChat();
        if (chat.getSoobscheniya()==null){
            chat.setSoobscheniya(new ArrayList <Sms>());
        }
        chat.getSoobscheniya().add(new Sms(new Date() , soobsch, "Avtor"));
        sohranitChat();

    }
}

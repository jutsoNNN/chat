import java.util.Date;

public class Sms {
    Date data;
    String text;
    String avtor;

    public Sms() {
    }

    public Sms(Date data, String text, String avtor) {
        this.data = data;
        this.text = text;
        this.avtor = avtor;
    }

    public Date getData() {
        return data;
    }
    public String getText() {
        return text;
    }
    public String getAvtor() {
        return avtor;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }
}

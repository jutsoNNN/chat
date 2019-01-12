import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Chat {
    String nazvanie;
    String avtor;
    Date dataSozdaniya;
    Date dataPoslednObnovl;
    ArrayList<Sms> soobscheniya;
    File chatFile;



    public Chat(String nazvanie, String avtor, Date dataSozdaniya) {
        this.nazvanie = nazvanie;
        this.avtor = avtor;
        this.dataSozdaniya = dataSozdaniya;
        
    }


    public String getNazvanie() {
        return nazvanie;
    }

    public String getAvtor() {
        return avtor;
    }

    public Date getDataSozdaniya() {
        return dataSozdaniya;
    }

    public Date getDataPoslednObnovl() {
        return dataPoslednObnovl;
    }

    public ArrayList<Sms> getSoobscheniya() {
        return soobscheniya;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public void setDataSozdaniya(Date dataSozdaniya) {
        this.dataSozdaniya = dataSozdaniya;
    }

    public void setDataPoslednObnovl(Date dataPoslednObnovl) {
        this.dataPoslednObnovl = dataPoslednObnovl;
    }

    public void setSoobscheniya(ArrayList<Sms> soobscheniya) {
        this.soobscheniya = soobscheniya;
    }
}

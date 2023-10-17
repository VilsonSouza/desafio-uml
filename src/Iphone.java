import interfaces.InternetBrowser;
import interfaces.MusicPlayer;
import interfaces.Telephone;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser {

    String modelo;
    String Armazenamento;
    int bateria;

    public Iphone(String modelo, String armazenamento, int bateria) {
        this.modelo = modelo;
        Armazenamento = armazenamento;
        this.bateria = bateria;
    }

    @Override
    public boolean play() {
        return true;
    }


    @Override
    public boolean pause(boolean isPlaying) {
        if (isPlaying){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void selectMusic(String musica) {
        System.out.println("Musica Selecionada: "+musica);
    }

    @Override
    public void makeCall() {

        System.out.println("Fazendo uma ligação...");
    }

    @Override
    public void answerCall() {

        System.out.println("Atendendo uma ligação...");
    }

    @Override
    public void startVoiceMail() {

        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void displayPage() {

        System.out.println("Exibindo página na internet...");
    }

    @Override
    public void addNewTab() {

        System.out.println("Adicionando uma nova aba no navegador...");
    }

    @Override
    public void refreshPage() {

        System.out.println("Atualizando página na internet...");
    }
}

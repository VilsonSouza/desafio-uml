// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Iphone iphone = new Iphone("Iphone 7","32gb",30);
       boolean isPlaying = iphone.play();

        System.out.println( iphone.pause(isPlaying));

    }
}
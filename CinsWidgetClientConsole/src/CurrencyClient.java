import java.net.SocketException;
import java.net.UnknownHostException;

public class CurrencyClient {


    public static void main(String[] args){
        try {
            EchoClient echoClient = new EchoClient();
            echoClient.sendEcho("currency");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }


}

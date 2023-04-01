package ma.enset;

import jakarta.xml.ws.Endpoint;
import ma.enset.ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:1806/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("Web service déploye sur "+url);

    }
}
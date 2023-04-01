package ma.enset.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.Date;
import java.util.List;

@WebService(serviceName="BanqueWS")
public class BanqueService {
    @WebMethod(operationName="ConversionEuroToDh")
    public double conversion(@WebParam(name="montant")double mt){
        return mt*11.3;
    }
    @WebMethod
    public Compte getCompte(int code){
        return  new Compte(code,Math.random()*65000,new Date());
    }
    @WebMethod
    public List<Compte> listComptes(){
        return  List.of(
                new Compte(1,Math.random()*65000,new Date()),
                new Compte(2,Math.random()*65000,new Date()),
                new Compte(3,Math.random()*65000,new Date()));
    }
}

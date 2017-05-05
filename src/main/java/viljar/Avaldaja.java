package viljar;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Avaldaja {

  @RequestMapping("/geeniliitja")
    String liitja(String g1, String g2 ){
      return new UusGeen().UusGeen(g1,g2);
    }
  @RequestMapping("/geenilooja")
    String geenilooja(String alleel1, String alleel2, String vaartus1, String vaartus2){
      return new Geeniliitja().Geeniliitja(alleel1,alleel2,vaartus1,vaartus2);
    }
  @RequestMapping("/geenitegija")
    String geenitegija(){
      Geen1[]sisu=new Geen1[3];
      sisu[0]= new Geen1(("a1","+"),("a2","+"));
      return "Posivne Geen eksisteerib";
    }
public static void main(String[] args)throws IOException{
  System.getProperties().put("server.port", 2497);
  SpringApplication.run(Avaldaja.class, args);
}
}

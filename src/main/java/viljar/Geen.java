package viljar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Geen{
  @RequestMapping("/algus")
    boolean tervitusfunktsioon() {
      Alleel[] sisu=new Alleel[3];
      sisu[0]= new Alleel("ARG",1);
      sisu[1]= new Alleel("ARG",0);
      sisu[2]= new Alleel("ARG",0);
      //System.out.println(Reesus(sisu));
        return Reesus(sisu);
}

  public static void main(String[]args){
    System.getProperties().put("server.port", 2497);
    SpringApplication.run(Geen.class, args);
  }
  public static boolean Reesus(Alleel[] x){
    for (int i=0; i<1; i++){
      if(x[i].gettoevaartus() == 1){
        System.out.println("Tere");
        return true;
      }
    }
  return false;
  }
}

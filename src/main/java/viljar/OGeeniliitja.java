public class OGeeniliitja{

  public String[] OGeeniliitja(String geen1, String geen2){
    int nr=new Geen().getGeen(geen1).length;
    String[] x=new String[nr*2];
    for(int i=0; i<new Geen().getGeen(geen1).length; i++){

        x[i]=(new Geen().getGeen(geen1)[i]);
        x[nr+1]new Geen().getGeen(geen2)[i];
    return x;
  }

  }
}

public class App {
    public static void main(String[] args) throws Exception {
       lutador l[] = new lutador[6];
       
       l[0] = new lutador ("Anderson Silva", "Brasil", 47, 1.88, 83.0 ,34, 11, 0 );
       l[1] = new lutador ("Chael Sonnen", "Estados Unidos", 45, 1.85, 83.00, 31,17,1);
       l[2] = new lutador ("Conor McGregor", "Irlanda", 34, 1.75, 77.0,22,6,0);
       l[3] = new lutador ("Jon Jones", "Estados Unidos", 35, 1.93, 113.0,26,1,0);
       l[4] = new lutador ("Alexander Gustafsson", "Suécia", 35, 1.96,93.00,18,7,0);
       l[5] = new lutador ("Lyoto Machida", "Brasil", 44,1.85,84,26,11,0);

      luta combate = new luta();
      combate.marcarluta(l[4], l[5]);
      combate.lutar();
      
     l[4].status();
     l[5].status();




    }
}

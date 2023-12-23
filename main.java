public  class Main {
    
public void main(String[]args) {
        Scanner input =new Scanner (System.in);
        int row,column;
                
        System.out.println("MAYIN TARLASI OYUNUNA HOŞGELDİNİZ!!");
        System.out.println("oyunda '-2' o kutuda  ve çevresinde bomba olmadığını ifade ediyor unutmayın.!");
        System.out.println("pozitif sayılar da o kutunun etrafında kaç tane bomba olduğunu ifade ediyor.!");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz ör(satır:5,sutun:5  5x5dir.)");
        System.out.println("sütun sayısı:");
        row = input.nextInt();
        System.out.println("satır sayısı:");
        column=input.nextInt();
        MayinTarlasi mayin =new MayinTarlasi(row,column);
        mayin.run();
}   
} 
  }
    

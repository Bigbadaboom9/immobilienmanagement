//Projekt Immobilienverwaltung
  // 03.11.2017
  // TUI 
  // Grafisches Interface
  
public class Immobilienverwaltung{
    
  
  private static void clear ()
  {
    System.out.print("\033[H\033[2J"); 
    System.out.flush(); 
    
  }
  
  public static void main(String args[]){
    
    hauptmenue();
  }
  
  public static void hauptmenue()
  {
    //Data programm = new Data();
    int menueeingabe = 0;
    // main menue
    System.out.println("-------------------------------------------------------------");
    System.out.println("|         > Willkommen in der Immobilienverwaltung <         |");
    System.out.println("-------------------------------------------------------------");
    System.out.println("|1) Anlegen eines Besitzers                                  |");
    System.out.println("|2) Anlegen einer Immobilie                                  |");
    System.out.println("|3) Bearbeiten eines Besitzers                               |");
    System.out.println("|4) Bearbeiten einer Immobilie                               | ");
    System.out.println("|5) Suchen nach einem Besitzer/Immobilie                     |");
    System.out.println("|6) Übersicht über leerstehende Häuser/ obdachlose Besitzer  |");
    System.out.println ("|0) Exit                                                     |");
    System.out.println("-------------------------------------------------------------");
    System.out.println("Wählen Sie eine Option aus!");                                                  
    menueeingabe = Tastatur.liesInt();
    
    
    switch (menueeingabe) {
      case 1 : 
      System.out.println("--------Anlegen eines Besitzers---------");
      System.out.println("Bitte ENTER drücken um zum Hauptmenü zu gelangen");
      Tastatur.liesString();
      hauptmenue();
      break;
      
      
      case 2: 
      System.out.println("--------Anlegen einer Immobilie---------"); 
      System.out.println("Bitte ENTER drücken um zum Hauptmenü zu gelangen");
      Tastatur.liesString();
      hauptmenue();   
      break;
      
      
      case 3: 
      System.out.println("------Bearbeiten eines Besitzers---------");
      System.out.println("Bitte ENTER drücken um zum Hauptmenü zu gelangen");
      Tastatur.liesString();
      hauptmenue();         
      break;
      
      
      case 4: 
      System.out.println("------------Bearbeiten einer Immobilie--------------");
      System.out.println("Bitte ENTER drücken um zum Hauptmenü zu gelangen");
      Tastatur.liesString();
      hauptmenue();
      break;
      
      case 5: 
      System.out.println("------------Bearbeiten einer Immobilie--------------");
      System.out.println("Bitte ENTER drücken um zum Hauptmenü zu gelangen");
      Tastatur.liesString();    
      hauptmenue();
      break;
      
      case 6: 
      System.out.println("------------Übersicht über leerstehende Häuser/ obdachlose Besitzer --------------");
      System.out.println("Bitte ENTER drücken um zum Hauptmenü zu gelangen");
      Tastatur.liesString();    
      hauptmenue(); 
      break;
      
      
      case 0: 
      break;
      default:
      System.out.println("Ungültige Auswahl\n Bitte die Eingabe wiederholen!"); 
      hauptmenue();

    } // end of switch
  }  
}

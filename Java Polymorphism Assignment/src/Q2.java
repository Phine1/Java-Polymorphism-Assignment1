 class Monster {
   private String name;

   
   public Monster(String name) {
      this.name = name;
   }
   public String monsterArrive() {
	   return "Here comes monster " +name;
   }
  public String attack() {
      return "Which method should I use to attack? I don't know how to attack!";
   }
}
 class FireMonster extends Monster {
	   
	   public FireMonster(String name) {
	      super(name);
	   }
	   @Override
	   public String attack() {
	      return "Attack with fire!"; 
	   }
	}
 class WaterMonster extends Monster {
	   
	   public WaterMonster(String name) {
	      super(name);
	   }
	 
	   @Override
	   public String attack() {
	      return "Attack with water!";
	   }
	}
 class StoneMonster extends Monster {
	  
	   public StoneMonster(String name) {
	      super(name);
	   }
	  
	   @Override
	   public String attack() {
	      return "Attack with stones!";
	   }
	}
public class Q2 {
	   public static void main(String[] args) {
	     
		  Monster m0 = new Monster("Monster");
	      Monster m1 = new FireMonster("red evil");   
	      Monster m2 = new WaterMonster("water lilly"); 
	      Monster m3 = new StoneMonster("stone cold"); 
          
	      System.out.println(m0.attack());
	      System.out.println(m1.monsterArrive());
	      System.out.println(m1.attack()); 
	      
	      System.out.println(m2.monsterArrive());
	      System.out.println(m2.attack());  
	      
	      System.out.println(m3.monsterArrive());
	      System.out.println(m3.attack()); 
   }  
}
	

public class GameCharacter {
    private String name;
    private int lifePoint;
    private int attackHitPoint;
    private int attackKickPoint;

public String getname () {
    return name;
}

public void setname(String name) {
    this.name = name;
}

public int getlifePoint() {
    return lifePoint;
}
    
public void setlifePoint(int lifePoint) {
this.lifePoint = lifePoint;
}

public int getattackHitPoint() {
    return attackHitPoint;
}
    
public void setattackHitPoint(int attackHitPoint) {
this.attackHitPoint = attackHitPoint;
}

public int getattackKickPoint() {
    return attackKickPoint;
}
    
public void setattackKickPoint(int attackKickPoint) {
this.attackKickPoint = attackKickPoint;
}

public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
    this.name = name;
    this.attackHitPoint = attackHitPoint;
    this.attackKickPoint = attackKickPoint;
}

void Hit(GameCharacter lawan, int attackHitPoint) {
    this.attackHitPoint -= attackHitpoint;
    System.out.println(this.name + "memukul" + lawan.name + "dengan kekuatan" + attackHitPoint);

    if(lifePoint >= attackHitPoint){
        lifePoint -= attackHitPoint;
        System.out.println(lifePoint);
    }
    
    else
    {
        lifePoint = 0;
    }
 }

 void Kick(GameCharacter lawan, int attackKickPoint) {
     this.attackKickPoint -= attackKickpoint;
     System.out.println(this.name + "memukul" + lawan.name + "dengan kekuatan" + attackKickPoint);

     if(lifePoint >= attackKickPoint){
         lifePoint -= attackKickPoint;
         System.out.println(lifePoint);
     }
     
     else
     {
         lifePoint = 0;
     }
  }

  void Selesai(GameCharacter lawan){
      if(lifePoint == 0){
          System.out.println("Pemenang = " + this.name);
      }
  }

  int lifePoint(){
    return lifePoint;
}

String name(){
    return name;
}

   public static void main(String[] args) {
       for (int i =1; i<=3; i++){
       System.out.println();
       
   }

   System.out.println("------Game Mulai------");
   System.out.println("LifePoint Raiden = 100");
   System.out.println("LIfePoint Sub-Zero = 100");

   GameCharacter GC1 = new GameCharacter("Raiden", 10, 20);
   GameCharacter GC2 = new GameCharacter("Sub-Zero", 5, 25);
 
   System.out.println();
   System.out.println(("------Ronde 1------"));
   GC1.Kick(GC2, 20);
   GC2.Kick(GC1, 25);
   
   System.out.println();
   System.out.println(("------Ronde 2------"));
   for (int i = 1; i <= 3; i++){
       GC1.Hit(GC2,5);
   }
   for (int i = 1; i <= 4; i++) {
    GC2.Kick(GC1,20);
   }
   System.out.println();

   System.out.println(("------Penentuan------"));
   GC1.Selesai(GC2);
   System.out.println();
    }
}
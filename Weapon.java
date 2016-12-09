//Heros can equip weapons to modify their damage.

public class Weapon{
  Hero wielder;
  int attack;
  int durability;

//Weapons can have deathrattle effects.
  public void die(){
    wielder.unequipWeapon;
  }

  public void decrementDurability(){
     this.durability--;
     if (this.durability<=0){
       this.die();
     }
   }
  public void incrementDurability(){ this.durability++; }
}

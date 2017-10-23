class Chick implements Animal 
{     
      private String myType;     
     private String mySound;
     private String mySounds;
     public Chick(String type, String sounds, String sound)     {         
         myType = type;         
         mySound = sound;  
         mySounds= sounds;
     }     
     public Chick()     {         
         myType = "unknown";
         mySound = "cluck";
         mySounds = "cheep";         
        
         
     }      
     public String getSound(){
     if((int)(Math.random()*2)+1 == 2)
       return mySound;
       else
       return mySounds;
       }     
     public String getType(){
     return myType;
   } 
}
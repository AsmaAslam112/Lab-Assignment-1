public class Artist{             //make a Class
   private String name;          //Declare Attribute

Artist(String name){             //Constructor
this.name=name;
}

public void setname(String name){   //Setter
this.name=name;}

public String getname(){            //Getter
return name;}

@Override                           //toString function
public String toString(){
return String.format("Name:%s",name);}

}

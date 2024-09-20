public class Artwork{

private String title;
private int year;
private Artist artist;

Artwork(String title,int year,Artist artist){
this.title=title;
this.year=year;
this.artist=artist;}

Artwork(String title,int year){
this.title=title;
this.year=year;
this.artist=new Artist("Unknown Artist");

}

public void settitle(String title){
this.title=title;}

public void setyear(int year){
this.year=year;}

public void setartist(Artist artist){
this.artist=artist;}

public String gettitle(){
return title;}

public int getyear(){
return year;}

public Artist getartist(){
return artist;}

public Artwork shallowcopy(){
return new Artwork(this.title,this.year,this.artist);}

public Artwork deepcopy(){
return new Artwork(this.title,this.year,new Artist(this.artist.getname()));}


@Override
public String toString(){
return String.format("Title:%s,Year:%d,Artistname:%s\n",title,year,artist);}

public boolean equals(Object o){
 Artwork temp=(Artwork)o;
return temp.title.equals(this.title)&&temp.year==this.year&& temp.artist.equals(this.artist);}


}

	
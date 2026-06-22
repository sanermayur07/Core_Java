class Artist{
	String name;
	int age;
	
	Artist(){
		
	}
	
	Artist(String name, int age){
		this.age= age;
		this.name= name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return this.age;
	}
	
	void display() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
	}
}//class Artist ends here

class Painter extends Artist{
	String paintingStyle;
	String mediumUsed;
	int numberOfPaintings;
	
	Painter(){
		
	}
	
	Painter(String name,int age,String paintingStyle,String mediumUsed,int numberOfPaintings){
		super(name,age);
		
		this.paintingStyle = paintingStyle;
		this.mediumUsed = mediumUsed;
	}
	
	void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}
	
	String getPaintingStyle() {
		return this.paintingStyle;
	}
	
	void setMediumUsed(String mediumUsed) {
		this.mediumUsed = mediumUsed;
	}
	
	String getMediumUsed() {
		return this.mediumUsed;
	}
	
	void setNumberOfPaintings(int numberOfPaintings) {
		this.numberOfPaintings = numberOfPaintings;
	}
	
	int getNumberOfPintings() {
		return this.numberOfPaintings;
	}
	
	void display() {
		super.display();
		
		System.out.println("Painting Style: "+this.paintingStyle);
		System.out.println("Medium Used: "+this.mediumUsed);
		System.out.println("Number of Paintings: "+this.numberOfPaintings);
	}
}//class painting ends here

class Musician extends Artist{
	String instrument;
	String musicGenre;
	int numberOfAlbums;
	
	Musician(){
		
	}
	
	Musician(String name,int age,String instrument,String musicGenre,int numberOfAlbums){
		super(name,age);
		
		this.instrument = instrument;
		this.musicGenre = musicGenre;
		this.numberOfAlbums = numberOfAlbums;
	}
	
	void setInstrument(String instrument) {
		this.instrument = instrument;
	}
	
	String getInstrument() {
		return this.instrument;
	}
	
	void setMusicGenre(String musicGenre) {
		this.musicGenre = musicGenre;
	}
	
	String getMusicGenre() {
		return this.musicGenre;
	}
	
	void setNumberOfAlbums(int numberOfAlbums) {
		this.numberOfAlbums = numberOfAlbums;
	}
	
	int getNumberOfAlbums() {
		return this.numberOfAlbums;
	}
	
	void display() {
		super.display();
		
		System.out.println("Instrument: "+this.instrument);
		System.out.println("MusicGenre: "+this.musicGenre);
		System.out.println("Number of Albums: "+this.numberOfAlbums);
	}
}//class musician ends here

class Actor extends Artist{
	String filmIndustry;
	int numberOfMovies;
	
	Actor(){
		
	}
	
	Actor(String name, int age, String filmIndustry,int numberOfMovies){
		super(name,age);
		
		this.filmIndustry = filmIndustry;
		this.numberOfMovies = numberOfMovies;
	}
	
	void setFilmIndustry(String filmIndustry) {
		this.filmIndustry = filmIndustry;
	}
	
	String getFilmIndustry() {
		return this.filmIndustry;
	}
	
	void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}
	
	int getNumberOfMovies() {
		return this.numberOfMovies;
	}
	
	void display() {
		super.display();
		
		System.out.println("Film Industry: "+this.filmIndustry);
		System.out.println("Number of Albums: "+this.numberOfMovies);
	}
}//class Actor ends here

public class ArtistClass {
  public static void main(String[] args) {
	
	  Painter p1= new Painter("Rahul",23,"Abstract","Oil",50);
	  Musician m1= new Musician("Ariji",37,"Guitar","Rock",150);
	  Actor a1= new Actor("Akshay",55,"Bollywood",150);
	  
	  System.out.println("=========Painter Details============");
	  p1.display();
	  
	  System.out.println("=========Musician Details============");
	  m1.display();
	  
	  System.out.println("=========Actor Details============");
	  a1.display();
}
}

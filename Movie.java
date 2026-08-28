package codegananDSA;

public class Movie {
	private int movieticket;
	private StringMethods moviename;
    private int availableSeats;
	
public void moviename(StringMethods moviename) {
	this.moviename=moviename;
}
  public StringMethods moviename() {
	  return moviename;
  }
  
public void movieticket(int movieticket) {
	this.movieticket=movieticket;
	
}
public int movieticket() {
	  return movieticket;
}
public void availableSeats(int availableSeats) {
	this.availableSeats=availableSeats;
	
}
public int availableSeats() {
	  return availableSeats;
}
}



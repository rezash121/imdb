package imdb;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.reflect.Array;

public class Film implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int year;
	private String country;
	private ArrayList<String> genreList;
	private int durationMinutes;
	private String director;
	private String description;
	
	public Film(){
		this.name="";
		this.year=0;
		this.country="";
		this.genreList=null;
		this.durationMinutes=0;
		this.director="";
		this.description="";
	}
	public Film(String name,int year,String country,ArrayList<String> genreList,int durationMinutes,String director,String description){
		this.name=name;
		this.year=year;
		this.country=country;
		this.genreList=genreList;
		this.durationMinutes=durationMinutes;
		this.director=director;
		this.description=description;
	}
	
	public String getname(){
		return name;
	}
	
	public int getyear(){
		return year;
	}
	
	public String getcountry(){
		return country;
	}

	public List<String> getFilmGeners() {
		return this.genreList;
	}

	public int getdurationminutes(){
		return durationMinutes;
	}
	
	public String getdirector(){
		return director;
		
	}

	@Override
	public String toString() {
		return "name: " + name + " |year: " + year + " |country: " + country + "\n" + "generlist: " + genreList
				+ " |durationMinutes: " + durationMinutes + " |director: " + director + "\n" + "description: "
				+ description;

	}
}// end of class Film

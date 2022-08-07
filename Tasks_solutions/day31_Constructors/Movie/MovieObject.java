package day31_Constructors.Movie;

public class MovieObject {
    public static void main(String[] args) {

        String genre = "Adventure, Comedy, Thriller";
        String title = "Journey to SDET: Cydeo Batch 25";
        String[] casts = {"Asiya", "Adam", "Muhtar", "Akbar", "Gurhan", "Saim", "Murodil", "Nadir", "Guljannet"};

      Movie movie=new Movie("USA","","","10/25/2021","Kuzzat Altay");
        movie.addCasts(casts);

        System.out.println(movie);
    }
}
/*
4. 2create a class called MovieObjects
  1. create an object of the movie:
  title: Journey to SDET: Cydeo Batch 25
  country: USA
  Genre: Adventure, Comedy, Thriller
  release date: 10/25/2021
  director: Kuzzat Altay
  Casts: Asiya, Adam, Muhtar and 5 more students from
  your group
  print the full info of the movie
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie movie = Movie.getMovie("S", "Star Wars");
//        movie.watchMovie();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            String type = scanner.nextLine();
            if ("Qq".contains(type)) {
                System.out.println("Bye Bye");
                break;
            }

            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }
    }
}
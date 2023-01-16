public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Movie comedyMovie = (Movie) comedy;
        comedyMovie.watchMovie();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        Object unknownObject = Movie.getMovie("A", "Airplane");
        if (unknownObject instanceof Adventure) {
            ((Adventure)unknownObject).watchMovie();
        } else if (unknownObject instanceof ScienceFiction sf) {
            sf.watchMovie();
        } else {
            System.out.println("The instance is Comedy");
            ((Comedy) unknownObject).watchMovie();
        }
    }
}

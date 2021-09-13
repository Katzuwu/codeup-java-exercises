package movies;
import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        System.out.println("Welcome user! I have a list of movies. Would you like to see? [Y/N]");
        Input input = new Input();
        Boolean userYesOrNo = input.yesNo();
        if (userYesOrNo) {
            System.out.println("Okay! Let's get started. First, would you like to see all movies or movies by a specific category?");
            String userAnswer = input.getString();
            if (userAnswer.equals("all movies")) {
                for (Movie movie : MoviesArray.findAll()) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            } else if (userAnswer.equals("specific category")) {
                System.out.println("Which category would you like to see? There's drama, musical, scifi, horror or animated.");
                String userResponse = input.getString();
                switch (userResponse) {
                    case "drama":
                        for (Movie movie : MoviesArray.findAll()) {
                            if (movie.getCategory().equals("drama")) {
                                System.out.println(movie.getName() + " - " + movie.getCategory());
                            }
                        }
                        break;
                    case "musical":
                        for (Movie movie : MoviesArray.findAll()) {
                            if (movie.getCategory().equals("musical")) {
                                System.out.println(movie.getName() + " - " + movie.getCategory());
                            }
                        }
                        break;
                    case "scifi":
                        for (Movie movie : MoviesArray.findAll()) {
                            if (movie.getCategory().equals("scifi")) {
                                System.out.println(movie.getName() + " - " + movie.getCategory());
                            }
                        }
                        break;
                    case "horror":
                        for (Movie movie : MoviesArray.findAll()) {
                            if (movie.getCategory().equals("horror")) {
                                System.out.println(movie.getName() + " - " + movie.getCategory());
                            }
                        }
                        break;
                    case "animated":
                        for (Movie movie : MoviesArray.findAll()) {
                            if (movie.getCategory().equals("animated")) {
                                System.out.println(movie.getName() + " - " + movie.getCategory());
                            }
                        }
                        break;
                }
            } else
                System.out.println("Okay. Thanks for stopping by!");
        }
    }
}

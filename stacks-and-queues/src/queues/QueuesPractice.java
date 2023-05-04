package queues;

import java.util.LinkedList;

public class QueuesPractice
{
    public static void main(String[] args)
    {
        LinkedList<String> moviesToSee = new LinkedList<>();

        //queue up movies we want to see
        moviesToSee.offer("Cocaine Bear");
        moviesToSee.offer("Super Mario Brothers");
        moviesToSee.offer("Dungeons and Dragons");

        System.out.println(moviesToSee.poll()); //see a movie
        System.out.println(moviesToSee.poll()); //see a movie

        moviesToSee.offer("GotG 3");
        moviesToSee.offer("Avatar 2");

        System.out.println(moviesToSee.poll()); //see a movie
        System.out.println(moviesToSee.poll()); //see a movie
    }
}

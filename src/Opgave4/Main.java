package Opgave4;

public class Main {
    public static void main(String[] args){
        Team team1 = new Team("Pandas");
        Team team2 = new Team("Bears");


        team1.addPlayer(new Player("Jens", 65));
        team1.addPlayer(new Player("Jens", 65));
        team1.addPlayer(new Player("Jens", 65));
        team1.addPlayer(new Player("Jens", 65));


        team2.addPlayer(new Player("Torben", 78));
        team2.addPlayer(new Player("Torben", 78));
        team2.addPlayer(new Player("Torben", 78));
        team2.addPlayer(new Player("Torben", 78));

        team1.printTeam();
        team2.printTeam();

        team1.compete(team2);
    }
}

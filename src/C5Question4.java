/**
 * Created by Brandon on 3/22/2016.
 * 0.0.1
 */

public class C5Question4 {
    private class Competition{
        String competition_name, winning_team, runner_up;
        int competition_year;

        void setCompetition_name(String entered){
            competition_name = entered;
        }

        void setWinning_team(String entered){
            winning_team = entered;
        }

        void setRunner_up(String entered){
            runner_up = entered;
        }

        void setCompetition_year(int entered){
            competition_year = entered;
        }

        String getCompetition_name(){
            return competition_name;
        }

        String getWinning_team(){
            return winning_team;
        }

        String getRunner_up(){
            return runner_up;
        }

        int getCompetition_year(){
            return competition_year;
        }
    }

    private class Team{
        private String team_name, name1, name2, name3, name4;
        Competition competition1, competition2;

        void setName1(String entered){
            name1 = entered;
        }

        void setName2(String entered){
            name2 = entered;
        }

        void setName3(String entered){
            name3 = entered;
        }

        void setName4(String entered){
            name4 = entered;
        }

        void setTeamName(String entered){
            team_name = entered;
        }

        String getName1(){
            return name1;
        }

        String getName2(){
            return name2;
        }

        String getName3(){
            return name3;
        }

        String getName4(){
            return name4;
        }

        String getTeamName(){
            return team_name;
        }

        void setCompetition1(Competition a){
            competition1 = a;
        }

        void setCompetition2(Competition b){
            competition2 = b;
        }

        Competition getCompetition1(){
            return competition1;
        }

        Competition getCompetition2(){
            return competition2;
        }

        String printTeamsMembers(){
            return "This";
        }
    }
}

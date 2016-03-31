/**
 * Created by Brandon on 3/22/2016.
 * 0.0.1
 */
    class Competition{

        Competition(){}

        Competition(Competition other_competition){
            /* Copy Constructor */
            this.competition_year = other_competition.competition_year;
            this.competition_name = other_competition.competition_name;
            this.runner_up = other_competition.runner_up;
            this.winning_team = other_competition.winning_team;
        }

        Competition(Competition other_competition, Boolean flag){
            /* Deep copy Constructor */
            competition_year = other_competition.competition_year;
            competition_name = other_competition.competition_name;
            runner_up = other_competition.runner_up;
            winning_team = other_competition.winning_team;
        }

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

        String printCompetition(){
            String temp = ("Competition Name: " + competition_name + "\nWinner: " + winning_team + "\nRunner Up: " + runner_up + "\nCompetition Year: " + competition_year);
            return temp;
        }

    }

    class Team{
        private String team_name, name1, name2, name3, name4;
        Competition competition1, competition2;

        Team(){}
        /* Copy Constructor */
        Team(Team other_team){
            this.team_name = other_team.team_name;
            this.name1 = other_team.name1;
            this.name2 = other_team.name2;
            this.name3 = other_team.name3;
            this.name4 = other_team.name4;
            this.competition1 = other_team.competition1;
            this.competition2 = other_team.competition2;
        }

        Team(Team other_team, Boolean flag){
            /* Deep copy Constructor */
            team_name = other_team.team_name;
            name1 = other_team.name1;
            name2 = other_team.name2;
            name3 = other_team.name3;
            name4 = other_team.name4;
            competition1 = other_team.competition1;
            competition2 = other_team.competition2;

        }

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

        String printTeamsMembers(Team a){
            String all_team_members;
            System.out.println("Team Name: " + a.getTeamName() +"\nTeam Members: " + a.getName1() + ", " + a.getName2() + ", " + a.getName3() + ", " + a.getName4());

            all_team_members = ("Team Name: " + a.getTeamName() +"\nTeam Members: " + a.getName1() + ", " + a.getName2() + ", " + a.getName3() + ", " + a.getName4());
            return all_team_members;
        }
    }

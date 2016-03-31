/**
 * This class is called Competition which contains the information
 * of a specific competition held by something or some organization.
 * This class also contains the names of the winning team, and the
 * runner up. Finally this class also contains the year that the
 * competition was held.
 * @since 22 March 2016
 * @author Brandon Hathaway
 */
    class Competition{
    /**
     * Default constructor of the Competition class.
     */
        Competition(){}

    /**
     * Accepts another object of the Competition class and then sets
     * all of the instance variables in the object that made the call
     * to this constructor to the instance variables of the object
     * passed as a parameter.
     * @param other_competition Accepts another Competition class object from the main file.
     */
        Competition(Competition other_competition){
            /* Copy Constructor */
            this.competition_year = other_competition.competition_year;
            this.competition_name = other_competition.competition_name;
            this.runner_up = other_competition.runner_up;
            this.winning_team = other_competition.winning_team;
        }

    /**
     * Accepts another object of the Competition class and then sets
     * all of the instance variables in the object that made the call
     * to this constructor to the instance variables of the object
     * passed as a parameter.
     * @param other_competition Accepts another Competition class object from the main file.
     * @param flag Accepts a boolean to signify that the function is calling the deep copy
     *             constructor of the Competition class.
     */
        Competition(Competition other_competition, Boolean flag){
            /* Deep copy Constructor */
            competition_year = other_competition.competition_year;
            competition_name = other_competition.competition_name;
            runner_up = other_competition.runner_up;
            winning_team = other_competition.winning_team;
        }

    /**
     * These are the instance variables of the Competition class.
     */
        String competition_name, winning_team, runner_up;
        int competition_year;

    /**
     * Sets the competition name variable equal to a string passed.
     * @param entered This is a String that is passed by the main program.
     *                In which the String contains the name of the
     *                competition.
     */
    void setCompetition_name(String entered){
            competition_name = entered;
        }

    /**
     * Assigns the value of the string variable passed to the
     * instance variable winning_team.
     * @param entered This is a string that is passed by the main program.
     *                In which the string contains the name of the winning
     *                team.
     *
     */
        void setWinning_team(String entered){
            winning_team = entered;
        }

    /**
     * Assigns the value of the string variable passed to the instance
     * variable runner_up.
     * @param entered This is a string that is passed by the main program.
     *                In which the string contains the name of the runner
     *                up.
     */
        void setRunner_up(String entered){
            runner_up = entered;
        }

    /**
     * Assigns the value of the integer variable passed to the instance
     * variable competition_year
     * @param entered This is an integer value that is passed by the main
     *                program. In which the integer contains the value of
     *                the competition year.
     */
        void setCompetition_year(int entered){
            competition_year = entered;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable competition_name.
     * @return Passes the value of competition_name which is an instance
     * variable back.
     */
        String getCompetition_name(){
            return competition_name;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable winning_team.
     * @return Passes the value of winning_team which is an instance
     * variable back.
     */
        String getWinning_team(){
            return winning_team;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable runner_up.
     * @return Passes the value of runner_up which is an instance
     * variable back.
     */
        String getRunner_up(){
            return runner_up;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable competition_year.
     * @return Passes the value of competition_year which is an instance
     * variable back.
     */
        int getCompetition_year(){
            return competition_year;
        }

    /**
     * This method returns a string containing all of the values of the instance variables
     * together so that another portion of the program can print out the object of the class
     * to the screen.
     * @return returns the variable temp that holds the values of the instance variables.
     */
        String printCompetition(){
            String temp = ("Competition Name: " + competition_name + "\nWinner: " + winning_team + "\nRunner Up: " + runner_up + "\nCompetition Year: " + competition_year);
            return temp;
        }

    }

/**
 * This class is name Team which contains information on a team name
 * that something or some people created. The team contains four
 * members and the class holds the names of all four members.
 * Finally the class contains two object of the competition that
 * the Team will participate in and will show the results of that
 * competition.
 * @since 22 March 2016
 * @author Brandon Hathaway
 */
    class Team{
    /**
     * These are all of the instance variables of the Team class.
     */
        private String team_name, name1, name2, name3, name4;
        Competition competition1, competition2;

    /**
     * This is the Default Constructor.
     */
        Team(){}

    /**
     * Accepts another object of the Team class and then sets
     * all of the instance variables in the object that made the call
     * to this constructor to the instance variables of the object
     * passed as a parameter.
     * @param other_team Accepts another Team class object from the main file.
     */
    Team(Team other_team){
            /* Copy Constructor */
            this.team_name = other_team.team_name;
            this.name1 = other_team.name1;
            this.name2 = other_team.name2;
            this.name3 = other_team.name3;
            this.name4 = other_team.name4;
            this.competition1 = other_team.competition1;
            this.competition2 = other_team.competition2;
        }

    /**
     * Accepts another object of the Team class and then sets
     * all of the instance variables in the object that made the call
     * to this constructor to the instance variables of the object
     * passed as a parameter.
     * @param other_team Accepts another Team class object from the main file.
     * @param flag Accepts a boolean to signify that the function is calling the deep copy
     *             constructor of the Team class.
     */
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

    /**
     * Assigns the value of the string variable passed to the
     * instance variable called name 1.
     * @param entered This is a string that is passed by the main program.
     *                In which the string contains the name of the first
     *                member of the team.
     */
        void setName1(String entered){
            name1 = entered;
        }

    /**
     * Assigns the value of the string variable passed to the
     * instance variable called name 2.
     * @param entered This is a string that is passed by the main program.
     *                In which the string contains the name of the second
     *                member of the team.
     */
        void setName2(String entered){
            name2 = entered;
        }

    /**
     * Assigns the value of the string variable passed to the
     * instance variable called name 3.
     * @param entered This is a string that is passed by the main program.
     *                In which the string contains the name of the third
     *                member of the team.
     */
        void setName3(String entered){
            name3 = entered;
        }

    /**
     * Assigns the value of the string variable passed to the
     * instance variable called name 4.
     * @param entered This is a string that is passed by the main program.
     *                In which the string contains the name of the fourth
     *                member of the team.
     */
        void setName4(String entered){
            name4 = entered;
        }

    /**
     * Assigns the value of the string variable passed to the
     * instance variable called team_name.
     * @param entered This is a string that is passed by the main program.
     *                In which the string contains the name of the team.
     */
        void setTeamName(String entered){
            team_name = entered;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable name1.
     * @return Passes the value of name1 which is an instance
     * variable back.
     */
        String getName1(){
            return name1;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable name2.
     * @return Passes the value of name2 which is an instance
     * variable back.
     */
        String getName2(){
            return name2;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable name3.
     * @return Passes the value of name3 which is an instance
     * variable back.
     */
        String getName3(){
            return name3;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable name4.
     * @return Passes the value of name4 which is an instance
     * variable back.
     */
        String getName4(){
            return name4;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable team_name.
     * @return Passes the value of team_name which is an instance
     * variable back.
     */
        String getTeamName(){
            return team_name;
        }

    /**
     * This method accepts an object of the Competition Class as a parameter
     * so that the object can be assigned the to the instance variable which
     * is also an object of the Competition class.
     * @param a This is an object that belongs to the Competition Class
     *          which is passed as a parameter.
     */
        void setCompetition1(Competition a){
            competition1 = a;
        }

    /**
     * This method accepts an object of the Competition Class as a parameter
     * so that the object can be assigned the to the instance variable which
     * is also an object of the Competition class.
     * @param b This is an object that belongs to the Competition Class
     *          which is passed as a parameter.
     */
        void setCompetition2(Competition b){
            competition2 = b;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable competition1 which is an
     * instance variable and object of the Competition Class.
     * @return Passes the value of competition1 which is an instance
     * variable and object back.
     */
        Competition getCompetition1(){
            return competition1;
        }

    /**
     * This method allows a user to call this function and retrieve
     * the value of the instance variable competition2 which is an
     * instance variable and object of the Competition Class.
     * @return Passes the value of competition2 which is an instance
     * variable and object back.
     */
        Competition getCompetition2(){
            return competition2;
        }

    /**
     * This method takes all of the values of the instance variables and then
     * puts those values into one string by calling the get functions so that
     * a string is formed and then is easy to print everything from the entire
     * object of the Team Class to the string.
     * @param a This is an object of the Team class that is passed by the call to this
     *          method.
     * @return A string is returned to the program that called this method.
     */
        String printTeamsMembers(Team a){
            String all_team_members;
            System.out.println("Team Name: " + a.getTeamName() +"\nTeam Members: " + a.getName1() + ", " + a.getName2() + ", " + a.getName3() + ", " + a.getName4());

            all_team_members = ("Team Name: " + a.getTeamName() +"\nTeam Members: " + a.getName1() + ", " + a.getName2() + ", " + a.getName3() + ", " + a.getName4());
            return all_team_members;
        }
    }

public class ElectionDriver {
        public static void main(String[] args) {
                Election state1 = new Election();
                Election state2 = new Election("Georgia", "Dr. Savio", 10, false, 50,
                                40);

                System.out.println("State 1: " + state1);

                System.out.println();

                System.out.println("State 2: " + state2);

                state1.setStateName("Montana");
                state1.setStatePopulation(5);
                state1.setIsElectionYear(false);

                System.out.println("\n");

                System.out.println("State 1:\n- State name: " + state1.getStateName() + "\n- President: "
                                + state1.getPresident() + "\n- State population: " + state1.getStatePopulation()
                                + "\n- Is it an election year? " + state1.getIsElectionYear() + "\n- Republican votes? "
                                + state1.getVoteR() + "\n- Democratic votes? " + state1.getVoteD());

                System.out.println("\n" + state1);

                System.out.println();

                System.out.println("State 2:\n- State name: " + state2.getStateName() + "\n- President: "
                                + state2.getPresident() + "\n- State population: " + state2.getStatePopulation()
                                + "\n- Is it an election year? " + state2.getIsElectionYear() + "\n- Republican votes? "
                                + state2.getVoteR() + "\n- Democratic votes? " + state2.getVoteD());

                System.out.println("\n" + state2);

                state2.setIsElectionYear(true);

                System.out.println("\n");

                System.out
                                .println("The new status for state 2 if it is an election year is "
                                                + state2.getIsElectionYear() + ".");

                System.out.println();

                System.out.println("The winner of the state 2 election is " + state2.electionResults());

        }
}

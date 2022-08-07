package day23_CustomMethod_Void;

public class _4_EligibleToVote {
    public static void main(String[] args) {
eligibleToVote(25,"usa");
    }

    public static void eligibleToVote(int age, String citizen) {
        if (age >= 18 && citizen.equalsIgnoreCase("usa")) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
    }
}

/*
	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");
			output:
				You are not eligible to vote!
 */
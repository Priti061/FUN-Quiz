import questions.*;

public class QuizRunner {

    // Create quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        // Create questions

        String q1 = "Which of the following is a symptom of dehydration?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Fever"),
                new Choice("Headache", true),
                new Choice("Runny nose"),
                new Choice("Excessive thirst", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "Main function of carbohydrates in the body is to provide energy.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "What is the recommended daily water intake for adults?";
        Choice[] q3Choices = new Choice[] {
                new Choice("8 cups", true),
                new Choice("2 cups"),
                new Choice("4 cups"),
                new Choice("12 cups")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);


        // Add questions to quiz

        quiz.addQuestions(new Question[] { question1, question2, question3 });


        // Interact with user (run quiz, give score)

        quiz.run();

        String newline = System.lineSeparator();
        System.out.println(newline + "You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);

    }

}

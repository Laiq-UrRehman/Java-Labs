import java.util.*;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========================================");
            System.out.println("             Main Menu                ");
            System.out.println("=========================================");
            System.out.println("1. Validate Social Security Number");
            System.out.println("2. Find Major & Year from Code");
            System.out.println("3. Generate Vehicle Plate Number");
            System.out.println("4. Convert Decimal to Binary");
            System.out.println("5. Global Warming Quiz");
            System.out.println("0. Exit Program");
            System.out.println("=========================================");
            System.out.print("Enter your choice (0-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    question1(sc);
                    break;
                case 2:
                    question2(sc);
                    break;
                case 3:
                    question3(sc);
                    break;
                case 4:
                    question4(sc);
                    break;
                case 5:
                    question5(sc);
                    break;
                case 0:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter between 0-5.");
                    break;
            }
        } while (choice != 0);

        sc.close();
    }

    // Question 1
    public static void question1(Scanner sc) {
        String response;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Question 1: Social Security Number Check");
            System.out.println("------------------------------------------");
            System.out.print("Enter SSN (format: DDD-DD-DDDD): ");
            String ssn = sc.next();

            if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
                System.out.println(ssn + " is a valid Social Security Number.");
            } else {
                System.out.println(ssn + " is not a valid Social Security Number.");
            }

            System.out.print("Run again? (y/b): ");
            response = sc.next();
        } while (response.equalsIgnoreCase("y"));
    }

    // Question 2
    public static void question2(Scanner sc) {
        String response;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Question 2: Major & Year from Code");
            System.out.print("Enter code (e.g., C2): ");
            String code = sc.next().toUpperCase();

            if (code.length() != 2) {
                System.out.println("Invalid code length.");
            } else {
                char major = code.charAt(0);
                char year = code.charAt(1);
                String majorName = "";
                String yearName = "";

                switch (major) {
                    case 'M':
                        majorName = "Mathematics";
                        break;
                    case 'C':
                        majorName = "Computer Science";
                        break;
                    case 'I':
                        majorName = "Information Technology";
                        break;
                    default:
                        System.out.println("Invalid major code.");
                        majorName = "";
                }

                switch (year) {
                    case '1':
                        yearName = "Freshman";
                        break;
                    case '2':
                        yearName = "Sophomore";
                        break;
                    case '3':
                        yearName = "Junior";
                        break;
                    case '4':
                        yearName = "Senior";
                        break;
                    default:
                        System.out.println("Invalid year code.");
                        yearName = "";
                }

                if (!majorName.isEmpty() && !yearName.isEmpty()) {
                    System.out.println(majorName + " " + yearName);
                }
            }

            System.out.print("Run again? (y/b): ");
            response = sc.next();
        } while (response.equalsIgnoreCase("y"));
    }

    // Question 3
    public static void question3(Scanner sc) {
        String response;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Question 3: Generate Vehicle Plate Number");
            Random rand = new Random();

            String letters = "";
            for (int i = 0; i < 3; i++) {
                char letter = (char) ('A' + rand.nextInt(26));
                letters += letter;
            }

            String numbers = "";
            for (int i = 0; i < 4; i++) {
                int number = rand.nextInt(10);
                numbers += number;
            }

            System.out.println("Generated Plate Number: " + letters + "-" + numbers);
            System.out.print("Run again? (y/b): ");
            response = sc.next();
        } while (response.equalsIgnoreCase("y"));
    }

    // Question 4
    public static void question4(Scanner sc) {
        String response;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Question 4: Convert Decimal to Binary");
            System.out.print("Enter a decimal number: ");
            int decimal = sc.nextInt();
            sc.nextLine();

            String binary = "";
            if (decimal == 0) {
                binary = "0";
            } else {
                while (decimal > 0) {
                    int remainder = decimal % 2;
                    binary = remainder + binary;
                    decimal /= 2;
                }
            }

            System.out.println("Binary representation: " + binary);
            System.out.print("Run again? (y/b): ");
            response = sc.nextLine();
        } while (response.equalsIgnoreCase("y"));
    }

    // Question 5
    public static void question5(Scanner sc) {
        String response;
        do {
            System.out.println("------------------------------------------");
            System.out.println("Question 5: Global Warming Quiz");
            int score = 0;

            String[] questions = {
                "1. What gas is the main contributor to global warming?\n1) Oxygen\n2) Carbon Dioxide\n3) Nitrogen\n4) Hydrogen",
                "2. Which organization studies climate change?\n1) NASA\n2) NOAA\n3) IPCC\n4) All of the above",
                "3. Which energy source is renewable?\n1) Coal\n2) Solar\n3) Natural Gas\n4) Oil",
                "4. What human activity increases greenhouse gases?\n1) Deforestation\n2) Burning fossil fuels\n3) Both 1 and 2\n4) None of the above",
                "5. Which film featured Al Gore about climate change?\n1) An Inconvenient Truth\n2) The Day After Tomorrow\n3) Ice Age\n4) Wall-E"
            };

            int[] answers = {2, 4, 2, 3, 1};

            for (int i = 0; i < 5; i++) {
                System.out.println(questions[i]);
                System.out.print("Your answer (1-4): ");
                int ans = sc.nextInt();
                if (ans == answers[i]) {
                    score++;
                }
            }

            sc.nextLine(); // clear buffer
            System.out.println("------------------------------------------");
            System.out.println("You got " + score + " out of 5 correct.");

            if (score == 5) {
                System.out.println("Excellent work!");
            } else if (score == 4) {
                System.out.println("Good job!");
            } else {
                System.out.println("Time to brush up on your knowledge of global warming.");
                System.out.println("Visit: www.nasa.gov, www.noaa.gov, www.ipcc.ch");
            }

            System.out.print("Run again? (y/b): ");
            response = sc.nextLine();
        } while (response.equalsIgnoreCase("y"));
    }
}

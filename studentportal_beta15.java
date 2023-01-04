import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class studentportal_beta15 {
    static Scanner call_scanner = new Scanner(System.in);
    static ArrayList <Object[]> list = new ArrayList<>();
    static String first_name, middle_name,middle_name_FirstLetter,middle_name_SecondLetter,last_name,coc_account_email;
    static double birth_year,Year_Divide_4,leap_year;
    static  String birth_month;
    static boolean year_loop;
    static int birth_day,Con_birth_year;
    static String add_more_list;
    static int ict_grade,pr_grade,philo_grade,fil_grade,pe_grade;
    //Convert to String
    static String ConStr_birth_year,ConStr_birth_day,coc_account_password ;
    public static String input_RealName(Scanner call_scanner) {
        first_loop:
        while (true) {
            first_name_loop:
            while (true) {
                System.out.print("First Name: ");
                first_name = call_scanner.nextLine().toLowerCase().trim();
                if (first_name.matches("[a-z \\s]+")) {
                    String[] con_arr_first_name = {first_name};
                    String first_name_FirstLetter = (con_arr_first_name[0].charAt(0)) + "";
                    if (first_name_FirstLetter.matches("[a-z]")) {
                        try {
                            String first_name_SecondLetter = (con_arr_first_name[0].charAt(1)) + "";
                            if (first_name_SecondLetter.matches("[a-z]")) {
                                //middle_name_loop
                                while (true){
                                    System.out.println("If You Don't Have a Middle Name You Can Just Type None");
                                    System.out.print("Middle Name: ");
                                    middle_name = call_scanner.nextLine().toLowerCase().trim();
                                    if(middle_name.matches("[a-z]+") && middle_name.equals("none")){
                                        //last_name_loop
                                        while (true){
                                            System.out.print("Last Name: ");
                                            last_name = call_scanner.nextLine().toLowerCase().trim();
                                            if(last_name.matches("[a-z]+")){
                                                coc_account_email = first_name_FirstLetter + first_name_SecondLetter + first_name_FirstLetter + first_name_SecondLetter + "." + last_name + ".coc@phinmaed.com";
                                                return coc_account_email;
                                                //input_BirthDate(call_scanner);
                                            }else{
                                                System.out.println("Please Correctly Input Your Last Name.");
                                            }
                                        }
                                    } else if (middle_name.matches("[a-z]+")) {
                                        String[] con_arr_middle_name = {middle_name};
                                        middle_name_FirstLetter = (con_arr_middle_name[0].charAt(0)) + "";
                                        if(middle_name_FirstLetter.matches("[a-z]")){
                                            try {
                                                middle_name_SecondLetter = (con_arr_middle_name[0].charAt(1)) + "";
                                                //last_name_loop
                                                while (true){
                                                    System.out.print("Last Name: ");
                                                    last_name = call_scanner.nextLine().toLowerCase().trim();
                                                    if(last_name.matches("[a-z]+")){
                                                        coc_account_email = first_name_FirstLetter + first_name_SecondLetter + middle_name_FirstLetter + middle_name_SecondLetter + "." + last_name + ".coc@phinmaed.com";
                                                        return coc_account_email;
                                                        //input_BirthDate(call_scanner);
                                                    }else{
                                                        System.out.println("Please Correctly Input Your Last Name.");
                                                    }
                                                }
                                            }catch (StringIndexOutOfBoundsException e){
                                                System.out.println("Please Correctly Input Your Middle Name.");
                                            }
                                        }
                                    } else{
                                        System.out.println("You inputted contain number(s) or special character(s)!Try again.");
                                    }
                                }
                            }
                        } catch (StringIndexOutOfBoundsException e) {
                            System.out.println("Please Correctly Inputted Your First Name");
                        }
                    } else {
                        System.out.println("You may be inputted contain number(s) or special character(s)!Try agains.");
                        break first_name_loop;
                    }
                } else {
                    System.out.println("You may be inputted contain number(s) or special character(s)!Try again.");
                }
            }
        }
    }

    //static boolean jan_bool;
    static String january_function(Scanner call_scanner){
        //January

        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 31) {
                        System.out.println("January");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;
                        //user_name_password(call_scanner);
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String february_LeapYear_function(Scanner call_scanner) {
        //February
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 29) {
                        System.out.println("February");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;
                        //user_name_password(call_scanner);
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String february_NotLeapYear_function(Scanner call_scanner) {
        //February
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 28) {
                        System.out.println("February");
                        Con_birth_year = (int) birth_year;

                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        //user_name_password(call_scanner);
                        return coc_account_password;

                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String march_function(Scanner call_scanner) {
        //March
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 31) {
                        System.out.println("March");
                        Con_birth_year = (int) birth_year;

                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String april_function(Scanner call_scanner) {
        //April
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 30) {
                        System.out.println("April");
                        Con_birth_year = (int) birth_year;

                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;

                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String may_function(Scanner call_scanner) {
        //May
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 31) {
                        System.out.println("May");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String june_function(Scanner call_scanner) {
        //June
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 30) {
                        System.out.println("June");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;
                        //user_name_password(call_scanner);
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String july_function(Scanner call_scanner) {
        //July
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 31) {
                        System.out.println("July");
                        Con_birth_year = (int) birth_year;

                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;
                        //user_name_password(call_scanner);

                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String august_function(Scanner call_scanner) {
        //August
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 31) {
                        System.out.println("August");
                        Con_birth_year = (int) birth_year;

                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        return coc_account_password;
                        //user_name_password(call_scanner);

                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String september_function(Scanner call_scanner) {
        //September
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 30) {
                        System.out.println("September");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);

                        return coc_account_password;
                        //user_name_password(call_scanner);

                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String october_function(Scanner call_scanner) {
        //October
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 31) {
                        System.out.println("October");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        //user_name_password(call_scanner);
                        return coc_account_password;
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String november_function(Scanner call_scanner) {
        //November
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 30) {
                        System.out.println("November");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        //user_name_password(call_scanner);
                        return coc_account_password;
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static String december_function(Scanner call_scanner){
        //December
        while (true) {
            System.out.print("Day:");
            if (call_scanner.hasNextInt()) {
                birth_day = call_scanner.nextInt();
                try {
                    if (birth_day >= 1 && birth_day <= 31) {
                        System.out.println("December");
                        Con_birth_year = (int) birth_year;
                        ConStr_birth_year =  Integer.toString(Con_birth_year);
                        ConStr_birth_day = Integer.toString(birth_day);
                        coc_account_password = ConStr_birth_year + ConStr_birth_day;
                        System.out.println(coc_account_email);
                        System.out.println(coc_account_password);
                        //user_name_password(call_scanner);
                        return coc_account_password;
                    } else {
                        System.out.println("Invalid Day Number");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid Day Number");
                }
            } else {
                System.out.println("Invalid Day Number");
                call_scanner.next(); // consumes the invalid input
            }
        }
    }

    static void user_email_input(Scanner call_scanner){
        while (true) {
            System.out.println("Email: ");
            String email = call_scanner.nextLine();
            System.out.println("Password: ");
            String password = call_scanner.nextLine();


            boolean authenticated = false;
            for (Object[] account : list) {
                if (email.equals(account[0]) && password.equals(account[1])) {
                    System.out.println(" ict: " + account[2] + " pr: " + account[3] + " philo: " + account[4] + " fil: " + account[5] + " pe: " + account[6]);
                    authenticated = true;
                    break;
                }
            }

            if (!authenticated) {
                System.out.println("Wrong");
            } 
        }
    }

    public static void main(String[] args){
        first_loop:
        while(true){
            second_loop:
            while(true){
                String return_coc_account_email = input_RealName(call_scanner);
                do {
                    try {
                        year_loop = false;
                        while(true){
                            System.out.print("Birth Year:");
                            birth_year = call_scanner.nextDouble();
                            call_scanner.nextLine();
                            if(birth_year >= 2000 && birth_year <= 2006) {
                                Year_Divide_4 = birth_year / 4;
                                int Convert_YeDi4_int = (int) Year_Divide_4;
                                leap_year = Year_Divide_4 - Convert_YeDi4_int;
                                if (leap_year == 0) {
                                    //Month
                                    while(true){
                                        System.out.println("Abbreviation Of Month Or Whole Name Of Month");
                                        System.out.println("Ex. January ---> Jan/January");
                                        System.out.print("Month:");
                                        birth_month = call_scanner.nextLine().toLowerCase().trim();

                                        if (birth_month.matches("[a-z]+") && birth_month.equals("jan") || birth_month.equals("january")) {
                                            String return_coc_account_password = january_function(call_scanner);
                                            ict_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            pr_grade =ThreadLocalRandom.current().nextInt(70,101);
                                            philo_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            fil_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            pe_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password,ict_grade,pr_grade,philo_grade,fil_grade,pe_grade});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1] + " ict: " + element[2] + " pr: " + element[3] + " philo: " + element[4] + " fil: " + element[5] + " pe: " + element[6]);
                                            }
                                            while(true){
                                                JanContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        user_email_input(call_scanner);
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break JanContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("feb") || birth_month.equals("february")) {
                                            String return_coc_account_password = february_LeapYear_function(call_scanner);
                                            ict_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            pr_grade =ThreadLocalRandom.current().nextInt(70,101);
                                            philo_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            fil_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            pe_grade = ThreadLocalRandom.current().nextInt(70,101);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password,ict_grade,pr_grade,philo_grade,fil_grade,pe_grade});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1] + " ict: " + element[2] + " pr: " + element[3] + " philo: " + element[4] + " fil: " + element[5] + " pe: " + element[6]);
                                            }
                                            while(true){
                                                FebLeapYearContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break FebLeapYearContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("mar") || birth_month.equals("march")) {
                                            String return_coc_account_password = march_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                MarContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break MarContol_loop;
                                                    }
                                                }
                                            }

                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("apr") || birth_month.equals("april")) {
                                            String return_coc_account_password = april_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                AprContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break AprContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("may")) {
                                            String return_coc_account_password = may_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                MayContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break MayContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("jun") || birth_month.equals("june")) {
                                            //june_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                JunContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break JunContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("jul") || birth_month.equals("july")) {
                                            //july_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                JulContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break JulContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("aug") || birth_month.equals("august")) {
                                            //august_function(call_scanner);
                                            String return_coc_account_password = august_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                AugContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break AugContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("sep") || birth_month.equals("september")) {
                                            //september_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                SepContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break SepContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("oct") || birth_month.equals("october")) {
                                            //october_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                OctContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break OctContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("nov") || birth_month.equals("november")) {
                                            //november_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                NovContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break NovContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("dec") || birth_month.equals("december")) {
                                            //december_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                DecContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break DecContol_loop;
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("Invalid Months");
                                        }
                                    }
                                }else{
                                    //Month
                                    while(true){
                                        System.out.println("Abbreviation Of Month Or Whole Name Of Month");
                                        System.out.println("Ex. January ---> Jan/January");
                                        System.out.print("Month:");
                                        birth_month = call_scanner.nextLine().toLowerCase().trim();

                                        if (birth_month.matches("[a-z]+") && birth_month.equals("jan") || birth_month.equals("january")) {
                                            //january_function(call_scanner);
                                            String return_coc_account_password = january_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                JanContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break JanContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("feb") || birth_month.equals("february")) {
                                            //february_NotLeapYear_function(call_scanner);
                                            String return_coc_account_password = february_NotLeapYear_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                FebLeapYearContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break FebLeapYearContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("mar") || birth_month.equals("march")) {
                                            //march_function(call_scanner);
                                            String return_coc_account_password = march_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                MarContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break MarContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("apr") || birth_month.equals("april")) {
                                            //april_function(call_scanner);
                                            String return_coc_account_password = april_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                AprContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break AprContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("may")) {
                                            //may_function(call_scanner);
                                            String return_coc_account_password = may_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                MayContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break MayContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("jun") || birth_month.equals("june")) {
                                            //june_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                JunContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break JunContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("jul") || birth_month.equals("july")) {
                                            //july_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                JulContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break JulContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("aug") || birth_month.equals("august")) {
                                            //august_function(call_scanner);
                                            String return_coc_account_password = august_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                AugContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break AugContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("sep") || birth_month.equals("september")) {
                                            //september_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                SepContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break SepContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("oct") || birth_month.equals("october")) {
                                            //october_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                OctContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break OctContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("nov") || birth_month.equals("november")) {
                                            //november_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                NovContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break NovContol_loop;
                                                    }
                                                }
                                            }
                                        }else if (birth_month.matches("[a-z]+") && birth_month.equals("dec") || birth_month.equals("december")) {
                                            //december_function(call_scanner);
                                            String return_coc_account_password = june_function(call_scanner);
                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password});
                                            for (int i = 0; i < list.size(); i++) {
                                                Object[] element = list.get(i);
                                                System.out.println((1+i) +"). "+element[0] + " " + element[1]);
                                            }
                                            while(true){
                                                DecContol_loop:
                                                while(true){
                                                    System.out.print("You Want to Add More List(Y/N):");
                                                    add_more_list = call_scanner.next().toLowerCase().trim();
                                                    call_scanner.nextLine();
                                                    if(add_more_list.equals("y")){
                                                        System.out.println("Adding List ... Proceed");
                                                        break second_loop;
                                                    }else if(add_more_list.equals("n")){
                                                        System.out.println("Thansk");
                                                        break first_loop;
                                                    }else{
                                                        System.out.println("Invalid Keywords123");
                                                        break DecContol_loop;
                                                    }
                                                }
                                            }
                                        }else{
                                            System.out.println("Invalid Months");
                                        }
                                    }
                                }

                            }else{
                                System.out.println("Invalid Year");
                            }
                        }

                    } catch (Exception e) {
                        year_loop = true;
                        System.out.println("Invalid Year");
                        call_scanner.next();
                    }
                } while (year_loop);
            }
        }

    }
}

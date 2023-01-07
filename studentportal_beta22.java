import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class studentportal_beta22 {
    static Scanner call_scanner = new Scanner(System.in);
    static ArrayList <Object[]> list = new ArrayList<>();
    static String first_name, middle_name,middle_name_FirstLetter,middle_name_SecondLetter,last_name,coc_account_email;
    static double Year_Divide_4,leap_year;
    static int birth_year;
    static String birth_month;
    static boolean year_loop;
    static int birth_day,Con_birth_year;
    static String add_more_list;
    static int ict_grade,pr_grade,philo_grade,fil_grade,pe_grade;
    static String student_complete_name, student_complete_YearBirth , student_complete_name_ConvertUpperCase;

    //Convert to String
    static String ConStr_birth_year,ConStr_birth_day,coc_account_password ;
    public static String input_RealName(Scanner call_scanner) {
        first_loop:
        while (true) {
            first_name_loop:
            while (true) {

                System.out.println("Enter Student Credentials \n");
                System.out.print("Student First Name: ");
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
                                    System.out.println("If The Student Don't Have a Middle Name, Type None");
                                    System.out.print("Student Middle Name: ");
                                    middle_name = call_scanner.nextLine().toLowerCase().trim();
                                    if(middle_name.matches("[a-z]+") && middle_name.equals("none")){
                                        //last_name_loop
                                        while (true){
                                            System.out.print("Student Last Name: ");
                                            last_name = call_scanner.nextLine().toLowerCase().trim();
                                            if(last_name.matches("[a-z]+")){
                                                coc_account_email = first_name_FirstLetter + first_name_SecondLetter + first_name_FirstLetter + first_name_SecondLetter + "." + last_name + ".coc@phinmaed.com";
                                                //student_complete_name = first_name + middle_name + last_name;
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
                                                    System.out.print("Student Last Name: ");
                                                    last_name = call_scanner.nextLine().toLowerCase().trim();
                                                    if(last_name.matches("[a-z]+")){
                                                        coc_account_email = first_name_FirstLetter + first_name_SecondLetter + middle_name_FirstLetter + middle_name_SecondLetter + "." + last_name + ".coc@phinmaed.com";
                                                        //student_complete_name = first_name + middle_name + last_name;
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

    static String student_name(Scanner call_scanner){
        if(middle_name.matches("[a-z]+") && middle_name.equals("none")){

            student_complete_name = first_name + " " + last_name ;
            student_complete_name_ConvertUpperCase = student_complete_name.toUpperCase();

        }else if(middle_name.matches("[a-z]+")){
            student_complete_name = first_name + " " + middle_name + " "+ last_name;
            student_complete_name_ConvertUpperCase = student_complete_name.toUpperCase();

        }
        return student_complete_name_ConvertUpperCase;
    }

    static String student_BornYear(Scanner callScanner){
        if(birth_month.equals("jan") || birth_month.equals("january")){

            student_complete_YearBirth = "JANUARY" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("feb") || birth_month.equals("february")){

            student_complete_YearBirth = "FEBRUARY" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("mar") || birth_month.equals("march")){

            student_complete_YearBirth = "MARCH" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("apr") || birth_month.equals("april")){

            student_complete_YearBirth = "APRIL" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("may")){

            student_complete_YearBirth = "MAY" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("jun") || birth_month.equals("june")){

            student_complete_YearBirth = "JUNE" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("jul") || birth_month.equals("july")){

            student_complete_YearBirth = "JULY" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("aug") || birth_month.equals("august")){

            student_complete_YearBirth = "AUGUST" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("sep") || birth_month.equals("september")){

            student_complete_YearBirth = "SEPTEMBER" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("oct") || birth_month.equals("october")){

            student_complete_YearBirth = "OCTOBER" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("nov") || birth_month.equals("november")){

            student_complete_YearBirth = "NOVEMBER" + " " + birth_day + " " + birth_year;

        }else if(birth_month.equals("dec") || birth_month.equals("december")){

            student_complete_YearBirth = "DECEMBER" + " " + birth_day + " " + birth_year;

        }
        return student_complete_YearBirth;
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

    static String confirm_student_information(Scanner call_scanner){        
        System.out.println("\n ==============================:[ STUDENT CREDINTIALS]:============================== ");
        for (int i = 0; i < list.size(); i++) {
            Object[] element = list.get(i);
            System.out.println("|" + (1 + i) +"| STUDENT NAME: " + element[7] + " | BIRTHDAY: " + element[8] );
        }
        while(true){
            System.out.print("Confirm Student Information Y for Yes , A for Add More and R for Remove: ");
            String information_store =  call_scanner.nextLine().toLowerCase().trim();
            if(information_store.equals("y")){
                return information_store;
            }else if(information_store.equals("a")){
                return information_store;
            }else if(information_store.equals("r")){
                while(true){
                    if(list.isEmpty()){
                        System.out.println("Datebase Is Empty ");
                        break;
                    }else{
                        System.out.println("\n ==============================:[ STUDENT CREDINTIALS]:============================== ");
                        for (int i = 0; i < list.size(); i++) {
                            Object[] element = list.get(i);
                            System.out.println("|" + (1 + i) +"| STUDENT NAME: " + element[7] + " | BIRTHDAY: " + element[8] );
                                                    
                        }
                        System.out.println("Enter the complete name of the student to remove:");
                        String student_name_remove = call_scanner.nextLine().toUpperCase().trim();
                        
                        boolean StudentName_remove = false;
                        for (Object[] remove_student : list) {
                            if(student_name_remove.equals(remove_student[7])){
                                int student_index_arrayList = list.indexOf(remove_student);
                                list.remove(student_index_arrayList);

                                StudentName_remove = true;
                                break;
                            }
                        }

                        if(!StudentName_remove){
                            System.out.println("These Credentials Do Not Match Our Records.");
                            System.out.println("Please Check The Spelling Of Student Name You Want To Remove");
                        }
                    }        
                }

            }else{
                System.out.println("Invalid Keyword");
            }
            //return information_store;
        }
    }

    static void user_email_input(Scanner call_scanner){
        while(true){
            while(true){
                int tries = 0;
                Email_loop:
                while (tries <= 2) {
                    System.out.print("Email: ");
                    String email = call_scanner.nextLine();
                    System.out.print("Password: ");
                    String password = call_scanner.nextLine();

                    boolean authenticated = false;
                    for (Object[] account : list) {
                        if (email.equals(account[0]) && password.equals(account[1])) {
                            System.out.println(" ict: " + account[2] + " pr: " + account[3] + " philo: " + account[4] + " fil: " + account[5] + " pe: " + account[6]);
                            int app_003 = (int) account[5];
                            int app_006 = (int) account[3];
                            int cor_015 = (int) account[4];
                            int cor_019 = (int) account[6];
                            int ict_001 = (int) account[2];
                            System.out.println("|==============|================================================|==============================|======|=====================|=============|=========|");
                            System.out.println("|              |                                                |                              |      |                     |             |         |");
                            System.out.println("| Subject Code |                 Description                    |         Faculty Name         | Unit |       Section       | 1st Quarter | Remarks |");
                            System.out.println("|--------------|------------------------------------------------|------------------------------|------|---------------------|-------------|---------|");
                            if(app_003 > 75){
                                System.out.println("|    APP 003   | FILIPINO SA PILING LARANGAN                    | ZAPANTA, FRANCISCO III E.    |   4  | COC-FB1-G12-01-PROG |      " + account[5] + "     | PASSED  |");

                            }else{
                                System.out.println("|    APP 003   | FILIPINO SA PILING LARANGAN                    | ZAPANTA, FRANCISCO III E.    |   4  | COC-FB1-G12-01-PROG |      " + account[5] + "     | FAILED  |");
                            }

                            if(app_006 >= 75){
                                System.out.println("|    APP 006   | PRACTICAL RESEARCH 2                           | BAHAN, ROSELYN -             |   4  | COC-FB1-G12-01-PROG |      " + account[3] + "     | PASSED  |");
                            }else{
                                System.out.println("|    APP 006   | PRACTICAL RESEARCH 2                           | BAHAN, ROSELYN -             |   4  | COC-FB1-G12-01-PROG |      " + account[3] + "     | FAILED  |");
                            }

                            if(cor_015 >= 75){
                                System.out.println("|    COR 015   | INTRODUCTION TO PHILOSOPHY OF THE HUMAN PERSON | MIÑOZA, MARK ANTHONY TENEBRO |   4  | COC-FB1-G12-01-PROG |      " + account[4] + "     | PASSED  |");
                            }else{
                                System.out.println("|    COR 015   | INTRODUCTION TO PHILOSOPHY OF THE HUMAN PERSON | MIÑOZA, MARK ANTHONY TENEBRO |   4  | COC-FB1-G12-01-PROG |      " + account[4] + "     | FAILED  |");
                            }

                            if(cor_019 >= 75){
                                System.out.println("|    COR 019   | PHYSICAL EDUCATION AND HEALTH 3                | ATLAWAN, DEXTER REY D.       |   4  | COC-FB1-G12-01-PROG |      " + account[6] + "     | PASSED  |");
                            }else{
                                System.out.println("|    COR 019   | PHYSICAL EDUCATION AND HEALTH 3                | ATLAWAN, DEXTER REY D.       |   4  | COC-FB1-G12-01-PROG |      " + account[6] + "     | FAILED  |");
                            }

                            if(ict_001 >= 75){
                                System.out.println("|    ICT 001   | COMPUTER PROGRAMMING (NC III)                  | BAGUIO, RALPH ANGELO E.      |   4  | COC-FB1-G12-01-PROG |      " + account[2] + "     | PASSED  |");
                            }else{
                                System.out.println("|    ICT 001   | COMPUTER PROGRAMMING (NC III)                  | BAGUIO, RALPH ANGELO E.      |   4  | COC-FB1-G12-01-PROG |      " + account[2] + "     | FAILED  |");
                            }
                            System.out.println("|              |                                                |                              |      |                     |             |         |");
                            System.out.println("|______________|________________________________________________|______________________________|______|_____________________|_____________|_________| " );
                            System.out.println("TYPE S for STOP THE PROGRAM And Press Any Thing To Enter Another Email ");
                            String stop_program = call_scanner.nextLine().toLowerCase();
                            if(stop_program.equals("s")){
                                System.exit(0);
                            }
                            authenticated = true;
                            break;
                        }
                    }

                    if (!authenticated) {
                        System.out.println("\033[31mThese Credentials Do Not Match Our Records.\033[0m");
                    }

                    tries++;
                }

                if(tries > 2){
                    email_forgot:
                    while(true){
                        System.out.print("Foget Password(Y/N): ");
                        String user_choice_ForgetPassword = call_scanner.nextLine().toLowerCase().trim();
                        if(user_choice_ForgetPassword.equals("y")){
                            while(true){
                                System.out.print("Your Email: ");
                                String forget_password = call_scanner.nextLine().toLowerCase().trim();

                                boolean student_forget_password = false;
                                for(Object[] student_retrive_password : list){
                                    if(forget_password.equals(student_retrive_password[0])){
                                        if(true){
                                            System.out.println("The Password in " + forget_password + " is " + student_retrive_password[1] + "\n");
                                            if(true){
                                                student_forget_password = true;
                                                break email_forgot;
                                            }

                                        }
                                        //student_forget_password = true;
                                        //break;
                                    }

                                }

                                if(!student_forget_password){
                                    System.out.println("\033[31mThese Credentials Do Not Match Our Records.\033[0m");
                                }
                            }

                        }else if (user_choice_ForgetPassword.equals("n")){
                            break;
                        }else{
                            System.out.println("Invalid Keyword");
                        }

                    }
                }
            }
        }
    }

    public static void main(String[] args){
        System.out.println("INFORMATION STORE");

        System.out.println("GOOD DAY! SIR RALPH");

        while (true){
            while (true){
                int attempt = 0;
                while(attempt <= 2 ){
                    System.out.println("\n");
                    System.out.print("Username: ");
                    String UserName = call_scanner.nextLine().toLowerCase().trim();

                    System.out.print("Password: ");
                    String password = call_scanner.nextLine().toLowerCase().trim();

                    if(UserName.equals("ralph angelo") && password.equals("ralph123") ){
                        System.out.println("ACCESS GRANTED \n");
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
                                            birth_year = call_scanner.nextInt();
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
                                                            String return_student_name = student_name(call_scanner);
                                                            String return_student_BornYear = student_BornYear(call_scanner);
                                                            list.add(new Object[]{return_coc_account_email,return_coc_account_password,ict_grade,pr_grade,philo_grade,fil_grade,pe_grade,return_student_name,return_student_BornYear});
                                                            System.out.println("==============================:[ STUDENT CREDINTIALS]:============================== ");
                                                            for (int i = 0; i < list.size(); i++) {
                                                                Object[] element = list.get(i);
                                                                System.out.println("|" + (1 + i) +"| STUDENT NAME: " + element[7] + " | BIRTHDAY: " + element[8] );
                                                                //System.out.println((1+i) +"). "+element[0] + " " + element[1] + " ict: " + element[2] + " pr: " + element[3] + " philo: " + element[4] + " fil: " + element[5] + " pe: " + element[6]);
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
                                                                        String return_information_store = confirm_student_information(call_scanner);
                                                                        if(return_information_store.equals("y")){
                                                                            user_email_input(call_scanner);
                                                                        }else if(return_information_store.equals("n")){
                                                                            System.out.println("Adding List ... Proceed");
                                                                            break second_loop;
                                                                        }                                     
                                                                    }else{
                                                                        System.out.println("Invalid Keywords");
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
                                                            list.add(new Object[]{student_complete_name,return_coc_account_email,return_coc_account_password});
                                                            for (int i = 0; i < list.size(); i++) {
                                                                Object[] element = list.get(i);
                                                                System.out.println("| STUDENT NAME: " + element[0] );
                                                                System.out.println((1+i) +"). "+element[1] + " " + element[2]);
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
                    }else{
                        System.out.println("\033[31mACCESS DENIED!\033[0m");
                    }
                    attempt++;
                    System.out.println("You Used your \033[31m" + attempt +"\033[0m attempt(s) \n" );
                }

                if(attempt > 2){
                    try {
                        for(int timer = 9 ; timer >= 0 ; timer --){
                            System.out.print( "Try Agin in: " + timer + "second(s)" +"\r");
                            Thread.sleep(1000);
                        }
                    }catch (InterruptedException e){

                    }
                }
                System.out.println();
                break;
            }
        }
    }
}


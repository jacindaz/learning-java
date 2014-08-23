class HelpMethods {

    void showmenu() {
        System.out.println("showmenu method");

        System.out.println("Help on:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Choose one (q to quit): ");
    }

    void helpon(char what) {
        System.out.println("helpon method");
        switch(what) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("    case constant:");
                System.out.println("        statement sequence");
                System.out.println("        break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(condition) statement;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while(condition);");
                break;
            case '6':
                System.out.println("The break:\n");
                System.out.println("break; or break label;");
                break;
            case '7':
                System.out.println("The continue:\n");
                System.out.println("continue; or continue label;");
                break;
        }
    }

    boolean isvalid(char ch) {
        System.out.println("isvalid method");
        if(ch < '1' | ch > '7' | ch == 'q') return false;
        else return true;
    }
}

class Help {
    public static void main(String args[])
        throws java.io.IOException, InterruptedException {
        char choice, ignore;
        HelpMethods help_object = new HelpMethods();

        System.out.println("Inside main method");

        do {
            System.out.println("Inside do loop");

            help_object.showmenu();
            choice = (char) System.in.read();

            System.out.println("User choice: " + choice);

            if (help_object.isvalid(choice)) {
                help_object.helpon(choice);
                Thread.sleep(1000);
                System.out.println("=================================================\n");
            }

        } while(choice != 'q');

        System.out.println("Exiting from help menu...");
    }
}

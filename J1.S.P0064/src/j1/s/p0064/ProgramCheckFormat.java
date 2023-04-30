/*
Class:
Descprition: 
          +. helper class contains both static and non static methods so it restrict to create object.
Author:
 */
package j1.s.p0064;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ProgramCheckFormat {

    private static final Scanner sc = new Scanner(System.in);

    /*
    Name: checkPhone
    Target: Check input phone number from user and return valid value
    Parameter:  String mess to ask use input number
    Return: phone number type of String
     */
    public String checkPhone(String mess) {
        System.out.println("====== Validate Program ======");
        String phone;
        while (true) {
            System.out.print(mess);
            phone = sc.nextLine();
            if (phone.isEmpty()) {
                System.err.println("Phone number must is number");
                continue;
            }
            try {
                //cach 1:

                /*Loop use access from the initial character to the last character of the string*/
 /*boolean isNumber = true;
                for (int i = 0; i < phone.length(); i++) {
                    char c = phone.charAt(i);
                    if (!Character.isDigit(c)) {
                        isNumber = false;
                        break;
                    }
                }
                if (!isNumber) {
                    throw new Error();
                }
                 */
                //cach 2:
                if (phone.length() < 10 || phone.length() > 10) {
                    throw new Exception();
                } else {
                    break;
                }

            } catch (Error e) {
                System.err.println("Phone number must is number");
            } catch (Exception e) {
                System.err.println("Phone number must be 10 digits");
            }
        }

        return phone;
    }

    /*
    Name: checkDate
    Target: Check input date from user and return valid value
    Parameter:  String mess to ask use input number
    Return: phone number type of String
     */
    public String checkDate(String mess) {
        String dateinput;
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        //loop until date valid
        while (true) {
            System.out.print(mess);
            dateinput = sc.nextLine();
            if (dateinput.isEmpty()) {
                System.out.println("Date to correct format(dd/mm/yyyy)");
                continue; // câu lệnh điều khiển luồng
                          //được sử dụng để bỏ qua câu lệnh còn lại để chạy tới vòng lặp tiếp theo luôn
            }
            
            try {
                //use regex
                if (!dateinput.matches("^[0-3]{1}[0-9]{1}+[/]+[0-1]{1}[1-9]{1}+[/]+[0-9]{4}$")) {
                    System.out.println("Date to correct format(dd/mm/yyyy)");
                    continue;
                }

                //setLenient to check date not exist or exist
                dateformat.setLenient(false);
                dateformat.parse(dateinput);
                break;

            } catch (ParseException e) {
                System.out.println("Date to correct format(dd/mm/yyyy)");
            }
        }
        return dateinput;

    }

    /*
    Name: checkPhone
    Target: Check input phone number from user and return valid value
    Parameter:  String mess to ask use input number
    Return: phone number type of String
     */
    public String checkEmail(String mess) {
        String email;
        while (true) {
            System.out.print(mess);
            email = sc.nextLine();
            if (email.isEmpty()) {
                System.out.println("Email must is correct format");
                continue;
            }
            try {
                if(!email.matches("^\\w+[a-z0-9]*@{1}\\w+.com$")){
                    System.out.println("Email must is correct format");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Email must is correct format");
            }

        }
        return email;

    }
}

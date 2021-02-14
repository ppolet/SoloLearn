/*
 * Задание с SoloLearn "Password Validation"
 * Проверка сложности вводимого пароля в строке
 * Условие сложности: >= 7 символов; >= 2 цифр; >= 2 символов из набора !@#$%^&
 * Если удовлетворяет, вывести: STRONG, иначе WEAK
 */
package checkpassword;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        String pass = "3!as%a(g";  //default password
        
        System.out.print("Input password for validation: ");
        Scanner input = new Scanner(System.in);
        pass = input.nextLine();
        
        String setNumbers = "0123456789";
        String setSymbols = "!@#$%^&";
        
        System.out.println("Password: " + pass);
        
        if (pass.length() < 7){
            System.out.println("WEAK");
            return;
        }
        
        int sumNumbers = 0;
        int sumSymbols = 0;
        for(int i = 0; i < pass.length(); i++){
            char c = pass.charAt(i);
            if (setNumbers.contains("" + c)) sumNumbers++;
            if (setSymbols.contains("" + c)) sumSymbols++;
        }
        
        if ((sumNumbers >= 2) && (sumSymbols >=2)){
            System.out.println("STRONG");
        } else {
            System.out.println("WEAK");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaabc;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    String red = "\u001B[31m";
    String blue = "\u001B[34m";
    String reset = "\u001B[0m";
    public void run(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j',
                           'k','l','m','n','o','p','q','r','s','t',
                           'u','v','w','x','y','z'};
        Scanner scanner = new Scanner(System.in);
        String user_str;
        char[] char_user_str;
        char[] not_in_str = new char[0];
        int not_in_str_index = 0;
        
        System.out.print("Enter a line: ");
        user_str = scanner.nextLine();
        user_str = user_str.toLowerCase();
        char_user_str = user_str.toCharArray();
        
        for(int i=0;i<alphabet.length;i++){
            if(user_str.indexOf(alphabet[i]) == -1){
                char[] not_in_str_buff = new char[not_in_str.length+1];
                for(int j=0;j<not_in_str.length;j++){
                    not_in_str_buff[j] = not_in_str[j];
                }
                not_in_str = not_in_str_buff;
                not_in_str[not_in_str_index++] = alphabet[i];
            }
        }
        
        if(not_in_str.length > 0){
            System.out.printf("Symblos not contained in string(%s%d%s): \n", red, not_in_str.length, reset);
            for(char c : not_in_str){
                System.out.print(c+" ");
            }
            System.out.println("");
        }
        else System.out.printf("%sString contain all symbols!%s\n", blue, reset);
    }
}

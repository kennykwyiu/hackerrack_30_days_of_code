package kenny.thirtydays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * Question
 * You are given a phone book that consists of people's names and their phone numbers.
 * After that, you will be given some person's name as a query.
 * For each query, print the person's name and phone number if it is present in the phone book;
 * otherwise, print "Not found".
 *
 * Input Format
 * The first line will have an integer, n, representing the number of entries in the phone book.
 * Each entry consists of two lines: a name and the corresponding phone number, separated by a newline.
 *
 * After the n lines of phone book entries,
 * there are an unknown number of lines of queries. Each line (query) contains a name to look up,
 * and you must continue reading lines until there is no more input.
 *
 * Output Format
 * For each query, print the person's name and phone number if it is present in the phone book;
 * otherwise, print "Not found".
 *
 * Sample Input
 *
 * 3
 * Sam
 * 99912222
 * Tom
 * 11122222
 * Harry
 * 12299933
 * Sam
 * Ed
 * Tom
 *
 * Sample Output
 *
 * Sam=99912222
 * Not found
 * Tom=11122222
 *
 */
public class Day8PhoneAFriend {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}

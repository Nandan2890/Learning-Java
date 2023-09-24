import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permautations {
    public static Set<String> getPermutationString(String str){

        //create a HashSet to avoid duplicate permutation
        Set<String> permutations = new HashSet<String>();

        //check string is null
        if(str == null){
            return null;
        } else if(str.length() == 0){
            //Here is terminating condition for recursion
            permutations.add("");
            return permutations;
        }

        //get the first character of string
        char first = str.charAt(0);

        //get the remaining substring as string
        String substr = str.substring(1);

        //make recursive call to getPermutation()
        Set<String> words = getPermutationString(substr);

        //access each element from words
        for(String strNew : words){
            for(int i=0; i <= strNew.length(); i++){
                //insert the permutation to the set
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }

        return permutations;
    }

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        //take input from users
        System.out.print("Enter the string: ");
        String data = read.nextLine();
        System.out.println("Permutations of " + data + " : \n" + getPermutationString(data));

    }
}

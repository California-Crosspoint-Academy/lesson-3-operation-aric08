public class SimpleStrings {
    public static void main(String[] args) {
        String tuf = "THAT WAS TUF";
        System.out.println(tuf.toLowerCase()); // makes everything lowercase

        System.out.println("THAT WAS TUF".toUpperCase()); // makes everything upper case

        int p = 67;
        String n = "I love cs";
        String combo = n + " " + p;
        System.out.println(combo);
        // combines string and integer

        //escapes the quotations
        System.out.println("\"bruh\"");
        // back slash n is next line
        System.out.println("this is a sentence 1 \nthis is the sentence 2");
        //back slash t is tab
        System.out.println("this is for the \t tab");

        //concatenation adding two lines
        String mm = "hello";
        String nx = "world";
        String c = mm + nx;
        System.out.println(c);

        //find the number of characters in string
        String h = "chair";
        int len = h.length();
        System.out.println(len);

        //substrings print one part of the String out
        String myDog = "I love my dog";
        String smallDog = myDog.substring(4,13);
        System.out.println(smallDog);
        //will print out e my dog


    }
}
public class Celebrity {
    public static void main(String[] args) {
        // Celebrity names
        String celeb1 = "Dwayne Johnson";
        String celeb2 = "Kanye West";
        String celeb3 = "Donald Trump";

        // Cut names: remove first 2 chars, remove last 3 chars
        String cut1 = celeb1.substring(2,11);
        String cut2 = celeb2.substring(2,7);
        String cut3 = celeb3.substring(2,9);

        // Output=
        System.out.println(cut1);
        System.out.println(cut2);
        System.out.println(cut3);
    }
}

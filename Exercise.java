public class Exercise {
    public static void main(String[] args) {
        String s = "The number of rabbit is";
        int argh = 129;
        String report = s + " " + argh + ".";

        String p = "Groovy Dude";

        String g = "Computer Science is for nerds";

        String m = "The Gettysburg Address";
        String c = m.substring(4); 

        String b = "Four score and seven years ago";
        String cc = b.substring(7, 12);

        String ss = "Surface tension";
        int count = ss.length();
       
        String look = "Look here!";
        String has = " has ";
        String chara = " characters.";
        int ten = look.length();
        String sentence = look + has + ten + chara;
        
        String all = "All \"good men\" should come to the aid to their country.";
        
        String hi = "Hello \nHello again";
        
        String back = "A backslash looks like this \\\\, ...right?";
       
        String pq = "Eddie Haskel";
        int hm = pq.length();
        String ed = pq.substring(hm - 4);
       
        String her = "Herman Munster";
        String herm = her.substring(5, 6);

        System.out.println(report);
        System.out.println(p.toUpperCase());
        System.out.println(g.toLowerCase());
        System.out.println(c);
        System.out.println(cc);
        System.out.println(count);
        System.out.println(sentence);
        System.out.println(all);
        System.out.println(hi);
        System.out.println(back);
        System.out.println(ed); 
        System.out.println(herm);
    }
}
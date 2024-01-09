package day3;

public class Stringoperations {
    public static void main(String[] args) {
        String inform, name, s, t;
        inform = "Sudha is learing Java Selenium";
        name = "Sundari";
        s = " ";
        t = "";

     /*   System.out.println("Information:  "+inform);
        System.out.println("Length:       "+inform.length());
        System.out.println("Uppercase:    "+inform.toUpperCase());
        System.out.println("Lowercase:    "+inform.toLowerCase());
        System.out.println("Second char:  "+inform.charAt(1));
        System.out.println("Sub string:   "+inform.substring(6));
        System.out.println("Sub string:   "+inform.substring(9,21));
        System.out.println("Replace:      "+inform.replace("sudha", "Sundari"));
        System.out.println("Replace:      "+inform.toLowerCase().replace("sudha", "Sundari"));
        System.out.println("Find Sudha:   "+inform.equals("sudha"));
        System.out.println("Find Sundari: "+name.equalsIgnoreCase("sundari"));
        System.out.println("Contains java:"+inform.contains("Java"));
        System.out.println("Starts with S:"+inform.startsWith("Sud"));
        System.out.println("Ends with m:  "+inform.endsWith("m"));
        System.out.println("Split sentence: "+inform.split(" ")[3]);
        System.out.println("Blank: "+s.isBlank());
        System.out.println("Blank: "+s.isEmpty());
        System.out.println("Blank: "+t.isEmpty());*/
        char[] x = name.toCharArray();
        for (int i = 0; i < name.length(); i++)
            System.out.println(x[i]);

    }
}
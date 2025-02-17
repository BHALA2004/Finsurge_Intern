package Day8.Strings;

public class StringBasics {
    public static void main(String[] args) {
        String s = "Bala";
        String m = "Bala";
        System.out.println("char At ="+s.charAt(2));
        System.out.println("Length = "+s.length());
        System.out.println("substring = "+s.substring(1));
        System.out.println(s.substring(1,3));
        System.out.println("Index = "+s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println("Contains = "+s.contains("al"));
        System.out.println("replace ="+s.replace('a','0'));
        String s2 = "kmksnkmknkoeMLMVMK";
        System.out.println(s2.replace("km","//"));
        //s=s+s.replace("al","me");

        System.out.println("Equals ="+"Bala".equals(s));
        System.out.println("Equals and case snsitive = "+"Bala".equalsIgnoreCase(s));
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println(s);
        System.out.println("Join ="+s.join("-","Bla","man"));
        System.out.println("Compare = "+s.compareTo("Bala"));
        System.out.println(s);
        System.out.println(m==s);

        String s1 = "Venugopanukfjdknujqnnuqjbnnul";
        System.out.println(s1.replaceAll("nu","???"));

    }
}

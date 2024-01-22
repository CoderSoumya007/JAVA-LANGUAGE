public class stringMethod {
    public static void main(String[] args){
        String name="soumya ranjan panda";
        System.out.println(name.substring(1));

        System.out.println(name.length());

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.trim());  //removes spaces from front and end;
        System.out.println(name.substring(0,8));
        System.out.println(name.replace('a','z'));
        System.out.println(name.replace("anda","bando"));
System.out.println();
        System.out.println(name.startsWith("a"));
        System.out.println(name.startsWith("a",5));
        System.out.println(name.endsWith("anda"));
        System.out.println();
        System.out.println(name.charAt(18));
        System.out.println();
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('a',6));
        System.out.println();
        System.out.println(name.indexOf("anda"));
        System.out.println(name.indexOf("anda",15));  //including the given index  
        System.out.println();
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('a',6));  //including and before the number;
        System.out.println(name.lastIndexOf("an"));
        System.out.println(name.lastIndexOf("ya",6));  //important(returns last index before the number)
        System.out.println(name.equals("soumya ranjan panda "));
        System.out.println(name.equalsIgnoreCase("SoumYa ranjaN paNDa"));
    }
}

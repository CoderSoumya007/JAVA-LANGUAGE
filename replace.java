public class replace {
    public static void main(String[]args){
        String name="soumya ranjan panda";
        System.out.println(name.replace(' ','_'));  //real string remains same;
        name=name.replace(' ','_');  //real string gets modified;
        System.out.println(name);  
        name=name.replace('_','z');  //real string gets modified;
        System.out.println(name);  //real string;
    }
}
 
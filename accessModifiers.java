class employee {
    private int id;
    private String name;

    public void setname(String n) {
        name = n;
    }

    public String getname() {
        return name;
    }

    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }
    // public employee(){  //**THIS IS A CONSTRUCTOR I.E HAVING SAME NAME AS OF CLASS */
    //     name="OTSOMEXX";
    //     id=700154526;
    // }
    public employee(String playername,int playercode){  //**THIS IS A CONSTRUCTOR I.E HAVING SAME NAME AS OF CLASS */
        name=playername;
        id=playercode;
    }

}

public class accessModifiers {
    public static void main(String[] args) {

        // employee e1 = new employee();
        employee e1 = new employee("gruesomesomexx",007);

        // employee e2 = new employee();

        e1.setname("soumya ranjan panda");  //****IS NOT REQUIRED BECAUSE USING CONSTRUCTOR
                                               // IT INITIALISES WHILE CREATING THE OBJECT */
        // e1.setid(98686);


        System.out.println(e1.getname());  //as the variable is private hence we require a method to access it;
        System.out.println(e1.getid());   
        // System.out.println(e2.id);
    }
}

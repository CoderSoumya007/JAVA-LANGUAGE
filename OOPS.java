class EMPLOYEE {
    String name; // THESE ARE NON STATIC VARIABLES;ACCESSED BY CREATING OBJECTS;
    int salary;

    public int getSalary() {
        // int salary=9; //THIS BECOMES STATIC VARIABLE;
        return salary;
    }

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }
}

class smartphone {
    String company;
    int model_no;

    public String brand() {
        return company;
    }

    public int model() {
        return model_no;
    }
}

class square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

public class OOPS {
    public static void main(String[] args) {

        EMPLOYEE soumya = new EMPLOYEE(); // ****OBJECT INSTANTIATING */
        soumya.setname("soumya ranjan panda");
        System.out.println(soumya.getname());
        soumya.salary = 700000;
        System.out.println(soumya.getSalary());  //***NON STATIC REFERENCE BY CREATING OBJECTS */

        smartphone redmi = new smartphone(); // **OBJECT INSTANTIATING */
        redmi.company = "redmi note 9 pro max";
        redmi.model_no = 345647456;
        System.out.println(redmi.brand());
        System.out.println(redmi.model());

        square sq = new square(); // ****OBJECT INSTANTIATING */
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}

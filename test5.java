
class rectangle {
        
        private int length; //as it is private hence cannot be accessed outside the class;
        public int breadth;
        
        public void setter(int l){
            length=l;
        }
        public int getter(){
            return length;
        }
        
        public int area(){
            return length*breadth;
        }
    
}
class test5{
    public static void main(String[] args) {
    byte b[]={65,2,3,4,5,6};
        String str=new String(b);
        System.out.println(str);
        rectangle t=new rectangle();
        // t.length=5;  -->not possible as the variable is private.Hence we have to use getter and setter() method to access the value;
        t.setter(5);
        t.breadth=7;
        System.out.println(t.area());
    }
}

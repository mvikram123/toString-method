// toString() method is used to convert object into its String representation .
//if any object is printed toString method is internally invoked by compiler.
 //       Else user is implemented or overridden toString method.


//class Employee{
//    int id;
//    String name;
//    String city;
//    Employee(int id, String name, String city){
//        this.id=id;
//        this.name=name;
//        this.city=city;
//    }
//}
//class Main{
//    public static void main(String args[]){
//        Employee e1=new Employee(01,"Ari","NewYork");
//        Employee e2=new Employee(02,"Jon","Chicago");
//        System.out.println(e1);//compiler writes here e1.toString()
//        System.out.println(e2);//compiler writes here e2.toString()
//
//        System.out.print(e1.id+" "+e1.name+" "+e1.city);
//
//    }
//}


//output Employee@6d03e736
//        Employee@568db2f2
 //       1 Ari NewYork







// Necessary Overriding
// Overriding is necessary to return the user specified values:

 class Employee {
     int id;
     String name;
     String city;

     Employee(int id, String name, String city) {
         this.id = id;
         this.name = name;
         this.city = city;
     }

     public String toString() {//overriding the toString() method
         return id + " " + name + " " + city;
     }
 }
    class Main{
    public static void main(String args[]){
        Employee e1=new Employee(01,"Ari","NewYork");
        Employee e2=new Employee(02,"Jon","Chicago");
        System.out.println(e1);
        System.out.println(e2);
    }
}


//output = 1 Ari NewYork
 //        2 Jon chicago
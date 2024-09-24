

package oopconcept;


public class OopConcept {

    
    public static void main(String[] args) {
        //primitive data type
        int age = 32;
        double salary = 45000.36;
        char grade = 'Z';
        boolean isEmployed = true;
        
        
        //derive data type
        String name= "john";
        int[] numbers = {1,2,4,5,6,};//array
        
        System.out.println("Name" +name);
        System.out.println("age" +age);
        System.out.println("Salary" +salary);
        System.out.println("Garade" +grade);
        System.out.println("Is Employed ?" +isEmployed);
        
        System.out.println("Array Elements:");
        for(int num: numbers){
            System.out.println(num);
        }
    }
    
}

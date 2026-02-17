import java.io.*;
import java.util.*;
class Student{
private String name;
private int roll;
Student(){
name="ysr";
roll=35;
}
Student(String s,int n){
name=s;
roll=n;
}

void details(){
System.out.println("my name is "+name);

System.out.println("my roll no is "+roll);
}
}

public class hash_code{

public static void main(String[] args){

Student abc = new Student();
abc.details();
Student def = new Student("rao",100);
def.details();
}
}
import java.io.FileWriter;
import java.io.IOException;
class student{
    int id;
    string name;
    student( int id,String name){
        this.id = id;
        this.name = name:
    }
}
public class FillwriterDemo{
public static void main (String [] args){
    student s1 = new student (1,"vikram");
    try{
        FileWriter fw =new Fillwriter("student.txt");
        fw.write("ID:"+s1.id+"\n");
         fw.write("name:"+s1.name);
         Fw.close();
         System.out.println("Data written succesful!\n");
    }
   }
}   
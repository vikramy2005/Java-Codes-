import java.io.*;

class student implements Serializable{
    int id;
    String name;
    student(int id , String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
    }
}

public class SerializtionDseraliztionDemo {
    public static void main(String[] args){
        try{
            student s1 = new student (101,"rahul");
            FileOutputStrem fos = new FileOutputStrem("student.ser");

            ObjectOutputStrem oos = new ObjectOutputStrem(fos);

            oos.writeObject(s1);
            System.out.println(" Object serialization successfully.\n");

            oos.close();
            fos.close();
            FileOutputStrem fis = new FileOutputStrem("student.ser");
            ObjectOutputStrem ois = new ObjectOutputStrem(fis);

            Student s2 = ( Student) ois.readObject();
             System.out.println(" Object serialization successfully:");
             System.out.println(" Student data after deserializtion:");
             ois.close();
             fis.close();

        } catch(IOException e){
            System.out.println("file error:"+e);
        }catch(ClassNotFoundException e){
            System.out.println("class error:"+e);
        }
        
    }
}
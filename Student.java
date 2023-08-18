import java.lang.*;
import java.util.Scanner;

class Student{
	public static void main(String[] args) {
    // using scanner method for user input
    Scanner in = new Scanner(System.in);

    Stu[] student1 = new Stu[2000]; //decleared an array to store 2000 students

    boolean flag = true;

         System.out.println ( "Welcome to the student management system:");
    do {
                 
                 System.out.println ( "Please enter your user name:");
        String userName = in.next();
                 //enter password 
                 System.out.println ( "Please enter your password:");
        String password = in.next();
                 // determine whether the correct user name and password
        if ("student".equals(userName) && "student".equals(password)) {
                         System.out.println ( "Login successful");
            do {
                                 // choose the operation you need to be
                                 System.out.println ( "**** ***** college student management system");
                                 System.out.println ( "**** 1, add students *****");
                                 System.out.println ( "**** 2, remove students *****");
                                 System.out.println ( "**** 3, modification information *****");
                                 System.out.println ( "**** 4, student inquiry *****");
                                 System.out.println ( "**** 5, print student *****");
                                 System.out.println ( "**** 6, exit the system *****");
                                 System.out.println ( "**** Please select the operation you need to do: *****");
                int sel = in.nextInt();
                switch (sel) {
                     //for case1 ,adding student details                    
                    case 1:
                                                 System.out.println ( "Please enter Student name");
                        String name = in.next();
                                                 System.out.println ( "Please enter ID ");
                        String number = in.next();
                                                 System.out.println ( "Please enter Address");
                        String phone = in.next();
												System.out.println ( "Please enter Contact number");
						String batch = in.next();
												System.out.println ( "Please enter Current GPA");
						String gpa = in.next();						
						
						
                        Stu student = new Stu(name, number, phone,batch,gpa);
                        for (int i = 0; i < student1.length; i++) {
                            if (student1[i] == null) {
                                student1[i] = student;
                                break;
                            }
                            else if(student1[i].getNumber().equals(number)){
                                                                 System.out.println ( "The Student ID repeat, please re-enter");
                                break;
                            }
                            else if (student1[student1.length - 1] != null) {
                                                                 System.out.println ( "Number of students in full");
                                break;
                            }
                        }
                        // array name .fori can directly create a for loop
                        for (int i = 0; i < student1.length; i++) {
                            if (student1[i] != null) {
                                System.out.println(student1[i]);
                            }
                        }

                        break;
                                         
                    case 2:
                                                 System.out.println ( "Please enter the name of the student you want to delete");
                        name = in.next();
                                                 
                        boolean flag1 = true;
                        for (int i = 0; i < student1.length; i++) {
                            if(student1[0]==null){
                                                                 System.out.println ( "No student");
                                break;
                            }
                            if(student1[i]!=null&&!student1[i].getName().equals(name)){
                                flag1 = false;
                            }
                            if(student1[i]!=null&&student1[i].getName().equals(name)){
                                student1[i] = null;
                                                                 System.out.println ( "deleted successfully!");
                                flag1 = true;
                                break;
                            }
                            if (!flag) {
                                                                 System.out.println ( "The students do not exist");
                            }
                        }
                        break;
                                         
                    case 3:
                                                 System.out.println ( "Please enter the name of the student to be modified");
                        name = in.next();
                                                 System.out.println ( "Please enter the name of the revised");
                        String n2 = in.next();
                                                 System.out.println ( "Please enter the revised study");
                        number = in.next();
                                                 System.out.println ( "Please enter the phone");
                        phone = in.next();
                        boolean flag2=true;

                        for (int i = 0; i < student1.length; i++) {
                            // when the array is not determined null books [i] .getName ()! = Name is false then flag2
                            if (student1[i]!=null&&!student1[i].getName().equals(name) ) {
                                flag2 = false;
                            }
                            if(student1[i]!=null&&student1[i].getNumber().equals(number)){
                                //System.out.println ( "The Student ID is already in use, please check and re-enter.");
                                flag2 = false;
                                break;
                            }
                            // determine if you need to modify students find it to be modified and prompts him
                            if(student1[i]!=null&&student1[i].getName().equals(name)){
                                student1[i].setName(n2);
                                student1[i].setNumber(number);
                                student1[i].setPhone(phone);
                                                                 System.out.println ( "modifications are complete");
                                flag2 = true;
                                break;
                            }
                        }
                        if (!flag2) {
                                                         System.out.println ( "This student or student number does not exist conflict");
                        }
                        break;
                                         
                    case 4:
                                                 System.out.println ( "Enter the student's name or Student ID required query");
                        String sname = in.next();
                        //number=in.next();
                        boolean flag3 = true;
                                                 
                        for (Stu b : student1) {
                            if (b != null) {
                                if (b.getName().equals(sname) || b.getNumber().equals(sname)) {
                                    flag3 = true;
                                    System.out.println(b);
                                    
                                } else {
                                    flag3 = false;
                                }
                            }
                        }
                        if(!flag3){
                                                         System.out.println ( "students do not exist");
                        }
                        break;
                                          
                    case 5:
                        for (int i = student1.length - 1; i >= 0; i--) {
                            if(student1[i]!=null)
                                System.out.println(student1[i]);
                        }
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        break;
                }
            }while (true);

        } else {
            flag = true;
                         System.out.println ( "Login failed please re-enter:");
        }
    } while (flag);
}
}
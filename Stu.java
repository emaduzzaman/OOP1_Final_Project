import java.util.Scanner;
import java.util.Scanner;
public class Stu {
			private String name; // student name
			private String number; // Student id
			private String phone; // student contact number
			private String batch; //student batch
			private String gpa; //student gpa
	
	
	
	
	// using getter and setter method to use private instense variables
	
	
	
	public String getName() {
		return name;
    }

    public void setName(String name) {
		this.name = name;
	}

	public String getbatch() {
		return number;
	}

	public void setbatch(String batch) {
		this.batch = batch;
	}
	
	public String getgpa() {
		return number;
	}

	public void setgpa(String gpa) {
		this.gpa = gpa;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
    this.phone = phone;
	}
	//a empty constructor
	public Stu() {
	}
		//A constructor for initialize the variables
		public Stu(String name,String number,String phone,String batch,String gpa) {
			// System.out.println ( "constructor that takes a parameter of the object being created");
			this.phone = phone;
			this.number = number;
			this.name = name;
			this.batch =batch;
			this.gpa =gpa;
        }



		public void show(String userName) {
			System.out.println (userName + "viewing" + this.name);
		}
		public String toString() {
			return "Name:" + name + ", Student ID:" + number + ", telephone:" + phone + ", Batch:" + batch + ", GPA:" + gpa;
		}
	}


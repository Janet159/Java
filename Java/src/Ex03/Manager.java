package Ex03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		LinkedList<Student> studentList = new LinkedList<>();
		getTxtToList(studentList);
		
		Collections.sort(studentList);
		
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	public static LinkedList<Student> getTxtToList(LinkedList<Student> list) {
	    try {
	        File file = new File("student.txt");
	        Scanner sc = new Scanner(file);
	        Student std;

	        while (sc.hasNextLine()) {
	            String stn = sc.nextLine();
	            String[] data = stn.split("/");
	            int no = Integer.parseInt(data[0]);
	            String name = data[1];
	            int score = Integer.parseInt(data[2]);
	            String className = data[3];
	            std = new Student(no, name, score, className);
	            list.offer(std);
	        }

	        sc.close();
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }

	    return list;
	}

}

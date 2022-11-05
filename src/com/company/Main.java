package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    Course[] courses = new Course[1];
        courses[0] = new Course("CS HL", "CS", "Jarmo", 10);

        Course course1 = courses[0];

        course1.setNumOfParticipants(-4);

        System.out.println("Has participants: " + course1.hasParticipants());
        System.out.println(course1);
    }
}

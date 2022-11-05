package com.company;

public class Course
{
    private String name, topic, nameOfTeacher;
    private int numOfParticipants;

    public Course(String name, String topic, String nameOfTeacher, int numOfParticipants)
    {
        this.name = name;
        this.topic = topic;
        this.nameOfTeacher = nameOfTeacher;
        this.numOfParticipants = numOfParticipants;
    }

    public String toString()
    {
        return name + ", " + topic + ", " + nameOfTeacher + " - " + numOfParticipants + " people.";
    }

    public boolean hasParticipants()
    {
        if (numOfParticipants > 0)
            return true;
        else
            return false;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTopic()
    {
        return topic;
    }

    public void setTopic(String topic)
    {
        this.topic = topic;
    }

    public String getNameOfTeacher()
    {
        return nameOfTeacher;
    }

    public void setNameOfTeacher(String nameOfTeacher)
    {
        this.nameOfTeacher = nameOfTeacher;
    }

    public int getNumOfParticipants()
    {
        return numOfParticipants;
    }

    public void setNumOfParticipants(int numOfParticipants)
    {
        this.numOfParticipants = numOfParticipants;
        if (numOfParticipants < 0)
            System.out.println("Number of participants is negative");
    }
}

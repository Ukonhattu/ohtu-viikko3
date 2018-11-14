package ohtu;

import java.util.Arrays;

public class Submission {
    private int week;
    private int hours;
    private String course;
    private int[] exercises;   


    public void setWeek(int week) {
        this.week = week;
    }

    /**
     * @return the exercises
     */
    public int[] getExcercises() {
        return exercises;
    }

    /**
     * @param exercises the exercises to set
     */
    public void setExcercises(int[] exercises) {
        this.exercises = exercises;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getWeek() {
        return week;
    }

    @Override
    public String toString() {
        return ""+course+", viikko "+week+" tehtyjä tehtäviä yhteensä "+exercises.length+
        " aikaa kului " + hours + " tehdyt tehtävät "+ Arrays.toString(exercises);
    }
    
}
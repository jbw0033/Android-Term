package edu.auburn.eng.csse.comp3170.sjh0020.gradecalculator;

import java.util.ArrayList;

/**
 * Created by Michael on 4/29/2016.
 */
public class Course {
    ArrayList<Float> weights = new ArrayList<Float>();
    ArrayList<String> catNames = new ArrayList<String>();
    ArrayList<Float> catScores = new ArrayList<Float>();

    public float calcGrade(){
        float grade = 0;
        int i = 0;
        while(i < weights.size()){
            grade += weights.get(i) * catScores.get(i);
            i++;
        }
        return i;
    }

}

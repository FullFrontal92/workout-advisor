package com.example.adambenyahia.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List <String> getWorkouts (String workouttypes )
    {
        List <String> workout= new ArrayList<String>();

        if(workouttypes.equals("Chest"))
        {
            workout.add("Bench Press");
            workout.add("Cable Flys");

        }
        else if (workouttypes.equals("Triceps"))
        {
            workout.add("Triceps Ext");
            workout.add("Triceps PushDowns");
        }

        else if (workouttypes.equals("Shoulders"))
        {
            workout.add("Shoulder Press");
            workout.add("Shoulder Ext");

        }

        else if (workouttypes.equals("Biceps"))
        {
            workout.add("Biceps Press");
            workout.add("Biceps PushUps");

        }

        return workout;

    }
}

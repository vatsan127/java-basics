package org.example.oops.myenum;

public enum DaysOfWeek {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    final private boolean weekOff;

    DaysOfWeek(boolean weekOff) {
        this.weekOff = weekOff;
    }
    public boolean getWeekOff(){
        return weekOff;
    }

}

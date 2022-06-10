package ss4_oop.bai_tap.stop_watch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }
    public void start(){
        this.startTime = new Date();
        System.out.println(this.startTime);
    }
    public void endTime(){
        this.endTime = new Date();
        System.out.println(this.endTime);
    }

    public long getElapsedTime(){
        return this.endTime.getTime()-this.startTime.getTime();
    }
}

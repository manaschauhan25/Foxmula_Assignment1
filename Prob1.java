package internship;

class Time{
	private int hour,min,sec;
	
	Time(){
	hour=0;
	min=0;
	sec=0;
	}
	Time(int hour, int min, int sec){
		this.hour=hour;
		this.min=min;
		this.sec=sec;
		}
	Time add(Time t) {
		Time time=new Time();
		time.hour=this.hour+ t.hour;
		time.min=this.min+ t.min;
		time.sec=this.sec+ t.sec;
		if(time.sec>60) {
			time.sec-=60;
			time.min++;
		}
		if(time.min>60) {
			time.min-=60;
			time.hour++;
		}
		if(time.hour>24) {
			time.hour-=24;
		}
		
		return  time;
	}
	
	void show() {
		System.out.println(this.hour+":"+this.min+":"+this.sec);
	}
}

public class Prob1 {
	public static void main(String[] args) {
		Time time1=new Time(13,45,0);
		Time time2=new Time(12,55,0);
		Time nTime=time1.add(time2);
		nTime.show();
	}

}

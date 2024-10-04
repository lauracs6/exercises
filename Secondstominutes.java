public class Secondstominutes {
	public static void main(String[] args) {
	  int secs_ini;
	  int minutes;
	  int secs_rest;
	  secs_ini = 103;
	  minutes = (secs_ini / 60);
	  secs_rest = (secs_ini % 60);
	  System.out.println(minutes + " minutes " + secs_rest +" seconds");
	  }
	}

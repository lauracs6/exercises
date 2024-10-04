public class Secondstominutes {
2	  public static void main(String[] args) {
3	    int secs_ini;
4	    int minutes;
5	    int secs_rest;
6	    secs_ini = 103;
7	    minutes = (secs_ini / 60);
8	    secs_rest = (secs_ini % 60);
9	    System.out.println(minutes + " minutes " + secs_rest +" seconds");
10	  }
11	}

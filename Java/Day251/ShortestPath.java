package Java.Day251;

// Given a route containing 4 directions (E, W, N, S), find the shortest path to reach the destination.
public class ShortestPath {
    public static void main(String args[]){
        String str = "WNEENESENNN";
        int x = 0, y = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'E'){
                x++;
            } else if(str.charAt(i) == 'W'){
                x--;
            } else if(str.charAt(i) == 'N'){
                y++;
            } else if(str.charAt(i) == 'S'){
                y--;
            }
        }

        System.out.print("Shortest path is: ");
        System.out.println(Math.sqrt((x*x + y*y)));
    }
}

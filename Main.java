

import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Node> graph;
    //private  int vertex; /* total number number of vertices in the graph */
    /* adjacency list */
    /* maintaining a queue */

    public static void main(String[] args) throws FileNotFoundException {
        setupTree();
        BFS();
    }

    private static void BFS() {
        
// put bfs code here
   
    }

    private static void setupTree() throws FileNotFoundException {
        File f = new File("tree.txt");
        graph = new ArrayList<>();
        Scanner scan = new Scanner(f);
        while(scan.hasNext()){
            String line = scan.nextLine();
            parseLine(line);
            System.out.println(line);
        }
    }

    private static void parseLine(String line) {
        String[] keys = line.split(" ");
        int key = Integer.parseInt(keys[0]);
        ArrayList<Integer> points = new ArrayList<>();
        for(int i = 1; i < keys.length;i++){
            points.add(Integer.parseInt(keys[i]));
        }
        graph.add(new Node(key, points));
    }
}

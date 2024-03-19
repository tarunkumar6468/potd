import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class dfs {
private LinkedList<Integer>adjacency[];
public dfs(int v) {
    adjacency = new LinkedList[v];

    for(int i = 0; i<v; i++){
        adjacency[i] = new LinkedList<>();
    }
}
public void insertEdge(int s, int d){
    adjacency[s].add(d);
    adjacency[d].add(s);
}
public void bfs (int source){
    boolean visited_node[] = new boolean[adjacency.length];
    int parent_node[] = new int[adjacency.length];
    Queue<Integer> q = new LinkedList<>();
    q.add(source);
    visited_node[source]= true;
    parent_node[source] = -1;

    while (!q.isEmpty())
    {
        int p = q.poll();
        System.out.print(p);
        for(int i:adjacency[p])
        {
            if(visited_node[i]!=true){
                visited_node[i] = true;
                q.add(i);
                parent_node[i] = p;

            }
        }
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Eneter Number of Vertices and Edgs");// 5 6
    int v = sc.nextInt();
    int e = sc.nextInt();
    dfs g = new dfs(v);
    System.out.println("enter edgs");//0 1 0 2 2 3 3 4 2 4 1 4
    for(int i = 0; i<e; i++){
        int s = sc.nextInt();
        int d = sc.nextInt();
        g.insertEdge(s,d);
    }
    System.out.println("enter source for bfs traversal");
    int source = sc.nextInt();//  2
    g.bfs(source);// answer is 2 0 3 4 1

}
}

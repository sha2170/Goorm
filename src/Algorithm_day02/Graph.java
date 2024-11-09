package Algorithm_day02;

import java.util.ArrayList;

public class Graph {
    private int[][] adjacencyMatrix;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    public Graph(int vertices) {
        adjacencyMatrix = new int[vertices][vertices];
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        // 인접 행렬 방식으로 간선 추가
        adjacencyMatrix[u - 1][v - 1] = 1;
        adjacencyMatrix[v - 1][u - 1] = 1;

        // 인접 리스트 방식으로 간선 추가
        adjacencyList.get(u - 1).add(v);
        adjacencyList.get(v - 1).add(u);
    }

    // 인접 행렬
    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 인접 리스트
    public void printAdjacencyList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < adjacencyList.size(); i++) {
            System.out.print((i + 1) + ": ");
            for (int j : adjacencyList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 5);
        graph.addEdge(3, 6);
        graph.addEdge(4, 5);
        graph.addEdge(4, 7);
        graph.addEdge(5, 7);
        graph.addEdge(6, 7);

        // 인접 행렬
        graph.printAdjacencyMatrix();

        // 인접 리스트
        graph.printAdjacencyList();
    }
}

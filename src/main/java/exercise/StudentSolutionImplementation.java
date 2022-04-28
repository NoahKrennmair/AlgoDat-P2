package main.java.exercise;

import main.java.exercise.graph.Graph;
import main.java.exercise.Heuristic;
import main.java.framework.StudentInformation;
import main.java.framework.StudentSolution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentSolutionImplementation implements StudentSolution {
    @Override
    public StudentInformation provideStudentInformation() {
        return new StudentInformation(
                "Noah", // Vorname
                "Krennmair", // Nachname
                "12023994" // Matrikelnummer
        );
    }

    // Implementieren Sie hier einen Algorithmus der ueberprueft, ob der Graph azyklisch ist.
    public boolean isAcyclic(Graph g) {

        /*
        int[] temp = g.getVertices();
        List<Integer> vertices = new ArrayList<>();
        for (int i = 0; i < g.numberOfVertices(); i++) {
            vertices.add(temp[i]);
        }

        List<Integer> sortedVertices = new ArrayList<>(); //L
        List<Integer> sourceVertices= new ArrayList<>(); // Q


        for (int vertex : vertices) {
            if (g.inDegree(vertex) == 0) {
                sourceVertices.add(vertex);
            }
        }

        while (!sourceVertices.isEmpty()) {

            int n = sourceVertices.remove(0);
            sortedVertices.add(n);

            for (int i = 0; i < g.numberOfVertices(); i++) {
                int m = vertices.get(i);

                if (g.containsEdge(n, m)) {
                    g.
                }
            }
        }

        for (int i = 0; i < ; i++) {

        }
         */
        int[] vertices = g.getVertices();
        int[] entranceDegree = new int[g.numberOfVertices()];

        for (int i = 0; i < g.numberOfVertices(); i++) {
            entranceDegree[i] = g.inDegree(vertices[i]);
        }


        while (Arrays.stream(entranceDegree).max().getAsInt() >= 0) {

            int[] compare = entranceDegree;

            for (int i = 0; i < vertices.length; i++) {

                if (entranceDegree[i] == 0) {

                    for (int j = 0; j < vertices.length; j++) {

                        if (i != j) {
                            if (g.containsEdge(vertices[i], vertices[j])) {
                                entranceDegree[j]--;
                            }
                        }
                    }
                    entranceDegree[i]--;
                    break;
                }
            }

            /*if (compare.equals(entranceDegree)) {
                return true;
            }*/
        }

        return false;


    }

    // Implementieren Sie hier die erste Heuristik.
    public double heuristic1(Graph g, int vertex) {
        return 0.0;
    }

    // Implementieren Sie hier die zweite Heuristik.
    public double heuristic2(Graph g, int vertex) {
        return 0.0;
    }

    // Implementieren Sie hier die dritte Heuristik.
    public double heuristic3(Graph g, int vertex) {
        return 0.0;
    }

    // Implementieren Sie hier optional eine vierte Heuristik.
    public double heuristic4(Graph g, int vertex) {
        return 0.0;
    }

    // Implementieren Sie hier den Greedy-Algorithmus, der eine Menge von Knoten findet ohne
    // denen der Graph azyklisch ist.
    public void greedyFeedbackVertexSet(Graph g, Heuristic h, int[] feedbackVertexSet) {
    }
}

package Forelesning2;

public class Noder {

    public static class Node {
        char value;
        Node left_child;
        Node right_child;

        Node(char value) {
            this.value = value;
            this.left_child = null;
            this.right_child = null;
        }

        void print() {
            System.out.print(value+" ");
            if(this.left_child != null) {
                this.left_child.print();
            }
            if(this.right_child != null) {
                this.right_child.print();
            }


        }
    }

    static Node playMatch(Node team_1, Node team_2) {
        char winner;
        if (team_1.value > team_2.value) {
            winner = team_1.value;
        } else {
            winner = team_2.value;
        }
        Node parent = new Node(winner);
        parent.left_child = team_1;
        parent.right_child = team_2;

        return parent;
    }

    public static void main(String[] args) {
        // Verdien av en char bestemmes av ASCII-tabellen.
        // f.eks. er 'A' = 65 og 'B' = 66,... 'a' = ??
        Node z = new Node('Z');
        Node c = new Node ('C');
        Node f = new Node('F');
        Node k = new Node('K');

        Node semi_1 = playMatch(z,c);
        Node semi_2 = playMatch(f,k);
        /*System.out.println("Semifinalevinnere:");
        semi_1.print();
        semi_2.print();
        System.out.println(); */

        Node winner = playMatch(semi_1,semi_2);
       // System.out.println("Vinner av match:");
        System.out.println("Turneringstreet i pre-orden");
        // Forventer
        winner.print();
    }




}

package Forelesning8;

public class BinarySearchTree {

    public static void main(String[] args) {
        System.out.println("Hello world.");

        BST tree = new BST();
        int[] values = {9, 7, 1, 3, 5, 11, 13, 10, 8};

        for (int i = 0; i < values.length; i++) {
            tree.insert(values[i]);
            tree.print();
            System.out.println();
        }

    }

    /**
     * Node-klasse som har alt vi trenger i binæresøketreet.
     */
   static class Node {
        Node parent;
        Node left_child;
        Node right_child;
        int value;

        Node(int value) {
            this.value = value;
            this.parent = null;
            this.left_child = null;
            this.right_child = null;
        }

        Node(int value, Node parent) {
            this.value = value;
            this.parent = parent;
            this.left_child = null;
            this.right_child = null;
        }

        Node(int value, Node parent, Node left_child, Node right_child) {
            this.value = value;
            this.parent = parent;
            this.left_child = left_child;
            this.right_child = right_child;
        }

        void printPreorderRecurisve() {
            System.out.print(this.value+", ");
            if (left_child != null) {
                left_child.printPreorderRecurisve();
            }
            if (right_child != null) {
                right_child.printPreorderRecurisve();
            }
        }

    }

    /**
     * Klasse som har rot-noden og annen info om vårt søketre.
     * Har også metodene for innlegging, fjerning, søking etc..
     */

    public static class BST {
        Node root;

        /**
         * Denne funksjon søker etter verien i søketreet,
         * men returnerer null om verien ikke finnes.
         * @param value
         * @return
         */
        Node Search(int value) { // O(log(n))
            Node p = root;

            // Inntil vi er utenfor treet, eller hav funnet verdien
            while (p != null ||p.value == value) {
                // Verdien er større enn p -> Gå til høyre
                if (value > p.value) {
                    p = p.right_child;
                    // Verdien er mindre enn p -> Gå til venstre
                } else if (value < p.value){
                    p = p.left_child;
                    // Verdien er lik p -> Returnerer p
                } else {
                    break;
                }
            }

            return null; // IKKE FERDIG
        }

        void insert(int value) {
            // Treet vårt er null, vi lager vår første node!
            if (root == null) {
                root = new Node(value);
                return;
            // Treet er ikke tomt -> Vi må legge inn verdien på riktig plass
            } else {
                // Initaliser og sett noden vi ser på til root-noden
                Node p = root;
                Node q = null; // Parent til p

                while (p != null) {
                    q = p;
                    if (value >= p.value) {
                        // Flytt p ett hakk nedover
                        p = p.right_child;
                    } else {
                        // Flytt p ett hakk nedover
                        p = p.left_child;
                    }
                }

                // Nå har vi funnet hvor den nye koden skal ligge
                // Nye noden skal være høyre eller venstre barn av q
                if (value >= q.value) {
                    q.right_child = new Node(value,q);
                } else {
                    q.left_child = new Node(value,q);
                }
            }
        }

        public void print() {
            this.root.printPreorderRecurisve();
        }
    }
}


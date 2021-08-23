package UkeOppgaver1;

public class UkeOppgaver1 {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int a[] = {8,4,17,10,6,20,1,11,15,3,18,9,2,7,19};
        int min_index = min(a);

        System.out.println("Tallet finnes på plass: "+min_index);
        System.out.println("Og det er tall: "+a[min_index]);
    }

    static int min(int[] a){
            //Initierer min_value og min_index til å bli det første tallet i arrayet mitt
        int min_value = a[0];
        int min_index = 0;

            //For-løkke
        for (int i=1; i < a.length; i++){
           int value = a[i];
           int index = i;
           //Sjekker om det finnes mindre tall enn tall som er på a[0]
           if(value < min_value) {
               min_value = value;
               min_index = index;
           }
        }

        //Returerer index
        return min_index;
    }
}

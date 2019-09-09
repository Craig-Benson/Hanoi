import java.util.ArrayList;

public class main {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();


tower(A,B,C);


    }

    public static ArrayList<Integer> tower(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C){

        ArrayList<Integer> correct = A;


if(C.equals(correct)){
    System.out.println("done");
return C;

}else{

    //dont use loop

        if(C.isEmpty()){
            C.add(A.get(0));
            A.remove(0);
        }
        if (B.isEmpty()){
            B.add(A.get(0));
            A.remove(0);
        }
        if (A.isEmpty()){

            int smallest = B.get(0);
            if (smallest > B.)


        }

        if(A.get(0)<B.get(0)){

            B.add(A.get(0));
            A.remove(0);

        }else if(A.get(0)<C.get(0)){
            C.add(A.get(0));
            A.remove(0);
        }
    if(B.get(0)<C.get(0)){

        C.add(B.get(0));
        B.remove(0);

    }else if(C.get(0)<B.get(0)){
        B.add(C.get(0));
        C.remove(0);
    }



tower(A,B,C);


            //can move something here
        }
//        }else if(B.get(i) <){
//            //sort items that are here
//        }
    return C;
    }


}









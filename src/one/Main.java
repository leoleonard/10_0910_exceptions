//package one;
//
//public class Main {
//
//    public static void main(String[] args) {
//        int[] tablica = new int[] {1, 2, 3};
//
//     //   System.out.println(tablica[3]); // array out of bound
//
//        try {
//            showInfo(tablica, 10);
//        } catch (OutOfRangeException e) {
//            System.out.println("Out of array range");
//           // e.printStackTrace();
//            //stos wywolan, gdzie wystapil blad
//            String message = e.getMessage();
////            System.err
//        }
//
//
//
//    }
//
//    static void showInfo(int[] tablica, int index) throws OutOfRangeException {
//
//        if (tablica.length > index) {
//            System.out.println(tablica[index]);
//        } else {
//            throw new OutOfRangeException();
//            }
//        }
//
//    }

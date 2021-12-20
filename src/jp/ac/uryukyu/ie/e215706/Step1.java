package jp.ac.uryukyu.ie.e215706;

public class Step1 {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException e) {
            System.out.println("NullPointerException発生！");
            System.out.println(e.getMessage());
        }
        
    }
}

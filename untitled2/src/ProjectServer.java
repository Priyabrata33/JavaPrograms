import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.awt.*;



public class ProjectServer {
    public static void main(String[] args) throws Exception {


        ServerSocket ss = new ServerSocket(2222);
        System.out.println("-------SERVER WAITING FOR CLIENT CONNECTION-------");
        Socket s  = ss.accept();

        System.out.println("________Connection Established________");

        BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()) );//for getting the input come from the Client Socket

        PrintStream ps = new PrintStream(s.getOutputStream());//
        String msg;
        do{
            msg = bf.readLine();
            System.out.println("Code Receive from Client side is: " + msg);

            msg = checkHammingCode(msg);    //check the upcoming code for the checking the correct and send the correct code

            ps.println(msg);            //write in print stream to send to cient

        }while (!msg.equals("end"));
        ss.close();
        s.close();





    }

    private static String checkHammingCode(String msg) {

       int length = msg.length();

       int[] hmm = new int[msg.length()];

       for(int i = 0; i<msg.length();i++){
           hmm[i] = (int)msg.charAt(i);         //adding the upcoming client code to a array
       }

       ArrayList<Integer> li = new ArrayList<>();       //adding the parity bits in a list
       for(int i=0;i<hmm.length;i=(int)Math.pow(2,i)-1){
           li.add(hmm[i]);
       }

       for(int i=0;i<li.size();i++){
           for(int j = 0; j<hmm.length;j++){

           }
       }




       return msg;
    }


}

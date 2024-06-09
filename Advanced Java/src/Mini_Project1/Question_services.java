package Mini_Project1;

import java.util.Scanner;

public class Question_services {
    Question [] que = new Question[5];
    String selection[] = new String[5];
    public Question_services(){
        que[0] = new Question(1,"Which Language your are Learning ? ","Java",
                "Python ","C++" ,"Java","Golang");
        que[1]  = new Question(2,"Size of int","4","1","4","8","5");
        que[2]  = new Question(3,"Size of Double","8","1","4","8","5");
        que[3]  = new Question(4,"Size of Float","4","1","4","8","5");
        que[4]  = new Question(5,"Size of boolean","1","1","4","8","5");


    }

    public void displayque(){
        for(Question q :que){
            System.out.println(q);
        }
    }

    public void playquiz(){
        int i = 0;
        for(Question q :que){
            System.out.println("Question number : "+ q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOp1());
            System.out.println(q.getOp2());
            System.out.println(q.getOp3());
            System.out.println(q.getOp4());
            Scanner in = new Scanner(System.in);
            selection[i++] = in.nextLine();
        }

        System.out.println("User Selected Option is: ");
        int score = 0;
        int j =0 ;
        for(String s:selection){
            System.out.println(s);
            if(s.equals(que[j++].getAnswer())){
                score++;
            }
        }
        System.out.println("Final Score is: "+score);

    }


}

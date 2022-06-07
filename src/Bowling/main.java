package Bowling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        GameScore gs = new GameScore();

        int round = 0;
        int inpScore;
        int stack = 0 ;

        BufferedReader bufferRead = new BufferedReader(
                new FileReader("C:\\Users\\jgChoi\\Desktop\\inputScore.txt")
        );//8kb 객체 전달
        String readScore;
        while( (readScore = bufferRead.readLine()) != null){
             inpScore = Integer.parseInt(readScore) ;

            //System.out.println("입력된 값"+inpScore);
            if( inpScore >= 0 && inpScore <= 10){

                if( inpScore < 10 && stack == 0 ){
                    stack = 1 ;
                }else{ //10점일 경우 & 두번째 점수

                    if( gs.score[round] + inpScore > 10){
                        System.out.println("남은 핀 개수를 초과하였습니다.");
                        continue;
                    }

                    round++;
                    stack = 0 ;
                }

                gs.setScore(round,inpScore);

            }else{
                System.out.println("다시 입력해주세요.");
            }

            System.out.println("점수 합:"+gs.sumScore());
        }

    }
}

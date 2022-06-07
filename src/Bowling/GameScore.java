package Bowling;
public class GameScore {

    int[] score = new int[12];
    int[] secScore = new int[12];
    int sum = 0;
    int cnt = 0;
    public void setScore(int round,int score){
        System.out.println(score);
        //라운드 중복 방지

        if(cnt != round){
            this.score[round] = score;
            System.out.println("배열 입력값:"+this.score[round]);
            cnt++;
        }
        else {
            secScore[round] = score;
        }
    }


    public int sumScore(){


        for(int i = 0; i < 10; i++){
            this.sum += this.score[i];
            if(score[i] == 10 && (i+1 <= score.length)){ //스트라이크 점수 처리
                if(i+2 < 11){
                    this.sum += score[i+1];
                    if(i+2 <= score.length)
                        this.sum += score[i+2];
                }else if(i+2 == 11){
                    this.sum += score[i+1];
                }
            }else if(score[i]+secScore[i] == 10){ //스페어
                if(i+1 < 11){

                    this.sum += score[i+1];


                }
            }

        }

        return sum;

    }



}

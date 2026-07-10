public class Rotiparata {
    static boolean ispossible(int[] cook,int totalcookis, int timelimit, int Totalparate){
        int paratecount =0;
        for(int i =0; i<cook.length; i++){
            int currentcookrank =cook[i];
            int timetake =0;
            int j =1;
            while(timetake<=timelimit){
               if((timetake+currentcookrank*j)<=timelimit){
                paratecount++;
                timetake = timetake+currentcookrank*j;
                j++;
               }else{
                break;
               }
            }
            if(paratecount >=Totalparate){
                return true;
            }
        }
        if(paratecount >= Totalparate){
            return true;
        }
        else{
            return false;
        }

    }
    static int roti(int [] cook, int Totalparateparate,int totalcookis ){
        int ans=-1;
        int s=0;
        int rank = -1;
        for(int i=0;i<cook.length;i++){
            if(cook[i]>rank){
                rank=cook[i];
            }
        }
        int e =rank*(totalcookis*(totalcookis+1)/2);
        while(s<=e){
            int mid =s+(e-s)/2;
            if(ispossible(cook, totalcookis, mid, Totalparateparate)){
                ans =mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] cook = {1,2,3,4};
        int totalcookis = 4;
        int Totalparate =10;
        System.out.println(roti(cook, Totalparate, totalcookis));
    }
}

/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start

class IsLand{
    public static void main(String[] aa){
        char sam[][]={{'1','1','0'},
                      {'1','1','0'},
                      {'1','0','1'}}
       Solution.numIslands(sam);

    }
}
class Solution {
    public static int numIslands(char[][] g) {
        int count=0;

        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[i].length;j++){
                if(g[i][j]=='1'){
                    call(g,i,j);
                    count+=1;


                }
                
            }
        }


        return count;
        
    }
   public void call(char[][] g,int i,int j){

    if(i<0 || i>=g.length||j<0 ||j>=g[i].length||g[i][j]=='0') {
        return;
    }
  
    

      g[i][j]='0';
      call(g,i+1,j);
      call(g,i-1,j);
      call(g,i+1,j-1);
      call(g,i+1,j+1);


    }


}
// @lc code=end


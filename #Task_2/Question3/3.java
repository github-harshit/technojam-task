class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        int length=points.length;
        for(int i=0;i<length-1;i++){
            int xd=Math.abs(points[i][0]-points[i+1][0]);
            int yd=Math.abs(points[i][1]-points[i+1][1]);
            int max=Math.max(xd,yd);
            int min=Math.min(xd,yd);
            
        
        
        sum+=min;
        sum+=(max-min);
        }
    
        return sum;
    
        
    }
}

class Solution {
    int[] parent;
    int[] rank;

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int m = isConnected[0].length;

        parent = new int[n+1];
        rank = new int[n+1];

        for(int i=1; i<=n; i++){
            parent[i] = i;
        }
        int comp = n;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(isConnected[i][j]==1){
                    if(i==j) continue;
                    else{
                        if(unionRank(i,j))
                            comp--;
                    }
                }
            }
        }
        return comp;

    }
    public int find(int x){
        if(x==parent[x]) return x;
        return parent[x] = find(parent[x]);
    }
    public boolean unionRank(int x, int y){
        int px = find(x);
        int py = find(y);

        if(px == py) return false;
        if(rank[px]>rank[py]) parent[py] = px;
        else if(rank[px]<rank[py]) parent[px] = py;
        else{
            parent[py] = px;
            rank[px]++;
            
        }
        return true;
    }
}
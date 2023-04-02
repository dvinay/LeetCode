class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        results.add(row);
        
        for (int i=1;i<=rowIndex;i++) {
            row = new ArrayList<>();
            row.add(1);
            
            for (int j=0;j<i-1;j++) {
               row.add(results.get(i-1).get(j) + results.get(i-1).get(j+1));
            }
            row.add(1);
            results.add(row);
        }
        
        return results.get(rowIndex);
    }
}
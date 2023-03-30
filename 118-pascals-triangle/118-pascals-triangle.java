class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> previousRow = new ArrayList<>();
        List<Integer> currentRow = new ArrayList<>();
        
        if (numRows >= 1) {
            currentRow = new ArrayList<>();
            currentRow.add(1);
            results.add(currentRow);
        }
        if (numRows >= 2) {
            currentRow = new ArrayList<>();
            currentRow.add(1);
            currentRow.add(1);
            results.add(currentRow);
        }
        
        for (int i=2;i<numRows;i++) {
            previousRow = results.get(results.size()-1);
            
            currentRow = new ArrayList<>();
            
            currentRow.add(1);
            for (int j = 0;j<previousRow.size()-1;j++) {
                currentRow.add(previousRow.get(j) + previousRow.get(j+1));
            }
            currentRow.add(1);
            
            results.add(currentRow);
        }
        
        return results;
    }
}
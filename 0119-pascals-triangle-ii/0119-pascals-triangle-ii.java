class Solution {
    public List<Integer> getRow(int rowIndex) {
      

        List<Integer> row = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {

            long value = 1;

            for (int j = 0; j < i; j++) {
                value = value * (rowIndex - j) / (j + 1);
            }

            row.add((int) value);
        }

        return row;
    
    }
}

package j1.s.p0074;


public class Matrix {
    private int[][] data;
    private int row;
    private int column;

    public Matrix(int[][] data) {
        this.data = data;
        this.row = data.length;
        this.column = data[0].length;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }
    
    
    
}

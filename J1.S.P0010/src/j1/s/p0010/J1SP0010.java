/*
Linear search : tìm kiếm tuyến tính hoặc tìm kiếm tuần tự là một phương pháp tìm kiếm một giá trị cụ thê trong danh sách
bao gồm kiểm tra từng phần tử của nó,từng phần tử một và theo trình tự, cho đến khi tìm thấy phần tử mong muốn.

TH tót nhất = 1
TH xất nhất = not found
 */
package j1.s.p0010;

import java.util.ArrayList;

public class J1SP0010 {


    public static void main(String[] args) {
        Infor infor = new Infor();
        Managelinearsearch linearsearch = new Managelinearsearch();
       //Enter a size of array 
       infor.setSize(linearsearch.inputNumber("Enter number of array: "));
        //Enter a search number
       infor.setValue(linearsearch.inputNumber("Enter search value: "));
        //Generate random integer in number range for each array element
       infor.setArray(linearsearch.generateElement(infor));
        //Display the array
        linearsearch.display(infor);
        //Linear Seach
        ArrayList list = linearsearch.linearSearch(infor);
         //Display the index of search number in array
        linearsearch.displayIndex(list, infor);
        
    }
    
}

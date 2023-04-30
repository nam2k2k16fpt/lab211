/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0050;

import java.util.List;

/* 
Interface class là tập hợp các method abstract và constants.mà các class khác
có thể implement.
  +, dùng để định nghĩa các hành vi cần thiết cho một loại object
*/
public interface Calculate {
    
    public List<Float> calculateEquation(float a, float b);
    public List<Float> calculateQuadraticEquation(float a, float b, float c);
    
}

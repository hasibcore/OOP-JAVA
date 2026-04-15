/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aisystem;

/**
 *
 * @author HP
 */
public class AiSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AiSoftware soft1=new ChatGPTService();
        CodeEditor editor1=new CodeEditor(soft1);
        editor1.response("solve the problems.");
        
        AiSoftware soft2=new GeminiService();
        CodeEditor editor2=new CodeEditor(soft2);
        editor2.response("solve the equations.");
    }
    
}

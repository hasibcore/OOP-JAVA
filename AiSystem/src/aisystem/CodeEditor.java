/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aisystem;

/**
 *
 * @author HP
 */
public class CodeEditor {
    public AiSoftware soft;

    public CodeEditor(AiSoftware soft) {
        this.soft = soft;
    }
    public void response(String p){
        System.out.println("Connecting with AI models for prompt: "+p);
        soft.generateText(p);
    }
    
}

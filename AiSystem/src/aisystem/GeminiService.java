/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aisystem;

/**
 *
 * @author HP
 */
public class GeminiService implements AiSoftware{
    public void generateText(String p){
        System.out.println("Connecting to Gemini API to process Prompt: "+p);
    }
}

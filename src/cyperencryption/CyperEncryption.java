/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cyperencryption;

import java.util.Scanner;

/**
 *
 * @author 18M01ACS031
 */
public class CyperEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String PlainText;
        int i;
        System.out.println("Write your text");
        Scanner cons = new Scanner(System.in);
        PlainText = cons.nextLine();
        char[]PlainTextCon = PlainText.toCharArray();
        int[]NumberPText = new int[PlainTextCon.length];
        for(i = 0;i < PlainTextCon.length;i++){
            if(PlainTextCon[i] == 'a' || PlainTextCon[i] == 'A'){
            NumberPText[i] = 0;
            }
            else if(PlainTextCon[i] == 'b' || PlainTextCon[i] == 'B'){
            NumberPText[i] = 1;
            }
            else if(PlainTextCon[i] == 'c' || PlainTextCon[i] == 'C'){
            NumberPText[i] = 2;
            }
            else if(PlainTextCon[i] == 'd'|| PlainTextCon[i] == 'D'){
            NumberPText[i] = 3;
            }
            else if(PlainTextCon[i] == 'e'|| PlainTextCon[i] == 'E'){
            NumberPText[i] = 4;
            }
            else if(PlainTextCon[i] == 'f'|| PlainTextCon[i] == 'F'){
            NumberPText[i] = 5;
            }
            else if(PlainTextCon[i] == 'g'|| PlainTextCon[i] == 'G'){
            NumberPText[i] = 6;
            }
            else if(PlainTextCon[i] == 'h'|| PlainTextCon[i] == 'H'){
            NumberPText[i] = 7;
            }
            else if(PlainTextCon[i] == 'i'|| PlainTextCon[i] == 'I'){
            NumberPText[i] = 8;
            }
            else if(PlainTextCon[i] == 'j'|| PlainTextCon[i] == 'J'){
            NumberPText[i] = 9;
            }
            else if(PlainTextCon[i] == 'k'|| PlainTextCon[i] == 'K'){
            NumberPText[i] = 10;
            }
            else if(PlainTextCon[i] == 'l'|| PlainTextCon[i] == 'L'){
            NumberPText[i] = 11;
            }
            else if(PlainTextCon[i] == 'm'|| PlainTextCon[i] == 'M'){
            NumberPText[i] = 12;
            }else if(PlainTextCon[i] == 'n'|| PlainTextCon[i] == 'N'){
            NumberPText[i] = 13;
            }
            else if(PlainTextCon[i] == 'o'|| PlainTextCon[i] == 'O'){
            NumberPText[i] = 14;
            }
            else if(PlainTextCon[i] == 'p'|| PlainTextCon[i] == 'P'){
            NumberPText[i] = 15;
            }
            else if(PlainTextCon[i] == 'q'|| PlainTextCon[i] == 'Q'){
            NumberPText[i] = 16;
            }
            else if(PlainTextCon[i] == 'r'|| PlainTextCon[i] == 'R'){
            NumberPText[i] = 17;
            }
            else if(PlainTextCon[i] == 's'|| PlainTextCon[i] == 'S'){
            NumberPText[i] = 18;
            }
            else if(PlainTextCon[i] == 't'|| PlainTextCon[i] == 'T'){
            NumberPText[i] = 19;
            }
            else if(PlainTextCon[i] == 'u'|| PlainTextCon[i] == 'U'){
            NumberPText[i] = 20;
            }
            else if(PlainTextCon[i] == 'v'|| PlainTextCon[i] == 'V'){
            NumberPText[i] = 21;
            }
            else if(PlainTextCon[i] == 'w'|| PlainTextCon[i] == 'W'){
            NumberPText[i] = 22;
            }
            else if(PlainTextCon[i] == 'x'|| PlainTextCon[i] == 'X'){
            NumberPText[i] = 23;
            }
            else if(PlainTextCon[i] == 'y' || PlainTextCon[i] == 'Y'){
            NumberPText[i] = 24;
            }
            else if(PlainTextCon[i] == 'z' || PlainTextCon[i] == 'Z'){
            NumberPText[i] = 25;
            }
            else {
            continue;
            }
                  
            System.out.print(NumberPText[i] + "\t");
        }
        System.out.println("");
        int[]NumberCText = new int [NumberPText.length];
        for(i = 0;i < NumberPText.length;i++){
          NumberCText[i] = NumberPText[i] + 3;
            if(NumberCText[i] > 25){
            NumberCText[i] = NumberCText[i] % 26;
            }
        }
         for(i = 0;i < NumberPText.length;i++){
             System.out.print(NumberCText[i] + "\t");
            }
         System.out.println("\n");
         char[]CypherTextCon = new char [NumberCText.length];
         for(i = 0;i < NumberCText.length;i++){
          if(NumberCText[i] == 0){
           CypherTextCon[i] = 'a';
            }
            else if(NumberCText[i] == 1){
            CypherTextCon[i] = 'b';
            }
            else if(NumberCText[i] == 2){
            CypherTextCon[i] = 'c';
            }
            else if(NumberCText[i] == 3){
            CypherTextCon[i] = 'd';
            }
            else if(NumberCText[i] == 4){
            CypherTextCon[i] = 'e';
            }
            else if(NumberCText[i] == 5){
            CypherTextCon[i] = 'f';
            }
            else if(NumberCText[i] == 6){
            CypherTextCon[i] = 'g';
            }
            else if(NumberCText[i] == 7){
            CypherTextCon[i] = 'h';
            }
            else if(NumberCText[i] == 8){
            CypherTextCon[i] = 'i';
            }
            else if(NumberCText[i] == 9){
            CypherTextCon[i] = 'j';
            }
            else if(NumberCText[i] == 10){
            CypherTextCon[i] = 'k';
            }
            else if(NumberCText[i] == 11){
            CypherTextCon[i] = 'l';
            }
            else if(NumberCText[i] == 12){
            CypherTextCon[i] = 'm';
            }else if(NumberCText[i] == 13){
            CypherTextCon[i] = 'n';
            }
            else if(NumberCText[i] == 14){
            CypherTextCon[i] = 'o';
            }
            else if(NumberCText[i] == 15){
            CypherTextCon[i] = 'p';
            }
            else if(NumberCText[i] == 16){
            CypherTextCon[i] = 'q';
            }
            else if(NumberCText[i] == 17){
            CypherTextCon[i] = 'r';
            }
            else if(NumberCText[i] == 18){
            CypherTextCon[i] = 's';
            }
            else if(NumberCText[i] == 19){
            CypherTextCon[i] = 't';
            }
            else if(NumberCText[i] == 20){
            CypherTextCon[i] = 'u';
            }
            else if(NumberCText[i] == 21){
            CypherTextCon[i] = 'v';
            }
            else if(NumberCText[i] == 22){
            CypherTextCon[i] = 'w';
            }
            else if(NumberCText[i] == 23){
            CypherTextCon[i] = 'x';
            }
            else if(NumberCText[i] == 24){
            CypherTextCon[i] = 'y';
            }
            else if(NumberCText[i] == 25){
            CypherTextCon[i] = 'z';
            }
            else {
            continue;
            }
         }
         for(i = 0;i < NumberCText.length;i++){
             System.out.print(CypherTextCon[i] + "\t");
         }
         System.out.println("");
         String CypherText = new String(CypherTextCon);
         System.out.println(CypherText);
    }
    
}
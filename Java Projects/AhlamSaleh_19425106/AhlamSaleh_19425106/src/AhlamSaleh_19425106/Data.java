/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhlamSaleh_19425106;

import java.util.*;
import java.io.*;

/**
 *
 * @author AHLAM
 */
public class Data {
    static Scanner input = new Scanner(System.in);

    public static void SaveText(ArrayList<Section> sections) {
        try {
            File f = new File("src\\AhlamSaleh_19425106\\Data.txt");
            PrintWriter pw = new PrintWriter(f);
            for (Section section : sections) {
                System.out.println(section);
                pw.println(section);

            }
            pw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<Section> sections = new ArrayList<Section>();

    }
}

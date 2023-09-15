package com.htmlman1.eloapi;

import java.awt.EventQueue;


import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import net.proteanit.sql.DbUtils;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import java.net.URL;
import java.awt.*;
import java.io.IOException;



public class RateSession {
	
	public static void main(String args[]) {

		
 		EloAPI txt = new EloAPI();
 		int ratingA = 1700;
 		int ratingB = 1850;
 		String winner = "A";
 		int kFactor = 4;
 	   
 	    int[] newRatings =  txt.calculateNewRatings(ratingA, ratingB, winner, kFactor);
 	    
 	   for (int i = 0; i <= 1; i++) {
           System.out.print(newRatings[i] + " ");
		}
	}

}

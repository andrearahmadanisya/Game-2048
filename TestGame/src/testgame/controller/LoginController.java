/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame.controller;

import testgame.model.Board;
import testgame.model.connection;
import testgame.view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

/**
 *
 * @author 62822
 */
public class LoginController extends MouseAdapter implements ActionListener {
    private Login login;
    private connection conn;
    private Board bmodel;
    private BoardUI bView;
    public static String name;
    
    public LoginController(){
        login = new Login();
        conn = new connection();
        login.addActionListener(this);
        login.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(login.getStart())){
            
            if (!login.getUSER().isEmpty()) {
                LoginController.name = login.getUSER();
                bView = new BoardUI();
                login.dispose();

                conn.insertUser(login.getUSER());
                login.dispose();
                bmodel = new Board(0,100);
                bView = new BoardUI();
                new BoardController(bView,bmodel);
            } else{
                login.showMessage("NAMA KOSONG", "ERROR", 0);
            } 
            //new FinishController();
        }
            
    }
}

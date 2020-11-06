/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testgame.controller;

import testgame.model.Board;
import testgame.model.connection;
import testgame.view.BoardUI;
import testgame.view.Finish;

/**
 *
 * @author Andrea Rahmadanisya
 */
public class FinishController {
    private Finish F;
    private Board bmodel;
    private BoardUI bView;
    private connection conn = new connection();
    private LoginController login;
    String nama = "";
    int scr = 0;

    public FinishController(){
        F = new Finish();
        F.setVisible(true);
        F.setUsernm(conn.selectnama(nama));
        F.setScr(conn.selectScore(nama));
    }
}

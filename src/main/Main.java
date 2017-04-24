package main;

import map.Map;
import menu.MenuViewer;
import object.Unit;
import object.item.Recovery;
import view.map.MapViewer;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Main {
  public static void main(String[] args){
    MenuViewer mv = new MenuViewer();
    mv.menuShow();
  }
}

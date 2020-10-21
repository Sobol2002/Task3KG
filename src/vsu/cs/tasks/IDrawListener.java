/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsu.cs.tasks;

import java.util.EventListener;

public interface IDrawListener extends EventListener {
    public void DrawEvent(DrawEventArg e);
}

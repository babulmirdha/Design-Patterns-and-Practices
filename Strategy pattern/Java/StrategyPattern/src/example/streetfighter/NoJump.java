/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.streetfighter;

/**
 *
 * @author ih_hi
 */
public class NoJump implements JumpBehaviorInterface{

    @Override
    public void jump() {
        System.out.println("I can't give jump");
    }
    
}
